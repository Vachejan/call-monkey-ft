package com.call_monkey.ft.CallCentreRegistrationNegativeTeste;

import com.call_monkey.ft.BaseTest;
import org.testng.annotations.Test;

/**
 * Created by vache on 7/25/17.
 */
public class NegativeCallCentrePasswordTest extends BaseTest {

    public void callCentrePassword(String strPassword) {

        String strRightNameEmail = "Valodik@mail.ru";
        String strRightNameCompany = "Valod";

        accountRegistrationPage.open();
        accountRegistrationPage.fillCompnyAddress(strRightNameCompany);
        accountRegistrationPage.fillEmailAddress(strRightNameEmail);
        accountRegistrationPage.fillPassword(strPassword);
        accountRegistrationPage.fillConfirmPassword(strPassword);
        accountRegistrationPage.clickCreateMyAccountButton();
    }

    @Test
    public void negativeCallCentrePasswordTestEmpty() throws Exception {
        callCentrePassword("");
        callCentreRegistrationPage.checkIfPasswordIsNull();

    }

    @Test
    public void negativeCallCentrePasswordTestOnlySpace() throws Exception {
        callCentrePassword("        ");
        callCentreRegistrationPage.checkIfPasswordIsWrong();
    }

    @Test
    public void negativeCallCentrePasswordTestShortPassword() throws Exception {
        callCentrePassword("JJjj1");
        callCentreRegistrationPage.checkIfPasswordIsWrong();

    }

    @Test
    public void negativeCallCentrePasswordTestOnlyLowerCase() throws Exception {
        callCentrePassword("sdssaqww");
        callCentreRegistrationPage.checkIfPasswordIsWrong();
    }

    @Test
    public void negativeCallCentrePasswordTestOnlyNumber() throws Exception {
        callCentrePassword("123456789");
        callCentreRegistrationPage.checkIfPasswordIsWrong();
    }

    @Test
    public void negativeCallCentrePasswordTestNoUpperCase() throws Exception {
        callCentrePassword("janjekojan123");
        callCentreRegistrationPage.checkIfPasswordIsWrong();
    }

    @Test
    public void negativeCallCentrePasswordTestNoNumber() throws Exception {
        callCentrePassword("JJJjjjkl");
        callCentreRegistrationPage.checkIfPasswordIsWrong();
    }

    @Test
    public void negativeCallCentrePasswordTestNoLetters() throws Exception {
        callCentrePassword("/////****");
        callCentreRegistrationPage.checkIfPasswordIsWrong();
    }
}