package com.exito.www.driver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Driver {
    public static AppiumDriver<MobileElement> driver;

    public static Driver appium(){
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("noReset", "true");
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("platformVersion", "12");
            capabilities.setCapability("deviceName", "2201117TG");
            capabilities.setCapability( "udid", "72d9f928");
            capabilities.setCapability("appPackage", "com.exito.appcompania");
            capabilities.setCapability("appActivity", "views.initialaccess.activities.SplashActivity");

            driver = new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);

        }catch (MalformedURLException e){
            e.printStackTrace();
        }
        return new Driver();
    }
    public io.appium.java_client.AppiumDriver<MobileElement> on(){return driver;}
}
