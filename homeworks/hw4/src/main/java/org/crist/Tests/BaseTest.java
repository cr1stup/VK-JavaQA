package org.crist.Tests;

import org.crist.Utils.Factory.BrowserManager;
import org.crist.Utils.Factory.BrowserTypes;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

abstract public class BaseTest {
    protected static BrowserManager browserManager;
    private static final String BASE_URL = "https://ok.ru/";
    private static final String BROWSER = "chrome";
    private static final String BROWSER_SIZE = "1920x1080";

    @BeforeAll
    public static void start() {
        browserManager = BrowserTypes.getBrowserType(BROWSER);
        browserManager.browserURL(BASE_URL);
        browserManager.browserSize(BROWSER_SIZE);
    }

    @BeforeEach
    public void init() {
        browserManager.openBrowser();
    }

    @AfterEach
    public void tearDown() {
        browserManager.closeBrowser();
    }
}
