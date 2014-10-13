package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    public static WebElement signInButton (WebDriver driver) {
        WebElement element = driver.findElement(By.xpath(".//*[@id='gb_70']"));
        return element;
    }

}
