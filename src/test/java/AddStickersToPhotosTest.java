import Config.Configuration;
import Config.Driverutils;
import Config.AddStickersToPhotos;
import Config.HomePage;
import org.openqa.selenium.Cookie;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;


public class AddStickersToPhotosTest{

    @BeforeMethod
    public void initDriver(){
        Driverutils.initDriver();
        HomePage homePage = new HomePage();
        homePage.openPage();
        Driverutils.driver.manage().addCookie(new Cookie("user_key", "8a0ade4e-a203-4bbe-8fb0-59e9613cde49"));
        Driverutils.driver.navigate().refresh();

    }

    @Test
    public void test(){
        AddStickersToPhotos addStickersToPhotos = new AddStickersToPhotos();
        addStickersToPhotos.openPage();
        addStickersToPhotos.clickPrimaryButton();
        assertEquals("https://picsartstage2.com/create/editor?category=stickers", "https://picsartstage2.com/create/editor?category=stickers");
        addStickersToPhotos.openPage();
        addStickersToPhotos.openFirstHyperLink();
        assertEquals("https://picsartstage2.com/stickers", "https://picsartstage2.com/stickers");
        addStickersToPhotos.openPage();
        addStickersToPhotos.clickSecondButton();
        assertEquals("https://picsartstage2.com/create/editor?category=stickers", "https://picsartstage2.com/create/editor?category=stickers");
        addStickersToPhotos.openPage();
        addStickersToPhotos.clickThirdButton();
        assertEquals("https://picsartstage2.com/create/editor?category=stickers", "https://picsartstage2.com/create/editor?category=stickers");
        addStickersToPhotos.openPage();
        addStickersToPhotos.openSecondHyperlink();
        assertEquals("https://picsartstage2.com/sticker-maker", "https://picsartstage2.com/sticker-maker");
        addStickersToPhotos.openThirdHyperLink();
        assertEquals("https://picsartstage2.com/create/batch","https://picsartstage2.com/create/batch");
        addStickersToPhotos.openPage();
        addStickersToPhotos.clickFourthButton();
        assertEquals("https://picsartstage2.com/create/editor?category=stickers", "https://picsartstage2.com/create/editor?category=stickers");



    }

    @AfterMethod
    public void closeDriver(){
        Driverutils.kill();
    }



}
