package com.call_monkey.ft.AccountRegistrationNegativeTeste;

import com.call_monkey.ft.BaseTest;
import org.testng.annotations.Test;

/**
 * Created by vache on 7/25/17.
 */
public class NegativeConfirmPasswordTextBoxTest extends BaseTest {

    public void confirmPassword(String strConfirmPassword) {
        String strRightNameCompany = "Valod";
        String strWrongNameEmail = "Valodik@mail.ru";
        String strRightNamePassword = "janValodikjan123";

        accountRegistrationPage.open();
        accountRegistrationPage.fillCompnyAddress(strRightNameCompany);
        accountRegistrationPage.fillEmailAddress(strWrongNameEmail);
        accountRegistrationPage.fillPassword(strRightNamePassword);
        accountRegistrationPage.fillConfirmPassword(strConfirmPassword);
        accountRegistrationPage.clickCreateMyAccountButton();
    }


    @Test
    public void negativeConfirmPasswordTeste_ConfirmePasswordEampty() throws Exception {
        confirmPassword("");
        accountRegistrationPage.checkIfConfirmPasswordMessigeIsWrong();

    }

    @Test
    public void negativeConfirmPasswordTeste_() throws Exception {
        confirmPassword("janvalodikjan123");
    }

    @Test
    public void negativeConfirmPasswordTeste_1() throws Exception {
        confirmPassword(" ");
    }

}
