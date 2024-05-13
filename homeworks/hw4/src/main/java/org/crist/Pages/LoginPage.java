package org.crist.Pages;

import org.crist.Utils.Loadable.LoadablePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage implements LoadablePage {
    private static final String LOGIN = "technopol38";
    private static final String PASSWORD = "technopolisPassword";
    private static final By searchInput = By.xpath("//input[@name='st.query']");
    private static final By loginInput = By.xpath("//input[@name='st.email']");
    private static final By passwordInput = By.xpath("//input[@name='st.password']");
    private static final By enterButton = By.xpath("//input[@class='button-pro __wide']");

    public LoginPage open() {
        checkPage();
        return this;
    }

    @Override
    public void checkPage() {
        $(loginInput).shouldBe(visible.because("login input should be visible on login page"));
        $(passwordInput).shouldBe(visible.because("password input should be visible on login page"));
        $(enterButton).shouldBe(visible.because("enter button should be visible on login page"));
    }

    public SearchResultPage search(String searchString) {
        $(searchInput).shouldBe(visible.because("search should be visible on login page"))
                .setValue(searchString)
                .sendKeys(Keys.ENTER);
        return new SearchResultPage();
    }

    public FeedPage login() {
        $(loginInput).shouldBe(visible.because("login input should be visible on login page")).setValue(LOGIN);
        $(passwordInput).shouldBe(visible.because("password input should be visible on login page")).setValue(PASSWORD);
        $(enterButton).shouldBe(visible.because("enter button should be visible on login page")).click();
        return new FeedPage();
    }
}
