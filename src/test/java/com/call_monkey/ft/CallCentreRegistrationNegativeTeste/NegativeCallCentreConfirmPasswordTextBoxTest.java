package com.call_monkey.ft.CallCentreRegistrationNegativeTeste;

import com.call_monkey.ft.BaseTest;
import org.testng.annotations.Test;

/**
 * Created by vache on 7/25/17.
 */
public class NegativeCallCentreConfirmPasswordTextBoxTest extends BaseTest {

    public void callCentreConfirmPassword(String strCallCentreConfirmPassword){
        String strWrongNameEmail = "Valodik@mail.ru";
        String strRightNameCompany = "Valod";
        String strRightNamePassword = "janValodikjan123";

        accountRegistrationPage.open();
        accountRegistrationPage.fillCompnyAddress(strRightNameCompany);
        accountRegistrationPage.fillEmailAddress(strWrongNameEmail);
        accountRegistrationPage.fillPassword(strRightNamePassword);
        accountRegistrationPage.fillConfirmPassword(strCallCentreConfirmPassword);
        accountRegistrationPage.clickCreateMyAccountButton();
    }

    @Test
    public void negativeCallCentreConfirmPasswordTestEmpty() throws Exception {
        callCentreConfirmPassword("");
        callCentreRegistrationPage.checkIfConfirmPasswordNull();

    }

    @Test
    public void negativeCallCentreConfirmPasswordTestNoUpperCase() throws Exception {
        callCentreConfirmPassword("janvalodikjan123");
        callCentreRegistrationPage.checkIfConfirmPasswordIsWrong();
    }

    @Test
    public void negativeCallCentreConfirmPasswordTestOnlySpase() throws Exception {
        callCentreConfirmPassword("       ");
        callCentreRegistrationPage.checkIfConfirmPasswordIsWrong();

    }
}
