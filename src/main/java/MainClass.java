import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

//РАБОТА С КНОПКАМИ

public class MainClass {

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "D:\\Java\\SeleniumProjects\\drivers\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://en.wikipedia.org");

//        WebElement link = driver.findElement(By.linkText("Log in"));
//        WebElement link2 = driver.findElement(By.linkText("Donate"));
//        WebElement searchField = driver.findElement(By.name("search"));
//        WebElement searchButton = driver.findElement(By.className("searchButton"));
//        WebElement byId = driver.findElement(By.id("ca-history"));
//        WebElement tag = driver.findElement(By.tagName("input"));
//        WebElement element = driver.findElement(By.cssSelector(""));

//        WebElement xPath = driver.findElement(By.xpath("//div[@id='mw-panel']/div[@id='p-logo']//a"));

        driver.findElement(By.xpath("//input[@id='searchButton']")).click();

        driver.get("https://github.com/");
        WebElement button = driver.findElement(By.xpath("//div[@class = 'd-flex flex-column flex-sm-row flex-items-center']//button"));

        if(button.getText().equals("Sign up for GitHub")){
            System.out.println("Success!!");
        }
        else System.out.println("Fail!");

        //System.out.println(button.getText());
        //button.submit();

        driver.findElement(By.xpath("//div[@class = 'position-relative mr-3 mb-4 mb-lg-0 d-inline-block']//a")).click();


        // driver.quit();


    }
}
