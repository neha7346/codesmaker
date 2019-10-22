package selenium;



import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class DragandDrop {

public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub
String path;


path=System.getProperty("user.dir")+"\\Browser\\chromedriver.exe";
System.out.println(path);
System.setProperty("webdriver.chrome.driver",path);

WebDriver driver=new ChromeDriver();

driver.get("https://jqueryui.com");
driver.switchTo().frame(0);

Actions act=new Actions(driver);
act.clickAndHold(driver.findElement(By.id("draggable")))
.moveToElement(driver.findElement(By.id("droppable")))
.release().build().perform();
}

}


