package Entertainment;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UniAcco {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://unicreds.com/contact-us");
			//Full Name
			driver.findElement(By.xpath("//input[@id='fullname']")).sendKeys("raut barate");
			//Email
			driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("raut456@gmail.com");
			//dropDown select country code
			Select drpcontrycod = new Select (driver.findElement(By.xpath("//select[contains(@class,'p-2 pl-4 pr-4 m-2 mt-2 mb-2 form-control form-control-md')]")));
			drpcontrycod.selectByVisibleText("India (+91)");
			//phone no.
			driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("9874563210");
			//text-area
			driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("Your offers are really good");
			//button
			driver.findElement(By.xpath("//button[@id='contactButton']")).click();
			//validation
			boolean li = driver.findElement(By.xpath("//div[.='Message sent successfully!']")).isDisplayed();
			boolean fr = driver.findElement(By.xpath("//div[@class='text-left pl-2 m-1 invalid-feedback']")).isDisplayed();
			if(li)
			{
				System.out.println("Link is working");
			}
			else if(fr)
			{
				System.out.println("Link is working");
			}
			else
			{
				System.out.println("Link is not working ");
			}
			
		}

	}

