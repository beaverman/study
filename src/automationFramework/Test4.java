package automationFramework;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Test4 {

	public static void main(String[] args) throws InterruptedException {
		
		driver = new StartWebDriver("ff").init();
		driver.get("http://dhtmlx.com/docs/products/dhtmlxTree/");
				
		Actions drugger = new Actions(driver);
		WebElement From = driver.findElement(By.xpath(".//*[@id='treebox1']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));
		WebElement To = driver.findElement(By.xpath(".//*[@id='treebox2']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[3]/td[2]/table/tbody/tr[1]/td[4]/span"));
				
		Action drugndrop = drugger.clickAndHold(From).dragAndDrop(From, To).release(To).build();
		drugndrop.perform();
		
		Thread.sleep(4000);
		
		driver.close();
		
		
		driver = new StartWebDriver("ch").init();
		driver.get("http://www.coldsteel.com/");
		
		WebElement productButton = driver.findElement(By.xpath(".//*[@id='csMenu']/li[1]"));
		WebElement knives = driver.findElement(By.xpath(".//*[@id='csMenu']/li[1]/div/div[3]/ul/li[1]"));
		
		Actions drugger2 = new Actions(driver);
		drugger2.moveToElement(productButton).moveToElement(knives).click().perform();
		
		driver.close();
	}

	public static WebDriver driver;
}