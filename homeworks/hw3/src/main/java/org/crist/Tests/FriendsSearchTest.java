package org.crist.Tests;

import org.crist.Pages.MainPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class FriendsSearchTest extends BaseTest {
    private static final String FIND_FRIENDS = "Искать друзей";

    @Test
    @Tag("FriendsSearch")
    public void testSearchFriends() {
        Assertions.assertEquals(FIND_FRIENDS,
                new MainPage().open()
                        .login()
                        .openFriendsSearch()
                        .getFindFriendsButton(),
                "friend search button is different");
    }
}
