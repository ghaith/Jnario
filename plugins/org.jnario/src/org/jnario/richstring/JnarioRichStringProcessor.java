package org.jnario.richstring;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.util.TextRegion;

import com.google.common.collect.Lists;

public class JnarioRichStringProcessor {
	private static interface RegionBuilder {
		TextRegion build(int offset, int length);
	}
	
	private static class RegionAppender {
		private RegionBuilder regionBuilder;
		private int newRegionStart;
		private int newRegionStop;
		private List<TextRegion> regionList = new ArrayList<TextRegion>();
		
		RegionAppender(RegionBuilder regionBuilder) {
			this.regionBuilder = regionBuilder;
			clear();
		}
		
		void appendChar(int position) {
			if (position == newRegionStop) {
				newRegionStop++;
				return;
			}
			
			if (newRegionStart != -1) {
				regionList.add(regionBuilder.build(newRegionStart, newRegionStop - newRegionStart));
			}

			newRegionStart = position;
			newRegionStop = position + 1;
		}
		
		List<TextRegion> finish() {
			if (newRegionStart != -1) {
				regionList.add(regionBuilder.build(newRegionStart, newRegionStop - newRegionStart));
			}
			return regionList;
		}

		public void clear() {
			regionList.clear();
			newRegionStart = -1;
			newRegionStop = 0;
		}
	}
	public List<TextRegion> process(String string) {
		if (string.startsWith("'''")) {
			int i = 0;
			while (i < 3 && string.charAt(string.length() - 1 - i) == '\'') {
				i++;
			}
			return processContent(string.substring(3, string.length() - i), new RegionBuilder() {
				@Override
				public TextRegion build(int offset, int length) {
					return new TextRegion(3 + offset, length);
				}
			});
		}
		return null;
	}

	private List<TextRegion> processContent(String string, RegionBuilder regionBuilder) {
		int indentation = 0;
		int minimalIndentation = Integer.MAX_VALUE;
		boolean inIndentation = true;
		int lineNumber = 0;
		for (int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);
			boolean newLine = false;
			if(c == '\r') {
				if(i+1 < string.length() && string.charAt(i+1) == '\n') {
					i++;
				}
				newLine = true;
			}
			if(c == '\n') {
				newLine = true;
			}
			if(newLine) {
				inIndentation = true;
				indentation=0;
				lineNumber++;
				continue;
			}
				
			if(Character.isWhitespace(c) && inIndentation) {
				indentation++;
				continue;
			}
			if(inIndentation) {
				if(lineNumber == 0) {
					return trimRightToNewLine(string, regionBuilder);
				}
				minimalIndentation = Math.min(minimalIndentation, indentation);
				inIndentation = false;
			}
		}
		boolean trimRight = inIndentation;
		int lastLine = lineNumber;
		if(minimalIndentation == Integer.MAX_VALUE) {
			return trimRightToNewLine(string, regionBuilder);
		}

		indentation = 0;
		inIndentation = true;
		lineNumber = 0;

		RegionAppender regionAppender = new RegionAppender(regionBuilder);
		for (int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);
			boolean newLine = false;
			if(c == '\r') {
				regionAppender.appendChar(i);
				if(i+1 < string.length() && string.charAt(i+1) == '\n') {
					i++;
					regionAppender.appendChar(i);
				}
				newLine = true;
			}
			if(c == '\n') {
				regionAppender.appendChar(i);
				newLine = true;
			}
			if(newLine) {
				if(lineNumber == 0) {
					regionAppender.clear();
				}
				inIndentation = true;
				indentation=0;
				lineNumber++;
				if (lineNumber == lastLine && trimRight)
					return regionAppender.finish();
				continue;
			}
			
			if(Character.isWhitespace(c) && inIndentation) {
				indentation++;
				if(indentation > minimalIndentation)
					regionAppender.appendChar(i);
				continue;
			}
			regionAppender.appendChar(i);
			if(inIndentation) {
				if(lineNumber == 0)
					return regionAppender.finish();
				minimalIndentation = Math.min(minimalIndentation, indentation);
				inIndentation = false;
			}
		}
		
		return regionAppender.finish();
	}

	private List<TextRegion> trimRightToNewLine(String string, RegionBuilder regionBuilder) {
		for (int i = string.length() - 1; i != -1; i--) {
			char c = string.charAt(i);
			if (c == '\n' || c == '\r') {
				return returnString(string.substring(0, i + 1), regionBuilder);
			}
			if (!Character.isWhitespace(c)) {
				return returnString(string, regionBuilder);
			}
		}
		return returnString(string, regionBuilder);
	}

	private ArrayList<TextRegion> returnString(String string,
			RegionBuilder regionBuilder) {
		return Lists.newArrayList(regionBuilder.build(0, string.length()));
	}

}
