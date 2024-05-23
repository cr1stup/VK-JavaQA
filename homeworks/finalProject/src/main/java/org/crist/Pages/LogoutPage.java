package org.crist.Pages;

import org.crist.Utils.Loadable.LoadablePage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class LogoutPage implements LoadablePage {
    private static final By loginAvatar = By.xpath("//div[@class ='user-profile-redesign_user-avatar']");
    private static final By enterField = By.xpath("//a[@data-l ='t,login_tab']");
    private static final By qrField = By.xpath("//a[@data-l ='t,qr_tab']");

    public LogoutPage() {
        checkPage();
    }

    @Override
    public void checkPage() {
        $(loginAvatar).shouldBe(visible.because("loginAvatar should be visible on logout page"));
        $(enterField).shouldBe(visible.because("enterField should be visible on logout page"));
        $(qrField).shouldBe(visible.because("qrField should be visible on logout page"));
    }

    public FeedPage fastLogin() {
        $(loginAvatar).shouldBe(visible.because("loginAvatar should be visible on logout page")).click();
        return new FeedPage();
    }
}
