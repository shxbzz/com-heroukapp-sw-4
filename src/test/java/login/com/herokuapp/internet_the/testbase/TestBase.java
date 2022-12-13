package login.com.herokuapp.internet_the.testbase;

import login.com.herokuapp.internet_the.propertyreader.PropertyReader;
import login.com.herokuapp.internet_the.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase extends Utility {

    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod
    public void setUp(){
        selectBrowser(browser);
    }



    @AfterMethod
    public void tearDown(){
        closeBrowser();
    }
}
