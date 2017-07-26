package com.call_monkey.ft.AccountRegistrationNegativeTeste;

import com.call_monkey.ft.BaseTest;
import org.testng.annotations.Test;

/**
 * Created by vache on 7/25/17.
 */
public class NegativePasswordTextBoxTest extends BaseTest {

    public void password(String strPassword){

        String strRightNameCompany = "Valod";
        String strRightNameEmail = "Valodik@mail.ru";

        accountRegistrationPage.open();
        accountRegistrationPage.fillCompnyAddress(strRightNameCompany);
        accountRegistrationPage.fillEmailAddress(strRightNameEmail);
        accountRegistrationPage.fillPassword(strPassword);
        accountRegistrationPage.fillConfirmPassword(strPassword);
        accountRegistrationPage.clickCreateMyAccountButton();
    }

    @Test
    public void negativePasswordNameTestEmpty() throws Exception {
      password("");
      accountRegistrationPage.checkIfPasswordIsNull();
    }

    @Test
    public void negativePasswordNameTestShortPassword() throws Exception {
        password("JJjj1");
        accountRegistrationPage.checkIfPasswordIsWrong();
    }

    @Test
    public void negativePasswordNameTestOnlyLowerCase() throws Exception {
       password("asdfghjk");
       accountRegistrationPage.checkIfPasswordIsWrong();
    }

    @Test
    public void negativePasswordNameTestOnlyNumber() throws Exception {
        password("123456789");
        accountRegistrationPage.checkIfPasswordIsWrong();
    }

    @Test
    public void negativePasswordNameTestNoUpperCase() throws Exception {
        password("janjekojan123");
        accountRegistrationPage.checkIfPasswordIsWrong();
    }

    @Test
    public void negativePasswordNameTestNoNumber() throws Exception {
        password("JJjjjkkl");
        accountRegistrationPage.checkIfPasswordIsWrong();
    }

    @Test
    public void negativePasswordNameTestNoLetters() throws Exception {
       password("////***///");
       accountRegistrationPage.checkIfPasswordIsWrong();
    }
}