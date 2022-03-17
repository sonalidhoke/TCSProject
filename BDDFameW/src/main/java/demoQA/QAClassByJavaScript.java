package demoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QAClassByJavaScript {

	

			public static void main(String[] args) throws InterruptedException {
				
				
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Documents\\sonaliD\\selenium\\chromedriver.exe");

				WebDriver driver = new ChromeDriver();

				driver.get("https://demoqa.com/");
				
				 driver.manage().window().maximize();
			        Thread.sleep(4000);

				WebElement ele = driver.findElement(By.xpath("//div//h5[text()='Elements']"));
				clk(ele,driver);
				
				
				
				driver.findElement(By.xpath("//*[@id='item-0']")).click();
				Thread.sleep(4000);
		        driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("sonalidhoke");
		        Thread.sleep(4000);
		        
		        driver.findElement(By.xpath("//input[@type='email' and @id='userEmail']")).sendKeys("xyz@gmail.com");
		        Thread.sleep(4000);
		        driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("flat no 4 D wing chakan");
		        Thread.sleep(4000);
		        driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("flat no 4 D wing chakan nigadi");
		        Thread.sleep(4000);
		        driver.findElement(By.xpath("//button[@id='submit']")).click();
		        Thread.sleep(4000);
			}
			
			public static void clk(WebElement element,WebDriver driver) {
				JavascriptExecutor js = ((JavascriptExecutor) driver);
				js.executeScript("arguments[0].click();",element);
			}
			
			
			}

	

	


