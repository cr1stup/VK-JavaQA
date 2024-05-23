package org.crist.Utils.Elements;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class TopBar {
    private static final By messagesButton = By.xpath("//*[@data-l='t,messages']//span[@class='toolbar_nav_i_ic']");
    private static final By discussionsButton = By.xpath("//*[@data-l='t,discussions']//span[@class='toolbar_nav_i_ic']");
    private static final By notificationsButton = By.xpath("//*[@data-l='t,notifications']//span[@class='toolbar_nav_i_ic']");
    private static final By guestsButton = By.xpath("//*[@data-l='t,guests']//div[@class='toolbar_nav_i_ic']");
    private static final By marksButton = By.xpath("//*[@data-l='t,marks']//span[@class='toolbar_nav_i_ic']");
    private static final By videoButton = By.xpath("//*[@data-l='t,video']//div[@class='toolbar_nav_i_ic']");
    private static final By musicButton = By.xpath("//*[@data-l='t,music']//span[@class='toolbar_nav_i_ic']");

    public TopBar() {
        checkTopBar();
    }

    public void checkTopBar() {
        $(messagesButton).shouldBe(visible.because("messagesButton should be visible on feed page"));
        $(discussionsButton).shouldBe(visible.because("discussionsButton should be visible on feed page"));
        $(notificationsButton).shouldBe(visible.because("notificationsButton should be visible on feed page"));
        $(guestsButton).shouldBe(visible.because("guestsButton should be visible on feed page"));
        $(marksButton).shouldBe(visible.because("marksButton should be visible on feed page"));
        $(videoButton).shouldBe(visible.because("videoButton should be visible on feed page"));
        $(musicButton).shouldBe(visible.because("musicButton should be visible on feed page"));
    }

    public By getMusicButton() {
        return musicButton;
    }
}
