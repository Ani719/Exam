package Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static Config.Driverutils.*;

public class HomePage extends BaseClass{

    @FindAll({
            @FindBy(css = "selector1"), @FindBy(css = "selector2")})
    List<WebElement> elements;


    @Override
    public void openPage() {
        driver.get(Configuration.Environment);
    }
}

