import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Calculator 
{	
	static WebDriver driver;
	@BeforeTest
	public static void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.navigate().to("https://www.calculator.net/");
		Thread.sleep(1000);	
	}
	
	@Test
	public static void Operations() throws Exception
	{
		Multiplication();
		Thread.sleep(2000);
		Division();
		Thread.sleep(2000);
		Addition();
		Thread.sleep(2000);
		Subtraction();
		Thread.sleep(2000);
	}
	public static void Multiplication() throws Exception
	{
		WebElement a4 = driver.findElement(By.xpath("//span[contains(@class,'scinm') and contains(text(), '4')]"));
		a4.click();
		WebElement b2 = driver.findElement(By.xpath("//span[contains(@class,'scinm') and contains(text(), '2')]"));
		b2.click();
		WebElement c3 = driver.findElement(By.xpath("//span[contains(@class,'scinm') and contains(text(), '3')]"));
		c3.click();
		Thread.sleep(500);
		WebElement mul = driver.findElement(By.xpath("//span[contains(@class,'sciop') and contains(text(), '×')]"));
		mul.click();
		Thread.sleep(500);
		WebElement d5 = driver.findElement(By.xpath("//span[contains(@class,'scinm') and contains(text(), '5')]"));
		d5.click();
		WebElement e2 = driver.findElement(By.xpath("//span[contains(@class,'scinm') and contains(text(), '2')]"));
		e2.click();
		WebElement f5 = driver.findElement(By.xpath("//span[contains(@class,'scinm') and contains(text(), '5')]"));
		f5.click();
		Thread.sleep(1500);
		WebElement a = driver.findElement(By.xpath("//span[contains(@class,'scieq') and contains(text(), 'AC')]"));
		a.click();
	}
	
	public static void Division() throws Exception
	{
		WebElement a4 = driver.findElement(By.xpath("//span[contains(@class,'scinm') and contains(text(), '4')]"));
		a4.click();
		WebElement h0 = driver.findElement(By.xpath("//span[contains(@class,'scinm') and contains(text(), '0')]"));
		h0.click();
		WebElement i0 = driver.findElement(By.xpath("//span[contains(@class,'scinm') and contains(text(), '0')]"));
		i0.click();
		WebElement j0 = driver.findElement(By.xpath("//span[contains(@class,'scinm') and contains(text(), '0')]"));
		j0.click();
		Thread.sleep(500);
		WebElement div = driver.findElement(By.xpath("//span[contains(@class,'sciop') and contains(text(), '/')]"));
		div.click();
		Thread.sleep(500);
		WebElement e2 = driver.findElement(By.xpath("//span[contains(@class,'scinm') and contains(text(), '2')]"));
		e2.click();
		WebElement l0 = driver.findElement(By.xpath("//span[contains(@class,'scinm') and contains(text(), '0')]"));
		l0.click();
		WebElement m0 = driver.findElement(By.xpath("//span[contains(@class,'scinm') and contains(text(), '0')]"));
		m0.click();
		Thread.sleep(1500);
		WebElement a = driver.findElement(By.xpath("//span[contains(@class,'scieq') and contains(text(), 'AC')]"));
		a.click();
	}
	
	public static void Addition() throws Exception
	{
		WebElement minus = driver.findElement(By.xpath("//span[contains(@class,'sciop') and contains(text(), '–')]"));
		minus.click();
		WebElement a2 = driver.findElement(By.xpath("//span[contains(@class,'scinm') and contains(text(), '2')]"));
		a2.click();
		WebElement a3 = driver.findElement(By.xpath("//span[contains(@class,'scinm') and contains(text(), '3')]"));
		a3.click();
		WebElement a4 = driver.findElement(By.xpath("//span[contains(@class,'scinm') and contains(text(), '4')]"));
		a4.click();
		WebElement b2 = driver.findElement(By.xpath("//span[contains(@class,'scinm') and contains(text(), '2')]"));
		b2.click();
		WebElement b3 = driver.findElement(By.xpath("//span[contains(@class,'scinm') and contains(text(), '3')]"));
		b3.click();
		WebElement b4 = driver.findElement(By.xpath("//span[contains(@class,'scinm') and contains(text(), '4')]"));
		b4.click();
		Thread.sleep(500);
		WebElement add = driver.findElement(By.xpath("//span[contains(@class,'sciop') and contains(text(), '+')]"));
		add.click();
		Thread.sleep(500);
		WebElement c3 = driver.findElement(By.xpath("//span[contains(@class,'scinm') and contains(text(), '3')]"));
		c3.click();
		WebElement c4 = driver.findElement(By.xpath("//span[contains(@class,'scinm') and contains(text(), '4')]"));
		c4.click();
		WebElement c5 = driver.findElement(By.xpath("//span[contains(@class,'scinm') and contains(text(), '5')]"));
		c5.click();
		WebElement d3 = driver.findElement(By.xpath("//span[contains(@class,'scinm') and contains(text(), '3')]"));
		d3.click();
		WebElement d4 = driver.findElement(By.xpath("//span[contains(@class,'scinm') and contains(text(), '4')]"));
		d4.click();
		WebElement d5 = driver.findElement(By.xpath("//span[contains(@class,'scinm') and contains(text(), '5')]"));
		d5.click();
		Thread.sleep(1500);
		WebElement a = driver.findElement(By.xpath("//span[contains(@class,'scieq') and contains(text(), 'AC')]"));
		a.click();
	}
	public static void Subtraction() throws Exception
	{
		WebElement a2 = driver.findElement(By.xpath("//span[contains(@class,'scinm') and contains(text(), '2')]"));
		a2.click();
		WebElement a3 = driver.findElement(By.xpath("//span[contains(@class,'scinm') and contains(text(), '3')]"));
		a3.click();
		WebElement a4 = driver.findElement(By.xpath("//span[contains(@class,'scinm') and contains(text(), '4')]"));
		a4.click();
		WebElement a8 = driver.findElement(By.xpath("//span[contains(@class,'scinm') and contains(text(), '8')]"));
		a8.click();
		WebElement b2 = driver.findElement(By.xpath("//span[contains(@class,'scinm') and contains(text(), '2')]"));
		b2.click();
		WebElement b3 = driver.findElement(By.xpath("//span[contains(@class,'scinm') and contains(text(), '3')]"));
		b3.click();
		Thread.sleep(2000);
		WebElement sub = driver.findElement(By.xpath("//span[contains(@class,'sciop') and contains(text(), '–')]"));
		sub.click();
		Thread.sleep(500);
		WebElement c = driver.findElement(By.xpath("//span[contains(@class,'scifunc') and contains(text(), '(')]"));
		c.click();
		WebElement min = driver.findElement(By.xpath("//span[contains(@class,'sciop') and contains(text(), '–')]"));
		min.click();
		WebElement c2 = driver.findElement(By.xpath("//span[contains(@class,'scinm') and contains(text(), '2')]"));
		c2.click();
		WebElement c3 = driver.findElement(By.xpath("//span[contains(@class,'scinm') and contains(text(), '3')]"));
		c3.click();
		WebElement c0 = driver.findElement(By.xpath("//span[contains(@class,'scinm') and contains(text(), '0')]"));
		c0.click();
		WebElement c9 = driver.findElement(By.xpath("//span[contains(@class,'scinm') and contains(text(), '9')]"));
		c9.click();
		WebElement c4 = driver.findElement(By.xpath("//span[contains(@class,'scinm') and contains(text(), '4')]"));
		c4.click();
		WebElement c8 = driver.findElement(By.xpath("//span[contains(@class,'scinm') and contains(text(), '8')]"));
		c8.click();
		WebElement d2 = driver.findElement(By.xpath("//span[contains(@class,'scinm') and contains(text(), '2')]"));
		d2.click();
		WebElement d3 = driver.findElement(By.xpath("//span[contains(@class,'scinm') and contains(text(), '3')]"));
		d3.click();
		WebElement b = driver.findElement(By.xpath("//span[contains(@class,'scifunc') and contains(text(), ')')]"));
		b.click();
		Thread.sleep(2500);
		WebElement a = driver.findElement(By.xpath("//span[contains(@class,'scieq') and contains(text(), 'AC')]"));
		a.click();
	}
	@AfterTest
	public static void tearDown()
	{
		driver.quit();
	}
}