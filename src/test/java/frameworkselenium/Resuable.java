package frameworkselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Resuable {


	static WebDriver driver = new ChromeDriver();


	static WebDriverWait wait=null;
	public static Actions actions;

	/* Name of the Method: launchBrowser
	 * Description: Launches the Browser
	 * Created By: SalesForce Automation team
	 * Created Date: Jan 13 2024
	 * Last Modified date: Jan 14 2024
	 * 
	 * */
	
	

	public static void launchBrowser() {
		ChromeOptions option = new ChromeOptions();

		option.setBinary("C:\\Users\\91861\\chrome-win64\\chrome-win64\\chrome.exe");
	}
	
		/* Name of the Method: goToUrl
	 * Description: Gets the Browser
	 * Created By: SalesForce Automation team
	 * Created Date: Jan 13 2024
	 * Last Modified date: Jan 14 2024
	 * 
	 * */


	public static void goToUrl(String url) {

		driver.get(url);
		System.out.println(url+ " is entered");
	}

	/* Name of the Method: maximiseBrowser
 * Description: Maximizes the Browser
 * Created By: SalesForce Automation team
 * Created Date: Jan 13 2024
 * Last Modified date: Jan 14 2024
 * 
 * */


	public static void maximiseBrowser() {
		driver.manage().window().maximize();
		System.out.println("Browser window has maximized");
	}


	/* Name of the Method:getTextFromElement
 * Description: Gets the text from the Elements
 * Created By: SalesForce Automation team
 * Created Date: Jan 13 2024
 * Last Modified date: Jan 14 2024
 * 
 * */


	public static String getTextFromElement(WebElement ele,String objectName) {
		String data=ele.getText();
		System.out.println("extracted the text from"+objectName);
		return data;
	}
	
	/* Name of the Method:entertext
	 * Description: To enter text into the textbox.
	 * Created By: SalesForce Automation team
	 * Created Date: Jan 13 2024
	 * Last Modified date: Jan 14 2024
	 * 
	 * */
	

	public static void enterText(WebElement ele,String data,String ObjectName) {
		if (ele.isDisplayed()) {
			ele.clear();
			ele.sendKeys(data);
			System.out.println("data is entered in the "+ObjectName);
		} else {
			System.out.println(ObjectName+" element is not displayed");
		}
	}



	/* Name of the Method: closebrowser
	 * Description: To closer the browser.
	 * Created By: SalesForce Automation team
	 * Created Date: Jan 13 2024
	 * Last Modified date: Jan 14 2024
	 * 
	 * */
	
	public static void closeBrowser() {
		driver.close();
	}

	/* Name of the Method:quitBrowser
	 * Description: To quit from the Browser.
	 * Created By: SalesForce Automation team
	 * Created Date: Jan 13 2024
	 * Last Modified date: Jan 14 2024
	 * 
	 * */
	
	public static void quitBrowser() {
		driver.quit();
	}


	/* Name of the Method clcickElement
	 * Description: to click on the login element
	 * Created By: SalesForce Automation team
	 * Created Date: Jan 13 2024
	 * Last Modified date: Jan 14 2024
	 * 
	 * */
	
	public static void clickElement(WebElement ele,String ObjectName) {
		if(ele.isEnabled()) {
			ele.click();
			System.out.println(ObjectName+"button is clicked");
		}
		else {
			System.out.println("button element is not enabled");
		}
		
		/* Name of the Method:waitForVisibility
		 * Description: fluent wait time to locate element 
		 * Created By: SalesForce Automation team
		 * Created Date: Jan 13 2024
		 * Last Modified date: Jan 14 2024
		 * 
		 * */


	
	}
	public static void waitForVisibility(WebElement ele,int time,int pollingtime,String objectName) {
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(time))
		.pollingEvery(Duration.ofSeconds(pollingtime))
		.ignoring(ElementNotInteractableException.class);

		wait.until(ExpectedConditions.visibilityOf(ele));
		System.out.println(objectName+" is waited for visibility using fluent wait");
	}
	
	
	
	/* Name of the Method:waitForVisibility
	 * Description: wait time to find the web element.
	 * Created By: SalesForce Automation team
	 * Created Date: Jan 13 2024
	 * Last Modified date: Jan 14 2024
	 * 
	 * */
	
	


	public static void waitForVisibility(WebElement ele,int time,String objectNam) {
		wait=new WebDriverWait(driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	/* Name of the Method:movetoelement
	 * Description: Gets the text from the Elements
	 * Created By: SalesForce Automation team
	 * Created Date: Jan 13 2024
	 * Last Modified date: Jan 14 2024
	 * 
	 * */

	public static void moveToElement(WebElement element) {
		actions.moveToElement(element).perform();
	}

	
	/* Name of the Method:Actionclick
	 * Description: Gets the text from the Elements
	 * Created By: SalesForce Automation team
	 * Created Date: Jan 13 2024
	 * Last Modified date: Jan 14 2024
	 * 
	 * */
	
	public void Actionclick(WebElement element) {
		element.click();
	}
	
	/* Name of the Method:doubleclick
	 * Description: Gets the text from the Elements
	 * Created By: SalesForce Automation team
	 * Created Date: Jan 13 2024
	 * Last Modified date: Jan 14 2024
	 * 
	 * */


	public void doubleClick(WebElement element) {
		actions.doubleClick(element).perform();
	}

	/* Name of the Method:rightClick
	 * Description: Gets the text from the Elements
	 * Created By: SalesForce Automation team
	 * Created Date: Jan 13 2024
	 * Last Modified date: Jan 14 2024
	 * 
	 * */
	public void rightClick(WebElement element) {
		actions.contextClick(element).perform();
	}
	
	/* Name of the Method:login
	 * Description: login to any application with username, password.
	 * Created By: SalesForce Automation team
	 * Created Date: Jan 13 2024
	 * Last Modified date: Jan 14 2024
	 * 
	 * */
	
	 public static boolean login(WebDriver driver,String url, String username, String password) {
	        try {
	          
	            driver.get(url);
	            //maximiseBrowser();

	            // Find userName and password input fields
	            WebElement usernameInput = driver.findElement(By.id("username"));
	            WebElement passwordInput = driver.findElement(By.id("password"));

	            // Enter credentials
	            usernameInput.sendKeys(username);
	         passwordInput.sendKeys(password);

	            // Find and click the login button
	            WebElement login = driver.findElement(By.id("Login"));
	            clickElement(login, "login button");
	            

	            // Return true if login was successful
	            return true;
	        } catch (Exception e) {
	            // Handle exceptions and return false if login fails
	            e.printStackTrace();
	            return false;
	        }
	    
	}
	public static void select(WebElement menu,String menuName) {
		Select select = new Select(menu);

        // Select by visible text
        select.selectByVisibleText("menu");
		
		 
	 }




}
