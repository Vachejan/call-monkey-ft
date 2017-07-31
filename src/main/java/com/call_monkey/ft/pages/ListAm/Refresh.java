package com.call_monkey.ft.pages.ListAm;

import com.call_monkey.ft.pages.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.util.List;

/**
 * Created by vache on 7/31/17.
 */
public class Refresh extends Page {
    public void open() {
        super.open("my", "List.am - Հայաստանի հայտարարություններ ");
    }


    @FindBy(css = "#main > div.tabbody > div > table > tbody > tr:nth-child(1) > td:nth-child(3) > div > a:nth-child(1)")
    WebElement wbRefresh_1;

    @FindBy(css = "#main > div.tabbody > div > table > tbody > tr:nth-child(2) > td:nth-child(3) > div > a:nth-child(1)")
    WebElement wbRefresh_2;

    @FindBy(css = "#main > div.tabbody > div > table > tbody > tr:nth-child(3) > td:nth-child(3) > div > a:nth-child(1)")
    WebElement wbRefresh_3;

    @FindBy(css = "#main > div.tabbody > div > table > tbody > tr:nth-child(4) > td:nth-child(3) > div > a:nth-child(1)")
    WebElement wbRefresh_4;

    @FindBy(css = "#main > div.tabbody > div > table > tbody > tr:nth-child(5) > td:nth-child(3) > div > a:nth-child(1)")
    WebElement wbRefresh_5;

    @FindBy(css = "#main > div.tabbody > div > table > tbody > tr:nth-child(6) > td:nth-child(3) > div > a:nth-child(1)")
    WebElement wbRefresh_6;

    @FindBy(css = "#main > div.tabbody > div > table > tbody > tr:nth-child(7) > td:nth-child(3) > div > a:nth-child(1)")
    WebElement wbRefresh_7;

    @FindBy(css = "#main > div.tabbody > div > table > tbody > tr:nth-child(8) > td:nth-child(3) > div > a:nth-child(1)")
    WebElement wbRefresh_8;

    @FindBy(css = "#main > div.tabbody > div > table > tbody > tr:nth-child(9) > td:nth-child(3) > div > a:nth-child(1)")
    WebElement wbRefresh_9;

    @FindBy(css = "#main > div.tabbody > div > table > tbody > tr:nth-child(10) > td:nth-child(3) > div > a:nth-child(1)")
    WebElement wbRefresh_10;

    @FindBy(css = "#main > div.tabbody > div > table > tbody > tr:nth-child(11) > td:nth-child(3) > div > a:nth-child(1)")
    WebElement wbRefresh_11;

    @FindBy(css = "#main > div.tabbody > div > table > tbody > tr:nth-child(12) > td:nth-child(3) > div > a:nth-child(1)")
    WebElement wbRefresh_12;

    @FindBy(css = "#main > div.tabbody > div > table > tbody > tr:nth-child(13) > td:nth-child(3) > div > a:nth-child(1)")
    WebElement wbRefresh_13;

    @FindBy(css = "#main > div.tabbody > div > table > tbody > tr:nth-child(14) > td:nth-child(3) > div > a:nth-child(1)")
    WebElement wbRefresh_14;

    @FindBy(css = "#main > div.tabbody > div > table > tbody > tr:nth-child(15) > td:nth-child(3) > div > a:nth-child(1)")
    WebElement wbRefresh_15;

    @FindBy(css = "#main > div.tabbody > div > table > tbody > tr:nth-child(16) > td:nth-child(3) > div > a:nth-child(1)")
    WebElement wbRefresh_16;

    @FindBy(css = "#main > div.tabbody > div > table > tbody > tr:nth-child(17) > td:nth-child(3) > div > a:nth-child(1)")
    WebElement wbRefresh_17;

    @FindBy(css = "#main > div.tabbody > div > table > tbody > tr:nth-child(18) > td:nth-child(3) > div > a:nth-child(1)")
    WebElement wbRefresh_18;

    @FindBy(css = "#main > div.tabbody > div > table > tbody > tr:nth-child(19) > td:nth-child(3) > div > a:nth-child(1)")
    WebElement wbRefresh_19;

    @FindBy(css = "#main > div.tabbody > div > table > tbody > tr:nth-child(20) > td:nth-child(3) > div > a:nth-child(1)")
    WebElement wbRefresh_20;

    @FindBy(css = "#submit_dlg_button")
    WebElement wbSubmit;

    @FindBy(css = "#close_dlg_button")
    WebElement wbCanncle;

    public void refresh(){
        String vText= getWebDriver().findElement(By.xpath("#main > div.tabbody > div > table > tbody > tr:nth-child(1) > td:nth-child(3) > div > a:nth-child(1)")).getText();
        int vEle= vText.length();
        for (int i=0; i<vEle; i++) {
        getWebDriver().findElement(By.xpath("tr:nth-child(1)")).click();
        }
    }

    public void submit() {
        wbSubmit.click();
    }

    public void cancel() {
        wbCanncle.click();
    }

    public void refresh_1() {
        wbRefresh_1.click();
    }

    public void refresh_2(){
        wbRefresh_2.click();
    }

    public void refresh_3(){
        wbRefresh_3.click();
    }

    public void refresh_4(){
        wbRefresh_4.click();
    }

    public void refresh_5(){
        wbRefresh_5.click();
    }

    public void refresh_6(){
        wbRefresh_6.click();
    }

    public void refresh_7(){
        wbRefresh_7.click();
    }

    public void refresh_8(){
        wbRefresh_8.click();
    }

    public void refresh_9(){
        wbRefresh_9.click();
    }

    public void refresh_10(){
        wbRefresh_10.click();
    }

    public void refresh_11() {
        wbRefresh_11.click();
    }

    public void refresh_12(){
        wbRefresh_12.click();
    }

    public void refresh_13(){
        wbRefresh_13.click();
    }

    public void refresh_14(){
        wbRefresh_14.click();
    }

    public void refresh_15(){
        wbRefresh_15.click();
    }

    public void refresh_16(){
        wbRefresh_16.click();
    }

    public void refresh_17(){
        wbRefresh_17.click();
    }

    public void refresh_18(){
        wbRefresh_18.click();
    }

    public void refresh_19(){
        wbRefresh_19.click();
    }

    public void refresh_20(){
        wbRefresh_20.click();
    }
}

