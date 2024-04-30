package org.crist.Tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

abstract public class BaseTest {
    private static final String BASE_URL = "https://ok.ru/";

    @BeforeAll
    public static void setUp() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = BASE_URL;
    }

    @BeforeEach
    public void init() {
        Selenide.open(BASE_URL);
    }

    @AfterEach
    public void tearDown() {
        Selenide.closeWebDriver();
    }
}
