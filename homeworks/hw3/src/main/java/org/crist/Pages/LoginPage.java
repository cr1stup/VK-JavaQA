package org.crist.Pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private static final By profileName = By.xpath("//*[@class='tico ellip']");
    private static final By friendsButton = By.xpath("//*[@id='hook_Block_Navigation']//a[@data-l='t,userFriend']//div");
    private static final By messagesButton = By.xpath("//*[@data-l='t,messages']//span[@class='toolbar_nav_i_ic']");

    public LoginPage() {
        checkPage();
    }

    public void checkPage() {
        $(profileName).shouldBe(visible.because("profile name should be visible on login page"));
        $(friendsButton).shouldBe(visible.because("friends button should be visible on login page"));
        $(messagesButton).shouldBe(visible.because("message button should be visible on login page"));
    }

    public String getProfileName() {
        return $(profileName).text();
    }

    public FriendsPage openFriendsSearch() {
        $(friendsButton).click();
        return new FriendsPage();
    }
}
