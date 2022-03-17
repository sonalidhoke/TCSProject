package demoQA;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkListDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Documents\\sonaliD\\selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/");
		
		 driver.manage().window().maximize();
	        Thread.sleep(4000);
	        

			WebElement ele = driver.findElement(By.xpath("//div//h5[text()='Elements']"));
			clk(ele,driver);
			Thread.sleep(4000);
			WebElement ele1 = driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-5']"));
			clk1(ele1,driver);
			Thread.sleep(4000);
			
			driver.findElement(By.xpath("//a[@id='simpleLink']")).click();
			
			//driver.switchTo().frame("home");
			List<WebElement> linklist=driver.findElements(By.xpath("a"));
			System.out.println("Total links are" +linklist.size());
			
			for(int i=0; i<linklist.size(); i++) {
			
				WebElement el=linklist.get(i);
				String url=el.getAttribute("href");
				verifyLinkActive(url);
			}
	}

	
	private static void verifyLinkActive(String linkurl) {
		try
		{
			URL url=new URL(linkurl);
			HttpURLConnection httpURL=(HttpURLConnection)url.openConnection();
			httpURL.setConnectTimeout(3000);
			httpURL.connect();
			
			if(httpURL.getResponseCode()==200) {
				System.out.println(linkurl+" - "+httpURL.getResponseMessage() );
			}
			
			if(httpURL.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND) {
				
				System.out.println(linkurl+" - "+httpURL.getResponseMessage()+ " - " + HttpURLConnection.HTTP_NOT_FOUND);
				
				
			}
			}
			catch(Exception e) {
				
			}
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
