package Nani;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HandlingDynamicTable {

	@Test(priority = 1,invocationCount = 1,enabled = true)
	void dynamicTableHandlingTest()
	{
		String Browser1="Chrome";
		String Browser2="Firefox";
		String Browser3="Internet Explorer";
		String Browser4="System";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.navigate().to("https://practice.expandtesting.com/dynamic-table");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,350);");
		
		//Chrome Details
		
		String ChromeNamevalue = driver.findElement(By.xpath("//table[@class='table table-striped']//tr/td[contains(text(),'"+Browser1+"')]")).getText();
		
		System.out.println(Browser1+" Browser Name="+ChromeNamevalue);
		
		String ChromeCpuvalue = driver.findElement(By.xpath("//table[@class='table table-striped']//tr/td[contains(text(),'"+Browser1+"')]//following-sibling::td[contains(text(),'%')]")).getText();
		
		System.out.println(Browser1+" Cpu Value="+ChromeCpuvalue);
		
        List<WebElement> TwoElements = driver.findElements(By.xpath("//table[@class='table table-striped']//tr/td[contains(text(),'"+Browser1+"')]//following-sibling::td[contains(text(),'MB')]"));
		
		for(WebElement Two : TwoElements)
		{
			String Value = Two.getText();
			if(Value.contains("MB/s"))
			{
				System.out.println(Browser1+" Disk Value="+Value);
			}
			else
			{
				System.out.println(Browser1+" Memory Value="+Value);
			}
		}
		
        String ChromeNetworkvalue = driver.findElement(By.xpath("//table[@class='table table-striped']//tr/td[contains(text(),'"+Browser1+"')]//following-sibling::td[contains(text(),'Mbps')]")).getText();
		
		System.out.println(Browser1+" Network Value="+ChromeNetworkvalue);
		
		//Firefox Details
		
		String FirefoxNamevalue = driver.findElement(By.xpath("//table[@class='table table-striped']//tr/td[contains(text(),'"+Browser2+"')]")).getText();
		
		System.out.println(Browser2+" Browser Name="+FirefoxNamevalue);
		
		String FirefoxCpuvalue = driver.findElement(By.xpath("//table[@class='table table-striped']//tr/td[contains(text(),'"+Browser2+"')]//following-sibling::td[contains(text(),'%')]")).getText();
		
		System.out.println(Browser2+" Cpu Value="+FirefoxCpuvalue);
		
        List<WebElement> TwooElements = driver.findElements(By.xpath("//table[@class='table table-striped']//tr/td[contains(text(),'"+Browser2+"')]//following-sibling::td[contains(text(),'MB')]"));
		
		for(WebElement Two : TwooElements)
		{
			String Value = Two.getText();
			if(Value.contains("MB/s"))
			{
				System.out.println(Browser1+" Disk Value="+Value);
			}
			else
			{
				System.out.println(Browser1+" Memory Value="+Value);
			}
		}
		
        String FirefoxNetworkvalue = driver.findElement(By.xpath("//table[@class='table table-striped']//tr/td[contains(text(),'"+Browser2+"')]//following-sibling::td[contains(text(),'Mbps')]")).getText();
		
		System.out.println(Browser2+" Network Value="+FirefoxNetworkvalue);
		
		//Internet Explorer Details
		
        String InternetExplorerNamevalue = driver.findElement(By.xpath("//table[@class='table table-striped']//tr/td[contains(text(),'"+Browser3+"')]")).getText();
		
		System.out.println(Browser3+" Browser Name="+InternetExplorerNamevalue);
		
		String InternetExplorerCpuvalue = driver.findElement(By.xpath("//table[@class='table table-striped']//tr/td[contains(text(),'"+Browser3+"')]//following-sibling::td[contains(text(),'%')]")).getText();
		
		System.out.println(Browser3+" Cpu Value="+InternetExplorerCpuvalue);
		
        List<WebElement> TwoooElements = driver.findElements(By.xpath("//table[@class='table table-striped']//tr/td[contains(text(),'"+Browser3+"')]//following-sibling::td[contains(text(),'MB')]"));
		
		for(WebElement Two : TwoooElements)
		{
			String Value = Two.getText();
			if(Value.contains("MB/s"))
			{
				System.out.println(Browser3+" Disk Value="+Value);
			}
			else
			{
				System.out.println(Browser3+" Memory Value="+Value);
			}
		}
		
        String InternetExplorerNetworkvalue = driver.findElement(By.xpath("//table[@class='table table-striped']//tr/td[contains(text(),'"+Browser3+"')]//following-sibling::td[contains(text(),'Mbps')]")).getText();
		
		System.out.println(Browser3+" Network Value="+InternetExplorerNetworkvalue);
		
		
		//System Details
		
        String SystemNamevalue = driver.findElement(By.xpath("//table[@class='table table-striped']//tr/td[contains(text(),'"+Browser4+"')]")).getText();
		
		System.out.println(Browser4+" Browser Name="+SystemNamevalue);
		
		String SystemCpuvalue = driver.findElement(By.xpath("//table[@class='table table-striped']//tr/td[contains(text(),'"+Browser4+"')]//following-sibling::td[contains(text(),'%')]")).getText();
		
		System.out.println(Browser4+" Cpu Value="+SystemCpuvalue);
		
        List<WebElement> TwooooElements = driver.findElements(By.xpath("//table[@class='table table-striped']//tr/td[contains(text(),'"+Browser4+"')]//following-sibling::td[contains(text(),'MB')]"));
		
		for(WebElement Two : TwooooElements)
		{
			String Value = Two.getText();
			if(Value.contains("MB/s"))
			{
				System.out.println(Browser4+" Disk Value="+Value);
			}
			else
			{
				System.out.println(Browser4+" Memory Value="+Value);
			}
		}
		
        String SystemNetworkvalue = driver.findElement(By.xpath("//table[@class='table table-striped']//tr/td[contains(text(),'"+Browser4+"')]//following-sibling::td[contains(text(),'Mbps')]")).getText();
		
		System.out.println(Browser4+" Network Value="+SystemNetworkvalue);
		
	}
	
	
	@Test(priority = 2,invocationCount = 1,enabled = true)
	void dropDownOptionsSortingTest()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,450);");
		
		WebElement drpDwn = driver.findElement(By.xpath("//select[@id='colors']"));
		//select[@id='animals']
		
		Select dropDown = new Select(drpDwn);
		
		ArrayList<String> oList = new ArrayList<String>();
		ArrayList<String> tList = new ArrayList<String>();
		
		List<WebElement> options = dropDown.getOptions();
		
		for(WebElement option : options)
		{
			oList.add(option.getText());
			tList.add(option.getText());
		}
		
		System.out.println("Before Sorting");
		System.out.println(oList+"\n"+tList);
		
	    Collections.sort(tList);
		System.out.println("After Sorting");
		System.out.println(oList+"\n"+tList);
		
		if(oList.equals(tList))
		{
			System.out.println("List box is sorted");
		}
		else
		{
			System.out.println("List box is not sorted");
		}
	}
	
	
	@Test(priority = 1,invocationCount = 1,enabled = false)
	void checkBoxHandlingTest()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.navigate().to("https://itera.qa.azurewebsites.net/home/automation");
	}
	
}
