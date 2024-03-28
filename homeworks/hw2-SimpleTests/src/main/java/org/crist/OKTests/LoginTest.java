package org.crist.OKTests;

import org.crist.Core.BaseTest;
import org.crist.Pages.MainPage;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;

public class LoginTest extends BaseTest {
    private final static String USER_NAME = "technopol38";

    @Test
    public void checkLogin() {
        new MainPage().open()
                .login()
                .getProfileName()
                .shouldHave(text(USER_NAME));
    }
}
