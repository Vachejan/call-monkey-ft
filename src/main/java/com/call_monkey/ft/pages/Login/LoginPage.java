package com.call_monkey.ft.pages.Login;

import com.call_monkey.ft.pages.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by vache on 7/13/17.
 */
public class LoginPage extends Page {

    @FindBy (css = "input#email-inputEl")
    private WebElement wbEmailTextBox;

    @FindBy (css = "input#password-inputEl")
    private WebElement wbPasswordTextBox;

    @FindBy(css = "div#scrollContainer-targetEl div.x-container.cm-bg-grey.x-box-item.x-container-default > div > div > div > div > div > input")
    private WebElement wbCheckBoxToon;

    @FindBy(css = "div#scrollContainer-targetEl a > span > span")
    private WebElement wbLoginButton;

    @FindBy(css = "div#scrollContainer-targetEl div.x-component.cm-login-reg-message-cnt.x-box-item.x-component-default > a:nth-child(1)")
    private WebElement wbAccountRegistrationLink;

    @FindBy(css = "div#scrollContainer-targetEl a:nth-child(2)")
    private WebElement wbCallCentreRegistrationLink;

    @FindBy(css = "div#scrollContainer-targetEl div.x-container.cm-borderBottom.x-container-default.x-box-layout-ct > div > div > a:nth-child(1)")
    private WebElement wbMoeitMetInloggen;

    @FindBy(css = "div#scrollContainer-targetEl a:nth-child(3)")
    private WebElement wbWachtwoodVergeten;

    @FindBy(css = "div#scrollContainer-targetEl button.x-btn.social-network-button.cm-social-google.x-unselectable.x-box-item.x-btn-default-small.x-btn-over > span > span")
    private WebElement wbInloggenMetGooglePluse;

    @FindBy(css = "div#scrollContainer-targetEl button.x-btn.social-network-button.cm-social-fb.x-unselectable.x-box-item.x-btn-default-small.x-btn-over > span > span > span.x-btn-inner.x-btn-inner-default-small > span")
    private WebElement wbInloggenMetFacebook;

    public void open() {
        super.open("#Login", "CallMonkey");
    }

    //Fill email address.
    public void fillEmailTextBox(String strEmail){
        wbEmailTextBox.sendKeys(strEmail);
    }

    //Fill password address.
    public void fillPasswordTextBox(String strPassword) {
        wbPasswordTextBox.sendKeys(strPassword);
    }

    //Mark CheckBox.
    public void clickToonCheckBox() {
        wbCheckBoxToon.click();
    }

    //Click login button.
    public void clickLoginButton() {
        wbLoginButton.click();
    }

    //Click Account Registration Link.
    public void clickAccountRegistrationLink() {
        wbAccountRegistrationLink.click();
    }

    //Click Call Centre Registration Link.
    public void clickCallCentreRegistrationLink() {
        wbCallCentreRegistrationLink.click();
    }

    //Click Moeit Met Inloggen Link.
    public void clickMoeitMetInloggenLink() {
        wbMoeitMetInloggen.click();
    }

    //Click Wachtwood Vergeten Link.
    public void clickWachtwoodVergetenLink() {
        wbWachtwoodVergeten.click();
    }

    //Click Inloggen met google+ button
    public void clickInloggenMetGooglePluseButton() {
        wbInloggenMetGooglePluse.click();
    }

    //Click Inloggen met Facebook button.
    public void clickInloggenMetFacebookbutton() {
        wbInloggenMetFacebook.click();
    }
}

