package com.call_monkey.ft.AccountRegistrationNegativeTeste;

import com.call_monkey.ft.BaseTest;
import org.testng.annotations.Test;

/**
 * Created by vache on 7/25/17.
 */
public class NegativePasswordTextBoxTest extends BaseTest {

    @Test
    public void negativePasswordNameTestEmpatyName() throws Exception {

        String strRightNameCompany = "Valod";
        String strRightNameEmail = "Valodik@mail.ru";
        String strWrongNamePassword = "";

        accountRegistrationPage.open();
        accountRegistrationPage.fillCompnyAddress(strRightNameCompany);
        accountRegistrationPage.fillEmailAddress(strRightNameEmail);
        accountRegistrationPage.fillPassword(strWrongNamePassword);
        accountRegistrationPage.fillConfirmPassword(strWrongNamePassword);
        accountRegistrationPage.clickCreateMyAccountButton();
    }

    @Test
    public void negativePasswordNameTest_1() throws Exception {

        String strRightNameCompany = "Valod";
        String strRightNameEmail = "Valodik@mail.ru";
        String strWrongNamePassword = "JJjj1 ";

        accountRegistrationPage.open();
        accountRegistrationPage.fillCompnyAddress(strRightNameCompany);
        accountRegistrationPage.fillEmailAddress(strRightNameEmail);
        accountRegistrationPage.fillPassword(strWrongNamePassword);
        accountRegistrationPage.fillConfirmPassword(strWrongNamePassword);
        accountRegistrationPage.clickCreateMyAccountButton();
    }

    @Test
    public void negativePasswordNameTest_2() throws Exception {

        String strRightNameCompany = "Valod";
        String strRightNameEmail = "Valodik@mail.ru";
        String strWrongNamePassword = "asdfghjk";

        accountRegistrationPage.open();
        accountRegistrationPage.fillCompnyAddress(strRightNameCompany);
        accountRegistrationPage.fillEmailAddress(strRightNameEmail);
        accountRegistrationPage.fillPassword(strWrongNamePassword);
        accountRegistrationPage.fillConfirmPassword(strWrongNamePassword);
        accountRegistrationPage.clickCreateMyAccountButton();
    }

    @Test
    public void negativePasswordNameTest_3() throws Exception {

        String strRightNameCompany = "Valod";
        String strRightNameEmail = "Valodik@mail.ru";
        String strWrongNamePassword = "123456789";

        accountRegistrationPage.open();
        accountRegistrationPage.fillCompnyAddress(strRightNameCompany);
        accountRegistrationPage.fillEmailAddress(strRightNameEmail);
        accountRegistrationPage.fillPassword(strWrongNamePassword);
        accountRegistrationPage.fillConfirmPassword(strWrongNamePassword);
        accountRegistrationPage.clickCreateMyAccountButton();
    }
    @Test
    public void negativePasswordNameTest_4() throws Exception {

        String strRightNameCompany = "Valod";
        String strRightNameEmail = "Valodik@mail.ru";
        String strWrongNamePassword = "janjekojan123";

        accountRegistrationPage.open();
        accountRegistrationPage.fillCompnyAddress(strRightNameCompany);
        accountRegistrationPage.fillEmailAddress(strRightNameEmail);
        accountRegistrationPage.fillPassword(strWrongNamePassword);
        accountRegistrationPage.fillConfirmPassword(strWrongNamePassword);
        accountRegistrationPage.clickCreateMyAccountButton();
    }
    @Test
    public void negativePasswordNameTest_5() throws Exception {

        String strRightNameCompany = "Valod";
        String strRightNameEmail = "Valodik@mail.ru";
        String strWrongNamePassword = "JJjjjkkl ";

        accountRegistrationPage.open();
        accountRegistrationPage.fillCompnyAddress(strRightNameCompany);
        accountRegistrationPage.fillEmailAddress(strRightNameEmail);
        accountRegistrationPage.fillPassword(strWrongNamePassword);
        accountRegistrationPage.fillConfirmPassword(strWrongNamePassword);
        accountRegistrationPage.clickCreateMyAccountButton();
    }

    @Test
    public void negativePasswordNameTest_6() throws Exception {

        String strRightNameCompany = "Valod";
        String strRightNameEmail = "Valodik@mail.ru";
        String strWrongNamePassword = "////***///";

        accountRegistrationPage.open();
        accountRegistrationPage.fillCompnyAddress(strRightNameCompany);
        accountRegistrationPage.fillEmailAddress(strRightNameEmail);
        accountRegistrationPage.fillPassword(strWrongNamePassword);
        accountRegistrationPage.fillConfirmPassword(strWrongNamePassword);
        accountRegistrationPage.clickCreateMyAccountButton();
    }
}
