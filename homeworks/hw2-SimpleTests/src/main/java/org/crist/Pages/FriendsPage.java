package org.crist.Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class FriendsPage {
    private final static SelenideElement findFriendsButton = $x("//*[@id=\"hook_Block_MyFriendsSquareCardsPagingB\"]/div/div[3]/a");

    public SelenideElement getFindFriendsButton() {
        return findFriendsButton;
    }
}
