package utils;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtil {

    public static String takeScreenshot(WebDriver driver, String fileName) {
        File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss"));
        File destination = new File("screenshots/" + fileName + "_" + timestamp + ".png");

        destination.getParentFile().mkdirs();

        try {
            org.openqa.selenium.io.FileHandler.copy(source, destination);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return destination.getAbsolutePath();
    }
}