import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

//работа с текстовыми полями
public class Text {

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "D:\\Java\\SeleniumProjects\\drivers\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

//        driver.get("https://en.wikipedia.org"); //ссылка на сайт
//        driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("Selenium WebDriver"); //ввод в панель поиска
//        driver.findElement(By.xpath("//input[@id='searchButton']")).click(); //нажатие кнопки поиск
//
//       // driver.findElement(By.xpath("//div[@id='searchText']/input")).getAttribute("value");
//        System.out.println(driver.findElement(By.xpath("//div[@id='searchText']/input")).getAttribute("value"));
//        driver.findElement(By.xpath("//div[@id='searchText']/input")).clear(); //очистка поля поиска


        driver.get("https://github.com/");
        WebElement button = driver.findElement(By.xpath("//div[@class = 'd-flex flex-column flex-sm-row flex-items-center']//button"));
        driver.findElement(By.xpath("//*[@id='user_email']")).sendKeys("KostyanRO@yandex.ru");
        driver.findElement(By.xpath("//div[@class = 'position-relative mr-3 mb-4 mb-lg-0 d-inline-block']//a")).click();
        driver.findElement(By.xpath("//*[@id='login_field']")).sendKeys("KostyanRO@yandex.ru");
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("123qwe");



        //driver.quit();

    }
}
