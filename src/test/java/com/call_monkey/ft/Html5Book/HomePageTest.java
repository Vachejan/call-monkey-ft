package com.call_monkey.ft.Html5Book;

import com.call_monkey.ft.BaseTest;
import org.testng.annotations.Test;

/**
 * Created by vache on 7/27/17.
 */
public class HomePageTest extends BaseTest {

    @Test
    public void schools  () throws Exception {
        html5BookRuHomePage.open();
        html5BookRuHomePage.clickCssTag();



    }
}
