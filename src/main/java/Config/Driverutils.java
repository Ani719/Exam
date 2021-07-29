package Config;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driverutils {

    static String driverPath = "/Users/animanukyan/Downloads/chromedriver";
    public static WebDriver driver;


    public static void initDriver() {
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();

    }


    public static void kill(){
        driver.close();
        driver.quit();
    }
}


