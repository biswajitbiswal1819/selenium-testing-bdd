package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import pages.WebForm;
import utils.ScreenshotUtil;

public class WebFormSteps {

    private WebDriver driver;
    private WebForm webFormPage;
    private String lastScreenshot;

    public WebFormSteps(ScenarioContext context) {
        this.driver = context.getDriver();
    }

    @Given("user navigates to the web form")
    public void navigateToWebForm() {
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        webFormPage = new WebForm(driver);
    }

    @When("user enters {string} in text field")
    public void enterTextInTextField(String text) {
        webFormPage.enterText(text);
    }

    @When("user enters {string} in password field")
    public void enterPasswordInPasswordField(String password) {
        webFormPage.enterPassword(password);
    }

    @When("user enters {string} in text area")
    public void enterTextInTextArea(String text) {
        webFormPage.enterTextArea(text);
    }

    @When("user selects {string} from dropdown")
    public void selectFromDropdown(String value) {
        webFormPage.selectDropdown(value);
    }

    @When("user selects checkbox")
    public void selectCheckbox() {
        webFormPage.selectCheckbox();
    }

    @When("user selects radio button")
    public void selectRadioButton() {
        webFormPage.selectRadioButton();
    }

    @When("user clicks submit button")
    public void clickSubmitButton() {
        webFormPage.clickSubmit();
    }

    @Then("success message {string} should be displayed")
    public void verifySuccessMessage(String expectedMessage) {
        String actualMessage = webFormPage.getMessage();
        Assert.assertEquals(actualMessage, expectedMessage, "Success message does not match");
    }

    @When("user takes screenshot of {string}")
    public void takeScreenshot(String name) {
        lastScreenshot = ScreenshotUtil.takeScreenshot(driver, name);
    }

    @Then("screenshot should be saved")
    public void verifyScreenshotSaved() {
        Assert.assertNotNull(lastScreenshot, "Screenshot was not saved");
    }
}