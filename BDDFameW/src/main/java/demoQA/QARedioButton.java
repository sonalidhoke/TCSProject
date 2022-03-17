package demoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QARedioButton {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Documents\\sonaliD\\selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/");
		
		 driver.manage().window().maximize();
	        Thread.sleep(4000);

		WebElement ele = driver.findElement(By.xpath("//div//h5[text()='Elements']"));
		clk(ele,driver);
		Thread.sleep(4000);
		WebElement ele1 = driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-2']"));
		clk1(ele1,driver);
		
		//driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-2']")).click(); //radio button
		//driver.findElement(By.ByPartialLinkText)
		//driver.findElement(By.linkText("Radio Button")).click();
		Thread.sleep(4000);
		WebElement ele2 = driver.findElement(By.xpath("//input[@type='radio'  and @id='yesRadio']"));
		clk2(ele2,driver);
		//driver.findElement(By.xpath("//input[@type='radio'  and @id='yesRadio']")).click(); 
		
		
	}
	
	public static void clk(WebElement element,WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();",element);
	}
	public static void clk1(WebElement element,WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();",element);
	}
	
	public static void clk2(WebElement element,WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();",element);
	}

}
