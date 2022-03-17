package demoQA;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Documents\\sonaliD\\selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/");
		
		 driver.manage().window().maximize();
	        Thread.sleep(4000);
	        

			WebElement ele = driver.findElement(By.xpath("//div//h5[text()='Elements']"));
			clk(ele,driver);
			Thread.sleep(4000);
			WebElement ele1 = driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-3']"));
			clk1(ele1,driver);
			
			driver.findElement(By.xpath("//button[@id='addNewRecordButton']")).click();
			Thread.sleep(4000);
			
			driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("sonali");
			
			driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("dhoke");
			
			driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("xyz@gmail.com");
			
			driver.findElement(By.xpath("//input[@id='age']")).sendKeys("33");
			
			driver.findElement(By.xpath("//input[@id='salary']")).sendKeys("33000");
			
			driver.findElement(By.xpath("//input[@id='department']")).sendKeys("33000");
			
			driver.findElement(By.xpath("//button[@id='submit']")).click();
			
			//driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-3']")).click();
//			List<WebElement> allHeaders=driver.findElements(By.xpath("//div[@class='rt-thead -header']"));
//			System.out.println(allHeaders.size());
//			
//			for(WebElement el:allHeaders) {
//				String value=el.getText();
//				System.out.println(value);
//			}
//			driver.quit();

	}

	public static void clk(WebElement element,WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();",element);
	}
	
	public static void clk1(WebElement element,WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();",element);
	}
}
