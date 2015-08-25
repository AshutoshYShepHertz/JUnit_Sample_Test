package selenium;

import java.io.File;
import java.net.URL;
import java.util.Map;

import junit.framework.Assert;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class JunitTest {
  
	@Test
    public void myTest1() {
		Assert.assertEquals("Google", "Google");
	}
	@Test
    public void myTest2() {
		Assert.assertEquals("Google WebPage", "Google WebPage");
	}
	
}
