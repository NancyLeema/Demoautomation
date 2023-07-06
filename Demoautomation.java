package seliniumproject7;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;


public class Demoautomation {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://demo.automationtesting.in//");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("nancyleema.k0911@gmail.com");
		driver.findElement(By.id("enterimg")).click();
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("Nancyleema");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("Kaarunakaran");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("No.8,Thulukanathamman koil,8th cross street,Pallikaranai,Chennai-600100");
		driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("nancyleema.k0911@gmail.com");
		TakesScreenshot srcshot=(TakesScreenshot)driver;
		File src=srcshot.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\Admin\\Desktop\\screenshot\\snap2.jpg");
		FileHandler.copy(src, des);
	
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("7358339748");
		WebElement Male=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input"));
		Male.click();
		Male.click();
		WebElement FeMale=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input"));
		FeMale.click();
		WebElement Cricket=driver.findElement(By.id("checkbox1"));
		Cricket.click();
		WebElement Movies=driver.findElement(By.id("checkbox2"));
		Movies.click();
		WebElement Hockey=driver.findElement(By.id("checkbox3"));
		Hockey.click();
		Hockey.click();
		Movies.click();
		Cricket.click();
		Cricket.click();
		Movies.click();
		WebElement skills=driver.findElement(By.id("Skills"));
		Select myskills=new Select(skills);
		myskills.selectByValue("Java");
		WebElement countries=driver.findElement(By.id("countries"));
		Select mycountries=new Select(countries);
		WebElement dropdown=driver.findElement(By.id("yearbox"));
		WebElement dropdown1=driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[11]/div[2]/select[1]"));
		WebElement dropdown2=driver.findElement(By.id("daybox"));
		Select dd=new Select(dropdown);
		Select dd1=new Select(dropdown1);
		Select dd2=new Select(dropdown2);
		dd.selectByValue("2000");
		dd1.selectByValue("November");
		dd2.selectByValue("9");
		driver.findElement(By.xpath(" //input[@id='imagesrc']")).sendKeys("C:\\Users\\Admin\\Desktop\\images");
		driver.findElement(By.id("firstpassword")).sendKeys("Tharun@0911");
		driver.findElement(By.id("secondpassword")).sendKeys("Tharun@0911");
		TakesScreenshot src1shot=(TakesScreenshot)driver;
		File src1=src1shot.getScreenshotAs(OutputType.FILE);
		File des1=new File("C:\\Users\\Admin\\Desktop\\screenshot\\snap1.jpg");
		FileHandler.copy(src1, des1);
		driver.quit();
		driver.findElement(By.id("submitbtn")).click();
		
		
		// TODO Auto-generated method stub

	}

}
