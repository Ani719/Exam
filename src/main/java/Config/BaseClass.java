package Config;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;


public  abstract class BaseClass {

    public abstract void openPage();


    public BaseClass() {
        PageFactory.initElements(Driverutils.driver, this);

        }


        protected void click(WebElement element) {
            Wait.getWait().elementToBeClicable(element);
            element.click();
        }



        protected void scrollDown(WebElement element) {
            JavascriptExecutor js = (JavascriptExecutor) Driverutils.driver;
            js.executeScript("arguments[0].scrollIntoView();", element);
        }

    }

