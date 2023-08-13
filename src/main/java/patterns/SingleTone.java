package patterns;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleTone {

  private static WebDriver driver;
  private static SingleTone singleTone;

  private SingleTone() {
    System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
    // Initialization of WebDriver for the Chrome browser
    driver = new ChromeDriver();
  }

  public WebDriver getDriver() {
    return driver;
  }

  public SingleTone getInstance() {
    if (singleTone == null) {
      singleTone = new SingleTone();
    }
    return singleTone;
  }

}
