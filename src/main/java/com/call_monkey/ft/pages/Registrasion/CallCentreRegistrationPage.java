package com.call_monkey.ft.pages.Registrasion;

import com.call_monkey.ft.pages.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

/**
 * Created by vache on 7/14/17.
 */
public class CallCentreRegistrationPage extends Page {

    private String strRightTitleCallCentreRegistrationPage = "Sign up in 30 seconds. No credit card required.";

    private String strWrongCompanyMassageTag = "<ul class=\"x-list-plain\"><li>Must be present</li></ul>";

    private String strEmailNotFilledMessige = "<ul class=\"x-list-plain\"><li>Must be present</li></ul>";

    private String strWrongEmailMessageTag = "<ul class=\"x-list-plain\"><li>Is not a valid email address</li></ul>";

    private String strWrongPasswordMassageTag = "<ul class=\"x-list-plain\"><li>Password should contain at least 6 characters, including a capital letter and a number</li></ul>";

    private String strWrongConfirmPasswordTag ="<ul class=\"x-list-plain\"><li>Passwords does not match</li></ul>";

    private String strWeongEmailErrorMassige = "id=\"component-1077\">An unknown error occurred. Please verify your entry and try again. If the problem persists, please contact your system administrator.</div>";

    @FindBy(css = "div#scrollContainer-targetEl div > div > div > div > input[placeholder=\"Company\"]")
    private WebElement wbCompanyTextBox;

    @FindBy(css = "div#scrollContainer-targetEl div > div > div > div > input[placeholder=\"Email\"]")
    private WebElement wbEmailTextBox;

    @FindBy(css = "div#scrollContainer-targetEl div > div > div > div > input[placeholder=\"Password\"]" )
    private WebElement wbPasswordTextBox;

    @FindBy(css = "div#scrollContainer-targetEl div > div > div > div > input[placeholder=\"Confirm Password\"]")
    private WebElement wbConfirmPassword;

    @FindBy(css = "div#scrollContainer-targetEl a > span > span")
    private WebElement wbCreateMyAccount;

    @FindBy(css = "div#scrollContainer-targetEl button.x-btn.social-network-button.cm-social-google.x-unselectable.x-box-item.x-btn-default-small.x-btn-over > span > span > span.x-btn-inner.x-btn-inner-default-small > span")
    private WebElement wbInloggenMetGooglePluse;

    @FindBy(css = "div#scrollContainer-targetEl button.x-btn.social-network-button.cm-social-fb.x-unselectable.x-box-item.x-btn-default-small.x-btn-over > span > span > span.x-btn-inner.x-btn-inner-default-small > span")
    private WebElement wbInloggenMetFacebook;

    @FindBy(css ="div#scrollContainer-targetEl div.x-container.cm-bg-white.cm-box-shadow.x-box-item.x-container-default.x-box-layout-ct > div > div > label")
    private WebElement wbTitleCallCentreRegistration;

    @FindBy(css ="div#scrollContainer-targetEl div.x-component.cm-feedback-panel.x-box-item.x-component-default")
    private WebElement wbEmailErrorMasige;

    public void open() {
        super.open("#RegisterCallCenter", "CallMonkey");
    }


    //Fill Company address.
    public void fillCompnyAddress(String strComponyAddress  ) {
        wbCompanyTextBox.sendKeys(strComponyAddress);

    }

    //Fill email address.
    public void fillEmailAddress(String strEmailAdress) {
        wbEmailTextBox.sendKeys(strEmailAdress);
    }

    //Fill Password.
    public void fillPassword(String strPassword) {
        wbPasswordTextBox.sendKeys(strPassword);
    }

    //Fill Confirm password.
    public void fillConfirmPassword(String strConfirmPassword) {
        wbConfirmPassword.sendKeys(strConfirmPassword);
    }

    //Click Create My Account button.
    public void clickCreateMyAccountButton() {
        wbCreateMyAccount.click();
    }

    //Click Inloggen met google+ button
    public void clickInloggenMetGooglePluseButton() {
        wbInloggenMetGooglePluse.click();
    }

    //Click Inloggen met Facebook button.
    public void clickInloggenMetFacebookbutton() {
        wbInloggenMetFacebook.click();
    }

    //Get tex title title call centre registration.
    public String getTextCallCentreRegistration() {
        return wbTitleCallCentreRegistration.getText();
    }

    //Compare "getTextCallCentreRegistration"
    public void compareTextTitleCallCentreRegistration() {
        Assert.assertEquals(strRightTitleCallCentreRegistrationPage,getTextCallCentreRegistration(),"Call Centre account registration title is wrong");
    }

    public String getTextErrorMasigeEmail() {
        return wbEmailErrorMasige.getText();
    }

    public void compareEmailErrorMasige() {
        Assert.assertEquals(wbEmailErrorMasige.getAttribute("display: none"),strWeongEmailErrorMassige, "Error masige email is wrong");
    }

    public void checkIfCompanyIsWrong() {
        Assert.assertEquals(wbCompanyTextBox.getAttribute("data-errorqtip"),strWrongCompanyMassageTag,"Company filed error masage is wrong");
    }

    public void checkIfEmailIsWrongMessige(){
        Assert.assertEquals(wbEmailTextBox.getAttribute("data-errorqtip"), strWrongEmailMessageTag, "Email field error message is wrong");
    }

    public void chackIfEmailNotFilledMessige() {
        Assert.assertEquals(wbEmailTextBox.getAttribute("data-errorqtip"), strEmailNotFilledMessige, "Must be present");
    }

    public void checkIfPasswordIsWrong() {
        Assert.assertEquals(wbPasswordTextBox.getAttribute("data-errorqtip"),strWrongPasswordMassageTag,"Password field error mesage is wrong");
    }

    public void checkIfConfirmPasswordIsWrong() {
        Assert.assertEquals(wbConfirmPassword.getAttribute("data-errorqtip"),strWrongConfirmPasswordTag,"Confirm password filed error is wrong");
    }

}
