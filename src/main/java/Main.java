import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().setSize(new Dimension(1920, 1080));

        driver.get("https://demoqa.com/text-box");
     




    }
}
