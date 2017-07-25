package com.call_monkey.ft.CallCentreRegistrationNegativeTeste;

import com.call_monkey.ft.BaseTest;
import org.testng.annotations.Test;

/**
 * Created by vache on 7/25/17.
 */
public class NegativeCallCentreConfirmPasswordTextBoxTest extends BaseTest {

    @Test
    public void negativeCallCentreConfirmPasswordTest_1() throws Exception {

        String strRightNameCompany = "Valod";
        String strWrongNameEmail = "Valodik@mail.ru";
        String strWrongNameConfirmPassword = "";
        String strRightNamePassword = "janValodikjan123";

        accountRegistrationPage.open();
        accountRegistrationPage.fillCompnyAddress(strRightNameCompany);
        accountRegistrationPage.fillEmailAddress(strWrongNameEmail);
        accountRegistrationPage.fillPassword(strRightNamePassword);
        accountRegistrationPage.fillConfirmPassword(strWrongNameConfirmPassword);
        accountRegistrationPage.clickCreateMyAccountButton();
    }

    @Test
    public void negativeCallCentreConfirmPasswordTest_2() throws Exception {


        String strRightNameCompany = "Valod";
        String strWrongNameEmail = "Valodik@mail.ru";
        String strWrongNameConfirmPassword = "janvalodikjan123";
        String strRightNamePassword = "janValodikjan123";

        accountRegistrationPage.open();
        accountRegistrationPage.fillCompnyAddress(strRightNameCompany);
        accountRegistrationPage.fillEmailAddress(strWrongNameEmail);
        accountRegistrationPage.fillPassword(strRightNamePassword);
        accountRegistrationPage.fillConfirmPassword(strWrongNameConfirmPassword);
        accountRegistrationPage.clickCreateMyAccountButton();
    }

    @Test
    public void negativeCallCentreConfirmPasswordTest_3() throws Exception {


        String strRightNameCompany = "Valod";
        String strWrongNameEmail = "Valodik@mail.ru";
        String strRightNamePassword = "janValodikjan123";
        String strWrongNameConfirmPassword = "       ";

        accountRegistrationPage.open();
        accountRegistrationPage.fillCompnyAddress(strRightNameCompany);
        accountRegistrationPage.fillEmailAddress(strWrongNameEmail);
        accountRegistrationPage.fillPassword(strRightNamePassword);
        accountRegistrationPage.fillConfirmPassword(strWrongNameConfirmPassword);
        accountRegistrationPage.clickCreateMyAccountButton();
    }

}
