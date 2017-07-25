package com.call_monkey.ft.CallCentreRegistrationNegativeTeste;

import com.call_monkey.ft.BaseTest;
import org.testng.annotations.Test;

/**
 * Created by vache on 7/25/17.
 */
public class NegativeCallCentreCompanyTextBoxTest extends BaseTest {

    @Test
    public void negativeCallCentreCompanyTestNameEmpty() throws Exception {

        String strWrongNameCompany = "";
        String strRightNamePassword = "janValodikjan123";
        String strRightNameEmail = "Valodik@mail.ru";

        callCentreRegistrationPage.open();
        callCentreRegistrationPage.fillCompnyAddress(strWrongNameCompany);
        callCentreRegistrationPage.fillEmailAddress(strRightNameEmail);
        callCentreRegistrationPage.fillPassword(strRightNamePassword);
        callCentreRegistrationPage.fillConfirmPassword(strRightNamePassword);
        callCentreRegistrationPage.clickCreateMyAccountButton();
    }

    @Test
    public void negativeCallCentreCompanyTestOneSpace() throws Exception {

        String strWrongNameCompany = " ";
        String strRightNamePassword = "janValodikjan123";
        String strRightNameEmail = "Valodik@mail.ru";

        callCentreRegistrationPage.open();
        callCentreRegistrationPage.fillCompnyAddress(strWrongNameCompany);
        callCentreRegistrationPage.fillEmailAddress(strRightNameEmail);
        callCentreRegistrationPage.fillPassword(strRightNamePassword);
        callCentreRegistrationPage.fillConfirmPassword(strRightNamePassword);
        callCentreRegistrationPage.clickCreateMyAccountButton();
    }

    @Test
    public void negativeCallCentreCompanyTestSpaceName() throws Exception {

        String strWrongNameCompany = " Valod";
        String strRightNameEmail = "Valodik@mail.ru";
        String strRightNamePassword = "janValodikjan123";

        callCentreRegistrationPage.open();
        callCentreRegistrationPage.fillCompnyAddress(strWrongNameCompany);
        callCentreRegistrationPage.fillEmailAddress(strRightNameEmail);
        callCentreRegistrationPage.fillPassword(strRightNamePassword);
        callCentreRegistrationPage.fillConfirmPassword(strRightNamePassword);
        callCentreRegistrationPage.clickCreateMyAccountButton();
    }

    @Test
    public void negativeCallCentreCompanyTestNameMixLeatters() throws Exception {

        String strWrongNameCompany = "V//**{}]";
        String strRightNameEmail = "Valodik@mail.ru";
        String strRightNamePassword = "janValodikjan123";

        callCentreRegistrationPage.open();
        callCentreRegistrationPage.fillCompnyAddress(strWrongNameCompany);
        callCentreRegistrationPage.fillEmailAddress(strRightNameEmail);
        callCentreRegistrationPage.fillPassword(strRightNamePassword);
        callCentreRegistrationPage.fillConfirmPassword(strRightNamePassword);
        callCentreRegistrationPage.clickCreateMyAccountButton();
    }

}
