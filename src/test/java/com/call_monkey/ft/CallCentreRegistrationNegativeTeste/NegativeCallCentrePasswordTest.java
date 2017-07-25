package com.call_monkey.ft.CallCentreRegistrationNegativeTeste;

import com.call_monkey.ft.BaseTest;
import org.testng.annotations.Test;

/**
 * Created by vache on 7/25/17.
 */
public class NegativeCallCentrePasswordTest extends BaseTest {

    @Test
    public void negativeCallCentrePasswordTest_Eampty() throws Exception {

        String strRightNameEmail = "Valodik@mail.ru";
        String strRightNameCompany = "Valod";
        String strWrongNamePassword = "";

        accountRegistrationPage.open();
        accountRegistrationPage.fillCompnyAddress(strRightNameCompany);
        accountRegistrationPage.fillEmailAddress(strRightNameEmail);
        accountRegistrationPage.fillPassword(strWrongNamePassword);
        accountRegistrationPage.fillConfirmPassword(strWrongNamePassword);
        accountRegistrationPage.clickCreateMyAccountButton();
    }

    @Test
    public void negativeCallCentrePasswordTest_1() throws Exception {

        String strRightNameCompany = "Valod";
        String strRightNameEmail = "Valodik@mail.ru";
        String strWrongNamePassword = "        ";

        accountRegistrationPage.open();
        accountRegistrationPage.fillCompnyAddress(strRightNameCompany);
        accountRegistrationPage.fillEmailAddress(strRightNameEmail);
        accountRegistrationPage.fillPassword(strWrongNamePassword);
        accountRegistrationPage.fillConfirmPassword(strWrongNamePassword);
        accountRegistrationPage.clickCreateMyAccountButton();
    }

    @Test
    public void negativeCallCentrePasswordTest_2() throws Exception {

        String strRightNameCompany = "Valod";
        String strRightNameEmail = "Valodik@mail.ru";
        String strWrongNamePassword = "JJjj1";

        accountRegistrationPage.open();
        accountRegistrationPage.fillCompnyAddress(strRightNameCompany);
        accountRegistrationPage.fillEmailAddress(strRightNameEmail);
        accountRegistrationPage.fillPassword(strWrongNamePassword);
        accountRegistrationPage.fillConfirmPassword(strWrongNamePassword);
        accountRegistrationPage.clickCreateMyAccountButton();
    }

    @Test
    public void negativeCallCentrePasswordTest_3() throws Exception {

        String strRightNameCompany = "Valod";
        String strRightNameEmail = "Valodik@mail.ru";
        String strWrongNamePassword = "sdssaqww";

        accountRegistrationPage.open();
        accountRegistrationPage.fillCompnyAddress(strRightNameCompany);
        accountRegistrationPage.fillEmailAddress(strRightNameEmail);
        accountRegistrationPage.fillPassword(strWrongNamePassword);
        accountRegistrationPage.fillConfirmPassword(strWrongNamePassword);
        accountRegistrationPage.clickCreateMyAccountButton();
    }

    @Test
    public void negativeCallCentrePasswordTest_4() throws Exception {

        String strRightNameCompany = "Valod";
        String strWrongNamePassword = "123456789";
        String strRightNameEmail = "Valodik@mail.ru";

        accountRegistrationPage.open();
        accountRegistrationPage.fillCompnyAddress(strRightNameCompany);
        accountRegistrationPage.fillEmailAddress(strRightNameEmail);
        accountRegistrationPage.fillPassword(strWrongNamePassword);
        accountRegistrationPage.fillConfirmPassword(strWrongNamePassword);
        accountRegistrationPage.clickCreateMyAccountButton();
    }

    @Test
    public void negativeCallCentrePasswordTest_5() throws Exception {

        String strRightNameEmail = "Valodik@mail.ru";
        String strRightNameCompany = "Valod";
        String strWrongNamePassword = "janjekojan123";

        accountRegistrationPage.open();
        accountRegistrationPage.fillCompnyAddress(strRightNameCompany);
        accountRegistrationPage.fillEmailAddress(strRightNameEmail);
        accountRegistrationPage.fillPassword(strWrongNamePassword);
        accountRegistrationPage.fillConfirmPassword(strWrongNamePassword);
        accountRegistrationPage.clickCreateMyAccountButton();
    }

    @Test
    public void negativeCallCentrePasswordTest_6() throws Exception {

        String strRightNameCompany = "Valod";
        String strRightNameEmail = "Valodik@mail.ru";
        String strWrongNamePassword = "JJJjjjkl";

        accountRegistrationPage.open();
        accountRegistrationPage.fillCompnyAddress(strRightNameCompany);
        accountRegistrationPage.fillEmailAddress(strRightNameEmail);
        accountRegistrationPage.fillPassword(strWrongNamePassword);
        accountRegistrationPage.fillConfirmPassword(strWrongNamePassword);
        accountRegistrationPage.clickCreateMyAccountButton();
    }

    @Test
    public void negativeCallCentrePasswordTest_7() throws Exception {

        String strRightNameCompany = "Valod";
        String strRightNameEmail = "Valodik@mail.ru";
        String strWrongNamePassword = "/////****777";

        accountRegistrationPage.open();
        accountRegistrationPage.fillCompnyAddress(strRightNameCompany);
        accountRegistrationPage.fillEmailAddress(strRightNameEmail);
        accountRegistrationPage.fillPassword(strWrongNamePassword);
        accountRegistrationPage.fillConfirmPassword(strWrongNamePassword);
        accountRegistrationPage.clickCreateMyAccountButton();
    }



}
