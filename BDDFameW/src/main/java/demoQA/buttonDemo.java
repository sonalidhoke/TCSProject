package demoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class buttonDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Documents\\sonaliD\\selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/");
		
		 driver.manage().window().maximize();
	        Thread.sleep(4000);
	        

			WebElement ele = driver.findElement(By.xpath("//div//h5[text()='Elements']"));
			clk(ele,driver);
			Thread.sleep(4000);
			WebElement ele1 = driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-4']"));
			clk1(ele1,driver);
			Thread.sleep(4000);
			
			Actions act=new Actions(driver);
			act.doubleClick(driver.findElement(By.xpath("//button[@id='doubleClickBtn']"))).perform();
			
			
			//driver.findElement(By.xpath("//button[@id='doubleClickBtn']")).click();
			
//			WebElement ele2 = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
//			clk2(ele2,driver);
			
			//driver.findElement(By.xpath("//button[@id='NmU8Z' and @type='button']")).click();

	}
	
	public static void clk(WebElement element,WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();",element);
	}
	
	public static void clk1(WebElement element,WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();",element);
	}
	
//	public static void clk2(WebElement element,WebDriver driver) {
//		JavascriptExecutor js = ((JavascriptExecutor) driver);
//		js.executeScript("arguments[0].click();",element);
//	}


}
