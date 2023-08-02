package patterns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObjectLogin {

  private WebDriver driver;
  private By usernameField = By.id("username");
  private By passwordField = By.id("password");
  private By loginButton = By.id("login");

  public PageObjectLogin (WebDriver driver) {
    this.driver = driver;
  }

  public void enterUsername (String username) {
    driver.findElement(usernameField).sendKeys(username);
  }

  public void enterPassword (String password) {
    driver.findElement(passwordField).sendKeys(password);
  }

  public void clickLoginButton (String login) {
    driver.findElement(loginButton).click();
  }

}
