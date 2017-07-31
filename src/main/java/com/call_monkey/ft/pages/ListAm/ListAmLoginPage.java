package com.call_monkey.ft.pages.ListAm;

import com.call_monkey.ft.pages.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by vache on 7/28/17.
 */
public class ListAmLoginPage extends Page {

    @FindBy(id = "idSearchBox")
    private WebElement wbSearch;

    @FindBy(css = "#ff > div:nth-child(2) > div:nth-child(1) > a")
    private WebElement wbForSale;

    @FindBy(css = "#menu > div.c > span:nth-child(4) > div > span:nth-child(1) > div:nth-child(2) > a:nth-child(1)")
    private WebElement wbOther;

    @FindBy(css = "#ff > div:nth-child(2) > div:nth-child(6) > a > div")
    private WebElement wbAdsWithPhotos;

    @FindBy(css = "#menu > div.c > span:nth-child(4) > a")
    private WebElement wbEectronics;

    @FindBy(id = "idprice1")
    private WebElement wbPriceFrom;

    @FindBy(css = "#ff > div:nth-child(6) > div:nth-child(1) > a > div")
    private WebElement wbConditionNew;

    @FindBy(id = "locList")
    private WebElement wbLocationDropDown;

    public void open() {
        super.open("", "List.am - Հայաստանի անվճար հայտարարությունների կայք");
    }

    public void clickOtherButton() {
        wbOther.click();
    }

    public void click(){
        Actions act = new Actions(getWebDriver());
        act.moveToElement(wbEectronics).perform();

    }

    public void SearchListAm(String strSeach) {
        wbSearch.sendKeys(strSeach + '\n');
    }

    public void clickForSaleRadioButon() {
        wbForSale.click();
    }

    public void clickAdsWithPgotosCheckBox() {
        wbAdsWithPhotos.click();
    }

    public void filPriceFrom(String strPriceFrom, String strTo) {
        wbPriceFrom.sendKeys(strPriceFrom + '\ue004' + strTo + '\ue004' + '\ue00d' + '\ue015' + '\ue015' + '\n' );
    }
    public void clickNew() {
        wbConditionNew.click();
    }

    public void clickDropDown(String strValue){
        Select select = new Select(wbLocationDropDown);
        select.selectByVisibleText(strValue);
    }


}
