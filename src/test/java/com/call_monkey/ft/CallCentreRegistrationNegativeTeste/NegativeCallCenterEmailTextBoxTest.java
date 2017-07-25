package com.call_monkey.ft.CallCentreRegistrationNegativeTeste;

import com.call_monkey.ft.BaseTest;
import org.testng.annotations.Test;

/**
 * Created by vache on 7/25/17.
 */
public class NegativeCallCenterEmailTextBoxTest extends BaseTest {

    @Test
    public void negativeCompanyEmailTestEmailNameEmpaty() throws Exception {

        String strRightNameCompany = "Jeko";
        String strWrongNameEmail = "";
        String strRightNamePassword = "janValodikjan123";

        callCentreRegistrationPage.open();
        callCentreRegistrationPage.fillCompnyAddress(strRightNameCompany);
        callCentreRegistrationPage.fillEmailAddress(strWrongNameEmail);
        callCentreRegistrationPage.fillPassword(strRightNamePassword);
        callCentreRegistrationPage.fillConfirmPassword(strRightNamePassword);
        callCentreRegistrationPage.clickCreateMyAccountButton();
        callCentreRegistrationPage.chackIfEmailNotFilledMessige();
    }

    @Test
    public void negativeCompanyEmailTestOneSpace() throws Exception {

        String strWrongNameCompany = "Jeko";
        String strRightNameEmail = " ";
        String strRightNamePassword = "janValodikjan123";

        callCentreRegistrationPage.open();
        callCentreRegistrationPage.fillCompnyAddress(strWrongNameCompany);
        callCentreRegistrationPage.fillEmailAddress(strRightNameEmail);
        callCentreRegistrationPage.fillPassword(strRightNamePassword);
        callCentreRegistrationPage.fillConfirmPassword(strRightNamePassword);
        callCentreRegistrationPage.clickCreateMyAccountButton();
        callCentreRegistrationPage.checkIfEmailIsWrongMessige();
    }

    @Test
    public void negativeCompanyEmailTestSpace() throws Exception {

        String strWrongNameCompany = "Jeko";
        String strRightNameEmail = " @mail.ru";
        String strRightNamePassword = "janValodikjan123";

        callCentreRegistrationPage.open();
        callCentreRegistrationPage.fillCompnyAddress(strWrongNameCompany);
        callCentreRegistrationPage.fillEmailAddress(strRightNameEmail);
        callCentreRegistrationPage.fillPassword(strRightNamePassword);
        callCentreRegistrationPage.fillConfirmPassword(strRightNamePassword);
        callCentreRegistrationPage.clickCreateMyAccountButton();
        callCentreRegistrationPage.checkIfEmailIsWrongMessige();
    }

    @Test
    public void negativeCompanyEmailTestOnlyDomen() throws Exception {

        String strWrongNameCompany = "Jeko";
        String strRightNameEmail = "@mail.ru";
        String strRightNamePassword = "janValodikjan123";

        callCentreRegistrationPage.open();
        callCentreRegistrationPage.fillCompnyAddress(strWrongNameCompany);
        callCentreRegistrationPage.fillEmailAddress(strRightNameEmail);
        callCentreRegistrationPage.fillPassword(strRightNamePassword);
        callCentreRegistrationPage.fillConfirmPassword(strRightNamePassword);
        callCentreRegistrationPage.clickCreateMyAccountButton();
        callCentreRegistrationPage.checkIfEmailIsWrongMessige();
    }

    @Test
    public void negativeCompanyEmailTestNoAt() throws Exception {

        String strWrongNameCompany = "Jeko";
        String strRightNameEmail = "valod.mail.ru";
        String strRightNamePassword = "janValodikjan123";

        callCentreRegistrationPage.open();
        callCentreRegistrationPage.fillCompnyAddress(strWrongNameCompany);
        callCentreRegistrationPage.fillEmailAddress(strRightNameEmail);
        callCentreRegistrationPage.fillPassword(strRightNamePassword);
        callCentreRegistrationPage.fillConfirmPassword(strRightNamePassword);
        callCentreRegistrationPage.clickCreateMyAccountButton();
        callCentreRegistrationPage.checkIfEmailIsWrongMessige();
    }

    @Test
    public void negativeCompanyEmailTestNoDomen() throws Exception {

        String strWrongNameCompany = "Jeko";
        String strRightNameEmail = "jeko";
        String strRightNamePassword = "janValodikjan123";

        callCentreRegistrationPage.open();
        callCentreRegistrationPage.fillCompnyAddress(strWrongNameCompany);
        callCentreRegistrationPage.fillEmailAddress(strRightNameEmail);
        callCentreRegistrationPage.fillPassword(strRightNamePassword);
        callCentreRegistrationPage.fillConfirmPassword(strRightNamePassword);
        callCentreRegistrationPage.clickCreateMyAccountButton();
        callCentreRegistrationPage.checkIfEmailIsWrongMessige();
    }

    @Test
    public void negativeCompanyEmailTestTwoAt() throws Exception {

        String strWrongNameCompany = "Jeko";
        String strRightNameEmail = "jeko@@mail.ru";
        String strRightNamePassword = "janValodikjan123";

        callCentreRegistrationPage.open();
        callCentreRegistrationPage.fillCompnyAddress(strWrongNameCompany);
        callCentreRegistrationPage.fillEmailAddress(strRightNameEmail);
        callCentreRegistrationPage.fillPassword(strRightNamePassword);
        callCentreRegistrationPage.fillConfirmPassword(strRightNamePassword);
        callCentreRegistrationPage.clickCreateMyAccountButton();
        callCentreRegistrationPage.checkIfEmailIsWrongMessige();
    }

    @Test
    public void negativeCompanyEmailTestWrongSymbol() throws Exception {

        String strWrongNameCompany = "Jeko";
        String strRightNameEmail = "////**/@mail.ru";
        String strRightNamePassword = "janValodikjan123";

        callCentreRegistrationPage.open();
        callCentreRegistrationPage.fillCompnyAddress(strWrongNameCompany);
        callCentreRegistrationPage.fillEmailAddress(strRightNameEmail);
        callCentreRegistrationPage.fillPassword(strRightNamePassword);
        callCentreRegistrationPage.fillConfirmPassword(strRightNamePassword);
        callCentreRegistrationPage.clickCreateMyAccountButton();
        callCentreRegistrationPage.checkIfEmailIsWrongMessige();
    }
/*
    @Test
    public void negativecompanyEmailTestUsedMail() throws Exception {

        String strWrongNameCompany = "Jeko";
        String strRightNameEmail = "Valodik@mail.ru";
        String strRightNamePassword = "janValodikjan123";

        callCentreRegistrationPage.open();
        callCentreRegistrationPage.fillCompnyAddress(strWrongNameCompany);
        callCentreRegistrationPage.fillEmailAddress(strRightNameEmail);
        callCentreRegistrationPage.fillPassword(strRightNamePassword);
        callCentreRegistrationPage.fillConfirmPassword(strRightNamePassword);
        callCentreRegistrationPage.clickCreateMyAccountButton();
        callCentreRegistrationPage.checkIfEmailIsWrongMessige();
    }*/
}
