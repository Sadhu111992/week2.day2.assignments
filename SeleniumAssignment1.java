package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumAssignment1 {
	private static WebElement webElement;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		
		WebElement usernameElement= driver.findElement(By.id("username"));
		usernameElement.sendKeys("DemosalesManager");
		
		WebElement passwordElement = driver.findElement(By.name("PASSWORD"));
		passwordElement.sendKeys("crmsfa");
		
		WebElement loginElement = driver.findElement(By.className("decorativeSubmit"));
		loginElement.click();
		
		WebElement crmsfaElement = driver.findElement(By.linkText("CRM/SFA"));
		crmsfaElement.click();
		
		WebElement leadsElement = driver.findElement(By.linkText("Leads"));
		leadsElement.click();
		
		WebElement createLeadElement = driver.findElement(By.linkText("Create Lead"));
		createLeadElement.click();
		
		WebElement companyNameElement= driver.findElement(By.id("createLeadForm_companyName"));
		companyNameElement.sendKeys("Comcast");
		
		WebElement firstNameElement= driver.findElement(By.id("createLeadForm_firstName"));
		firstNameElement.sendKeys("Sadhana");
		
		WebElement lastNameElement= driver.findElement(By.id("createLeadForm_lastName"));
		lastNameElement.sendKeys("Manickavel");
		
		WebElement localNameElement= driver.findElement(By.id("createLeadForm_firstNameLocal"));
		localNameElement.sendKeys("Sadhu");
		
		WebElement departmentNameElement= driver.findElement(By.id("createLeadForm_departmentName"));
		departmentNameElement.sendKeys("IT");
		
		WebElement descriptionElement= driver.findElement(By.id("createLeadForm_description"));
		descriptionElement.sendKeys("This is an example");
		
		WebElement emailElement= driver.findElement(By.id("createLeadForm_primaryEmail"));
		emailElement.sendKeys("sadhana@gmail.com");
		
		WebElement elementOwnerDropDown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd = new Select(elementOwnerDropDown);
		dd.selectByVisibleText("New York");
		
		WebElement submitElement= driver.findElement(By.name("submitButton"));
		submitElement.click();
		
		System.out.println("The title is "+ driver.getTitle());
		
	}
}
