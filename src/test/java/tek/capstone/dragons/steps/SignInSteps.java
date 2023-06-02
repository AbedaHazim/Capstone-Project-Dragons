package tek.capstone.dragons.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.dragons.pages.POMFactory;
import tek.capstone.dragons.utilities.CommonUtility;

public class SignInSteps extends CommonUtility{
	
	POMFactory factory = new POMFactory(); // POMFactory help us to eliminate duplicate creation of the object
//	
//	@Given("User is on retail website")
//	public void userIsOnRetailWebsite() {
//		String actualTitle = getTitle();// wrote this one in CommonUtility
//		String expectedTitle = "React App";
//		Assert.assertEquals(expectedTitle, actualTitle);
//		logger.info("User is on retail website");
//	}
//	
//	@When("User click on Sign in option")
//	public void userClickOnSignInOption() {
//		click(factory.homePage().signIn);
//		logger.info("user clicked on Sign In option");
//	}
//	
//	@And("User enter email {string} and password {string}")
//	public void userEnterEmailAndPassword(String email,String password) {
//		sendText(factory.signInPage().emailField,email);
//		sendText(factory.signInPage().passwordField,password);
//		logger.info("user entered email "+ email + " and password "+ password);
//	
//		
//	}
//	
//	@And("User click on login button")
//	public void userClickOnLoginButton(){
//		click(factory.signInPage().loginButton);
//		logger.info("user clicked on login button");
//	}
//	
//	@Then("User should be logged in into Account")
//	public void userShouldBeLoggedInIntoAccount() {
//		waitTillPresence(factory.homePage().account);
//		Assert.assertTrue(isElementDisplayed(factory.homePage().account));
//		Assert.assertTrue(isElementDisplayed(factory.homePage().orderOption));
//		Assert.assertTrue(isElementDisplayed(factory.homePage().logoutBtnOption));
//		logger.info("user logged in into account");
//		
//	}
//	@When("User click on Create New Account button")
//	public void userClickOnCreateNewAccountButton() {
//	   click(factory.signInPage().newAccountButton);
//	   logger.info("User click on Create New Account button");
//	}
//	@When("User fill the signUp information with below data")
//	public void userFillTheSignUpInformationWithBelowData() {
//		sendText(factory.signInPage().nameInput,"name");
//		sendText(factory.signInPage().emailInput,"emailInput");
//		sendText(factory.signInPage().passwordInput,"password");
//		sendText(factory.signInPage().confirmPasswordInput,"confirmpassword");
//		logger.info("all data enter successfully");
//	}
//	@When("User click on SignUp button")
//	public void userClickOnSignUpButton() {
//	   click(factory.signInPage().signUpButton);
//	   logger.info("User click on SignUp button");
	//}
	// etw

	@Given("User is on retail website")

    public void userIsOnRetailWebsite() {

        String expectedTitle = "React App";

        String actualTitle = getTitle();

        Assert.assertEquals(expectedTitle, actualTitle);

        logger.info("User is on retail website");

 

    }

 

    @When("User click on Sign in option")

    public void userClickOnSignInOption() {

        click(factory.signInPage().singInOption);

        logger.info("User clicked on signin option successfully");

 

    }

 

    @When("User enter email {string} and password {string}")

    public void userEnterEmailAndPassword(String email, String password) {

        // sendText(WebElement element, String value)

        sendText(factory.signInPage().emailInput, email);

        sendText(factory.signInPage().passwordInput, password);

        logger.info(email + "email was entered successfully");

        logger.info(password + "password was entered successfully");

 

    }

 

    @When("User click on login button")

    public void userClickOnLoginButton() {

        

        

        click(factory.signInPage().loginBttn);

        logger.info("user was able to login successfully");

    }

 

    @Then("User should be logged in into Account")

    public void userShouldBeLoggedInIntoAccount() {

        String pageTitleExpected = "React App";

        String pageTitleActual = getTitle();

        Assert.assertEquals(pageTitleExpected, pageTitleActual);

        logger.info("User logged in into the account");

 

    }

 

    @Then("User click on Create New Account button")

    public void userClickOnCreateNewAccountButton() {

        click(factory.signInPage().newAccountBttn);

        logger.info("New account button was clicked");

    }

 

    @Then("User fill the signUp information with below data")

    public void userFillTheSignUpInformationWithBelowData(io.cucumber.datatable.DataTable dataTable) {

        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);

        for (Map<String, String> row : data) {

            sendText(factory.signInPage().nameField, row.get("name"));

            sendText(factory.signInPage().emailField, row.get("email"));

            sendText(factory.signInPage().passwordField, row.get("password"));

            sendText(factory.signInPage().passConfirmField, row.get("confirmPassword"));

            logger.info("Registration info entered");

        }

    }

 

    @Then("User click on SignUp button")

    public void userClickOnSignUpButton() {

        click(factory.signInPage().signUPBttn);

        logger.info("Sign up button was clicked");

    }

 
	}
	

