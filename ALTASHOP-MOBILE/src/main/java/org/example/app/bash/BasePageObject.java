package org.example.app.bash;

import io.appium.java_client.android.AndroidDriver;
import org.example.app.drivers.AndroidDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BasePageObject {
    public AndroidDriver getDriver() {
        if (AndroidDriverInit.driver == null) {
            AndroidDriverInit.initialize();
        }
        return AndroidDriverInit.driver;
    }

    public WebElement find(By by) {
        return getDriver().findElement(by);
    }

    public void type(By by, String text) {
        WebElement element = find(by);
        element.clear();
        element.sendKeys(text);
    }

    public void click(By by) {
        find(by).click();
    }

    public String getText(By by) {
        return find(by).getText();
    }

    public boolean isDisplayed(By by) {
        return find(by).isDisplayed();
    }
}
