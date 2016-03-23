import Common.WebdriverManager;
import Pages.AmazonHomePage;
import Pages.AmazonLoginPage;
import Pages.AmazonRegistrationPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThat;

/**
 * Created by tyguo on 6/20/14.
 */
public class AmazonTest {
    public static final String NAME = "TYTest";
    private AmazonRegistrationPage amazonRegistrationPage;
    private AmazonHomePage amazonHomePage;
    private AmazonLoginPage amazonLoginPage;


//    public WebDriver openmainpage() {
//        //创建一个新的WEBDRIVER
//        driver = new FirefoxDriver();
//        //使用他来打开主页
//        driver.get("http://www.amazon.cn/");
//        return driver;
//    }
    
    @Before
    public void setUp() throws Exception {
        WebdriverManager.getDriver().get("http://www.amazon.cn/");
        amazonRegistrationPage = PageFactory.initElements(WebdriverManager.getDriver(), AmazonRegistrationPage.class);
        amazonHomePage= PageFactory.initElements(WebdriverManager.getDriver(),AmazonHomePage.class);
        amazonLoginPage= PageFactory.initElements(WebdriverManager.getDriver(),AmazonLoginPage.class);


    }

    @Test
    public void testRegistration() {

//      找到链接点击进入注册页面
        amazonHomePage.clickRegisterLink();
//      填入各种信息后提交
        amazonRegistrationPage.inputName(NAME);
        amazonRegistrationPage.inputEmail("tyty@sina.cn");
        amazonRegistrationPage.inputEmailCheck("tyty@sina.cn");
        amazonRegistrationPage.inputPassword("123456");
        amazonRegistrationPage.inputPasswordCheck("123456");
        amazonRegistrationPage.clickRegisterButton();
//      检查是否成功
        String name = amazonHomePage.getUsername();
        assertThat(name,is(NAME));
    }


    @After
    public void tearDown() throws Exception {
        WebdriverManager.getDriver().close();

    }

}
