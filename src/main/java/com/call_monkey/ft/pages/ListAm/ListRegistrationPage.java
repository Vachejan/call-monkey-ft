package com.call_monkey.ft.pages.ListAm;

import com.call_monkey.ft.pages.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by vache on 7/27/17.
 */
public class ListRegistrationPage extends Page {

    @FindBy(css = "#main > div.bubble > div > div.r > div.btn > a")
    private WebElement wbRegistration;

    @FindBy(id = "_idyour_email")
    private WebElement wbEmail;

    @FindBy(id = "_idpassword")
    private WebElement wbPassword;

    @FindBy(id = "_idconfirm_password")
    private WebElement wbConfirmPasssword;

    @FindBy(id = "_idagree")
    private WebElement wbAgreeCheckBox;

    @FindBy(id = "registeraction__form_action0")
    private WebElement wbRegistrationButton;

    @FindBy(id = "_idyour_email")
    private WebElement wbLogin;

    @FindBy(id = "_idpassword")
    private WebElement wbPasswordName;

    @FindBy(id = "loginaction__form_action0")
    private WebElement wbSubmit;

    public void open() {
        super.open("login", "List.am Մուտք - List.am");
    }

    public void clickRegistrationButton() {
        wbRegistration.click();
    }

    public void fillEmail(String strEmailName) {
        wbEmail.sendKeys(strEmailName);
    }

    public void fillPassword(String strPasswordName) {
        wbPassword.sendKeys(strPasswordName);
    }

    public void fillConfirmPassword(String strConfirmPassword) {
        wbConfirmPasssword.sendKeys(strConfirmPassword);
    }

    public void clickAgreeCheckBox() {
        wbAgreeCheckBox.click();
    }

    public void clickAccountRegistrationButton() {
        wbRegistrationButton.click();
    }

    public void fillLogin(String strLoginName) {
        wbLogin.sendKeys(strLoginName);
    }

    public void fillPasswordName(String strPassword){
        wbPasswordName.sendKeys(strPassword);
    }

    public void clickSubmitButton() {
        wbSubmit.click();
    }
}


