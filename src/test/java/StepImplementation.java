
import org.openqa.selenium.By;
import org.testng.Assert;

import com.thoughtworks.gauge.Step;

import driver.Driver;

public class StepImplementation {


	@Step("Go to xs")
	public void goToXs() throws InterruptedException{
	
        Driver.webDriver.get("https://www.xenonstack.com/");
        Thread.sleep(2000);
        
	}

	@Step("Validate the page title")
	public void validateThePageTitle() throws InterruptedException{
		
        String title = Driver.webDriver.getTitle();
        String title_org = "XenonStack - Cloud Native and Data Intelligence Company";
        Thread.sleep(2000);

        Assert.assertEquals(title_org, title, "XSSSS");

	}

	@Step("Go to elixr")
	public void goToElixr() throws InterruptedException{
		
        Driver.webDriver.get("https://www.elixirdata.com/");
        Thread.sleep(1000);
	}

	@Step("Page title")
	public void pageTitle(){
		
        String name = Driver.webDriver.getTitle();
        String or_name = "ElixirData | Data Mesh as a Platform";

        Assert.assertEquals(or_name, name);
	}

	@Step("Go to onboard")
	public void goToOnboard() throws InterruptedException{
		
        Driver.webDriver.get("https://careers.xenonstack.com/onboarding/login");
        Thread.sleep(1000);

	}

	@Step("Validate titlePage")
	public void validateTitlepage() throws InterruptedException{
		
        String exp_onboard = Driver.webDriver.getTitle();
        String act_onboard = "On Boarding Dashboard";

        Assert.assertEquals(act_onboard, exp_onboard);
        Thread.sleep(1000);
	}
}
