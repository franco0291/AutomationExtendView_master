package src.Base;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseTest {
    public WebDriver driver;

    @BeforeMethod
    public WebDriver initializeDriver() throws IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\frank\\Desktop\\Extend-View-Browser-Project-test_1\\Automation Project EV\\src\\Resources\\data.properties");
        //C:\Users\frank\IdeaProjects\GBAtemp\src\main\resources\driver
        prop.load(fis);
        String browserName = prop.getProperty("browser");

        if (browserName.equals("Chrome"))
        {
            System.out.println("Testing on " + browserName + "Browser");
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if (browserName.equals("firefox"))
        {
            System.out.println("Testing on " + browserName + "Browser");
            driver = new FirefoxDriver();
        }

        return driver;
    }

    @AfterMethod
    public void TearDown()
    {
        driver.close();
        driver.quit();
    }
    public String randomString() {

        int length = 5;
        boolean useLetters = true;
        boolean useNumbers = true;
        String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
        return generatedString;
    }


}



