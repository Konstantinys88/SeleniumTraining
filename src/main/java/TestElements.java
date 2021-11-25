import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class TestElements {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "D:\\Java\\SeleniumProjects\\drivers\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

//        driver.get("https://www.w3schools.com/jsref/prop_pushbutton_disabled.asp");
//        WebElement button1 = driver.findElement(By.xpath("/html/body/div[7]/div[1]/div[1]/div[2]/a"));
//        System.out.println(button1.isEnabled());
//        if(button1.isEnabled()) button1.click();

        driver.get("https://kwork.ru/usability-testing/13101747/bystroe-testirovanie-sayta?utm_medium=cpc&utm_source=yandex&utm_campaign=Obschaya-Dinamicheskaya_po_fidu-Poisk-MIR-NS&utm_term=&utm_content=cid:59102573|ct:type3|gr:4458657528|b:10260177076|kw:|ph:1575334|drf:no|mt:|mkw:|st:search|s:none|p:2|pt:premium|dt:desktop|regn:|regid:0|intid:|cf:0|re:%D0%A0%D0%B0%D0%B7%D1%80%D0%B0%D0%B1%D0%BE%D1%82%D0%BA%D0%B0%20%D0%B8%20IT|creoid:0|adtrgn:%D0%A0%D0%B0%D0%B7%D1%80%D0%B0%D0%B1%D0%BE%D1%82%D0%BA%D0%B0%20%D0%B8%20IT|adtrgid:1575334|main&yclid=4857912294831816703");
        WebElement rb1 = driver.findElement(By.xpath("//*[@id=\"order-extra-block-20305236-right\"]"));

        rb1.click();
        System.out.println(rb1.isSelected());


    }
}
