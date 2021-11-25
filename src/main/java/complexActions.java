import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class complexActions {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "D:\\Java\\SeleniumProjects\\drivers\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://www.ebay.com/");

        WebElement link = driver.findElement(By.xpath("//li[@class = 'hl-cat-nav__js-tab']//a[text()='Электроника']"));
        WebElement element = driver.findElement(By.xpath("//li[@class = 'hl-cat-nav__js-tab']//a[text()='Электроника']"));


        Actions actions = new Actions(driver);

        actions.moveToElement(link).build().perform();
        actions.dragAndDrop(element,link).build().perform();
        actions.clickAndHold(element).moveToElement(link).release().build().perform();
        actions.doubleClick(element);
        actions.contextClick(element);

        Action action =  actions.clickAndHold(element).moveToElement(link).release().build();
        action.perform();







    }
}
