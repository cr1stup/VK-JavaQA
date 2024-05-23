package org.crist.Utils.Factory;

public class BrowserTypes {
    public static BrowserManager getBrowserType(String browserName) {
        switch (browserName) {
            case "chrome" -> {
                return new ChromeBrowser();
            }
            case "firefox" -> {
                return new FirefoxBrowser();
            }
            default -> throw new IllegalArgumentException("Unknown browser");
        }
    }
}
