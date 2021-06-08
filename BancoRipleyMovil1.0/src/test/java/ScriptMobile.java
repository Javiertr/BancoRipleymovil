import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.io.IOException;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.TakesScreenshot;


public class ScriptMobile {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		
		WebDriver driver;
		DesiredCapabilities cap = new DesiredCapabilities();
				
			cap.setCapability("deviceName", "RF8MA045T5T");
			cap.setCapability("platformName", "Android");
			cap.setCapability("app", "C:\\automation\\Apps\\app-debug.apk");
			cap.setCapability("appPackage", "cl.bancoripley.appbanco");
			cap.setCapability("noSing", true);
			cap.setCapability("autoGrantPermissions", true);
		
		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebDriver augmentedDriver = new Augmenter().augment(driver);
		File srcFile = ((TakesScreenshot) augmentedDriver).getScreenshotAs(OutputType.FILE);
		String filename = "PantallaPrincipal.png";
		FileHandler.copy(srcFile, new File(filename));
	
		
		
		driver.findElement(By.xpath("	\r\n"
				+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText")).sendKeys("175936386");
		System.out.println("Se escribe 175936386");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
				augmentedDriver = new Augmenter().augment(driver);
		srcFile = ((TakesScreenshot) augmentedDriver).getScreenshotAs(OutputType.FILE);
		filename = "IMG1_RUT.png";
		FileHandler.copy(srcFile, new File(filename));
		
		
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText")).sendKeys("1234");
		System.out.println("Se ingresa Password 1234");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
				augmentedDriver = new Augmenter().augment(driver);
		srcFile = ((TakesScreenshot) augmentedDriver).getScreenshotAs(OutputType.FILE);
		filename = "IMG2_Pass.png";
		FileHandler.copy(srcFile, new File(filename));
		
		
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.Button[1]\r\n"
				+ "		")).click();
		System.out.println("Se da click en botón de Registrar ingresar");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				augmentedDriver = new Augmenter().augment(driver);
		srcFile = ((TakesScreenshot) augmentedDriver).getScreenshotAs(OutputType.FILE);
		filename = "IMG3_Ingresar.png";
		FileHandler.copy(srcFile, new File(filename));
		
		
	driver.quit();
		
	}

}
