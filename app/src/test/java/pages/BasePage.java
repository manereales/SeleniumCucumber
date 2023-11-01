package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;



public class BasePage {
    
    protected static WebDriver driver;
    private static WebDriverWait wait;
    private static Actions action;
    


    static{

        System.setProperty("webdriver.chrome.driver", "C://Users//maner//Downloads//chromdriver118//chromedriver-win64//chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
       
    }

    public BasePage(WebDriver driver){
        BasePage.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(60));
    }

    public static void navigateTo(String url){
        driver.get(url);
        wait = new WebDriverWait(driver, Duration.ofSeconds(60, 1));
    }

    private WebElement find(String locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    public void clickElement(String locator){
        find(locator).click();
    }

    public void writeElement(String locator, String textToWrite )
    {
        
        find(locator).sendKeys(textToWrite);
    }

    public void SelectFromDropdownValue(String locator, String valuetoSelect){
        Select dropdown = new Select(find(locator));

        dropdown.selectByValue(valuetoSelect);  

    }

    public void SelectToIndex(String locator, int valuetoSelect){
        Select dropdown = new Select(find(locator));

        dropdown.selectByIndex(valuetoSelect);  
        
    }

      public void SelectToText(String locator, String valuetoSelect){
        Select dropdown = new Select(find(locator));

        dropdown.selectByVisibleText(valuetoSelect);  
        
    }

    public void hoverOverElement(String locator){
        action.moveToElement(find(locator));
    }

    public void dobleClick(String locator){
        action.doubleClick(find(locator));
    }

    public void rightClick(String locator){
        action.contextClick(find(locator));
    }
}

