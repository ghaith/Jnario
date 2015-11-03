package org.jnario.lib

import org.eclipse.xtext.xbase.lib.Functions$Function0
import org.eclipse.xtext.xbase.lib.Functions$Function1

import static org.jnario.lib.Clock.*
import static org.jnario.lib.Sleeper.*

/*
 * A helper for automatically waiting until a condition turns true. Use it like this:
 * 
 * <code>
 * fact "Wait for something"{
 *   // define wait condition using lambdas
 *   waitUntil[1 > 0]
 *   // configuration options
 *   waitUntil[
 *     message = "Custom error message"
 *     duration = 100
 *     pollingInterval = 10
 *     1 > 0
 *   ]
 * }
 * </code>
 */
class Wait {
	
	/*
	 * Wait until the provided function evaluates to true.
	 */
	def static waitUntil(Functions$Function1<Wait, Boolean> initializer){
		val wait = new Wait(SYSTEM_SLEEPER, SYSTEM_CLOCK)
		val Functions$Function0<Boolean> condition = [
			|initializer.apply(wait)
		]
		wait.until(condition)
	}

	val Sleeper sleeper
	val Clock clock

	var message = "Timeout occurred"
	var duration = 500l
	var pollingInterval = 50l
	
	new(Sleeper sleeper, Clock clock){
		this.sleeper = sleeper
		this.clock = clock
	}

	def until(Functions$Function0<Boolean> condition){
		val start = clock.currentTime
		while(!condition.apply()){
			if(timeOut(start)){
				throw new TimeoutError(message)
			}
			sleeper.sleep(pollingInterval)
		}
	}
	
	def timeOut(long start){
		clock.currentTime > start + duration
	}
	
	def setMessage(String message){
		this.message = message
	}
	
	def setDuration(long duration){
		this.duration = duration
	}
	
	def setPollingInterval(long pollingInterval){
		this.pollingInterval = pollingInterval
	}
} 