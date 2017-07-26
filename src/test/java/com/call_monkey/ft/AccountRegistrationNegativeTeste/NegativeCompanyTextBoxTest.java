package com.call_monkey.ft.AccountRegistrationNegativeTeste;

import com.call_monkey.ft.BaseTest;
import org.testng.annotations.Test;

/**
 * Created by vache on 7/25/17.
 */
public class NegativeCompanyTextBoxTest extends BaseTest {

    public void companyName (String strSendCompanyName){

        String strRightNameEmail = "Valodik@mail.ru";
        String strRightNamePassword = "janValodikjan123";

        accountRegistrationPage.open();
        accountRegistrationPage.fillCompnyAddress(strSendCompanyName);
        accountRegistrationPage.fillEmailAddress(strRightNameEmail);
        accountRegistrationPage.fillPassword(strRightNamePassword);
        accountRegistrationPage.fillConfirmPassword(strRightNamePassword);
        accountRegistrationPage.clickCreateMyAccountButton();

    }

    @Test
    public void negativeCompanyNameTestNameEmpty() throws Exception {
        companyName("");
        accountRegistrationPage.checkIfCompanyIsWrong();
    }

    @Test
    public void negativeCompanyNameTestNameOneSpace() throws Exception {
        companyName(" ");
        accountRegistrationPage.checkIfCompanyIsWrong();
    }

    @Test
    public void negativeCompanyNameTestSpaceName() throws Exception {
        companyName("       ");
        accountRegistrationPage.checkIfCompanyIsWrong();
    }

    @Test
    public void negativeCompanyNameTesteNameMixLeatters() throws Exception {
        companyName("V..;l{{]");
        accountRegistrationPage.checkIfCompanyIsWrong();
    }
}