import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class UploadingFiles {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "D:\\Java\\SeleniumProjects\\drivers\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://www.google.ru/imghp?hl=ru&ogbl");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[3]/div[2]/span")).click();
        driver.findElement(By.xpath("//a[text()=\"Загрузить изображение\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"awyMjb\"]")).sendKeys("D:\\Картинки\\scr1.png");
    }
}
