package org.crist.Tests;

import org.crist.Pages.LoginPage;
import org.crist.Utils.Objects.TestBot;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class LoginTest extends BaseTest {

    @ParameterizedTest
    @MethodSource("dataTestBots")
    @DisplayName("Test correct User Login")
    @Tag("CorrectLogin")
    public void testCorrectLogin(TestBot testBot) {
        Assertions.assertTrue(
                new LoginPage().open()
                        .login(testBot)
                        .getProfileName()
                        .contains(testBot.login()),
                "Login strange account");
    }
}
