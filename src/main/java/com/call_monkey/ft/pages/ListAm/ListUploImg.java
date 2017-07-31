package com.call_monkey.ft.pages.ListAm;


import com.call_monkey.ft.pages.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import sun.nio.ch.sctp.SendFailed;

import java.awt.*;
import java.awt.datatransfer.StringSelection;


/**
 * Created by vache on 7/28/17.
 */
public class ListUploImg extends Page {


    @FindBy(css = "#main > div.tabbody > div > div > div > a")
    private WebElement wbPostToClassifieds;

    @FindBy(css = "#c0_0 > a:nth-child(1)")
    private WebElement wbMarketplace;

    @FindBy(css = "#c1_Marketplace > a:nth-child(4)")
    private WebElement wbElectronics;

    @FindBy(css = "#c2_4 > span:nth-child(2) > a")
    private WebElement wbOthers;

    @FindBy(css = "div#upload input[type=\"file\"]")
    private WebElement wbAddPhoto;

    @FindBy(id = "_idphone_1")
    private WebElement wbTelephoneNumber;


    public void open() {
        super.open("/add/76", "Ավելացնել հայտարարություն - Էլեկտրոնիկա › Այլ - List.am");
    }

    public void clickPostToClassifiedsButton() {
        wbPostToClassifieds.click();
    }

    public void clickMarketplaceButton(){
        wbMarketplace.click();
    }

    public void clickElectronicsButtn() {
        wbElectronics.click();
    }

    public void clickOtherButton() {
        wbOthers.click();
    }

    public void addPhoto () {
       wbAddPhoto.sendKeys("/home/vache/Desktop/call-monkey-ft/download.jpg");
       wbAddPhoto.sendKeys("/home/vache/Downloads/download.jpg");
    }

    public void fillTelephoneNumber(String strNumber) {
        wbTelephoneNumber.sendKeys(strNumber);
    }

}
