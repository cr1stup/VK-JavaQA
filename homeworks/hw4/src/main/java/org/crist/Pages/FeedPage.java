package org.crist.Pages;

import org.crist.Utils.Elements.LeftSideMenu;
import org.crist.Utils.Loadable.LoadablePage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class FeedPage implements LoadablePage {
    private final LeftSideMenu leftMenu = new LeftSideMenu();
    private static final By messagesButton = By.xpath("//*[@data-l='t,messages']//span[@class='toolbar_nav_i_ic']");

    public FeedPage() {
        checkPage();
    }

    @Override
    public void checkPage() {
        $(leftMenu.getProfileName()).shouldBe(visible.because("profile name should be visible on feed page"));
        $(leftMenu.getFriendsButton()).shouldBe(visible.because("friends button should be visible on feed page"));
        $(messagesButton).shouldBe(visible.because("message button should be visible on feed page"));
    }

    public String getProfileName() {
        return $(leftMenu.getProfileName()).text();
    }

    public FriendsPage openFriendsSearch() {
        return leftMenu.openFriendsSearch();
    }

    public ProfilePage openProfile() {
        return leftMenu.openProfile();
    }
}
