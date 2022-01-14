import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;

public class CreateDriverSession {

    public static AppiumDriver initializeDriver(String platformName) throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("newCommandTimeout", 300);

        URL url = new URL("http://0.0.0.0:4723/wd/hub");

        switch (platformName){
            case "Android":
                caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
                caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 3");
                caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
                caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
                caps.setCapability("avd", "Pixel_3");
                caps.setCapability("avdLaunchTimeout", 180000);
                String andappUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator
                        + "resources" + File.separator + "ApiDemos-debug.apk";
                //caps.setCapability("appPackage", "com.pickery.app.debug");
                //caps.setCapability("appActivity", "com.flink.consumer.feature.cart.CartActivity");
                caps.setCapability(MobileCapabilityType.APP, andappUrl);
               // caps.setCapability("unlockType", "pin");
               // caps.setCapability("unlockKey", "1111");
                return new AndroidDriver(url, caps);

            case "IOS":

                caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
                caps.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone13");
                caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
                caps.setCapability(MobileCapabilityType.UDID, "9BB5C442-D59C-4E87-A77D-3F066E391B80");
                String IOSapUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator
                        + "resources" + File.separator + "UIKitCatalog-iphonesimulator.app";
                caps.setCapability("simulatorStartupTimeout", 180000);
                caps.setCapability("bundleId", "com.example.apple-samplecode.UICatalog");
                caps.setCapability(MobileCapabilityType.APP, IOSapUrl);
                return new IOSDriver(url, caps);
            default:
                throw new Exception("invalid platform");

        }
    }

}
