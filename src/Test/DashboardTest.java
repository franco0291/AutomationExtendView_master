package src.Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import src.Base.BaseTest;
import src.PageObjects.DashboardPageObjects;
import src.PageObjects.HomePageObjects;
import src.PageObjects.LoginPageObjects;

public class DashboardTest extends BaseTest {


    @Test
    @Parameters({"username","password"})
    public void dashboardListTest(String username, String password)
    {
        HomePageObjects l = new HomePageObjects(driver);
        l.openPage();
        l.clickLoginButton();
        LoginPageObjects Login = new LoginPageObjects(driver);
        Login.FillLoginFields(username, password);
        Login.getLoginButton.click();
        l.clickMyTeams();
        DashboardPageObjects Dash = new DashboardPageObjects(driver);
        Dash.getTextFromList();

    }
}
