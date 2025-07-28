package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
    private WebDriver driver;
    
    @CacheLookup
    @FindBy(id = "email")
    WebElement email;
    
    @CacheLookup
    @FindBy(id = "pass")
    WebElement passwd;
    
    @CacheLookup
    @FindBy(xpath ="//h2[@class='_8eso']")
    WebElement Welmsge;
    
    public Login(WebDriver driver) {
    	this.driver = driver;
    	PageFactory.initElements(driver, this);
    	
    }
    
    public void enterUsername(String username) {
    	email.clear();
    	email.sendKeys(username);
    }
    
    public String getemailPlaceHolder() {
    	return email.getDomAttribute("PlaceHolder");
    }
    
    public void enterPassword(String Password) {
    	passwd.clear();
    	passwd.sendKeys(Password);
    }
    
    public String getPasswordPlaceHolder() {
    	return passwd.getDomAttribute("PlaceHolder");
    }
    
    public String getWelcomemessage() {
    	return Welmsge.getText();
    }
}
