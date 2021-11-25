import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

//Работа с ссылками

public class Links {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "D:\\Java\\SeleniumProjects\\drivers\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

//        driver.get("https://en.wikipedia.org");
//
//        WebElement link = driver.findElement(By.xpath("//li[@id='n-aboutsite']/a"));
//        System.out.println(link.getText());
//        link.click();

        driver.get("https://github.com/");
//        driver.findElement(By.xpath("//li[@class = 'mr-0 mr-lg-3 edge-item-fix position-relative flex-wrap flex-justify-" +
//                "between flex-items-center border-bottom border-lg-bottom-0 d-block d-lg-flex flex-lg-nowrap flex-lg-items-center']" +
//                "//a[@class = 'HeaderMenu-link no-underline py-3 d-block d-lg-inline-block']")).click();
        driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/nav/ul/li[2]/a")).click();




        //driver.quit();

    }
}
