package seleniumdivya;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ResuableWithoutFW {
	static WebDriver driver = new ChromeDriver();
	
	static WebDriverWait wait=null;
	

	public static void main(String[] args) throws InterruptedException {
		sdfc();
		
	}
	
	
	public static void launchBrowser() {
		ChromeOptions option = new ChromeOptions();

		option.setBinary("C:\\Users\\91861\\chrome-win64\\chrome-win64\\chrome.exe");
	}
        //WebDriver driver = new ChromeDriver(option);

		
		
	
	//******************************to get url *****************
		
	public static void goToUrl(String url) {
		
		driver.get(url);
		System.out.println(url+ "is entered");
	}
	
	
	///**********to maximize the browser ***********
	
	public static void maximiseBrowser() {
		driver.manage().window().maximize();
		System.out.println("browser window has maximized");
	}
	
	//************to enter the text***********
	
	public static String getTextFromElement(WebElement ele,String objectName) {
		String data=ele.getText();
		System.out.println("extracted the text from"+objectName);
		return data;
	}
	
	//******** to enter the text***********
	
	public static void enterText(WebElement ele,String data,String ObjectName) {
		if (ele.isDisplayed()) {
			ele.clear();
			ele.sendKeys(data);
			System.out.println("data is entered in the "+ObjectName);
		} else {
			System.out.println(ObjectName+" element is not displayed");
		}
	}
	
	
	
	//*********** to close *********
	public static void closeBrowser() {
		driver.close();
	}
	
	//*********** to quit ********
	public static void quitBrowser() {
		driver.quit();
	}
	
	
	//********* to click ********
	public static void clickElement(WebElement ele,String ObjectName) {
		if(ele.isEnabled()) {
			ele.click();
			System.out.println(ObjectName+"button is clicked");
			}
			else {
				System.out.println("button element is not enabled");
			}
	}
	public static void waitForVisibility(WebElement ele,int time,int pollingtime,String objectName) {
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(time))
		.pollingEvery(Duration.ofSeconds(pollingtime))
		.ignoring(ElementNotInteractableException.class);
		
		wait.until(ExpectedConditions.visibilityOf(ele));
		System.out.println(objectName+" is waited for visibility using fluent wait");
	}
	
	public static void waitForVisibility(WebElement ele,int time,String objectNam) {
		wait=new WebDriverWait(driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	

	
	
	//********** test case to sdfc login with pass and username**********
	

	public static void sdfc() throws InterruptedException {
		System.out.println("******login_to_sdfc automation script started***********");
				launchBrowser();
		        maximiseBrowser();
		        goToUrl("https://login.salesforce.com/");
		      
		        
		       
		        WebElement user =driver.findElement(By.id("username"));
		        
		        waitForVisibility(user, 5, 2, "username textbox");
		        enterText(user,"gowdaaish.d@gmail.com","username textbox");
		       
		        WebElement password=driver.findElement(By.id("password"));
		        enterText(password,"Masters-2022","password textbox");

		    
		        
		      WebElement login = driver.findElement(By.id("Login"));
		      clickElement(login, "login button");
		     		     
		         closeBrowser();
		
		System.out.println("******login_to_sdfc automation script ended***********");
	}

		
	}
	

	

