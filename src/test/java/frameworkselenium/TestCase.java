package frameworkselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class TestCase extends Resuable {

	// SDFC test case1
	// CMMI 5 Level standards --> Logical name of the variables , name of the
	// methods, name of the automation script, name test data files
	// Comments, proper documentaiton

	/*
	 * Name of the Method: launchBrowser Description: Launches the Browser Created
	 * By: SalesForce Automation team Created Date: Jan 13 2024 Last Modified date:
	 * Jan 14 2024
	 * 
	 */
	public static void launch() throws InterruptedException {
		System.out.println("******login_to_sdfc automation script started***********");

		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("C:\\SeleniumReport\\LaunchSFDC.html");
		spark.config().setDocumentTitle("Automation Report");
		spark.config().setReportName("Extent Report");
		extent.attachReporter(spark);
		ExtentTest test = extent.createTest("login  to SDFC application ");

		launchBrowser();
		maximiseBrowser();
		goToUrl("https://login.salesforce.com/");
		test.pass("SFDC Browser launched ");

		WebElement user = driver.findElement(By.id("username"));

		waitForVisibility(user, 5, 2, "username textbox");
		enterText(user, "gowdaaish.d@gmail.com", "username textbox");
		test.pass("User Name Entered");

		// WebElement password=driver.findElement(By.id("password"));
		// enterText(password,"Masters-2022","password textbox");

		waitForVisibility(user, 5, 2, "username textbox");

		WebElement login = driver.findElement(By.id("Login"));
		clickElement(login, "login button");

		closeBrowser();

		test.pass("******login_to_salesfroce with just user_name automation script ended***********");
		extent.flush();
	}

	public static void testCase4() throws InterruptedException {

		System.out.println("******login_to_sdfc automation script started***********");

		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("C:\\Users\\Automation\\report\\test.html");
		spark.config().setDocumentTitle("Automation Report");
		spark.config().setReportName("Extent Report");
		extent.attachReporter(spark);
		ExtentTest test = extent.createTest("login  to SDFC application ");

		launchBrowser();
		maximiseBrowser();
		goToUrl("https://login.salesforce.com/");
		test.pass("SFDC Browser launched ");

		WebElement user = driver.findElement(By.id("username"));
		waitForVisibility(user, 5, 2, "username textbox");
		enterText(user, "gowdaaish.d@gmail.com", "username textbox");
		test.pass("Username Entered");

		WebElement password = driver.findElement(By.id("password"));
		enterText(password, "Masters-2022", "password textbox");

		test.pass("Password entered ");

		WebElement login = driver.findElement(By.id("Login"));
		clickElement(login, "login button");

		test.pass("Login succesfull");

		WebElement profile = driver.findElement(By.xpath("//span[text()=\"Aishwarya Dinesh...\"]"));
		clickElement(profile, "profile buttom");

		test.pass("profile clicked");

		WebElement sdflogout = driver.findElement(By.xpath("//a[text()=\"Logout\"]"));
		clickElement(profile, "logout");
		test.fail("test fail");

		// actions.moveToElement(sdflogout).perform();
		// waitForVisibility(user, 5, 2, "clicked on logout");

		// test.pass("Successfully Test case passed");

		extent.flush();
	}

	public static void loginToSalesForce() {
		ChromeOptions option = new ChromeOptions();

		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("C:\\SeleniumReport\\loginToSalesForce.html");
		spark.config().setDocumentTitle("Automation Report");
		spark.config().setReportName("Extent Report");
		extent.attachReporter(spark);
		ExtentTest test = extent.createTest("login  to SDFC application ");

		launchBrowser();
		maximiseBrowser();

		login(driver, "https://login.salesforce.com ", "gowdaaish.d@gmail.com", "Masters-2022");
		test.pass("test pass with single line ");
		extent.flush();

	}

	public static void testCase2() throws InterruptedException {
		ChromeOptions option = new ChromeOptions();

		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("C:\\SeleniumReport\\test2.html");
		spark.config().setDocumentTitle("Automation Report");
		spark.config().setReportName("Extent Report");
		extent.attachReporter(spark);
		ExtentTest test = extent.createTest("login  to SDFC application ");

		launchBrowser();
		maximiseBrowser();
		goToUrl("https://login.salesforce.com/");
		test.pass("SFDC Browser launched ");

		driver.findElement(By.id("username")).sendKeys("gowdaaish.d@gmail.com");
		test.pass("Username enetered");

		driver.findElement(By.id("password")).sendKeys("Masters-2022");
		test.pass("Password Entered");

		driver.findElement(By.id("Login")).click();
		System.out.println("TestCase two Pass");
		test.pass("Login successfull");
		// Thread.sleep(2000);
		driver.quit();

		test.pass("TestCase pass");

		extent.flush();

	}

	public static void testCase3() throws InterruptedException {
		ChromeOptions option = new ChromeOptions();

		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("C:\\SeleniumReport\\TestCase3.html");
		spark.config().setDocumentTitle("Automation Report");
		spark.config().setReportName("Extent Report");
		extent.attachReporter(spark);
		ExtentTest test = extent.createTest("login  to SDFC application CheckButton ");

		launchBrowser();
		maximiseBrowser();
		goToUrl("https://login.salesforce.com/");
		test.pass("SFDC Browser launched ");

		driver.findElement(By.id("username")).sendKeys("gowdaaish.d@gmail.com");

		driver.findElement(By.id("password")).sendKeys("Masters-2022");
		// driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//label[text()=\"Remember me\"]")).click();
		test.pass("Rememebr Box checked");
		test.pass("TestCase three Pass");

		Thread.sleep(2000);
		driver.quit();
		extent.flush();

	}

	public static void testCase4a() throws InterruptedException {

		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("C:\\SeleniumReport\\TestCase4a.html");
		spark.config().setDocumentTitle("Automation Report");
		spark.config().setReportName("Extent Report");
		extent.attachReporter(spark);
		ExtentTest test = extent.createTest("Forgot Passwords ");

		launchBrowser();
		maximiseBrowser();
		goToUrl("https://login.salesforce.com/");
		test.pass("SFDC Browser launched ");
		driver.findElement(By.id("forgot_password_link")).click();

		test.pass("Clicked on Forgot Password");

		driver.findElement(By.id("un")).sendKeys("gowdaaish.d2gmail.com");

		driver.findElement(By.id("continue")).click();
		test.pass("continue Button Clicked");

		test.pass("Test case 4A pass");

		driver.quit();
		extent.flush();
	}

	// tasecase for wrong userid and password
	public static void testCase4b() throws InterruptedException {

		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("C:\\SeleniumReport\\TestCase4b.html");
		spark.config().setDocumentTitle("Automation Report");
		spark.config().setReportName("Extent Report");
		extent.attachReporter(spark);
		ExtentTest test = extent.createTest("wrong userID and password");

		launchBrowser();
		maximiseBrowser();
		goToUrl("https://login.salesforce.com/");
		test.pass("SFDC Browser launched ");

		driver.findElement(By.id("username")).sendKeys("123");
		test.pass("Wrong Username entered");
		driver.findElement(By.id("password")).sendKeys("M123");
		test.pass("Wrong Password entered");

		driver.findElement(By.id("Login")).click();
		test.pass("Clicked on Login");

		Thread.sleep(3000);
		driver.quit();
		test.pass("Test case 4B Pass");
		extent.flush();
	}

	public static void createAccount() {
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("C:\\SeleniumReport\\createAccount.html");
		spark.config().setDocumentTitle("Automation Report");
		spark.config().setReportName("Extent Report");
		extent.attachReporter(spark);
		ExtentTest test = extent.createTest("SFDC Create a Account");

		launchBrowser();
		maximiseBrowser();
		goToUrl("https://login.salesforce.com/");
		test.pass("SFDC Browser launched ");

		driver.findElement(By.id("username")).sendKeys("gowdaaish.d@gmail.com");

		driver.findElement(By.id("password")).sendKeys("Masters-2022");
		driver.findElement(By.id("Login")).click();
		test.pass("Login Succesfull");

		// Navigate to Accounts
		WebElement accountsLink = driver.findElement(By.xpath("//a[@title=\"Accounts Tab\"]"));
		accountsLink.click();

		test.pass("Clicked On account succesfull ");

		// Navigate to New Account Edit Page
		WebElement newAccountButton = driver.findElement(By.id("createNewButton"));
		newAccountButton.click();

		test.pass("New account clicked succesfully");

		// to perform action means to select from the list

		Actions a = new Actions(driver);
		a.moveToElement(newAccountButton);
		driver.findElement(By.xpath("//*[@id=\"createNewMenu\"]/a[3]")).click();

		// to enter new name
		WebElement accountNameField = driver.findElement(By.xpath("//*[@id=\"acc2\"]"));

		accountNameField.sendKeys("Akshatha");
		test.pass("new Account name entered");

		// dropdown operation and selecting

		WebElement type = driver.findElement(By.xpath("//*[@id=\"acc6\"]"));
		Select sc = new Select(type);
		sc.selectByVisibleText("Technology Partner");
		test.pass("Technology Partner selected succesfully");

		// dropdowm selection
		WebElement customerPriority = driver.findElement(By.xpath("//*[@id=\"00NHn00000NDh2u\"]"));
		Select sc2 = new Select(customerPriority);
		sc2.selectByVisibleText("High");
		test.pass("High selected");

		driver.quit();

		test.pass("test case pass");
		extent.flush();
	}

	public static void createNewView() {

		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("C:\\SeleniumReport\\createNewView.html");
		spark.config().setDocumentTitle("Automation Report");
		spark.config().setReportName("Extent Report");
		extent.attachReporter(spark);
		ExtentTest test = extent.createTest("Create NewView");

		launchBrowser();
		maximiseBrowser();
		goToUrl("https://login.salesforce.com/");
		test.pass("SFDC Browser launched ");

		driver.findElement(By.id("username")).sendKeys("gowdaaish.d@gmail.com");

		driver.findElement(By.id("password")).sendKeys("Masters-2022");
		driver.findElement(By.id("Login")).click();
		test.pass("Login to Browser succesfull");
		WebElement accountsLink = driver.findElement(By.xpath("//a[@title=\"Accounts Tab\"]"));
		accountsLink.click();
		test.pass("Account tab clicked succefull");

		driver.findElement(By.xpath("//*[@id=\"filter_element\"]/div/span/span[2]/a[2]")).click();

		WebElement name = driver.findElement(By.xpath("//*[@id=\"fname\"]"));
		name.sendKeys("Jhon");
		test.pass("Fname jhon entered");
		WebElement unique = driver.findElement(By.xpath("//*[@id=\"devname\"]"));
		unique.clear();
		unique.sendKeys("js");

		driver.findElement(By.xpath("//*[@id=\"editPage\"]/div[3]/table/tbody/tr/td[2]/input[1]")).click();

		driver.quit();

		test.pass("taste case pass");
		extent.flush();

	}

	public static void dropDown() throws InterruptedException {

		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("C:\\SeleniumReport\\dropDown.html");
		spark.config().setDocumentTitle("Automation Report");
		spark.config().setReportName("Extent Report");
		extent.attachReporter(spark);
		ExtentTest test = extent.createTest("Create NewView");

		launchBrowser();
		maximiseBrowser();
		goToUrl("https://login.salesforce.com/");
		test.pass("DropDown ");

		driver.findElement(By.id("username")).sendKeys("gowdaaish.d@gmail.com");

		driver.findElement(By.id("password")).sendKeys("Masters-2022");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(2000);

		test.pass("SalesForce login page is launched and application home page is logged in with correct username");

		WebElement profile = driver.findElement(By.xpath("//span[text()=\"Aishwarya Dinesh...\"]"));
		profile.click();

		Actions a = new Actions(driver);
		a.moveToElement(profile);
		driver.findElement(By.xpath("//a[text()=\"My Profile\"]")).click();
		Thread.sleep(2000);

		WebElement button = driver.findElement(By.id("moderatorMutton"));
		button.click();

		Actions ac1 = new Actions(driver);
		ac1.moveToElement(button);

		driver.findElement(By.xpath("//a[text()=\"Edit Profile\"]")).click();

		WebElement fm = driver.findElement(By.xpath("//iframe[@id=\"aboutMeContentId\"]"));

		driver.switchTo().frame(fm);
		// Thread.sleep(2000);

		// driver.findElement(By.xpath("//input[@id=\"firstName\"]")).sendKeys(Keys.chord(Keys.CONTROL,
		// "a"),"ABCD");

		WebElement firstname = driver.findElement(By.xpath("//input[@id=\"firstName\"]"));
		firstname.clear();
		firstname.sendKeys("Abhishek");
		test.pass("Test case pass ");

		driver.quit();
		extent.flush();
	}

}
