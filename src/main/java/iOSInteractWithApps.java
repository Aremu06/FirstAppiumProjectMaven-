import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class iOSInteractWithApps {

    public static void main(String[] args) throws Exception {
        AppiumDriver driver = CreateDriverSession.initializeDriver("IOS");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        By activityIndicators = MobileBy.AccessibilityId("Activity Indicators");
        driver.findElement(activityIndicators).click();

        Thread.sleep(5000);
        driver.terminateApp("com.example.apple-samplecode.UICatalog");
        Thread.sleep(5000);
        System.out.println(driver.queryAppState("com.example.apple-samplecode.UICatalog"));
    }
}
