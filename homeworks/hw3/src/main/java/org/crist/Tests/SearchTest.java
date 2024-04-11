package org.crist.Tests;

import org.crist.Pages.MainPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class SearchTest extends BaseTest {
    private static final String RESULT_WORD = "Найдено";

    @ParameterizedTest
    @ValueSource(strings = {"Баскетбол", "Волейбол", "Хоккей"})
    @Tag("CorrectSearch")
    public void testSearch(String searchString) {
        Assertions.assertTrue(
                new MainPage().open()
                        .search(searchString)
                        .getResultWord()
                        .contains(RESULT_WORD),
                "Search didn't work correctly");
    }
}