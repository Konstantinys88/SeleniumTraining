import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Alert {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "D:\\Java\\SeleniumProjects\\drivers\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get("https://yandex.ru/");
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("confirm('Are yor sure?');");
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

      //  driver.switchTo().alert().accept();
        driver.switchTo().alert().dismiss();



    }
}
