package org.crist.Utils.Factory;

import com.codeborne.selenide.Configuration;

public class FirefoxBrowser extends BaseBrowser {
    public FirefoxBrowser() {
        Configuration.browser = "firefox";
    }
}
