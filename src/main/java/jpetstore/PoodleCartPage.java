package jpetstore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PoodleCartPage {
    public WebDriver driver;

    public By AddToCart = By.xpath("//*[@id='Catalog']/table/tbody/tr[2]/td[5]/a");

    public void AddToCart(){
        driver.findElement(AddToCart).click();
    }

}
