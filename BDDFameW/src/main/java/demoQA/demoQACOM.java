package demoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoQACOM {
	
	 public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Documents\\sonaliD\\selenium\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://demoqa.com/elements");
        driver.manage().window().maximize();
        Thread.sleep(4000);
     // driver.findElement(By.xpath("//div[@class='category-cards']//div[@class='card mt-4 top-card'][1]")).click();
        //Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id='item-0']")).click();
        driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("sonalidhoke");
        driver.findElement(By.xpath("//input[@type='email' and @id='userEmail']")).sendKeys("xyz@gmail.com");
        driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("flat no 4 D wing chakan");
        driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("flat no 4 D wing chakan nigadi");
        driver.findElement(By.xpath("//button[@id='submit']")).click();
       	
	}

}
