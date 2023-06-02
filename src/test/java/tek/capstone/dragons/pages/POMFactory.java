package tek.capstone.dragons.pages;

import tek.capstone.dragons.base.BaseSetup;

public class POMFactory extends BaseSetup {

	private RetailHomePage homePage;
	private RetailSingnInPage signInPage;
	private RetailAccountPage accountPage;
	private RetailOrderPage ordersPage;

	public POMFactory() {
		this.homePage = new RetailHomePage();
		this.signInPage = new RetailSingnInPage();
		this.accountPage = new RetailAccountPage();
		this.ordersPage = new RetailOrderPage();

	}

	public RetailHomePage homePage() {
		return this.homePage;

	}

	public RetailSingnInPage signInPage() {
		return this.signInPage;
		
	}
	
	public RetailAccountPage accountPage() {
		return this.accountPage;
	}

	public RetailOrderPage  ordersPage() {
		return this.ordersPage;
	}

}
