package org.crist.OKTests;

import org.crist.Core.BaseTest;
import org.crist.Pages.MainPage;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;

public class SearchTest extends BaseTest {
    private final static String SEARCH_STRING = "Баскетбол";
    private final static String RESULT_WORD = "Найдено";

    @Test
    public void checkSearch() {
        new MainPage().open()
                .search(SEARCH_STRING)
                .getResult()
                .shouldHave(text(RESULT_WORD));
    }
}
