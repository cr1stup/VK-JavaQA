package org.crist.Utils.Elements;

import org.crist.Pages.FriendsPage;
import org.crist.Pages.ProfilePage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class LeftSideMenu {
    private static final By profileName = By.xpath("//*[@class='tico ellip']");
    private static final By friendsButton = By.xpath("//*[@id='hook_Block_Navigation']//a[@data-l='t,userFriend']//div");

    public LeftSideMenu() {
        checkMenu();
    }

    public void checkMenu() {
        $(friendsButton).shouldBe(visible.because("friends button should be visible on feed page"));
        $(profileName).shouldBe(visible.because("profile name should be visible on feed page"));
    }

    public By getProfileName() {
        return profileName;
    }

    public By getFriendsButton() {
        return friendsButton;
    }
    public FriendsPage openFriendsSearch() {
        $(friendsButton).shouldBe(visible.because("friends button should be visible on feed page")).click();
        return new FriendsPage();
    }

    public ProfilePage openProfile() {
        $(profileName).shouldBe(visible.because("profile name should be visible on feed page")).click();
        return new ProfilePage();
    }
}
