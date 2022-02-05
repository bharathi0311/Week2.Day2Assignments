package week2.Day2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {
		public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("FirstName");
		driver.findElement(By.id("lastNameField")).sendKeys("LastName");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("LocalFirstName");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("LocalLastName");
		driver.findElement(By.name("departmentName")).sendKeys("TESTING");
		driver.findElement(By.name("description")).sendKeys("TESTING DESCRIPTION");
		driver.findElement(By.name("primaryEmail")).sendKeys("bhartidg03@gmail.com");
		Select stateProvince = new Select(driver.findElement(By.id("createContactForm_generalStateProvinceGeoId")));
		stateProvince.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.name("importantNote")).sendKeys("TESTING-importantNote");
		driver.findElement(By.xpath("//input[@value='Update']")).click();		
		String Title = driver.findElement(By.id("sectionHeaderTitle_contacts")).getText();
		System.out.println(Title);
//		driver.close();
	}
}
