package org.crist.OKTests;

import org.crist.Pages.MainPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTest {
    private static final String USER_NAME = "technopol38 technopol38";

    @Test
    public void checkCorrectLogin() {
        Assertions.assertEquals(USER_NAME,
                new MainPage().open()
                .login()
                .getProfileName());
    }
}
