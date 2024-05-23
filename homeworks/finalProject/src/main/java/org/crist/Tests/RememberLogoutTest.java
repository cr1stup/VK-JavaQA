package org.crist.Tests;

import org.crist.Pages.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class RememberLogoutTest extends BaseTest {

    @Test
    @DisplayName("Test remember password")
    @Tag("RememberPassword")
    public void testRememberLogout() {
        Assertions.assertTrue(
                new LoginPage().open()
                        .login(testBot)
                        .rememberLogout()
                        .fastLogin()
                        .getProfileName()
                        .contains(testBot.login()),
                "couldn't remember the user");
    }
}
