package org.crist.Pages;

import org.crist.Utils.Elements.LeftSideMenu;
import org.crist.Utils.Elements.TopBar;
import org.crist.Utils.Loadable.LoadablePage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class FeedPage implements LoadablePage {
    private final LeftSideMenu leftMenu = new LeftSideMenu();
    private final TopBar topBar = new TopBar();
    private static final By profile = By.xpath("//div[@class='toolbar_dropdown_w h-mod']");
    private static final By exitButton = By.xpath("//div[@class='toolbar_accounts-user-delete-button']");
    private static final By rememberButton = By.xpath("//input[@name='st.layer.rememberMe']");
    private static final By acceptExitButton = By.xpath("//input[@class='button-pro form-actions_yes']");

    public FeedPage() {
        checkPage();
    }

    @Override
    public void checkPage() {
        leftMenu.checkMenu();
        topBar.checkTopBar();
    }

    public LogoutPage rememberLogout() {
        $(profile).shouldBe(visible.because("profile should be visible on feed page")).click();
        $(exitButton).shouldBe(visible.because("exitButton should be visible on feed page")).click();
        $(rememberButton).shouldBe(visible.because("rememberButton should be visible after click on exit")).click();
        $(acceptExitButton).shouldBe(visible.because("acceptExitButton should be visible after click on exit")).click();
        return new LogoutPage();
    }

    public PhotoPage openPhotoPage() {
        $(leftMenu.getPhotoButton()).shouldBe(visible.because("photo button should be visible on feed page")).click();
        return new PhotoPage();
    }

    public GroupsPage openGroupsPage() {
        $(leftMenu.getGroupsButton()).shouldBe(visible.because("groups button should be visible on feed page")).click();
        return new GroupsPage();
    }

    public MusicPage openMusicPage() {
        $(topBar.getMusicButton()).shouldBe(visible.because("music button should be visible on feed page")).click();
        return new MusicPage();
    }

    public String getProfileName() {
        return $(leftMenu.getProfileName()).shouldBe(visible.because("profile name should be visible on feed page")).text();
    }
}
