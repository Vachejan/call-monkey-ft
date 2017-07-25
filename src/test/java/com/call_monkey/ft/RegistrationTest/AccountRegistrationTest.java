package com.call_monkey.ft.RegistrationTest;

import com.call_monkey.ft.BaseTest;
import org.testng.annotations.Test;

/**
 * Created by vache on 7/14/17.
 */
public class AccountRegistrationTest extends BaseTest {

    @Test
    public void enterAccountRegistrationPage() throws Exception {

        String strRightNameCompany = "Valodik";
        String strRightNameEmail = "Valodik@mail.ru";
        String strRightNamePassword = "janValodikjan123";


        //Open Account Registration page.
        accountRegistrationPage.open();

        //Fill company adress.
        accountRegistrationPage.fillCompnyAddress(strRightNameCompany);

        //Fill email address.
        accountRegistrationPage.fillEmailAddress(strRightNameEmail);

        //Fill passowrd addres
        accountRegistrationPage.fillPassword(strRightNamePassword);

        //Fill confirm password.
        accountRegistrationPage.fillConfirmPassword(strRightNamePassword);

        //Click "create my account"
        accountRegistrationPage.clickCreateMyAccountButton();

        accountRegistrationPage.checkIfCompanyIsWrong();

        accountRegistrationPage.checkIfEmailIsWrong();

        accountRegistrationPage.checkIfPasswordIsWrong();

        accountRegistrationPage.checkIfConfirmPasswordIsWrong();


    }
}
