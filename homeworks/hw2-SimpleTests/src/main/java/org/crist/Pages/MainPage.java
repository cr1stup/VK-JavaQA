package org.crist.Pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    private final static String LOGIN = "technopol38";
    private final static String PASSWORD = "technopolisPassword";
    private final static SelenideElement searchInput = $x("//input[@name='st.query']");
    private final static SelenideElement loginInput = $x("//input[@name='st.email']");
    private final static SelenideElement passwordInput = $x("//input[@name='st.password']");
    private final static SelenideElement enterButton = $x("//input[@class='button-pro __wide']");

    public MainPage open() {
        Selenide.open("/");
        return this;
    }

    public SearchPage search(String searchString) {
        searchInput.setValue(searchString);
        searchInput.sendKeys(Keys.ENTER);
        return new SearchPage();
    }

    public LoginPage login() {
        loginInput.setValue(LOGIN);
        passwordInput.setValue(PASSWORD);
        enterButton.click();
        return new LoginPage();
    }
}
