import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Window {
    public static void main(String[] args) {
//        System.setProperty("webdriver.gecko.driver", "D:\\Java\\SeleniumProjects\\drivers\\geckodriver.exe");
//        WebDriver driver = new FirefoxDriver();

        System.setProperty("webdriver.chrome.driver", "D:\\Java2\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://yandex.ru/");
        String mainWindow = driver.getWindowHandle();

        driver.findElement(By.xpath("//div[text()='Картинки']")).click();

        for (String windowHandle:driver.getWindowHandles()){
            driver.switchTo().window(windowHandle);
        }

        driver.findElement(By.xpath("//a[text()='Новости']")).click();
        driver.switchTo().window(mainWindow);
        driver.findElement(By.xpath("//*[@id=\"text\"]")).sendKeys("Егор топор");




        //driver.quit();


    }
}
