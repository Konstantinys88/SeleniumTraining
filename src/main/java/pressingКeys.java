import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class pressingКeys {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "D:\\Java\\SeleniumProjects\\drivers\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://en.wikipedia.org/");
        WebElement searchInput = driver.findElement(By.xpath("//*[@id=\"searchInput\"]"));

        String select = Keys.chord(Keys.CONTROL,"a");
        String cut = Keys.chord(Keys.CONTROL,"x");
        String paste = Keys.chord(Keys.CONTROL,"v");
        searchInput.sendKeys( "test");
        searchInput.sendKeys(select);
        searchInput.sendKeys(cut);
        searchInput.sendKeys(paste);
        searchInput.sendKeys(Keys.ENTER);

        Date dateNow = new Date();
        SimpleDateFormat format = new SimpleDateFormat("hh_mm_ss");
        String fileName = format.format(dateNow) + ".png";

        File screenshotn = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshotn, new File("D:\\Картинки\\"+fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}
