package com.call_monkey.ft.RegistrationTest;

import com.call_monkey.ft.BaseTest;
import org.testng.annotations.Test;

/**
 * Created by vache on 7/17/17.
 */
public class AccountRegistrationCompanyTest extends BaseTest {

    @Test
    public void enterAccountRegistrationPage() throws Exception {

        String strRightNameCompany = "Valodik";
        String strWrongNameCompany = " ";
        String strRightNameEmail = "Valodik@mail.ru";
        String strWrongNameEmail = "]]]@[[[";
        String strRightNamePassword = "janValodikjan123";
        String strWrongNamepassword = ";;;;;''''.";

        //Open Account Registration page.
        accountRegistrationPage.open();
        
        //Fill Company address.
        accountRegistrationPage.fillCompnyAddress(strWrongNameCompany);

        //Fill email address.
        accountRegistrationPage.fillEmailAddress(strRightNameEmail);

        //Fill password
        accountRegistrationPage.fillPassword(strRightNamePassword);

        //Fill confirm password
        accountRegistrationPage.fillConfirmPassword(strRightNamePassword);

        //Click "CreatecMy Account" button
        accountRegistrationPage.clickCreateMyAccountButton();

        //Compare filed error masage
        accountRegistrationPage.checkIfCompanyIsWrong();

    }
}
