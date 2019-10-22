





import org.testng.annotations.Test;

public class TestNgdemo {
	String str = "Welcome Admin";
@Test 
public void launch()
{
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver2");
	WebDriver drive =new ChromeDriver();
    drive.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
    drive.findElement(By.id("txtUsername")).sendKeys("Admin");
	drive.findElement(By.id("txtPassword")).sendKeys("admin123");
	drive.findElement(By.id("btnLogin")).click();
	
}
@Test
public void launch1()
{
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver");
	WebDriver drive =new ChromeDriver();
    drive.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
    drive.findElement(By.xpath("//*[@id=\"forgotPasswordLink\"]/a")).click();
    drive.findElement(By.id("securityAuthentication_userName")).sendKeys("Admin");
    drive.findElement(By.id("btnSearchValues")).click();
	
}
@Test
public void launch2()
{
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver");
	WebDriver drive =new ChromeDriver();
    drive.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
    drive.findElement(By.id("txtUsername")).sendKeys("Admin");
	drive.findElement(By.id("txtPassword")).sendKeys("admin123");
	drive.findElement(By.id("btnLogin")).click();
	drive.findElement(By.className("panelTrigger"));
	  if (str.contains("Welcome Admin")) 
	  {
          System.out.println("You are on correct page");
      } else {
          System.out.println("Not landing on correct page");
      }
}
}