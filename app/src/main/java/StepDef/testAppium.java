package StepDef;

import java.util.concurrent.TimeUnit;

import io.cucumber.java.en.Given;
import static StepDef.CommonDefinitions.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class testAppium {


    @Given("EAASE is launched")
    public void launchEAASE() throws InterruptedException {
        TimeUnit.SECONDS.sleep(5);
//        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ImageView/android.view.View/android.widget.ScrollView/android.widget.EditText[1]")).sendKeys("Bad");
        WebElement usrname = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ImageView/android.view.View/android.widget.ScrollView/android.widget.EditText[1]"));
        TimeUnit.SECONDS.sleep(3);
        usrname.click();
        usrname.sendKeys("operator@eaas.com");
    }
}
