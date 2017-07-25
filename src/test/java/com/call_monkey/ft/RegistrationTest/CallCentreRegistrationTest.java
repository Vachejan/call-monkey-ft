package com.call_monkey.ft.RegistrationTest;

import com.call_monkey.ft.BaseTest;
import org.testng.annotations.Test;

/**
 * Created by vache on 7/14/17.
 */
public class CallCentreRegistrationTest extends BaseTest {

    @Test
    public void enterCallCentreRegistrationPage() throws Exception {

        String strRightNameCompany = "Jeko";
        String strRightNameEmail = "Jeko@mail.ru";
        String strRightNamePassword = "janJekojan123";

        //Open Call Centre Registration page.
        callCentreRegistrationPage.open();

        //Fill Compani address.
        callCentreRegistrationPage.fillCompnyAddress(strRightNameCompany);

        //Fill email address.
        callCentreRegistrationPage.fillEmailAddress(strRightNameEmail);

        //Fill password address.
        callCentreRegistrationPage.fillPassword(strRightNamePassword);

        //Fill confirm password address.
        callCentreRegistrationPage.fillConfirmPassword(strRightNamePassword);

        //Click "Greate My Account" button
        callCentreRegistrationPage.clickCreateMyAccountButton();

        //Get title call centre
        callCentreRegistrationPage.getTextCallCentreRegistration();

        //Compare  Text Title CallCentreRegistration.
        callCentreRegistrationPage.compareTextTitleCallCentreRegistration();

        callCentreRegistrationPage.compareEmailErrorMasige();

        callCentreRegistrationPage.checkIfCompanyIsWrong();

        callCentreRegistrationPage.checkIfEmailIsWrongMessige();

        callCentreRegistrationPage.checkIfPasswordIsWrong();

        callCentreRegistrationPage.checkIfConfirmPasswordIsWrong();



    }
}
