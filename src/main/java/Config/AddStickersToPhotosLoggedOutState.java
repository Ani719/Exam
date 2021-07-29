package Config;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static Config.Driverutils.*;

public class AddStickersToPhotosLoggedOutState extends BaseClass {

    @Override
    public void openPage() {
        driver.get(Configuration.Environment + "/add-stickers-to-photos");
    }

    @FindBy(css = "[data-test*='action-button-1-Add-Stickers']")
    WebElement primaryButton;
    @FindBy(css = "[data-test*='action-button-2-Free-Stickers']")
    WebElement secondButton;
    @FindBy(css = "[data-test*='Stickers-Online-and-Improve-Your-Designs']")
    WebElement thirdButton;
    @FindBy(css = "data-test*='action-button-4-Customize-Photo-Stickers-for-Your-Needs']")
    WebElement fourthButton;
    @FindBy(css = "[data-test='modal root']")
    WebElement ForcedRegistration;


    public void clickPrimaryButton(){
        click(primaryButton);
    }



    public void clickSecondButton(){
        scrollDown(secondButton);
        click(secondButton);
    }

    public void clickThirdButton(){
        scrollDown(thirdButton);
        click(thirdButton);
    }

    public void clickFourthButton(){
        scrollDown(fourthButton);
        click(fourthButton);
    }


}
