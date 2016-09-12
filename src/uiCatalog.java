import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.remote.DesiredCapabilities;


public class uiCatalog {

	/**
	 * @param args
	 * @throws MalformedURLException 
	 */
	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		File f = new File("/Users/PrateekMahawar/Desktop/itunesTopVideos.zip");
		//64D8EAD6-05A8-486A-9886-5F567AB0FCDB
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.3");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 6");
		
		
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "");
		cap.setCapability(MobileCapabilityType.APP, f.getAbsolutePath());
		
		IOSDriver driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
	}

}
