import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.nio.file.WatchEvent;
import java.time.Duration;

public class Tables {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "D:\\Java\\SeleniumProjects\\drivers\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://www.w3schools.com/html/html_tables.asp");

        WebElement tableElement = driver.findElement(By.xpath("//*[@id=\"customers\"]"));

        Table table = new Table(tableElement,driver);

        System.out.println("Rows numder is:" + table.getRows().size());
        System.out.println(table.getValueFromCell(2,3));
        System.out.println(table.getValueFromCell(4,1));

        System.out.println(table.getValueFromCell(4,"Company"));
        System.out.println(table.getValueFromCell(2,"Contact"));
        System.out.println(table.getValueFromCell(1,"Country"));




        //driver.quit();

    }
}
