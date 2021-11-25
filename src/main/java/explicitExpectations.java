import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class explicitExpectations {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "D:\\Java\\SeleniumProjects\\drivers\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://accounts.google.com/signin/v2/identifier?hl=ru&passive=true&continue=https%3A%2F%2Fwww.googl" +
                "e.ru%2F&ec=GAZAmgQ&flowName=GlifWebSignIn&flowEntry=ServiceLogin");


        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(driver1 -> driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/div/h1/span")));




        //driver.quit();
    }
}
