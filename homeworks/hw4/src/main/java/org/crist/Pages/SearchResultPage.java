package org.crist.Pages;

import org.crist.Utils.Loadable.LoadablePage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class SearchResultPage implements LoadablePage {
    private static final By resultTitle = By.xpath("//h3[@class='portlet_h_name_t']");
    private static final By enterButton = By.xpath("//*[@class='button-pro __small __sec h-mod']");
    private static final By mainButton = By.xpath("//*[@class='list__zb5rh']//span[@name='18/ico_home_18']");
    private static final By switchLanguageButton = By.xpath("//*[@data-l='t,switchLanguage']");

    public SearchResultPage() {
        checkPage();
    }

    @Override
    public void checkPage() {
        $(enterButton).shouldBe(visible.because("enter button input should be visible on result page"));
        $(mainButton).shouldBe(visible.because("main button input should be visible on result page"));
        $(switchLanguageButton).shouldBe(visible.because("switchLanguage button input should be visible on result page"));
    }

    public String getResultWord() {
        return $(resultTitle).shouldBe(visible.because("result title should be visible on result page")).text();
    }
}
