package Testing;

 

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;




public class Action {
	@Test
	public static void testing() throws InterruptedException
	{
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\archana.gaikwad\\Documents\\Barter\\MOCI01\\src\\test\\resources\\drivers\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver(); 
        driver.manage().window().maximize();
        System.out.println("Hello Google...");  
        driver.get("http://inidrrmstsrv01:8080/rms/dashboard/userdashboard");	
		driver.findElement(By.linkText("Edit Profile")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
	
		 
		 
		Thread.sleep(3000);
		
	//*****************************Method1*********************************
	/*	for (int i=1;i<=300;i++)
		{
			
			String sColValue1 = "Ftty";
			
			WebElement element = driver.findElement(By.xpath(".//*[@id='skillsList']/div/ul/li["+i+"]/div[1]"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			
			Thread.sleep(500); 
			String sColValue = driver.findElement(By.xpath("html/body/table/tbody/tr/td/div/div/div/div[2]/div[1]/form/table[2]/tbody/tr[1]/td[1]/ol/li/div[3]/div[3]/div/ul/li["+i+"]/div[1]")).getText();
	
			if(sColValue.equalsIgnoreCase(sColValue1))
			{
				
			
				 driver.findElement(By.xpath("html/body/table/tbody/tr/td/div/div/div/div[2]/div[1]/form/table[2]/tbody/tr[1]/td[1]/ol/li/div[3]/div[3]/div/ul/li["+i+"]/input[2]")).click();
				 
				 Select dropdown1 = new Select(driver.findElement(By.xpath("html/body/table/tbody/tr/td/div/div/div/div[2]/div[1]/form/table[2]/tbody/tr[1]/td[1]/ol/li/div[3]/div[3]/div/ul/li["+i+"]/div[2]/select")));
				 dropdown1.selectByIndex(3);
				 driver.findElement(By.xpath("//input[@id='primarySkill_Id:"+i+"']")).click();
				 break;
			}
		
		}*/
		
		
		//*******************************Method2*******************************
		for (int i=1;i<=300;i++)
		{
			
			String sColValue1 = "UNIX";
			WebElement element = driver.findElement(By.xpath(".//*[@id='skillsList']/div/ul/li["+i+"]/div[1]"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			
			Thread.sleep(500); 
			String sColValue = driver.findElement(By.xpath("html/body/table/tbody/tr/td/div/div/div/div[2]/div[1]/form/table[2]/tbody/tr[1]/td[1]/ol/li/div[3]/div[3]/div/ul/li["+i+"]/div[1]")).getText();
	
			if(sColValue.equalsIgnoreCase(sColValue1))
			{
				int j=i-1;
				driver.findElement(By.xpath("//input[@id='primarySkill_Id:"+j+"']")).click();
				break;
			}
	 
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='save']")).click();
		
		driver.findElement(By.xpath("//div[contains(.,'  SuccessYour profile has been updated successfully!!')]")).getText().toString();
	
		if (driver.findElement(By.xpath("//div[contains(.,'  SuccessYour profile has been updated successfully!!')]")).isDisplayed())
		{
		String message = driver.findElement(By.xpath("//div[contains(.,'  SuccessYour profile has been updated successfully!!')]")).getText();
		
		System.out.println(message);
		
		}

}
	
	



}