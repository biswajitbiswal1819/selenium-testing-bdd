package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class WebForm {
    
    private WebDriver driver;
    private WebDriverWait wait;

    // Text box
    private By textBox = By.name("my-text");

    // Password
    private By password = By.name("my-password");

    // Text area
    private By textArea = By.name("my-textarea");

    // Dropdown
    private By dropdown = By.name("my-select");

    // Checkbox
    private By checkbox = By.id("my-check-1");

    // Radio button
    private By radioButton = By.id("my-radio-1");

    // File upload
    private By fileUpload = By.name("my-file");

    // Submit button
    private By submitButton = By.cssSelector("button");

    // Success message
    private By message = By.id("message");


    public WebForm(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }


    // Text box
    public void enterText(String text) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(textBox));
        driver.findElement(textBox).sendKeys(text);
    }


    // Password
    public void enterPassword(String passwordValue) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(password));
        driver.findElement(password).sendKeys(passwordValue);
    }


    // Text area
    public void enterTextArea(String text) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(textArea));
        driver.findElement(textArea).sendKeys(text);
    }


    // Dropdown
    public void selectDropdown(String value) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(dropdown));
        Select select = new Select(driver.findElement(dropdown));
        select.selectByVisibleText(value);
    }


    // Checkbox
    public void selectCheckbox() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(checkbox));
        WebElement element = driver.findElement(checkbox);

        if (!element.isSelected()) {
            element.click();
        }
    }


    // Radio button
    public void selectRadioButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(radioButton));
        driver.findElement(radioButton).click();
    }


    // File upload
    public void uploadFile(String filePath) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(fileUpload));
        driver.findElement(fileUpload).sendKeys(filePath);
    }


    // Submit
    public void clickSubmit() {
        wait.until(ExpectedConditions.elementToBeClickable(submitButton));
        driver.findElement(submitButton).click();
    }


    // Get message
    public String getMessage() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(message));
        return driver.findElement(message).getText();
    }
}