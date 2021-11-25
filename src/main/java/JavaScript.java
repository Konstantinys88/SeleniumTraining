import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class JavaScript {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "D:\\Java\\SeleniumProjects\\drivers\\geckodriver.exe");
//        System.setProperty("webdriver.chrome.driver","D:\\Java2\\chromedriver\\chromedriver.exe");

        WebDriver driver = new FirefoxDriver();
//        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://en.wikipedia.org/wiki/Main_Page");

       JavascriptExecutor jse = (JavascriptExecutor) driver;
       jse.executeScript("window.scrollBy(0,1000)","");
        jse.executeScript("window.scrollBy(0,-1000)","");




    }
}
