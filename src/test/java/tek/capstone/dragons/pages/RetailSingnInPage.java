package tek.capstone.dragons.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.dragons.base.BaseSetup;
//we extends to base Setup because we need instance of web driver
public class RetailSingnInPage extends 	BaseSetup{
	// we create constructor in here 
	public RetailSingnInPage () {
		PageFactory.initElements(getDriver(), this);
		
	}
	/* instead of findElement() or findElements()
	 * We use @FindBy annotation to find element or elements
	 * @FindBy is a Selenium annotation, it is used as alternative way
	 * to findElement or findElements
	 * 
	 * if we use the link test we should make sure that tag name start with a 
	 */


//	@FindBy(id = "email")
//	public WebElement emailField;
//	
//	@FindBy(id="password")
//	public WebElement passwordField;
//	
//	@FindBy(xpath ="//button[@type='submit']")
//	public WebElement loginButton;
//
//	@FindBy(id ="newAccountBtn")
//	public WebElement newAccountButton;
//	
//	@FindBy(id="nameInput")
//	public WebElement nameInput;
//	
//	@FindBy(id="emailInput")
//	public WebElement emailInput;
//	
//	@FindBy(id="passwordInput")
//	public WebElement passwordInput;
//	
//	@FindBy(id="confirmPasswordInput")
//	public WebElement confirmPasswordInput;
//	
//	@FindBy(id="signupBtn")
//	public WebElement signUpButton;
//	
//	@FindBy(id="profileImage")
//	public WebElement profileImage;
//	


    @FindBy(id = "signinLink")

    public WebElement singInOption;

 

    @FindBy(id = "email")

    public WebElement emailInput;

 

    @FindBy(id = "password")

    public WebElement passwordInput;

 

    @FindBy(id = "loginBtn")

    public WebElement loginBttn;

 

    @FindBy(id = "accountLink")

    public WebElement accountOption;

 

    @FindBy(linkText = "Orders")

    public WebElement ordersOption;

 

    @FindBy(id = "logoutBtn")

    public WebElement logoutOPtion;

 

    @FindBy(id = "newAccountBtn")

    public WebElement newAccountBttn;

 

    @FindBy(id = "nameInput")

    public WebElement nameField;

 

    @FindBy(id = "emailInput")

    public WebElement emailField;

 

    @FindBy(id = "passwordInput")

    public WebElement passwordField;

 

    @FindBy(id = "confirmPasswordInput")

    public WebElement passConfirmField;

 

    @FindBy(id = "signupBtn")

    public WebElement signUPBttn;

}

 


