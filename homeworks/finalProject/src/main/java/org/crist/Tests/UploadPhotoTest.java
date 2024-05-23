package org.crist.Tests;

import org.crist.Pages.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class UploadPhotoTest extends BaseTest {

    @Test
    @DisplayName("Test upload photo")
    @Tag("UploadPhoto")
    public void testUploadPhoto() {
        Assertions.assertTrue(
                new LoginPage().open()
                        .login(testBot)
                        .openPhotoPage()
                        .uploadFile(),
                "photo didn't load");
    }
}
