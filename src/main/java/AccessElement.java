import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class AccessElement {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "D:\\Java\\SeleniumProjects\\drivers\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://github.com/");

        System.out.println(driver.findElements(By.xpath("/html/body/div[1]/header/div/div[2]/div[2]/div[2]/a")).size());

        if (driver.findElements(By.xpath("/html/body/div[1]/header/div/div[2]/div[2]/div[2]/a")).size()>0)
            System.out.println("Such element is presented");
        else System.out.println("Cannot find such element");


        driver.quit();
    }
}
