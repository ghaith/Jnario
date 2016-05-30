package selenium;

import com.google.common.base.Function;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

@SuppressWarnings("all")
public class WebDriverExtension {
  private WebDriver driver;
  
  private Wait<WebDriver> wait;
  
  public WebDriverExtension() {
    this(new FirefoxDriver());
  }
  
  public WebDriverExtension(final WebDriver driver) {
    this.driver = driver;
    WebDriverWait _webDriverWait = new WebDriverWait(driver, 30);
    this.wait = _webDriverWait;
  }
  
  public void get(final String url) {
    this.driver.get(url);
  }
  
  public WebElement findElement(final String name) {
    By _name = By.name(name);
    return this.driver.findElement(_name);
  }
  
  public WebElement findElement(final By by) {
    return this.driver.findElement(by);
  }
  
  public Boolean waitUntil(final Function<WebDriver, Boolean> predicate) {
    return this.wait.<Boolean>until(predicate);
  }
  
  @After
  public void tearDown() {
    this.driver.close();
  }
}
