package org.crist.Pages;

import org.crist.Utils.Loadable.LoadablePage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class FriendsPage implements LoadablePage {
    private static final By findFriendsButton = By.xpath("//*[@class='stub-empty_controls']//a");
    private static final By allButton = By.xpath("//*[contains(@hrefattrs, 'ViewAll')]");
    private static final By friendsRequestButton = By.xpath("//*[contains(@hrefattrs, 'ViewRequests')]");
    private static final By moreButton = By.xpath("//*[contains(@class, 'mctc_navMenuDropdownSecLabelText')]");

    public FriendsPage() {
        checkPage();
    }

    @Override
    public void checkPage() {
        $(allButton).shouldBe(visible.because("all button should be visible on friends page"));
        $(friendsRequestButton).shouldBe(visible.because("onSite button should be visible on friends page"));
        $(moreButton).shouldBe(visible.because("more button should be visible on friends page"));
    }

    public String getFindFriendsButton() {
        return $(findFriendsButton)
                .shouldBe(visible.because("findFriends button should be visible on friends page"))
                .text();
    }
}
