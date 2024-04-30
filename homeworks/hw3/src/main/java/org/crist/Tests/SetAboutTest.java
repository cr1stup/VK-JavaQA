package org.crist.Tests;

import org.crist.Pages.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class SetAboutTest extends BaseTest {
    @ParameterizedTest
    @ValueSource(strings = {"Hello", "My name is John", "Today"})
    @DisplayName("Test field about on profile page")
    @Tag("SetAbout")
    public void testAboutSet(String aboutString) {
        Assertions.assertEquals(aboutString,
                new LoginPage().open()
                        .login()
                        .openProfile()
                        .setAbout(aboutString)
                        .getAbout(),
                "About isn't displayed correctly");
    }
}
