import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class CheccBox {

    static WebDriver driver;


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "D:\\Java\\SeleniumProjects\\drivers\\geckodriver.exe");

        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://www.eldorado.ru/c/televizory/f/smart-tv/");

        driver.findElement(By.xpath("//a[text()='Samsung']/ancestor::div[2]/child::*[1]")).click();
        Thread.sleep(2000);

        System.out.println( driver.findElement(By.xpath("//a[text()='Samsung']/ancestor::div[2]/child::*[1]")).isSelected());

        //взять текст LO MO и сравнивать его через if else

//        selectCheckBox("Samsung");
//        selectCheckBox("LG");


        //driver.quit();
    }

    public static void selectCheckBox(String name){
        String rbXpatx = "//a[text()='%s']";
        if (!driver.findElement(By.xpath(String.format(rbXpatx,name))).isSelected())
            driver.findElement(By.xpath(String.format(rbXpatx,name))).click();
    }

}
