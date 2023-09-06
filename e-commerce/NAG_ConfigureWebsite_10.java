package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NAG_ConfigureWebsite_10 {
	
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
			
			//Click Configure
			driver.findElement(By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[7]/a/p")).click();
			driver.findElement(By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[7]/ul/li[1]/a")).click();
			driver.findElement(By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[7]/ul/li[1]/ul/li[1]/a/p")).click();
			
			//Click boxes
			driver.findElement(By.xpath("/html/body/div[3]/div[1]/form/section/div/div/nop-cards/nop-card[2]/div/div[2]/div[1]/div[2]/input")).click();
			driver.findElement(By.xpath("/html/body/div[3]/div[1]/form/section/div/div/nop-cards/nop-card[2]/div/div[2]/div[2]/div[2]/input")).click();
			driver.findElement(By.xpath("/html/body/div[3]/div[1]/form/section/div/div/nop-cards/nop-card[2]/div/div[2]/div[3]/div[2]/input")).click();
			driver.findElement(By.xpath("/html/body/div[3]/div[1]/form/section/div/div/nop-cards/nop-card[2]/div/div[2]/div[4]/div[2]/input")).click();
			driver.findElement(By.xpath("/html/body/div[3]/div[1]/form/section/div/div/nop-cards/nop-card[2]/div/div[2]/div[5]/div[2]/input")).click();
			driver.findElement(By.xpath("/html/body/div[3]/div[1]/form/section/div/div/nop-cards/nop-card[2]/div/div[2]/div[6]/div[2]/input")).click();
			driver.findElement(By.xpath("/html/body/div[3]/div[1]/form/section/div/div/nop-cards/nop-card[2]/div/div[2]/div[7]/div[2]/input")).click();
			
			//Save
			driver.findElement(By.name("save")).click();
			Thread.sleep(2000);
			driver.close();
	}
}
