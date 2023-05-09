package RunnerClass;

import org.testng.annotations.Test;

import io.cucumber.testng.CucumberOptions;

@Test

@CucumberOptions(plugin = {"pretty"}, tags = "", features = "C:/Users/badri/AndroidStudioProjects/AppiumAndroidStd/app/src/androidTest/Features", glue = "C:/Users/badri/AndroidStudioProjects/AppiumAndroidStd/app/src/androidTest/java/StepDef")
public class RunnerClass {
}
