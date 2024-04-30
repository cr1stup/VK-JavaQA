package org.crist.Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {
    private static final SelenideElement profileName = $x("//*[@class='tico ellip']");
    private static final SelenideElement friendsButton = $x("//*[@id='hook_Block_Navigation']//a[@data-l='t,userFriend']//div");
    private static final SelenideElement messagesButton = $x("//*[@data-l='t,messages']//span[@class='toolbar_nav_i_ic']");

    public LoginPage() {
        checkPage();
    }

    public void checkPage() {
        profileName.shouldBe(visible);
        friendsButton.shouldBe(visible);
        messagesButton.shouldBe(visible);
    }

    public String getProfileName() {
        return profileName.text();
    }

    public FriendsPage openFriendsSearch() {
        friendsButton.click();
        return new FriendsPage();
    }
}
