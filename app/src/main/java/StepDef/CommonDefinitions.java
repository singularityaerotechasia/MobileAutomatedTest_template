package StepDef;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;

public class CommonDefinitions {

    public static AndroidDriver driver;
    public static String  feature = System.getProperty("user.dir") + "\\src\\main\\Features";
    public static String  stepDef = System.getProperty("user.dir") + "\\src\\main\\java\\StepDef";

    @Before
    public void launchEAASE() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Pixel XL API 33");
        options.setApp(System.getProperty("user.dir") + "\\src\\AndroidApps\\EaaseApp.apk");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
    }

//    @After
//    public void tearDown(Scenario scenario) {
//        try {
//            String screenshotName = scenario.getName().replaceAll("", "_");
//            if (scenario.isFailed()) {
//                TakesScreenshot ts = (TakesScreenshot) driver;
//                byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
//                scenario.attach(screenshot, "img/png", screenshotName);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        driver.quit();
//    }
}
