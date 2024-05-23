package org.crist.Tests;

import org.crist.Pages.LoginPage;
import org.crist.Pages.MusicPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AddMusicTest extends BaseTest {
    private MusicPage musicPage;

    @ParameterizedTest
    @MethodSource("musicTitles")
    @DisplayName("Test add music")
    @Tag("AddMusic")
    public void testAddMusic(String title) {
        Assertions.assertTrue(
                musicPage.addMusic(title),
                "Login strange account");
    }

    @BeforeEach
    public void setUp() {
        musicPage = new LoginPage().open().login(testBot).openMusicPage();
    }

    @AfterEach
    public void cleanAfterTest() {
        musicPage.deleteMusic();
    }
}
