import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.pag1;

public class base {
    protected WebDriver driver;
    public pag1 paginsc;
    @BeforeMethod
    public void start() {
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        paginsc =new pag1(driver);

    }
    @AfterMethod
    public void end() {
        driver.quit();
    }
}
