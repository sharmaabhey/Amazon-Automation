package amazon_testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import amazon_pages.config_reader;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_test extends config_reader {
    
    
    protected WebDriver driver;
    
    
    
    @BeforeMethod
    
    
    public void launch_app() throws IOException {
        //System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
        
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://iengage.coforge.com/ess2/Login");
    
    
    }
    
    
    
    @AfterMethod
    
    public void close_app() {
        
        driver.quit();
    }

}
