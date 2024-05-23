package org.crist.Pages;

import org.crist.Utils.Loadable.LoadablePage;
import org.crist.Utils.Objects.TestBot;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage implements LoadablePage {
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

    public FeedPage login(TestBot testBot) {
        $(loginInput).shouldBe(visible.because("login input should be visible on login page")).setValue(testBot.login());
        $(passwordInput).shouldBe(visible.because("password input should be visible on login page")).setValue(testBot.password());
        $(enterButton).shouldBe(visible.because("enter button should be visible on login page")).click();
        return new FeedPage();
    }
}
