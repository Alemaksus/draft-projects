package frameworks;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert; // Импорт класса Assert из JUnit
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTitleTest {

  private WebDriver driver;

  @Before
  public void setUp() {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
  }

  @Test
  public void googleTitleTest() {
    driver.get("https://www.google.com");
    String expectedTitle = "Google";
    String actualTitle = driver.getTitle();
    Assert.assertEquals(expectedTitle, actualTitle); // Использование Assert из JUnit
  }

  @After
  public void tearDown() { // Исправлено имя метода с "teatDown" на "tearDown"
    if (driver != null) {
      driver.close();
      driver.quit();
    }
  }
}
