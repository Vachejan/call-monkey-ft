package com.call_monkey.ft.pages.Html5Book;

import com.call_monkey.ft.pages.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by vache on 7/27/17.
 */
public class Html5BookRuHomePage extends Page {

    @FindBy(css = "#wrapper > header > div > a")
    private WebElement wbHtml5BookButton;

    @FindBy(css = "#menu-item-3827 > a")
    private WebElement wbHtmlTag;

    @FindBy(css = "#menu-item-3871 > a")
    private WebElement wbCssTag;

    @FindBy(css = "#menu-item-3975 > a")
    private WebElement wbJsTag;

    @FindBy(css = "#menu-item-3884 > a")
    private WebElement wbTopographyTag;

    @FindBy(css = "#menu-item-5292 > a")
    private WebElement wbLessonsTag;

    @FindBy(css = "#menu-item-10067 > a")
    private WebElement wbLayoutTag;

    @FindBy(css = "#menu-item-9988 > a")
    private WebElement wbSeoTag;

    @FindBy(css = "#menu-item-11005 > a")
    private WebElement wbCssDirectoryTag;

    @FindBy(css = "#menu-item-10225 > a")
    private WebElement wbCssProperitiesTag;

    public void open() {
        super.open("", "HTML5BOOK.RU - HTML, CSS, JavaScript и jQuery");
    }
    //click "HTML5 Book" buuton.
    public void clickHtml5BookButton() {
        wbHtml5BookButton.click();
    }

     //click "HTML" tag.
    public void clickHtmlTag() {
        wbHtmlTag.click();
    }

    //click "CSS" tag.
    public void clickCssTag() {
        wbCssTag.click();
    }

    //click "JS" tag.
    public void clickJsTag() {
        wbJsTag.click();
    }

    //click "Topography" tag.
    public void clickTopagraphyTag() {
        wbTopographyTag.click();
    }

    //click "Lessons" Tag.
    public void clickLessonsTag() {
        wbLessonsTag.click();
    }

    //click "Layout" Tag.
    public void clickLayoutTag() {
        wbLayoutTag.click();
    }

    //click "Seo" Tag.
    public void clickSeoTag() {
        wbSeoTag.click();
    }

    //click "CssDirectory" tag.
    public void clickCssDirectoryTag() {
        wbCssDirectoryTag.click();
    }

    //click"CssProperties" tag.
    public void clickCssPropertiesTag() {
        wbCssProperitiesTag.click();
    }



}
