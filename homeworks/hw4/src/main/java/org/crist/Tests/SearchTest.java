package org.crist.Tests;

import org.crist.Pages.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class SearchTest extends BaseTest {
    private static final String RESULT_WORD = "Найдено";

    @ParameterizedTest
    @ValueSource(strings = {"Баскетбол", "Волейбол", "Хоккей"})
    @DisplayName("Test correct search on login page")
    @Tag("CorrectSearch")
    public void testSearch(String searchString) {
        Assertions.assertTrue(
                new LoginPage().open()
                        .search(searchString)
                        .getResultWord()
                        .contains(RESULT_WORD),
                "Search didn't work correctly");
    }
}