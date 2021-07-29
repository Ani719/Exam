package Config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

    public class Wait {

        private static WebDriverWait webDriverWait;

        public Wait(){
            webDriverWait = new WebDriverWait(Driverutils.driver, 30);
        }

        public static Wait getWait(){
            return new Wait();
        }

        public void elementToBeClicable(WebElement element){
            webDriverWait.until(ExpectedConditions.elementToBeClickable(element));

        }

    }

