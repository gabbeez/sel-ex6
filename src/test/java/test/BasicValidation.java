package test;

import static org.testng.Assert.assertTrue;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pom.Login;
import pom.Login4;
import pom.Login;

public class BasicValidation extends BaseTest{

	 @Test
	   public void urlValidation() {
		   String expectedResult = "https://www.facebook.com/";
		   String actualResult = driver.getCurrentUrl();
		   
		   Reporter.log("Expected Result = " + expectedResult);
		   Reporter.log("Actual Resutl = " + actualResult);
		   
		   assertTrue(actualResult.equals(expectedResult),"Mismatch in the application url,");
	   }
	
	 @Test
	   public void emailPlaceholderValidation() {
		   String expectedResult = "Email address or phone number";
		   
		   Login login = new Login(driver);
		   String actualResult = login.getemailPlaceHolder();
		   
		   Reporter.log("Expected Result = " + expectedResult);
		   Reporter.log("Actual Resutl = " + actualResult);
		   
		   assertTrue(actualResult.equals(expectedResult),"Mismatch in the email placeholder,");
	   }
	   
	   @Test
	   public void passwordPlaceholderValidation() {
		   String expectedResult = "Password";
		   
		   Login login = new Login(driver);
		   String actualResult = login.getPasswordPlaceHolder();
		   
		   Reporter.log("Expected Result = " + expectedResult);
		   Reporter.log("Actual Resutl = " + actualResult);
		   
		   assertTrue(actualResult.equals(expectedResult),"Mismatch in the password placeholder,");
	   }
	   
	   @Test
	   public void welcomeMessageValidation() {
		   String expectedResult = "Facebook helps you connect and share with the people in your life.";
		   Login login = new Login(driver);
		   String actualResult = login.getWelcomemessage();
		   
		   Reporter.log("Expected Result = " + expectedResult);
		   Reporter.log("Actual Resutl = " + actualResult);
		   
		   assertTrue(actualResult.equals(expectedResult),"Mismatch in the welcomeMessage application,");
	   }
	}

	