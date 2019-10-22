package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	String path;
	public void locate()
	{
		path=System.getProperty("user.dir")+"/Browser/⁩chromedriver.exe";
	    System.out.println(path);
	    System.setProperty("webdriver.chrome.driver",path);
	  WebDriver driver = new ChromeDriver();
	  driver.navigate().to("https://www.facebook.com");
	  driver.findElement(By.id("email")).sendKeys("admin");
	  driver.findElement(By.id("password")).sendKeys("admin");
	  driver.close();
      	
 	}
	public static void main(String[] args)
	{
		Demo D=new Demo();
		D.locate();
	}
}
