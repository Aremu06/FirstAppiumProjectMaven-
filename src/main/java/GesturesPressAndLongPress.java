import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.By;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class GesturesPressAndLongPress {

    public static void main(String[] args) throws Exception {
        AppiumDriver driver = CreateDriverSession.initializeDriver("Android");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        By accessibility = MobileBy.AccessibilityId("Accessibility");

        TouchAction t = new TouchAction(driver);

        t.press(ElementOption.element(driver.findElement(accessibility)))
           .waitAction(WaitOptions.waitOptions(Duration.ofMillis(5000))).perform().release();
        // t.longPress(ElementOption.element(driver.findElement(accessibility)))
        //        .waitAction(WaitOptions.waitOptions(Duration.ofMillis(5000))).release().perform();

        driver.closeApp();
    }
}