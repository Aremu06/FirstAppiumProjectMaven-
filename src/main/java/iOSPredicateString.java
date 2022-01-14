import io.appium.java_client.AppiumDriver;
import io.appium.java_client.FindsByIosNSPredicate;
import io.appium.java_client.MobileElement;

public class iOSPredicateString {

    public static void main(String[] args) throws Exception {
        AppiumDriver driver = CreateDriverSession.initializeDriver("IOS");

        MobileElement myElement = (MobileElement) ((FindsByIosNSPredicate) driver)
                .findElementByIosNsPredicate("name == \"Activity Indicators\"");

        myElement = (MobileElement) driver.findElementsByXPath("//XCUIElementTypeStaticText[@name=\"Activity Indicators\"]");
        System.out.println(myElement.getText());

    }
}
