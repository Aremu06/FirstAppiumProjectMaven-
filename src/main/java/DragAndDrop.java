import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class DragAndDrop {

    public static void main(String[] args) throws Exception {
        AppiumDriver driver = CreateDriverSession.initializeDriver("Android");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        By views = MobileBy.AccessibilityId("Views");
        By dragAndDrop = MobileBy.AccessibilityId("Drag and Drop");

         driver.findElement(views).click();
         driver.findElement(dragAndDrop).click();

        WebElement source = (WebElement) driver.findElementsByClassName("android.view.View").get(0);
        WebElement destination = (WebElement) driver.findElementsByClassName("android.view.View").get(1);


        TouchAction t = new TouchAction(driver);

        // t.longPress(longPressOptions().withElement(element(source))).moveTo(element(destination)).release().perform();

        t.longPress(element(source)).moveTo(element(destination)).release().perform();

    }
}
