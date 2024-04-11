package org.crist.Pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class FriendsPage {
    private static final By findFriendsButton = By.xpath("//*[@class='stub-empty_controls']//a");
    private static final By allButton = By.xpath("//*[@class='mctc_navMenuSec ellip-menu-item  mctc_navMenuActiveSec']");
    private static final By onSiteButton = By.xpath("//*[contains(@hrefattrs, 'st.cmd=userFriendRequest&st')]");
    private static final By moreButton = By.xpath("//*[contains(@class, 'mctc_navMenuDropdownSecLabelText')]");

    public FriendsPage() {
        checkPage();
    }

    public void checkPage() {
        $(allButton).shouldBe(visible.because("all button should be visible on friends page"));
        $(onSiteButton).shouldBe(visible.because("onSite button should be visible on friends page"));
        $(moreButton).shouldBe(visible.because("more button should be visible on friends page"));
    }

    public String getFindFriendsButton() {
        return $(findFriendsButton)
                .shouldBe(visible.because("findFriends button should be visible on friends page"))
                .text();
    }
}
