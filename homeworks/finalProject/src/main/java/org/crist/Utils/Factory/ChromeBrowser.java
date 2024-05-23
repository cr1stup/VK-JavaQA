package org.crist.Utils.Factory;

import com.codeborne.selenide.Configuration;

public class ChromeBrowser extends BaseBrowser {
    public ChromeBrowser() {
        Configuration.browser = "chrome";
    }
}
