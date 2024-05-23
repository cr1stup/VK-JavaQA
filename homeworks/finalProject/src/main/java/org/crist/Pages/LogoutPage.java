package org.crist.Pages;

import org.crist.Utils.Loadable.LoadablePage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class LogoutPage implements LoadablePage {
    private static final By loginAvatar = By.xpath("//div[@class ='user-profile-redesign_user-avatar']");

    public LogoutPage() {
        checkPage();
    }

    @Override
    public void checkPage() {
        $(loginAvatar).shouldBe(visible.because("loginAvatar should be visible on logout page"));
        // 2
        // 3
    }

    public FeedPage fastLogin() {
        $(loginAvatar).shouldBe(visible.because("loginAvatar should be visible on logout page")).click();
        return new FeedPage();
    }
}
