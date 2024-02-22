package jpetstore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    public WebDriver driver;
    public By dogsLink = By.xpath("//*[@id='QuickLinks']/a[2]/img");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnDogsLink() {
        driver.findElement(dogsLink).click();
    }
}