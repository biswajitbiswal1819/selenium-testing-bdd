package stepDefinitions;

import org.openqa.selenium.WebDriver;

public class ScenarioContext {

    private WebDriver driver;

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }
}