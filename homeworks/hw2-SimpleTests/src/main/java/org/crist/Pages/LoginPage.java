package org.crist.Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {
    private final static SelenideElement profileName = $x("//*[@id=\"hook_Block_Navigation\"]/div/div/div[1]/a/div");

    private final static SelenideElement friendsButton = $x("//*[@id=\"hook_Block_Navigation\"]/div/div/div[4]/a/div");

    public SelenideElement getProfileName() {
        return profileName;
    }

    public FriendsPage openFriendsSearch() {
        friendsButton.click();
        return new FriendsPage();
    }
}
