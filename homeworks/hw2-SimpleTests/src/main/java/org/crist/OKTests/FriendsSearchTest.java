package org.crist.OKTests;

import org.crist.Pages.MainPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FriendsSearchTest extends BaseTest {
    private static final String FIND_FRIENDS = "Искать друзей";

    @Test
    public void checkSearchFriends() {
        Assertions.assertEquals(FIND_FRIENDS,
                new MainPage().open()
                        .login()
                        .openFriendsSearch()
                        .getFindFriendsButton());
    }
}
