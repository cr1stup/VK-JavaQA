package org.crist.OKTests;

import org.crist.Core.BaseTest;
import org.crist.Pages.MainPage;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;

public class FriendsTest extends BaseTest {
    private final static String FIND_FRIENDS = "Искать друзей";

    @Test
    public void checkFindFriends() {
        new MainPage().open()
                .login()
                .openFriendsSearch()
                .getFindFriendsButton()
                .shouldHave(text(FIND_FRIENDS));
    }
}
