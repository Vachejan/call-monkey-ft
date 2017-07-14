package com.call_monkey.ft.RegistrationTest;

import com.call_monkey.ft.BaseTest;
import org.testng.annotations.Test;

/**
 * Created by vache on 7/14/17.
 */
public class CallCentreRegistrationTest extends BaseTest {

    @Test
    public void enterCallCentreRegistrationPage() throws Exception {

        String strRightNameCompany = "Valodik";
        String strWrongName = "123456";
        String strRightNameEmail = "Valodik@mail.ru";
        String strWrongNameEmail = "]]]@[[[";
        String strRightNamePassword = "janValodikjan123";
        String strwrongNamepassword = ";;;;;''''.";

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

    }
}
