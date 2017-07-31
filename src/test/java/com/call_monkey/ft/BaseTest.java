package com.call_monkey.ft;

import com.call_monkey.ft.factory.WebDriverFactory;
import com.call_monkey.ft.pages.ListAm.ListAmLoginPage;
import com.call_monkey.ft.pages.ListAm.ListRegistrationPage;
import com.call_monkey.ft.pages.ListAm.ListUploImg;
import com.call_monkey.ft.pages.ListAm.Refresh;
import com.call_monkey.ft.pages.Login.LoginPage;
import com.call_monkey.ft.pages.PageBuilder;
import com.call_monkey.ft.pages.Registrasion.AccountRegistrationPage;
import com.call_monkey.ft.pages.Registrasion.CallCentreRegistrationPage;
import com.call_monkey.ft.pages.Html5Book.Html5BookRuHomePage;
import com.call_monkey.ft.utils.SauceLabsListener;
import com.saucelabs.common.SauceOnDemandAuthentication;
import com.saucelabs.common.SauceOnDemandSessionIdProvider;
import com.saucelabs.testng.SauceOnDemandAuthenticationProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;

// Page file imports

@Listeners({SauceLabsListener.class})
public abstract class BaseTest implements SauceOnDemandSessionIdProvider, SauceOnDemandAuthenticationProvider {

    private static final String SAUCE_NAME = "sauce";
    private static final Configuration configuration = Configuration.instance();

    /**
     * Define variables for all pages
     */
    public LoginPage loginPage;
    public AccountRegistrationPage accountRegistrationPage;
    public CallCentreRegistrationPage callCentreRegistrationPage;
    public Html5BookRuHomePage html5BookRuHomePage;
    public ListRegistrationPage listRegistrationPage;
    public ListAmLoginPage listAmLoginPage;
    public ListUploImg listUploImg;
    public Refresh refresh;
    private   ThreadLocal<WebDriver> driver;


    @DataProvider(name = "browsers")
    public static Object[][] browser() {
        return new Object[][]{
                {"chrome", "latest"}
        };
    }

    @Override
    public String getSessionId() {
        final WebDriver driver = webDriver();
        if (driver instanceof RemoteWebDriver) {
            return ((RemoteWebDriver) driver).getSessionId().toString();
        } else {
            return null;
        }
    }

    protected WebDriver webDriver() {
        return driver.get();
    }

    @Override
    public SauceOnDemandAuthentication getAuthentication() {
        final SauceOnDemandAuthentication sauceOnDemandAuthentication = new SauceOnDemandAuthentication();
        sauceOnDemandAuthentication.setUsername(configuration.getUsername());
        sauceOnDemandAuthentication.setAccessKey(configuration.getAccessKey());
        return sauceOnDemandAuthentication;
    }

    @BeforeTest
    public void createPages() {
        driver = new ThreadLocal<>();
        driver.set(WebDriverFactory.createWebDriver());
        // Define page builders, example below
        // homePage = PageBuilder.page(HomePage.class, webDriver()).build();
        loginPage = PageBuilder.page(LoginPage.class, webDriver()).build();
        accountRegistrationPage = PageBuilder.page(AccountRegistrationPage.class, webDriver()).build();
        callCentreRegistrationPage = PageBuilder.page(CallCentreRegistrationPage.class, webDriver()).build();
        html5BookRuHomePage = PageBuilder.page(Html5BookRuHomePage.class, webDriver()).build();
        listRegistrationPage = PageBuilder.page(ListRegistrationPage.class, webDriver()).build();
        listAmLoginPage = PageBuilder.page(ListAmLoginPage.class, webDriver()).build();
        listUploImg = PageBuilder.page(ListUploImg.class, webDriver()).build();
        refresh = PageBuilder.page(Refresh.class, webDriver()).build();
    }


    @AfterTest(alwaysRun = true)
    public void closeBrowser() {
        if (webDriver() != null) {
            webDriver().close();
        }
    }
}


