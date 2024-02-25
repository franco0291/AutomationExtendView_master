package src.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import src.Base.BasePage;

public class TeamPageObjects {




    public class MyWorkoutsPageObjects extends BasePage {
        @FindBy(css = ".text-primary [data-toggle]")
        WebElement viewKeyFeaturesButton;

        @FindBy(xpath = "//*[@id='create-new-program-button']")
        WebElement CreateNewProgramButton;

        @FindBy(css=".loading-overlay")
        WebElement loadingOverlay;



        public MyWorkoutsPageObjects(WebDriver driver)
        {
            super(driver);
            PageFactory.initElements(driver, this);
        }


    }
}
