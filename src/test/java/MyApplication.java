import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

//INC34832583
public class MyApplication {

    public static WebDriver driver;
    public static String url = "https://developer.salesforce.com/docs/component-library/documentation/en/48.0/lwc";
    static Date currentDate = new Date();
    public static String dateToStr = DateFormat.getDateInstance().format(currentDate);
    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "/Users/Vinay/Music/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public static void test2() throws InterruptedException {
        System.out.println("Testing");
        waitForElement("//span[@title='Component Reference']");
        WebElement comp = driver.findElement(By.xpath("//a[@title='Component Reference']"));
        if(isElementDisplayed("//span[@title='Component Reference']") == true){
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            executor.executeScript("arguments[0].click();", comp);
        }
        String componetTtile = driver.getTitle();
        Assert.assertEquals(componetTtile,"Components - Salesforce Lightning Component Library");
        driver.findElement(By.xpath("//input[@name='Quick Find']")).sendKeys("datatable");
        WebElement datatable = driver.findElement(By.xpath("//h3[contains(text(),'Light')]//parent::div//child::span[contains(text(),'datatable')]"));
        datatable.click();
        //waitForElement("//table[contains(@class,'table_edit')]");
        driver.findElement(By.xpath("//button[contains(@id,'combobox')]")).click();
        WebElement dp_down = driver.findElement(By.xpath("//button[contains(@id,'combobox')]"));
        dp_down.sendKeys(Keys.ARROW_DOWN);
        dp_down.sendKeys(Keys.ARROW_DOWN);
        dp_down.sendKeys(Keys.ARROW_DOWN);
        dp_down.sendKeys(Keys.RETURN);

        driver.findElement((By.xpath("//button[text()='Run']"))).click();

        WebElement ele1 = driver.findElement(By.xpath("//table[contains(@class,'table_edit')]//tr[3]//th[@data-label='Label']"));
        ele1.click();
        WebElement ele2 = driver.findElement(By.xpath("//table[contains(@class,'table_edit')]//tr[3]//following-sibling::button[3]"));

        String value[]={"Larry Page","https://google.com","(555)-755-6575","TodayDate-12:57 PM","770.54"};
        for(int i=0;i<value.length;i++){
            String buildXpath = "//table[contains(@class,'table_edit')]//tr[3]//following-sibling::button["+(i+1)+"]";
            driver.switchTo().defaultContent();
            driver.switchTo().parentFrame().switchTo().frame(0);
            int size = driver.findElements(By.tagName("iframe")).size();
            driver.switchTo().defaultContent();
            driver.switchTo().frame(1);
            Actions actions = new Actions(driver);
            WebElement ele = driver.findElement(By.xpath(buildXpath));
            actions.moveToElement(ele);
            actions.click().build().perform();
            if(value[i].contains("TodayDate")){
                String[] valueSplitDateAndTime = value[i].split("-");
                driver.findElement(By.xpath("//button[@title='Select a date']")).click();
                driver.findElement(By.xpath("//input[contains(@name,'datetime') and @class='slds-input']")).clear();
                driver.findElement(By.xpath("//input[contains(@name,'datetime') and @class='slds-input']")).sendKeys(dateToStr);
                driver.findElement(By.xpath("//input[contains(@name,'datetime') and contains(@class,'slds-combobox')]")).clear();
                driver.findElement(By.xpath("//input[contains(@name,'datetime') and contains(@class,'slds-combobox')]")).sendKeys(valueSplitDateAndTime[1]);
            }else{
                driver.findElement(By.xpath("//input[contains(@name,'datetime') and contains(@class,'slds-combobox')]")).clear();
                driver.findElement(By.xpath("//input[contains(@name,'datetime') and contains(@class,'slds-combobox')]")).sendKeys(value[i]);
            }
        }

    }


    @AfterClass
    public static void tearDown(){
        driver.quit();
    }

    public static void waitForElement(String xpath){
        WebDriverWait wait=new WebDriverWait(driver,50);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
        //WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    }
    public static boolean isElementDisplayed(String xpath){
        if(driver.findElement(By.xpath(xpath)).isDisplayed()){
            return true;
        }
        return false;
    }
}
