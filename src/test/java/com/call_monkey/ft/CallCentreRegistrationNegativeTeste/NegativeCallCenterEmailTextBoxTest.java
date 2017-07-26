package com.call_monkey.ft.CallCentreRegistrationNegativeTeste;

import com.call_monkey.ft.BaseTest;
import org.testng.annotations.Test;

/**
 * Created by vache on 7/25/17.
 */
public class NegativeCallCenterEmailTextBoxTest extends BaseTest {

    public void companyEmailName(String strCompanyEmailName){
        String strRightNameCompany = "Jeko";
        String strRightNamePassword = "janValodikjan123";

        callCentreRegistrationPage.open();
        callCentreRegistrationPage.fillCompnyAddress(strRightNameCompany);
        callCentreRegistrationPage.fillEmailAddress(strCompanyEmailName);
        callCentreRegistrationPage.fillPassword(strRightNamePassword);
        callCentreRegistrationPage.fillConfirmPassword(strRightNamePassword);
        callCentreRegistrationPage.clickCreateMyAccountButton();
    }

    @Test
    public void negativeCompanyEmailTestEmailNameEmpaty() throws Exception {
        companyEmailName("");
        callCentreRegistrationPage.chackIfEmailNotFilledMessige();
    }

    @Test
    public void negativeCompanyEmailTestOneSpace() throws Exception {
        companyEmailName(" ");
        callCentreRegistrationPage.checkIfEmailIsWrongMessige();
    }

    @Test
    public void negativeCompanyEmailTestSpace() throws Exception {
        companyEmailName(" @mail.ru");
        callCentreRegistrationPage.checkIfEmailIsWrongMessige();
    }

    @Test
    public void negativeCompanyEmailTestOnlyDomen() throws Exception {
        companyEmailName("@mail.ru");
        callCentreRegistrationPage.checkIfEmailIsWrongMessige();
    }

    @Test
    public void negativeCompanyEmailTestNoAt() throws Exception {
       companyEmailName("valod.mail.ru");
        callCentreRegistrationPage.checkIfEmailIsWrongMessige();
    }

    @Test
    public void negativeCompanyEmailTestNoDomen() throws Exception {
        companyEmailName("jeko");
        callCentreRegistrationPage.checkIfEmailIsWrongMessige();
    }

    @Test
    public void negativeCompanyEmailTestTwoAt() throws Exception {
        companyEmailName("jeko@@mail.ru");
        callCentreRegistrationPage.checkIfEmailIsWrongMessige();
    }

    @Test
    public void negativeCompanyEmailTestWrongSymbol() throws Exception {
        companyEmailName("////**/@mail.ru");
        callCentreRegistrationPage.checkIfEmailIsWrongMessige();
    }

    @Test
    public void negativecompanyEmailTestUsedMail() throws Exception {
        companyEmailName("Valodik@mail.ru");
        callCentreRegistrationPage.checkIfEmailIsWrongMessige();
    }
}