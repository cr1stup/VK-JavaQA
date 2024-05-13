package org.crist.Tests;

import org.crist.Pages.LoginPage;
import org.crist.Pages.ProfilePage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class SetAboutTest extends BaseTest {
    private ProfilePage profilePage;
    
    @ParameterizedTest
    @ValueSource(strings = {"Hello", "My name is John", "can be more than 150 characters here"})
    @DisplayName("Test field about on profile page")
    @Tag("SetAbout")
    public void testAboutSet(String aboutString) {
        Assertions.assertEquals(aboutString,
                        profilePage
                        .setAbout(aboutString)
                        .getAbout(),
                "About isn't displayed correctly");
    }

    @BeforeEach
    public void setUp() {
        profilePage = new LoginPage().open().login().openProfile();
        profilePage.deleteAbout();
    }

    @AfterEach
    public void cleanAboutAfterTest() {
        profilePage.deleteAbout();
    }
}
