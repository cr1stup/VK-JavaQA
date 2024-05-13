package org.crist.Pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class ProfilePage {
    private static final By addCoverButton = By.xpath("//*[contains(@class, 'cover-install')]");
    private static final By userAvatar = By.xpath("//*[contains(@class, 'user-change')]");
    private static final By userAbout = By.xpath("//*[contains(@class, 'user-bio-component')]");
    private static final By editAboutUser = By.xpath("//*[@tsid='TextFieldEditor']");
    private static final By saveAboutButton = By.xpath("//*[@data-l='t,textField-save']");
    private static final By textAboutUser = By.xpath("//*[@tsid='TextFieldText']");

    public ProfilePage open() {
        checkPage();
        return this;
    }

    public void checkPage() {
        $(addCoverButton).shouldBe(visible.because("addCover button should be visible on profile page"));
        $(userAvatar).shouldBe(visible.because("user avatar input should be visible on profile page"));
        $(userAbout).shouldBe(visible.because("userAbout should be visible on profile page"));
    }

    public ProfilePage setAbout(String aboutString) {
        $(userAbout).shouldBe(visible.because("userAbout should be visible on profile page")).click();
        $(editAboutUser).shouldBe(visible.because("editAboutUser should be visible after click on userAbout")).setValue(aboutString);
        $(saveAboutButton).shouldBe(visible.because("saveAbout button should be after click on userAbout")).click();
        return this;
    }

    public String getAbout() {
        return $(textAboutUser).shouldBe(visible.because("textAboutUser should be after setAbout")).text();
    }
}
