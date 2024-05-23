package org.crist.Pages;

import org.crist.Utils.Loadable.LoadablePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class MusicPage implements LoadablePage {
    private static final By findMusicField = By.xpath("//input[@placeholder='Поиск музыки']");
    private static final By myMusicField = By.xpath(".//div[contains(text(),'Моя музыка')]");
    private static final By popularField = By.xpath(".//div[contains(text(),'Популярное')]");
    private static final By musicPlayerField = By.xpath("//wm-track[1]//slot[2]//wm-card-details[1]//slot[1]//div[1]");
    private static final By deleteButton = By.xpath("//button[contains(@title,'Удалить')]" +
            "//wm-icon//*[name()='svg']//*[name()='path' and contains(@fill-rule,'evenodd')]");
    private static final By addToMyMusicButton = By.xpath("//slot[@name='controls']//wm-icon[@aria-label='В мою музыку']" +
            "//*[name()='svg']//*[name()='path' and contains(@fill-rule,'evenodd')]");

    public MusicPage() {
        checkPage();
    }

    @Override
    public void checkPage() {
        $(findMusicField).shouldBe(visible.because("findMusicField should be visible on music page"));
        $(myMusicField).shouldBe(visible.because("myMusicField should be visible on music page"));
        $(popularField).shouldBe(visible.because("popularField should be visible on music page"));
    }

    public boolean addMusic(String title) {
        $(findMusicField).shouldBe(visible.because("findMusicField should be visible on music page")).setValue(title);
        $(findMusicField).shouldBe(visible.because("findMusicField should be visible on music page")).sendKeys(Keys.ENTER);
        $(musicPlayerField).shouldBe(visible.because("musicPlayerField should be visible on music page")).hover();
        $(addToMyMusicButton).shouldBe(visible.because("addToMyMusicButton should be visible on music page")).click();
        return true;
    }

    public void deleteMusic() {
        $(myMusicField).shouldBe(visible.because("myMusicField should be visible on music page")).click();
        $(musicPlayerField).shouldBe(visible.because("musicPlayerField should be visible on music page")).hover();
        $(deleteButton).shouldBe(visible.because("myMusicField should be visible on music page")).click();
    }
}
