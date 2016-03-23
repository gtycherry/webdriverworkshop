package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

/**
 * Created by tyguo on 7/12/14.
 */
public class AmazonHomePage {
    private WebDriver browser;

    @FindBy(id="nav-signin-text")
    WebElement username;

    @FindBy(linkText = "免费注册")
    WebElement registerLink;

    @FindBy(id="nav-signin-text")
    WebElement loginLink;

    public String getUsername(){
    return username.getText();
    }

    public void clickRegisterLink() {
        Actions movetoElement = new Actions(browser);
        movetoElement.moveToElement(browser.findElement(By.id("nav-signin-title"))).build().perform();
        registerLink.click();
    }

    public void clickLoginLink() {
        loginLink.click();
    }
}
