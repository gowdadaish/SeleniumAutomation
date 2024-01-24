package com.cliniops.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AutomationScript extends Resuable{

	static void  tc1() throws InterruptedException{
		
		login(driver, "https://ctmstaging.cliniops.com/login"," uat_sc1","Automate#1");
		maximiseBrowser();
	
		
		
		WebElement configures = driver.findElement(By.xpath("//a[@href=\"https://staging.cliniops.com/investigator/configurestudy/general\"]"));
		configures.click();
		
		WebElement roles = driver.findElement(By.xpath("//button[@onclick=\"location.href='https://staging.cliniops.com/investigator/configurestudy/roles';\"]"));
		roles.click();
		
		WebElement manage = driver.findElement(By.xpath(" //a[@href=\"https://staging.cliniops.com/investigator/managestudy/index\"]"));
		manage.click();
		WebElement delete = driver.findElement(By.xpath("//*[@id=\"user_table\"]/tbody/tr[1]/td[9]/a[2]/img"));
		delete.click();
		
		WebElement ok = driver.findElement(By.xpath("//*[@id=\"dialogDelete\"]/div/div/div[3]/button[2]"));
		ok.click();
		

		//WebElement buttonAdd = driver.findElement(By.xpath("//img[@src=\"https://staging.cliniops.com/public/images/blue_add_icon.svg\"]"));
		//  buttonAdd.click();
		
		

		
	
           


		
	}

}
