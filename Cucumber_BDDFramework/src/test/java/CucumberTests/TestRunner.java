package CucumberTests;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import utility.Constant;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature"
		,glue={"stepDefinition"},
				plugin = {"com.cucumber.listener.ExtentCucumberFormatter:"+Constant.Report_Path},
		monochrome = true
		)


public class TestRunner {

	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File(Constant.Extent_Config_filePath));
	}
}