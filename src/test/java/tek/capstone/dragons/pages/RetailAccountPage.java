package tek.capstone.dragons.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.dragons.base.BaseSetup;

public class RetailAccountPage extends BaseSetup{
	
	public  RetailAccountPage() {
		
		PageFactory.initElements(getDriver(), this);	
		
	}
	
	
//	@FindBy (id ="profileImage")
//	public WebElement profilePage;
//	
//	@FindBy(id= "nameInput")
//	public WebElement nameInput;
//	
//	@FindBy(id ="personalPhoneInput")
//	public WebElement phoneInput;
//	
//	@FindBy(xpath="//button[@id='personalUpdateBtn']")
//	public WebElement updateBtn;
//	
//	@FindBy(xpath="//div[text()='Personal Information Updated Successfully']")
//	public WebElement successMessageUpdate;
//	
//	// Locators for add new payment method
//	
//	@FindBy(xpath = "//p [text() = 'Add a payment method']")
//	public WebElement addApaymentMethodLink;
//	
//	@FindBy(id = "cardNumberInput")
//	public WebElement cardNumInPutFiled;
//	
//	@FindBy(id = "nameOnCardInput")
//	public WebElement nameOnCardInputFiled;
//	
//	@FindBy(id = "expirationMonthInput")
//	public WebElement expirationMonthInputFiled;
//	
//	@FindBy(id ="expirationYearInput")
//	public WebElement expirationYearInputFiled;
//	
//	@FindBy (id ="securityCodeInput")
//	public WebElement securityCodeInputFiled;
//	
//	@FindBy (id ="paymentSubmitBtn")
//	public WebElement addYourCard;
//	
//	@FindBy (xpath="//div[text() ='Payment Method added sucessfully']")
//	public WebElement paymentsuccessMessage;
//	
//	// remove payment method 
//	
//	@FindBy (xpath= "//p[@class='account__payment__sub-text']")
//	public List<WebElement> cardEndingNum;
//	
//	
//	@FindBy(xpath= "//button[text()='remove']")
//	public WebElement removeButton;
//	
//	// Locators for Add address
//	
//	@FindBy(xpath="//div[@class='account__address-new-wrapper']")
//	public WebElement addAddressLink;
//	
//	@FindBy(id="countryDropdown")
//	public WebElement countryDropdownField;
//	
//	@FindBy(id="fullNameInput")
//	public WebElement fullNameInput;
//	
//	@FindBy(id="phoneNumberInput")
//	public WebElement phoneNumberInput;
//	
//	@FindBy(id= "streetInput")
//	public WebElement streetInput;
//	
//	@FindBy(id ="apartmentInput")
//	public WebElement apartmentInput;
//	
//	@FindBy(id ="cityInput")
//	public WebElement cityInput;
//	
//	@FindBy(name ="state")
//	public WebElement stateInput;
//	
//	@FindBy(id ="zipCodeInput")
//	public WebElement zipCodeInput;
//	
//	@FindBy(id="addressBtn")
//	public WebElement addressBtnInput;
//	
//	@FindBy(xpath="//div[text()='Address Added Successfully']")
//	public WebElement AddressAddedSuccessfullyMssg;
//	// locater for update card
//	@FindBy(xpath="//div[@class='flex gap-2 py-2']/button[1]")
//	public WebElement CardEditOption;
//	
//	@FindBy(xpath="//div[text()='Payment Method updated Successfully']")
//	 public WebElement updatedPaymentMssag;
//	
//	//locater for  update address
//	
//	@FindBy(xpath="//div[@class='account__address-grid']//button[text()='Edit']")
//	public WebElement EditAddress;
//	
//	@FindBy(xpath="//div[text()='Address Updated Successfully']")
//	public WebElement  updatedAddressSuessMessage;
//	
//	 @FindBy (xpath="//button[@id='addressBtn']")
//	 public WebElement updateAddress;
//	
//	
//	//locater for remove address
//	 @FindBy(xpath="//div[@class='account__address-btn-wrapper']//child::button[2]")
//	 public WebElement removeAddress;
//	
//	
//
//}
	@FindBy(id = "accountLink")
    public WebElement accountOption;

 

    @FindBy(id = "nameInput")
    public WebElement nameInput;

 

    @FindBy(id = "personalPhoneInput")
    public WebElement phoneInput;

 

    @FindBy(xpath= "//div[@class='account__personal-edit']/form/div[4]/button[1]")
 
    public WebElement updateBttn;

 

    @FindBy(xpath = "//html//body//div//div[2]")
    public WebElement successMessage;

 

    @FindBy(xpath = "//p[text()='Add a payment method']")
    public WebElement addAPaymentMethodLink;

 

    @FindBy(xpath = "//input[@id ='cardNumberInput']")
    public WebElement cardNumberInput;

 

    @FindBy(xpath = "//input[@id ='nameOnCardInput']")
    public WebElement nameOnCardInput;

 

    @FindBy(xpath = "//select[@id ='expirationMonthInput']")
    public WebElement expirationMonthInput;

 

    @FindBy(xpath = "//select[@id ='expirationYearInput']")
    public WebElement expirationYearInput;

 

    @FindBy(xpath = "//input[@id ='securityCodeInput']")
    public WebElement securityCodeInput;

 

    @FindBy(xpath = "//button[@id= 'paymentSubmitBtn']")
    public WebElement paymentSubmitBttn;

 

    @FindBy(xpath = "//p[@class='account__payment-sub-title']")
    public WebElement cardOption;

 

    @FindBy(xpath = "//div[@class='flex gap-2 py-2']//child::button[2]")
    public WebElement removeBttn;

 

    @FindBy(xpath = "//div[@class='account__address-new-wrapper']")
    public WebElement addAdressOption;

 

    @FindBy(xpath = "//select[@id='countryDropdown']")
    public WebElement countryDowpDown;

 

    @FindBy(xpath = "//input[@id='fullNameInput']")
    public WebElement fullNameInput;

 

    @FindBy(xpath = "//input[@id='phoneNumberInput']")
    public WebElement phoneNumberInput;

 

    @FindBy(xpath = "//input[@id='streetInput']")
    public WebElement streetInput;

 

    @FindBy(xpath = "//input[@id='apartmentInput']")
    public WebElement apartmentInput;

 

    @FindBy(xpath = "//input[@id='cityInput']")
    public WebElement cityInput;

 

    @FindBy(xpath = "//select[@name='state']")
    public WebElement stateInput;

 

    @FindBy(xpath = "//input[@id='zipCodeInput']")
    public WebElement zipCodeInput;

 

    @FindBy(xpath = "//button[@id='addressBtn']")
    public WebElement addressBttn;

 

    @FindBy(xpath = "//div[@class='flex gap-2 py-2']//child::button[1]")
    public WebElement editCardBttn;

 

    @FindBy(xpath = "//input[@id='cardNumberInput']")
    public WebElement editCardNumberInput;

 

    @FindBy(xpath = "//input[@id='nameOnCardInput']")
    public WebElement editNameOnCardInput;

 

    @FindBy(xpath = "//select[@id='expirationMonthInput']")
    public WebElement editExpirationMonthInput;

 

    @FindBy(xpath = "//select[@id='expirationYearInput']")
    public WebElement editExpirationYearInput;

 

    @FindBy(xpath = "//input[@id='securityCodeInput']")
    public WebElement editSecurityCodeInput;

 

    @FindBy(xpath = "//button[@id='paymentSubmitBtn']")
    public WebElement editpaymentSubmitBttn;

 

    @FindBy(xpath = "//div[@class='account__address-btn-wrapper']//child::button[1]")
    public WebElement editAddresOption;

 

    @FindBy(xpath = "//select[@name='country']")
    public WebElement editCountry;

 

    @FindBy(xpath = "//input[@id='fullNameInput']")
    public WebElement editFullNameInput;

 

    @FindBy(xpath = "//input[@id='phoneNumberInput']")
    public WebElement editPhoneNumberInput;

 

    @FindBy(xpath = "//input[@id='streetInput']")
    public WebElement editStreetInput;

    @FindBy(xpath = "//input[@id='apartmentInput']")
    public WebElement editApartmentInput;

    @FindBy(xpath = "//input[@id='cityInput']")
    public WebElement editCityInput;

    @FindBy(xpath = "//select[@name='state']")
    public WebElement editState;

    @FindBy(xpath = "//input[@id='zipCodeInput']")
      public WebElement editZipCoseInput;

    @FindBy(xpath ="//button[@id='addressBtn']")
    public WebElement editAddressBttn;

    @FindBy(xpath ="//div[@class='account__address-btn-wrapper']//child::button[2]")
    public WebElement  removeAddressBttn;




}


