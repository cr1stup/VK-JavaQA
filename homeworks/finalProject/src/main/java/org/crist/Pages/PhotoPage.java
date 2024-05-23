package org.crist.Pages;

import org.crist.Utils.Loadable.LoadablePage;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class PhotoPage implements LoadablePage {
    private static final By uploadButton = By.xpath("//div[@class='h-mod html5-link_w js-fileapi-wrapper  __no-ui']//input[@class='html5-upload-link __before-upload']");
    private static final By successUpload = By.xpath("//*[contains(@style, 'background-image:url')]");
    private static final By createAlbumButton = By.xpath("//a[@role='button']");
    private static final By allPhotosField = By.xpath("//a[@id='tab-all-photos']");
    private static final By albumsField = By.xpath("//a[@id='tab-albums']");
    private static final By uploadedPhoto = By.xpath("//img[@class='photo-img__tt8r9']");
    private static final By threePoint = By.xpath("//button[@class='button-clean__0wfyv action-button-container__czsac']");

    public PhotoPage() {
        checkPage();
    }

    @Override
    public void checkPage() {
        $(createAlbumButton).shouldBe(visible.because("createAlbumButton should be visible on photo page"));
        $(allPhotosField).shouldBe(visible.because("allPhotosField should be visible on photo page"));
        $(albumsField).shouldBe(visible.because("albumsField should be visible on photo page"));
    }

    public boolean uploadFile()  {
        $(uploadButton).uploadFile(new File("src/main/java/org/crist/Utils/Data/example.jpg"));
        $(successUpload).shouldBe(visible.because("successUpload icon should be visible after upload"));
        return true;
    }

    /*public void deletePhoto() {
        $(uploadedPhoto).shouldBe(visible.because("visible")).click();
        $(threePoint).shouldBe(visible.because("visible")).click();
    }*/
}
