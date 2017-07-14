package com.call_monkey.ft.RegistrationTest;

import com.call_monkey.ft.BaseTest;
import org.testng.annotations.Test;

/**
 * Created by vache on 7/14/17.
 */
public class AccointRegistrationTest extends BaseTest {

    @Test
    public void enterAccountRegistrationPage() throws Exception {

        String strRightNameCompany = "Valodik";
        String strWrongName = "123456";
        String strRightNameEmail = "Valodik@mail.ru";
        String strWrongNameEmail = "]]]@[[[";
        String strRightNamePassword = "janValodikjan123";
        String strwrongNamepassword = ";;;;;''''.";


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

        //Click Greate my account
        accountRegistrationPage.clickCreateMyAccountButton();

    }
}
