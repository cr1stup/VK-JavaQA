package org.crist.OKTests;

import org.crist.Pages.MainPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchTest extends BaseTest {
    private static final String SEARCH_STRING = "Баскетбол";
    private static final String RESULT_WORD = "Найдено";

    @Test
    public void checkSearch() {
        Assertions.assertTrue(
                new MainPage().open()
                        .search(SEARCH_STRING)
                        .getResultWord()
                        .contains(RESULT_WORD));
    }
}