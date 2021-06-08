import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class NuevoDestTransf {

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
		String filename = "IMG1_PantallaPrincipal.png";
		FileHandler.copy(srcFile, new File(filename));
	
		
		
		driver.findElement(By.xpath("\r\n" + "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText")).sendKeys("175936386");
		System.out.println("Se escribe 175936386");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
				augmentedDriver = new Augmenter().augment(driver);
		srcFile = ((TakesScreenshot) augmentedDriver).getScreenshotAs(OutputType.FILE);
		filename = "IMG2_RUT.png";
		FileHandler.copy(srcFile, new File(filename));
		
		
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText")).sendKeys("1234");
		System.out.println("Se ingresa Password 1234");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
				augmentedDriver = new Augmenter().augment(driver);
		srcFile = ((TakesScreenshot) augmentedDriver).getScreenshotAs(OutputType.FILE);
		filename = "IMG3_Pass.png";
		FileHandler.copy(srcFile, new File(filename));
		
		
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.Button[1]\r\n"
				+ "		")).click();
		System.out.println("Se da click en botón de ingresar");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				augmentedDriver = new Augmenter().augment(driver);
		srcFile = ((TakesScreenshot) augmentedDriver).getScreenshotAs(OutputType.FILE);
		filename = "IMG4_Ingresar.png";
		FileHandler.copy(srcFile, new File(filename));
		
		
		
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]")).click();
		System.out.println("Se da click en botón de cerrar ingresar con huella");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
				augmentedDriver = new Augmenter().augment(driver);
		srcFile = ((TakesScreenshot) augmentedDriver).getScreenshotAs(OutputType.FILE);
		filename = "IMG5_ingresarconhuella.png";
		FileHandler.copy(srcFile, new File(filename));
		
		
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		driver.findElement(By.xpath("	\r\n"
				+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.Button")).click();
		System.out.println("Se da click en menú lateral");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				augmentedDriver = new Augmenter().augment(driver);
		srcFile = ((TakesScreenshot) augmentedDriver).getScreenshotAs(OutputType.FILE);
		filename = "IMG6_Menulateral.png";
		FileHandler.copy(srcFile, new File(filename));
		
		
		
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]")).click();
		System.out.println("Se da click en Transferir");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				augmentedDriver = new Augmenter().augment(driver);
		srcFile = ((TakesScreenshot) augmentedDriver).getScreenshotAs(OutputType.FILE);
		filename = "IMG7_Transferir.png";
		FileHandler.copy(srcFile, new File(filename));
		
		
		
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button")).click();
		System.out.println("Se da click en Nuevo");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				augmentedDriver = new Augmenter().augment(driver);
		srcFile = ((TakesScreenshot) augmentedDriver).getScreenshotAs(OutputType.FILE);
		filename = "IMG8_Nuevo.png";
		FileHandler.copy(srcFile, new File(filename));
		
		
		
		
		driver.findElement(By.xpath("\r\n"+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.widget.EditText[1]")).sendKeys("Emma");
		System.out.println("Se ingresa Nombre Emma");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
				augmentedDriver = new Augmenter().augment(driver);
		srcFile = ((TakesScreenshot) augmentedDriver).getScreenshotAs(OutputType.FILE);
		filename = "IMG9_Nombrenuevodest.png";
		FileHandler.copy(srcFile, new File(filename));
		
		
		

		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.widget.EditText[2]")).sendKeys("175936386");
		System.out.println("Se ingresa Rut 175936386");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
				augmentedDriver = new Augmenter().augment(driver);
		srcFile = ((TakesScreenshot) augmentedDriver).getScreenshotAs(OutputType.FILE);
		filename = "IMG10_rutnuevodest.png";
		FileHandler.copy(srcFile, new File(filename));
		
		
		
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.widget.EditText[3]\r\n"
				+ "")).sendKeys("maildeprueba@gmail.com");
		System.out.println("Se ingresa se ingresa mail maildeprueba@gmail.com");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
				augmentedDriver = new Augmenter().augment(driver);
		srcFile = ((TakesScreenshot) augmentedDriver).getScreenshotAs(OutputType.FILE);
		filename = "IMG11_mailnuevodest.png";
		FileHandler.copy(srcFile, new File(filename));
		
		
		
		
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View[5]\r\n"
				+ "")).click();
		System.out.println("Se da click en Banco");
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
				augmentedDriver = new Augmenter().augment(driver);
		srcFile = ((TakesScreenshot) augmentedDriver).getScreenshotAs(OutputType.FILE);
		filename = "IMG12_Banconuevodest.png";
		FileHandler.copy(srcFile, new File(filename));
		
		
		
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]")).click();
		System.out.println("Se da click en Banco Bci");
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
				augmentedDriver = new Augmenter().augment(driver);
		srcFile = ((TakesScreenshot) augmentedDriver).getScreenshotAs(OutputType.FILE);
		filename = "IMG13_Banconuevodest.png";
		FileHandler.copy(srcFile, new File(filename));
		
		
		
		
		driver.findElement(By.xpath("\r\n"+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View[7]")).click();
		System.out.println("Se da click en Tipo de cuenta");
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
				augmentedDriver = new Augmenter().augment(driver);
		srcFile = ((TakesScreenshot) augmentedDriver).getScreenshotAs(OutputType.FILE);
		filename = "IMG14_TipodeCuentanuevodest.png";
		FileHandler.copy(srcFile, new File(filename));
		
		
		
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]")).click();
		System.out.println("Se da click en cuenta Corriente");
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
				augmentedDriver = new Augmenter().augment(driver);
		srcFile = ((TakesScreenshot) augmentedDriver).getScreenshotAs(OutputType.FILE);
		filename = "IMG15_TipodeCuentanuevodest.png";
		FileHandler.copy(srcFile, new File(filename));
		
		
		
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.widget.EditText[4]")).sendKeys("175936386");
		System.out.println("Se ingresa se ingresa Número de cuenta 175936386");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
				augmentedDriver = new Augmenter().augment(driver);
		srcFile = ((TakesScreenshot) augmentedDriver).getScreenshotAs(OutputType.FILE);
		filename = "IMG16_numcuentanuevodest.png";
		FileHandler.copy(srcFile, new File(filename));
		
		
		
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.widget.Button")).click();
		System.out.println("Se da click en Continuar");
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
				augmentedDriver = new Augmenter().augment(driver);
		srcFile = ((TakesScreenshot) augmentedDriver).getScreenshotAs(OutputType.FILE);
		filename = "IMG17_Continuar.png";
		FileHandler.copy(srcFile, new File(filename));
		
		
		
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.widget.Button[1]")).click();
		System.out.println("Se da click en Confirmar");
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
				augmentedDriver = new Augmenter().augment(driver);
		srcFile = ((TakesScreenshot) augmentedDriver).getScreenshotAs(OutputType.FILE);
		filename = "IMG18_confirmar.png";
		FileHandler.copy(srcFile, new File(filename));
		
		
		
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View")).click();
		System.out.println("Se da click en cerrar");
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
				augmentedDriver = new Augmenter().augment(driver);
		srcFile = ((TakesScreenshot) augmentedDriver).getScreenshotAs(OutputType.FILE);
		filename = "IMG19_cerrar.png";
		FileHandler.copy(srcFile, new File(filename));
		
					
		
	driver.quit();
	}
}
