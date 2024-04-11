package org.crist.Tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

abstract public class BaseTest {
    private static final String BASE_URL = "https://ok.ru/";

    public void setUp() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = BASE_URL;
    }

    @BeforeEach
    public void init() {
        setUp();
    }

    @AfterEach
    public void tearDown() {
        Selenide.closeWebDriver();
    }
}
