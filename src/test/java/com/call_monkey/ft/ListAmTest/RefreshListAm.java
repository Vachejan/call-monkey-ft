package com.call_monkey.ft.ListAmTest;

import com.call_monkey.ft.BaseTest;
import org.testng.annotations.Test;

/**
 * Created by vache on 7/27/17.
 */
public class RefreshListAm extends BaseTest {
    @Test
    public void Registration () throws Exception {
        listRegistrationPage.open();
        listRegistrationPage.fillLogin("garik.kalash@gmail.com");
        listRegistrationPage.fillPasswordName("0944477522gar");
        listRegistrationPage.clickSubmitButton();
        refresh.refresh();
       /* refresh.refresh_1();
        refresh.submit();
        Thread .sleep(4000);
        refresh.refresh_2();
        refresh.submit();
        Thread .sleep(4000);
        refresh.refresh_3();
        refresh.submit();
        Thread .sleep(4000);
        refresh.refresh_4();
        refresh.submit();
        Thread .sleep(4000);
        refresh.refresh_5();
        refresh.submit();
        Thread .sleep(4000);
        refresh.refresh_6();
        refresh.submit();
        Thread .sleep(4000);
        refresh.refresh_7();
        refresh.submit();
        Thread .sleep(4000);
        refresh.refresh_8();
        refresh.submit();
        Thread .sleep(4000);
        refresh.refresh_9();
        refresh.submit();
        Thread .sleep(4000);
        refresh.refresh_10();
        refresh.submit();
        Thread .sleep(4000);
        refresh.refresh_11();
        refresh.submit();
        Thread .sleep(4000);
        refresh.refresh_12();
        refresh.submit();
        Thread .sleep(4000);
        refresh.refresh_13();
        refresh.submit();
        Thread .sleep(4000);
        refresh.refresh_14();
        refresh.submit();
        Thread .sleep(4000);
        refresh.refresh_15();
        refresh.submit();
        Thread .sleep(4000);
        refresh.refresh_16();
        refresh.submit();
        Thread .sleep(4000);
        refresh.refresh_17();
        refresh.submit();
        Thread .sleep(4000);
        refresh.refresh_18();
        refresh.submit();
        Thread .sleep(4000);
        refresh.refresh_19();
        refresh.submit();
        Thread .sleep(4000);
        refresh.refresh_20();
        refresh.submit();
        Thread.sleep(5000);*/
    }
}
