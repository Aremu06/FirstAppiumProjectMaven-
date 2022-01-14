import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.appmanagement.AndroidInstallApplicationOptions;
import org.openqa.selenium.By;

import java.io.File;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class AndInteractWithApps {

    public static void main(String[] args) throws Exception {
        AppiumDriver driver = CreateDriverSession.initializeDriver("Android");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        By views = MobileBy.AccessibilityId("Views");

        TouchAction t = new TouchAction(driver);

        driver.findElement(views).click();
        System.out.println(driver.isAppInstalled("io.appium.android.apis"));


        Thread.sleep(5000);
        System.out.println(driver.queryAppState("io.appium.android.apis"));
        Thread.sleep(5000);
       // driver.runAppInBackground(Duration.ofMillis(5000));
        driver.resetApp();
        driver.terminateApp("io.appium.android.apis");
        Thread.sleep(5000);
        System.out.println(driver.queryAppState("io.appium.android.apis"));
        /*Thread.sleep(5000);
        driver.activateApp("com.android.settings");
        String andappUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator
                + "resources" + File.separator + "ApiDemos-debug.apk";
        driver.installApp(andappUrl, new AndroidInstallApplicationOptions().withReplaceEnabled());
*/

    }
}
