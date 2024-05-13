package org.crist.Utils.Factory;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;

abstract public class BaseBrowser implements BrowserManager {
    @Override
    public void browserURL(String url) {
        Configuration.baseUrl = url;
    }
    @Override
    public void openBrowser() {
        Selenide.open("/");
    }
    @Override
    public void closeBrowser() {
        Selenide.closeWebDriver();
    }

    @Override
    public void browserSize(String size) {
        Configuration.browserSize = size;
    }
}
