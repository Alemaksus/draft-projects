import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleTone {

  WebDriver driver;
  SingleTone singleTone;

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
