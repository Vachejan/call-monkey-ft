package com.call_monkey.ft.RegistrationTest;

import com.call_monkey.ft.BaseTest;
import org.testng.annotations.Test;

/**
 * Created by vache on 7/13/17.
 */
public class RegistrationNegativeTests extends BaseTest {

    @Test
    public void enterRegistrationPage() throws Exception {

        String strRightNameCompany = "Valodik";
        String strRightNamePassword = "janJEKOjan111";

        callCentreRegistrationPage.open();
        callCentreRegistrationPage.fillEmailAddress(strRightNameCompany);
        callCentreRegistrationPage.fillPassword(strRightNamePassword);










    }

}

