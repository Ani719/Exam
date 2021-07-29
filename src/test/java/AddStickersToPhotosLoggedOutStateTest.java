import Config.Driverutils;
import Config.HomePage;
import Config.AddStickersToPhotosLoggedOutState;
import org.openqa.selenium.Cookie;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;


public class AddStickersToPhotosLoggedOutStateTest {

    @BeforeMethod
    public void initDriver() {
        Driverutils.initDriver();
        HomePage homePage = new HomePage();
        homePage.openPage();
    }

    @Test
    public void test(){
        AddStickersToPhotosLoggedOutState addStickersToPhotosLoggedOutState = new AddStickersToPhotosLoggedOutState();
        addStickersToPhotosLoggedOutState.clickPrimaryButton();
        addStickersToPhotosLoggedOutState.clickSecondButton();
        addStickersToPhotosLoggedOutState.clickThirdButton();
        addStickersToPhotosLoggedOutState.clickFourthButton();
    }

    @AfterMethod
    public void closeDriver(){
        Driverutils.kill();
    }

}



