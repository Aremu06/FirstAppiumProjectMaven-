import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class BasicTest {

    public static void main(String[] args) throws Exception {
        AppiumDriver driver = CreateDriverSession.initializeDriver("Android");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        By preference = MobileBy.AccessibilityId("Preference");
        By dependency = MobileBy.AccessibilityId("3. Preference dependencies");
        By id = MobileBy.id("android:id/checkbox");
        By wifiSettings = MobileBy.xpath("//android.widget.TextView[@text='WiFi settings']");
        By edit = MobileBy.id("android:id/edit");
        By button = MobileBy.id("android:id/button1");

        driver.findElement(preference).click();
        driver.findElement(dependency).click();
        driver.findElement(id).click();
        driver.findElement(wifiSettings).click();
        driver.findElement(edit).sendKeys("12345566");
        driver.findElement(button).click();

    }
}
