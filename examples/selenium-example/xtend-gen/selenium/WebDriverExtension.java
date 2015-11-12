package selenium;

import com.google.common.base.Function;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Wait;

@SuppressWarnings("all")
public class WebDriverExtension {
  private /* WebDriver */Object driver;
  
  private /* Wait<WebDriver> */Object wait;
  
  public WebDriverExtension() {
    throw new Error("Unresolved compilation problems:"
      + "\nFirefoxDriver cannot be resolved.");
  }
  
  public WebDriverExtension(final /* WebDriver */Object driver) {
    throw new Error("Unresolved compilation problems:"
      + "\nWebDriverWait cannot be resolved.");
  }
  
  public Object get(final String url) {
    throw new Error("Unresolved compilation problems:"
      + "\nget cannot be resolved");
  }
  
  public Object findElement(final String name) {
    throw new Error("Unresolved compilation problems:"
      + "\nfindElement cannot be resolved");
  }
  
  public Object findElement(final By by) {
    throw new Error("Unresolved compilation problems:"
      + "\nfindElement cannot be resolved");
  }
  
  public Boolean waitUntil(final /* Function<WebDriver, Boolean> */Object predicate) {
    return this.wait.<Boolean>until(predicate);
  }
  
  @After
  public void tearDown() {
    throw new Error("Unresolved compilation problems:"
      + "\nclose cannot be resolved");
  }
}
