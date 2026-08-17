package stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ScreenshotUtil;

public class Hooks {

    private WebDriver driver;
    private ScenarioContext scenarioContext;

    public Hooks(ScenarioContext context) {
        this.scenarioContext = context;
    }

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        scenarioContext.setDriver(driver);
    }

    @After
    public void tearDown(io.cucumber.java.Scenario scenario) {
        if (scenario.isFailed()) {
            System.out.println("\n" + scenario.getName() + " - FAILED");
            ScreenshotUtil.takeScreenshot(driver, "FAILED_" + scenario.getName());
        } else {
            System.out.println("\n" + scenario.getName() + " - PASSED");
        }

        if (driver != null) {
            driver.quit();
        }
    }
}