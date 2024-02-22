
import jpetstore.DogPage;
import jpetstore.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class AddProductToCartTest {
    private WebDriver driver;

//    @BeforeMethod
//    public void OpenBrowser() {
//        WebDriver driver = new ChromeDriver();
//        driver.navigate().to("https://petstore.octoperf.com/actions/Catalog.action");
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//    }

    @Test
    public void testAddingDogsToCart() {
       WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://petstore.octoperf.com/actions/Catalog.action");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//*[@id='QuickLinks']/a[2]/img")).click();
        driver.findElement(By.xpath("//*[@id='Catalog']/table/tbody/tr[3]/td[1]/a")).click();
        driver.findElement(By.xpath("//*[@id='Catalog']/table/tbody/tr[2]/td[5]/a")).click();
        driver.navigate().back();
        driver.navigate().back();
        driver.findElement(By.xpath("//*[@id='Catalog']/table/tbody/tr[4]/td[1]/a")).click();
        driver.findElement(By.xpath("//*[@id='Catalog']/table/tbody/tr[2]/td[5]/a")).click();

        Assert.assertEquals(2,2);

    }


}