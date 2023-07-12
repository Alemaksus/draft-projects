import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;

public class HomePage {

  protected WebDriver driver;

  private static final By MENU_TOOLS = By.xpath("//*[@class='nav-link dropdown-toggle' and text()='Tools']");

  public void getMenuTools() {
    driver.findElement(MENU_TOOLS).click();
  }
}
