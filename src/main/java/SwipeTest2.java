import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class SwipeTest2 {

    public static void main(String[] args) throws Exception {
        AppiumDriver driver = CreateDriverSession.initializeDriver("Android");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        By views = MobileBy.AccessibilityId("Views");
        By DateWidget = MobileBy.xpath("//android.widget.TextView[@content-desc='Date Widgets']");
        By Inline = MobileBy.AccessibilityId("2. Inline");
        By nine = MobileBy.xpath("//*[@content-desc='9']");

        TouchAction t = new TouchAction(driver);

        driver.findElement(views).click();
        driver.findElement(DateWidget).click();
        driver.findElement(Inline).click();
        driver.findElement(nine).click();


        WebElement fifteen = driver.findElementByXPath("//*[@content-desc='15']");
        WebElement second = driver.findElementByXPath("//*[@content-desc='45']");
        t.longPress(longPressOptions().withElement(element(fifteen))).moveTo(element(second)).release().perform();

  }
}
