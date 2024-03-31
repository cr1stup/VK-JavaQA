package org.crist.Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class SearchPage {
    private static final SelenideElement resultTitle = $x("//h3[@class='portlet_h_name_t']");
    private static final SelenideElement enterButton = $x("//*[@class='button-pro __small __sec h-mod']");
    private static final SelenideElement mainBox = $x("//*[@class='list__zb5rh']//span[@name='18/ico_home_18']");
    private static final SelenideElement switchLanguageButton = $x("//*[@data-l='t,switchLanguage']");


    public SearchPage() {
        checkPage();
    }

    public void checkPage() {
        enterButton.shouldBe(visible);
        mainBox.shouldBe(visible);
        switchLanguageButton.shouldBe(visible);
    }

    public String getResultWord() {
        return resultTitle.shouldBe(visible).text();
    }
}
