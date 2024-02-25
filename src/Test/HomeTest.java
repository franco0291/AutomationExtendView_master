package src.Test;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import src.Base.BaseTest;
import src.PageObjects.HomePageObjects;
import src.PageObjects.LoginPageObjects;


public class HomeTest extends BaseTest {


    @Test
    @Parameters({"username","password"})
    public void CHeckLoginWorks(String username, String password){
        HomePageObjects l = new HomePageObjects(driver);
        l.openPage();
        l.clickLoginButton();
        LoginPageObjects Login = new LoginPageObjects(driver);
        Login.FillLoginFields(username, password);
        Login.getLoginButton();
    }

    @Test
    @Parameters({"username","password"})
    public void checkLogoutWorks(String username, String password){
        HomePageObjects l = new HomePageObjects(driver);
        l.openPage();
        l.clickLoginButton();
        LoginPageObjects Login = new LoginPageObjects(driver);
        Login.FillLoginFields(username, password);
        Login.getLoginButton();
        //logout needs to be added
    }

    @Test
    public void footerLinksOpenTest()
    {
        HomePageObjects l = new HomePageObjects(driver);
        l.openPage();
        HomePageObjects home = new HomePageObjects(driver);
        home.checkEachFooterLink();

    }



    @Test
    public void CheckHowitWorksButtonWorks() throws InterruptedException
    {
        HomePageObjects l = new HomePageObjects(driver);
        l.openPage();
        l.clickHowitworksButton();
        Thread.sleep(4000);
//        System.out.println(l.getModalText);
//        Assert.assertEquals(l.getModalText,"Extend View Intro");
    }

    @Test
    public void checkWorkoutsButton() throws InterruptedException {
        HomePageObjects l = new HomePageObjects(driver);
        l.openPage();
//        l.getWorkoutsbutton.click();
//        Thread.sleep(4000);
//        Assert.assertEquals(l.getWorkouttext.getText(),"Workouts To Choose From");
    }


}
