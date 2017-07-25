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
    public void negativePasswordNameTestEmpatyName() throws Exception {
      password("");
    }

    @Test
    public void negativePasswordNameTest_1() throws Exception {
        password("JJjj1 ");
    }

    @Test
    public void negativePasswordNameTest_2() throws Exception {
       password("asdfghjk");
    }

    @Test
    public void negativePasswordNameTest_3() throws Exception {
        password("123456789");
    }

    @Test
    public void negativePasswordNameTest_4() throws Exception {
        password("janjekojan123");
    }

    @Test
    public void negativePasswordNameTest_5() throws Exception {
        password("JJjjjkkl");
    }

    @Test
    public void negativePasswordNameTest_6() throws Exception {
       password("////***///");
    }
}
