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
    public void negativeCallCentrePasswordTest_Eampty() throws Exception {
        callCentrePassword("");
    }

    @Test
    public void negativeCallCentrePasswordTest_1() throws Exception {
        callCentrePassword("        ");
    }

    @Test
    public void negativeCallCentrePasswordTest_2() throws Exception {
        callCentrePassword("JJjj1");
    }

    @Test
    public void negativeCallCentrePasswordTest_3() throws Exception {
        callCentrePassword("sdssaqww");
    }

    @Test
    public void negativeCallCentrePasswordTest_4() throws Exception {
        callCentrePassword("123456789");
    }

    @Test
    public void negativeCallCentrePasswordTest_5() throws Exception {
        callCentrePassword("janjekojan123");
    }

    @Test
    public void negativeCallCentrePasswordTest_6() throws Exception {
        callCentrePassword("JJJjjjkl");
    }

    @Test
    public void negativeCallCentrePasswordTest_7() throws Exception {
        callCentrePassword("/////****777");
    }

}
