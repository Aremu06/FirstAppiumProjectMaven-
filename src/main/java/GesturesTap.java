import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class GesturesTap {

    public static void main(String[] args) throws Exception {
        AppiumDriver driver = CreateDriverSession.initializeDriver("IOS");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        By activity_indicators = MobileBy.AccessibilityId("Activity Indicators");

        TouchAction t = new TouchAction(driver);

        driver.findElement(activity_indicators).click();


             t.tap(ElementOption.element(driver.findElement(activity_indicators))).perform();
             t.tap(PointOption.point(538, 416)).perform();

    }
}
