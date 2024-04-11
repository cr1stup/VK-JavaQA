package org.crist.Pages;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    private static final String LOGIN = "technopol38";
    private static final String PASSWORD = "technopolisPassword";
    private static final By searchInput = By.xpath("//input[@name='st.query']");
    private static final By loginInput = By.xpath("//input[@name='st.email']");
    private static final By passwordInput = By.xpath("//input[@name='st.password']");
    private static final By enterButton = By.xpath("//input[@class='button-pro __wide']");

    public MainPage open() {
        Selenide.open("/");
        checkPage();
        return this;
    }

    public void checkPage() {
        $(loginInput).shouldBe(visible.because("login input should be visible on main page"));
        $(passwordInput).shouldBe(visible.because("password input should be visible on main page"));
        $(enterButton).shouldBe(visible.because("enter button should be visible on main page"));
    }

    public SearchPage search(String searchString) {
        $(searchInput).shouldBe(visible.because("search should be visible on main page"))
                .setValue(searchString)
                .sendKeys(Keys.ENTER);
        return new SearchPage();
    }

    public LoginPage login() {
        $(loginInput).setValue(LOGIN);
        $(passwordInput).setValue(PASSWORD);
        $(enterButton).click();
        return new LoginPage();
    }
}
