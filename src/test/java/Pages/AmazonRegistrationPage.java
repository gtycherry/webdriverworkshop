package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by tyguo on 7/12/14.
 */
public class AmazonRegistrationPage {
    @FindBy(id = "ap_customer_name")
    WebElement ap_customer_name;

    @FindBy(id = "ap_email")
    WebElement ap_email;

    @FindBy (id = "ap_email_check")
    WebElement ap_email_check;

    @FindBy (id = "ap_password")
    WebElement ap_password;

    @FindBy(id="ap_password_check")
    WebElement ap_password_check;

    @FindBy(id="continue-input")
    WebElement register;

    public void inputName(String userName) {
        ap_customer_name.sendKeys(userName);
    }

    public void inputEmail(String email) {
        ap_email.sendKeys(email);
    }

    public void inputEmailCheck(String email) {
        ap_email_check.sendKeys(email);
    }

    public void inputPassword(String password) {
        ap_password.sendKeys(password);
    }

    public void inputPasswordCheck(String passwordCheck) {
        ap_password_check.sendKeys(passwordCheck);
    }

    public void clickRegisterButton() {
        register.click();
    }
}
