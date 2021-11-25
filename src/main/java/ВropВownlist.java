import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class ВropВownlist {

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "D:\\Java\\SeleniumProjects\\drivers\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://mosregister99.com/");

        driver.findElement(By.xpath("//*[@id=\"select1\"]")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/article/div/div/div[3]/section/div[2]/" +
                "table/tbody/tr/td[2]/div[1]/form/fieldset/div[1]/select/option[6]")).click();



        //driver.quit();

    }
}
