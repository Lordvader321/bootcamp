package jpetstore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DogPage {
    public WebDriver driver;
    public By poodleButton = By.xpath("//*[@id='Catalog']/table/tbody/tr[3]/td[1]/a");
    //private By dalmatianButton = By.xpath("//*[@id='Catalog']/table/tbody/tr[4]/td[1]/a");

    public void PoodleButton() {
        driver.findElement(poodleButton).click();
        driver.findElement(By.xpath("//*[@id='Catalog']/table/tbody/tr[3]/td[1]/a")).click();
    }


}

