package org.crist.Pages;

import org.crist.Utils.Loadable.LoadablePage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class GroupsPage implements LoadablePage {
    private static final String GROUP_NAME = "test";
    private static final By createGroupButton = By.xpath("//*[contains(@class, 'groups-catalog-header_button')]");
    private static final By actualField = By.xpath("//a[contains(@aria-label,'Актуально')]");
    private static final By newField = By.xpath("//a[@aria-label='Новые']");
    private static final By groupTypes = By.xpath("//div[@class='create-group-dialog-v2_n']");
    private static final By groupNameField = By.xpath("//input[@name='st.layer.name']");
    private static final By groupThemeField = By.xpath("//input[@autocomplete='new-password']");
    private static final By theme = By.xpath("//div[contains(@class,'multi-select-suggest-content js-multi-select-scroll')]");
    private static final By createButton = By.xpath("//input[@data-l='t,confirm']");
    private static final By threeDotsButton = By.xpath("//button[@class='u-menu_a toggle-dropdown button-clear']");
    private static final By deleteButton = By.xpath(".//a[contains(text(),'Удалить')]");
    private static final By confirmButton = By.xpath(".//input[@id='hook_FormButton_button_delete']");

    public GroupsPage() {
        checkPage();
    }

    @Override
    public void checkPage() {
        $(createGroupButton).shouldBe(visible.because("createGroupButton button should be visible on groups page"));
        $(actualField).shouldBe(visible.because("actualField should be visible on groups page"));
        $(newField).shouldBe(visible.because("actualField should be visible on groups page"));
    }

    public boolean createGroup() {
        $(createGroupButton).shouldBe(visible.because("createGroupButton button should be visible on groups page")).click();
        $$(groupTypes).first().shouldBe(visible.because("groupTypes should be visible after click on create")).click();
        $(groupNameField).shouldBe(visible.because("groupNameField should be visible on groups type")).setValue(GROUP_NAME);
        $(groupThemeField).shouldBe(visible.because("groupNameField should be visible on groups type")).click();
        $$(theme).first().shouldBe(visible.because("theme should be visible after click on groups type")).click();
        $(createButton).shouldBe(visible.because("createButton should be visible after click on theme")).click();
        return true;
    }

    public void deleteGroup() {
        $(threeDotsButton).shouldBe(visible.because("threeDotsButton button should be visible")).click();
        $(deleteButton).shouldBe(visible.because("deleteButton button should be visible")).click();
        $(confirmButton).shouldBe(visible.because("confirmButton button should be visible")).click();
    }
}
