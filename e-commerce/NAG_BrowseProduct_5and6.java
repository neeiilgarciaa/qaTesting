package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class NAG_BrowseProduct_5and6 {
	
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
		
			//First Test Case: Searching a product name
			
			//Click Catalog
			driver.findElement(By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[2]/a/p")).click();
			//Click Products
			driver.findElement(By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[2]/ul/li[1]/a/p")).click();
			
			//Searching a product name (laptop)
			Thread.sleep(2000);
			driver.findElement(By.name("SearchProductName")).clear();
			driver.findElement(By.name("SearchProductName")).sendKeys("laptop");
			driver.findElement(By.id("search-products")).click();
			
			Thread.sleep(9000);
			
			//Next Test Case: Clicking the buttons
			
			//Clicking Add New button
			driver.findElement(By.xpath("/html/body/div[3]/div[1]/form[1]/div/div/a")).click();
			driver.findElement(By.xpath("/html/body/div[3]/div[1]/form/div[1]/h1/small/a")).click();
			Thread.sleep(2000);
			
			//Click Download to PDF
			driver.findElement(By.xpath("/html/body/div[3]/div[1]/form[1]/section/div/div/div/div[2]/div/div[2]/div[1]/div/div/div[1]/div/table/thead/tr/th[1]/input")).click();
			driver.findElement(By.name("download-catalog-pdf")).click();
			Thread.sleep(2000);
			
			//Click Export to Excel
			driver.findElement(By.xpath("/html/body/div[3]/div[1]/form[1]/div/div/div[1]/button[2]")).click();
			driver.findElement(By.name("exportexcel-all")).click();
			Thread.sleep(2000);
			
			//Click Import
			driver.findElement(By.name("importexcel")).click();
			driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/div/div/form/div/div[2]/button")).click();
			Thread.sleep(2000);
			
			//Click Delete
			driver.findElement(By.xpath("//*[@id=\"products-grid\"]/tbody/tr[1]/td[1]/input")).click();
			driver.findElement(By.xpath("/html/body/div[3]/div[1]/form[1]/div/div/button[3]")).click();
			driver.findElement(By.id("delete-selected-action-confirmation-submit-button")).click();
			Thread.sleep(3000);
			
			driver.close();
	}


}
