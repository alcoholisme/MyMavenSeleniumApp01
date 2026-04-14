import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {
    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new"); // critical
        options.addArguments("--no-sandbox");   // critical for Jenkins
        options.addArguments("--disable-dev-shm-usage"); // prevents crashes
        options.addArguments("--disable-gpu");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());

        driver.quit();
    }
}
