package org.example.app.properties;

public class AppiumConfiguration {
    private String platformName;
    private String deviceName;
    private String app;
    private String automationName;
    private boolean autoGrantPermission;

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public String getAutomationName() {
        return automationName;
    }

    public void setAutomationName(String automationName) {
        this.automationName = automationName;
    }

    public boolean isAutoGrantPermission() {
        return autoGrantPermission;
    }

    public void setAutoGrantPermission(boolean autoGrantPermission) {
        this.autoGrantPermission = autoGrantPermission;
    }

    @Override
    public String toString() {
        return "AppiumConfiguration{" +
                "platformName='" + platformName + '\'' +
                ", deviceName='" + deviceName + '\'' +
                ", app='" + app + '\'' +
                ", automationName='" + automationName + '\'' +
                ", autoGrantPermission=" + autoGrantPermission +
                '}';
    }
}
