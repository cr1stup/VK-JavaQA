package org.crist.Pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    private static final String LOGIN = "technopol38";
    private static final String PASSWORD = "technopolisPassword";
    private static final SelenideElement searchInput = $x("//input[@name='st.query']");
    private static final SelenideElement loginInput = $x("//input[@name='st.email']");
    private static final SelenideElement passwordInput = $x("//input[@name='st.password']");
    private static final SelenideElement enterButton = $x("//input[@class='button-pro __wide']");

    public MainPage open() {
        Selenide.open("/");
        checkPage();
        return this;
    }

    public void checkPage() {
        loginInput.shouldBe(visible);
        passwordInput.shouldBe(visible);
        enterButton.shouldBe(visible);
    }

    public SearchPage search(String searchString) {
        searchInput.shouldBe(visible)
                .setValue(searchString)
                .sendKeys(Keys.ENTER);
        return new SearchPage();
    }

    public LoginPage login() {
        loginInput.setValue(LOGIN);
        passwordInput.setValue(PASSWORD);
        enterButton.click();
        return new LoginPage();
    }
}
