package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NAG_CheckOrderShipment_7 {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Neil Garcia\\Downloads\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://admin-demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
	
		driver.findElement(By.id("Email")).clear();
		Thread.sleep(2000);
		
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		
			driver.findElement(By.name("Password")).clear();
			driver.findElement(By.name("Password")).sendKeys("admin");
			
			driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
			
			//Click Sales
			driver.findElement(By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[3]/a/p")).click();
			
			//Display All Shipment
			driver.findElement(By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[3]/ul/li[2]/a")).click();
			driver.findElement(By.id("search-shipments")).click();
			Thread.sleep(2000);
			
			driver.close();
	}
}