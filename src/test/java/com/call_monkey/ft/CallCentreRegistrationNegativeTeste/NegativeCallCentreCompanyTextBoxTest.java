package com.call_monkey.ft.CallCentreRegistrationNegativeTeste;

import com.call_monkey.ft.BaseTest;
import org.testng.annotations.Test;

/**
 * Created by vache on 7/25/17.
 */
public class NegativeCallCentreCompanyTextBoxTest extends BaseTest {

    public void callCentreCompanyName(String strCallCentreCompanyName){

        String strRightNamePassword = "janValodikjan123";
        String strRightNameEmail = "Valodik@mail.ru";

        callCentreRegistrationPage.open();
        callCentreRegistrationPage.fillCompnyAddress(strCallCentreCompanyName);
        callCentreRegistrationPage.fillEmailAddress(strRightNameEmail);
        callCentreRegistrationPage.fillPassword(strRightNamePassword);
        callCentreRegistrationPage.fillConfirmPassword(strRightNamePassword);
        callCentreRegistrationPage.clickCreateMyAccountButton();
    }

    @Test
    public void negativeCallCentreCompanyTestNameEmpty() throws Exception {
        callCentreCompanyName("");
        callCentreRegistrationPage.checkIfCompanyIsWrong();
    }

    @Test
    public void negativeCallCentreCompanyTestOneSpace() throws Exception {
        callCentreCompanyName(" ");
        callCentreRegistrationPage.checkIfCompanyIsWrong();
    }

    @Test
    public void negativeCallCentreCompanyTestSpaceName() throws Exception {
    callCentreCompanyName(" Valod");
    callCentreRegistrationPage.checkIfCompanyIsWrong();
    }

    @Test
    public void negativeCallCentreCompanyTestNameMixLeatters() throws Exception {
        callCentreCompanyName("V//**{}]");
        callCentreRegistrationPage.checkIfCompanyIsWrong();
    }
}