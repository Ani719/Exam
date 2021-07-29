package Config;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static Config.Driverutils.*;



public class AddStickersToPhotos extends BaseClass{

    @FindBy(css = "[data-test*='action-button-1-Add-Stickers']")
    WebElement primaryButton;
    @FindBy(css = "[data-test='large-library-of-stickers-hypertext']")
    WebElement libraryOfStickersHypertext;
    @FindBy(css = "[data-test*='action-button-2-Free-Stickers']")
    WebElement secondButton;
    @FindBy(css = "[data-test*='Stickers-Online-and-Improve-Your-Designs']")
    WebElement thirdButton;
    @FindBy(css = "[data-test='make-your-own-stickers-hypertext']")
    WebElement makeYourOwnStickersHypertext;
    @FindBy(css = "a[href='/create/remove-background']")
    WebElement hereHyperlink;
    @FindBy(css = "data-test*='action-button-4-Customize-Photo-Stickers-for-Your-Needs']")
    WebElement fourthButton;





    @Override
    public void openPage() {
        driver.get(Configuration.Environment + "/add-stickers-to-photos");

    }

    public void clickPrimaryButton(){
        click(primaryButton);
    }

    public void openFirstHyperLink(){
        scrollDown(libraryOfStickersHypertext);
    }

    public void clickSecondButton(){
        scrollDown(secondButton);
        click(secondButton);
    }

    public void clickThirdButton(){
        scrollDown(thirdButton);
        click(thirdButton);
    }

    public void openSecondHyperlink(){
        scrollDown(makeYourOwnStickersHypertext);
        click(makeYourOwnStickersHypertext);
    }

    public void openThirdHyperLink(){
        scrollDown(hereHyperlink);
        click(hereHyperlink);
    }

    public void clickFourthButton(){
        scrollDown(fourthButton);
        click(fourthButton);
    }




}
