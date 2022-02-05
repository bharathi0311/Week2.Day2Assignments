package week2.Day2.Assignments;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {
public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.get("https://en-gb.facebook.com/");
driver.manage().window().maximize();
Thread.sleep(2000);
driver.findElement(By.linkText("Create New Account")).click();
driver.findElement(By.name("firstname")).sendKeys("FirstName");
driver.findElement(By.name("lastname")).sendKeys("LastName");
driver.findElement(By.name("reg_email__")).sendKeys("email@email.com");
driver.findElement(By.name("reg_passwd__")).sendKeys("9876543210");
Select dd = new Select(driver.findElement(By.id("day")));
dd.selectByValue("3");
Select mm = new Select(driver.findElement(By.id("month")));
mm.selectByVisibleText("Nov");
Select yy = new Select(driver.findElement(By.id("year")));
yy.selectByValue("2000");
driver.findElement(By.xpath("//label[text()='Female']/following-sibling::input[@value='1']")).click();
}
}
