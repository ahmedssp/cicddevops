package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pag1 {
    private WebDriver driver;

    public pag1(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    private static By searchBox2 = By.xpath("//div[@jscontroller=\"vZr2rb\"]");
    private static By searchBox3 = By.name("q");
    private static By searchBox = By.id("APjFqb");


    // Actions
    public void enterSearchText(String searchText) {
        driver.findElement(searchBox).sendKeys(searchText);
    }

    public  void submitSearch() {
        driver.findElement(searchBox).submit();
    }

    public  void acceptCookiesIfPresent() {
        try {
            WebElement agreeButton = driver.findElement(By.xpath("//div[contains(text(),'I agree') or contains(text(),'Accept all')]"));
            agreeButton.click();
        } catch (Exception e) {
            // No cookie popup
        }
    }

}
