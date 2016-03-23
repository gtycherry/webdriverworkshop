package Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by tyguo on 7/14/14.
 */
public class WebdriverManager {
    private  static WebDriver driver = null;

    public  static WebDriver getDriver(){
        if (driver==null){
            driver = new ChromeDriver();
}
        return driver;
    }
}
