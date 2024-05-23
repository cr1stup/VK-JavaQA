package org.crist.Tests;

import org.crist.Pages.GroupsPage;
import org.crist.Pages.LoginPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class CreateGroupTest extends BaseTest {
    private GroupsPage groupsPage;

    @Test
    @DisplayName("Test create group")
    @Tag("CreateGroup")
    public void testGroupCreate() {
        Assertions.assertTrue(
                groupsPage.createGroup(),
                "couldn't create the group");
    }

    @BeforeEach
    public void setUp() {
        groupsPage = new LoginPage().open().login(testBot).openGroupsPage();
    }

    @AfterEach
    public void cleanAfterTest() {
        groupsPage.deleteGroup();
    }
}
