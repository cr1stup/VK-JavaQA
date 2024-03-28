package org.crist.Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class SearchPage {
    private final static SelenideElement resultTitle = $x("//*[@id=\"hook_Block_UserGroupsSearchPortal\"]/div/div[1]/h3");

    public SelenideElement getResult() {
        return resultTitle;
    }
}
