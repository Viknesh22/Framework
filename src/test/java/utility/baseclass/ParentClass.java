package utility.baseclass;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParentClass {

	public static WebDriver url;
	public static Select s;

	public static TakesScreenshot ts;

	public static void browser(String name) {

		if (name.equals("chromebrowser")) {
			WebDriverManager.chromedriver().setup();
			url = new ChromeDriver();

		} else if (name.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			url = new FirefoxDriver();
		}
	
		else if (name.equals("edge")) {
		WebDriverManager.edgedriver().setup();
		url = new EdgeDriver();
		}
	
	
	}

	public static void chrome() {
		WebDriverManager.chromedriver().setup();
		url = new ChromeDriver();

	}

	public static void Launchurl(String urlpath) {
		url.get(urlpath);
	}

	public static void maximize() {

		url.manage().window().maximize();
	}

	public static void value(WebElement we, String value) {

		we.sendKeys(value);

	}

	public static String getPagetitle() {
		return url.getTitle();
	}

	public static void click(WebElement we) {
		we.click();

	}

	public static void waits() throws Exception {
		Thread.sleep(10000);
	}

	public static void createaccountforaddactin() throws Exception {
		url.findElement(By.xpath("//a[text()='New User Register Here']")).click();
		WebElement user = url.findElement(By.id("username"));
		value(user, "Viknesh22");

		WebElement pwd = url.findElement(By.id("password"));

		value(pwd, "cskeerthi@22");

		WebElement cpwd = url.findElement(By.xpath("(//input[@type='password'])[2]"));
		value(cpwd, "cskeerthi@22");

		WebElement fullname = url.findElement(By.xpath("(//input[@name='full_name'])"));
		value(fullname, "Viknesh Soundararajan");

		WebElement email = url.findElement(By.xpath("(//input[@class='reg_input'])[5]"));
		value(email, "csviknesh26@gmail.com");

		waits();

		url.findElement(By.id("tnc_box")).click();

		url.findElement(By.xpath("(//input[@class='reg_button'])[1]")).click();

	}

	public static void selectindex(WebElement e, int value) {
		s = new Select(e);
		s.selectByIndex(value);

	}

	public static void selectvalue(WebElement e, String value) {
		s = new Select(e);
		s.selectByValue(value);
	}

	public static void screenshot(String snp) throws IOException {
		ts = (TakesScreenshot) url;
		File temp = ts.getScreenshotAs(OutputType.FILE);

		File perm = new File("D:\\Java Class\\Java Progaram Save Location\\new\\FrameWorkMaven\\Screenshot\\"+snp+".png");
		FileUtils.copyFile(temp, perm);

	}
public void date() {
 Date d=new Date(0);
 System.out.println(d);
 
}
}
