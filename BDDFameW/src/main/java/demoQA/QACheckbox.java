package demoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QACheckbox {

	public static void main(String[] args) throws InterruptedException {
		
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Documents\\sonaliD\\selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/");
		
		 driver.manage().window().maximize();
	        Thread.sleep(4000);

		WebElement ele = driver.findElement(By.xpath("//div//h5[text()='Elements']"));
		clk(ele,driver);
		
		driver.findElement(By.xpath("//*[@id='item-1']")).click();  //*[@id="item-1"]/span
		//*[@id="tree-node"]/ol/li/span/label
		//span[@class='rct-text']//label[@for='tree-node-home']
		 Thread.sleep(4000);
		
		driver.findElement(By.xpath("//span[@class='rct-text']//label[@for='tree-node-home']")).click(); 

	}
	
	public static void clk(WebElement element,WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();",element);
	}
	

}
