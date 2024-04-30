package org.crist.Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class FriendsPage {
    private static final SelenideElement findFriendsButton = $x("//*[@class='stub-empty_controls']//a");
    private static final SelenideElement allButton = $x("//*[@class='mctc_navMenuSec ellip-menu-item  mctc_navMenuActiveSec']");
    private static final SelenideElement onSiteButton = $x("//*[contains(@hrefattrs, 'st.cmd=userFriendRequest&st')]");
    private static final SelenideElement moreButton = $x("//*[contains(@class, 'mctc_navMenuDropdownSecLabelText')]");

    public FriendsPage() {
        checkPage();
    }

    public void checkPage() {
        allButton.shouldBe(visible);
        onSiteButton.shouldBe(visible);
        moreButton.shouldBe(visible);
    }

    public String getFindFriendsButton() {
        return findFriendsButton.shouldBe(visible).text();
    }
}
