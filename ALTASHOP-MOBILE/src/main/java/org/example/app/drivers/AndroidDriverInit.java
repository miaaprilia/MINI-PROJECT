package org.example.app.drivers;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.example.app.properties.AppiumConfiguration;
import org.example.app.properties.PropertiesReader;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.time.Duration;

public class AndroidDriverInit {

    public static AndroidDriver driver;

    public static void initialize() {
        DesiredCapabilities caps = new DesiredCapabilities();
        PropertiesReader reader = new PropertiesReader();
        AppiumConfiguration configuration = reader.readProperties();

        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, configuration.getDeviceName());
        caps.setCapability(MobileCapabilityType.APP, configuration.getApp());
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, configuration.getAutomationName());
        caps.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, configuration.isAutoGrantPermission());

        String url = "http://127.0.0.1:4723/";

        try {
            driver = new AndroidDriver(new URL(url), caps);

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void quit() {
        driver.quit();
    }
}