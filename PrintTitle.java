package week2.Day2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintTitle {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://acme-test.uipath.com/login");
	driver.manage().window().maximize();
	driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
	driver.findElement(By.id("password")).sendKeys("leaf@12");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	String title = driver.findElement(By.xpath("(//h1)[2]")).getText();
	System.out.println("Title of the webage is '"+title+"'");
}
}
