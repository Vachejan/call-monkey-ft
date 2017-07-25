package com.call_monkey.ft.AccountRegistrationNegativeTeste;

import com.call_monkey.ft.BaseTest;
import org.testng.annotations.Test;

/**
 * Created by vache on 7/25/17.
 */
public class NegativeConfirmPasswordTextBoxTest extends BaseTest {

    @Test
    public void negativeConfirmPasswordTeste_ConfirmePasswordEampty() throws Exception {

        String strRightNameCompany = "Valod";
        String strWrongNameEmail = "Valodik@mail.ru";
        String strRightNamePassword = "janValodikjan123";
        String strWrongNameConfirmPassword = "";

        accountRegistrationPage.open();
        accountRegistrationPage.fillCompnyAddress(strRightNameCompany);
        accountRegistrationPage.fillEmailAddress(strWrongNameEmail);
        accountRegistrationPage.fillPassword(strRightNamePassword);
        accountRegistrationPage.fillConfirmPassword(strWrongNameConfirmPassword);
        accountRegistrationPage.clickCreateMyAccountButton();
    }

    @Test
    public void negativeConfirmPasswordTeste_() throws Exception {

        String strRightNameCompany = "Valod";
        String strWrongNameEmail = "Valodik@mail.ru";
        String strRightNamePassword = "janValodikjan123";
        String strWrongNameConfirmPassword = "janvalodikjan123";

        accountRegistrationPage.open();
        accountRegistrationPage.fillCompnyAddress(strRightNameCompany);
        accountRegistrationPage.fillEmailAddress(strWrongNameEmail);
        accountRegistrationPage.fillPassword(strRightNamePassword);
        accountRegistrationPage.fillConfirmPassword(strWrongNameConfirmPassword);
        accountRegistrationPage.clickCreateMyAccountButton();
    }

    @Test
    public void negativeConfirmPasswordTeste_1() throws Exception {

        String strRightNameCompany = "Valod";
        String strWrongNameEmail = "Valodik@mail.ru";
        String strRightNamePassword = "janValodikjan123";
        String strWrongNameConfirmPassword = " ";

        accountRegistrationPage.open();
        accountRegistrationPage.fillCompnyAddress(strRightNameCompany);
        accountRegistrationPage.fillEmailAddress(strWrongNameEmail);
        accountRegistrationPage.fillPassword(strRightNamePassword);
        accountRegistrationPage.fillConfirmPassword(strWrongNameConfirmPassword);
        accountRegistrationPage.clickCreateMyAccountButton();
    }

}
