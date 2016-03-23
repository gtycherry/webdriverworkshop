package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by tyguo on 7/14/14.
 */
public class AmazonLoginPage {
    @FindBy (id = "ap_email")
    private WebElement ap_email;

    @FindBy (id ="ap_password")
    private WebElement ap_password;

    @FindBy (id = "signInSubmit-input")
    private WebElement loginButton;


}
