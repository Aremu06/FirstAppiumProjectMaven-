import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class FetchElementAttributes {

    public static void main(String[] args) throws Exception {
        AppiumDriver driver = CreateDriverSession.initializeDriver("Android");

        By accessibility = MobileBy.AccessibilityId("Accessibility");

        System.out.println("text:" + driver.findElement(accessibility).getText());
        System.out.println("text:" + driver.findElement(accessibility).getAttribute("text"));
        System.out.println("text:" + driver.findElement(accessibility).getAttribute("checked"));
        System.out.println("text:" + driver.findElement(accessibility).getAttribute("enabled"));
        System.out.println("text:" + driver.findElement(accessibility).getAttribute("selected"));
        System.out.println("text:" + driver.findElement(accessibility).getAttribute("displayed"));

        System.out.println("text:" + driver.findElement(accessibility).isDisplayed());
        System.out.println("text:" + driver.findElement(accessibility).isEnabled());
        System.out.println("text:" + driver.findElement(accessibility).isSelected());

    }
}
