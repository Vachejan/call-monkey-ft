package com.call_monkey.ft.AccountRegistrationNegativeTeste;

import com.call_monkey.ft.BaseTest;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.testng.annotations.Test;

/**
 * Created by vache on 7/25/17.
 */
public class NegativeCompanyEmailTextBoxTest extends BaseTest {


    public void emailAddres (String strEmailAddres){
        String strRightNameCompany = "Valod";
        String strRightNamePassword = "janValodikjan123";
        String strWrongNameEmail = "Valodik@mail.ru";

        accountRegistrationPage.open();
        accountRegistrationPage.fillCompnyAddress(strRightNameCompany);
        accountRegistrationPage.fillEmailAddress(strEmailAddres);
        accountRegistrationPage.fillPassword(strRightNamePassword);
        accountRegistrationPage.fillConfirmPassword(strRightNamePassword);
        accountRegistrationPage.clickCreateMyAccountButton();

    }

    @Test
    public void negativeCompanyEmailTestNameEmpty() throws Exception {
        emailAddres("");
        accountRegistrationPage.chackIfEmailNotFilledMessige();
    }

    @Test
    public void negativeCompanyEsmailTestUsedEmail() throws Exception {
        emailAddres(" ");
        accountRegistrationPage.checkIfEmailIsWrong();
    }

    @Test
    public void negativeCompanyEmailTestSpace() throws Exception {
        emailAddres(" @mail.ru");
        accountRegistrationPage.checkIfEmailIsWrong();
    }

    @Test
    public void negativeCompanyEmailTestNoAt() throws Exception {
        emailAddres("jeko.mail.ru");
        accountRegistrationPage.checkIfEmailIsWrong();
    }

    @Test
    public void negativeCompanyEmailTestOnlyDomen() throws Exception {
        emailAddres("@mail.ru");
        accountRegistrationPage.checkIfEmailIsWrong();
    }

    @Test
    public void negativeCompanyEmailTestNoDomen() throws Exception {
        emailAddres("jeko");
        accountRegistrationPage.checkIfEmailIsWrong();
    }

    @Test
    public void negativeCompanyEmailTestTwoAt() throws Exception {
        emailAddres("jeko@@mail.ru");
        accountRegistrationPage.checkIfEmailIsWrong();
    }

    @Test
    public void negativeCompanyEmailTestWrongSymbol() throws Exception {
        emailAddres("//////*@mail.ru");
        accountRegistrationPage.checkIfEmailIsWrong();
    }

    @Test
    public void negativeCompanyEmailTestUsedEmail() throws Exception {
        emailAddres("Valodik@mail.ru");
        accountRegistrationPage.checkIfEmailIsWrong();
    }
}