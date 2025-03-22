import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

  protected WebDriver driver;

  private static final By MENU_TOOLS = By.xpath("//*[@class='nav-link dropdown-toggle' and text()='Tools']");

  public void getMenuTools() {
    driver.findElement(MENU_TOOLS).click();
  }
}
