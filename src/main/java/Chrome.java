import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Chrome {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Java2\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

    }
}
