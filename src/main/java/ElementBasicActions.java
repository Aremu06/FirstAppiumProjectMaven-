import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ElementBasicActions {

    public static void main(String[] args) throws Exception {
        AppiumDriver driver = CreateDriverSession.initializeDriver("Android");

        By views = MobileBy.AccessibilityId("Views");
        By textFields = MobileBy.AccessibilityId("TextFields");
        By editText = MobileBy.id("io.appium.android.apis:id/edit");

        driver.findElement(views).click();

        (new TouchAction(driver))
                .press(new PointOption().withCoordinates(507, 1679))
                .moveTo(new PointOption().withCoordinates(520, 625))
                .release()
                .perform();

        (new TouchAction(driver))
                .press(new PointOption().withCoordinates(494, 1713))
                .moveTo(new PointOption().withCoordinates(499, 560))
                .release()
                .perform();

        (new TouchAction(driver))
                .press(new PointOption().withCoordinates(503, 1713))
                .moveTo(new PointOption().withCoordinates(494, 525))
                .release()
                .perform();

        driver.findElement(textFields).click();
        driver.findElement(editText).sendKeys("my Testing");
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Thread.sleep(300);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(editText)).click();
        driver.findElement(editText).clear();

    }

}