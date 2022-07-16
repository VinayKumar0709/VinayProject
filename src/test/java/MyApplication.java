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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Files;
import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

//INC34832583
public class MyApplication {

    public static WebDriver driver;
    public static String url = "https://developer.salesforce.com/docs/component-library/documentation/en/48.0/lwc";
    static Date currentDate = new Date();
    public static String dateToStr = DateFormat.getDateInstance().format(currentDate);


    public MyApplication() throws FileNotFoundException {
    }


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
    public static void test2() throws Exception {
        System.out.println("Testing");
        FileReader reader = new FileReader("src/test/java/locatorsFile");
        Properties p = new Properties();
        p.load(reader);
        waitForElement(p.getProperty("componentReference"));
        WebElement comp = driver.findElement(By.xpath(p.getProperty("componentReference")));
        if(isElementDisplayed(p.getProperty("componentReference")) == true){
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            executor.executeScript("arguments[0].click();", comp);
        }


        String componetTtile = driver.getTitle();
        Assert.assertEquals(componetTtile,"Components - Salesforce Lightning Component Library");

        while(driver.findElement(By.id("dismissError")).isDisplayed()){
            driver.navigate().refresh();
        }
        driver.findElement(By.xpath(p.getProperty("quickFind"))).sendKeys("datatable");
        WebElement datatable = driver.findElement(By.xpath(p.getProperty("datatableLightning")));
        datatable.click();
        driver.findElement(By.xpath(p.getProperty("combobox"))).click();
        WebElement dp_down = driver.findElement(By.xpath(p.getProperty("combobox")));
        dp_down.sendKeys(Keys.ARROW_DOWN);
        dp_down.sendKeys(Keys.ARROW_DOWN);
        dp_down.sendKeys(Keys.ARROW_DOWN);
        dp_down.sendKeys(Keys.RETURN);
        driver.findElement((By.xpath("//button[text()='Run']"))).click();
        capTureTheScreenshot("src/test/java/screen.png");

        /*
        Edit the values in the preview table
         */
        String value[]={"Larry Page","https://google.com","(555)-755-6575","TodayDate-12:57 PM","770.54"};

        for(int i=0;i<value.length;i++){
            String buildXpath = "//table[contains(@class,'table_edit')]//tr[3]//following-sibling::button["+(i+1)+"]";
            driver.switchTo().defaultContent();
            driver.switchTo().parentFrame().switchTo().frame(0);
            int size = driver.findElements(By.tagName("iframe")).size();
            driver.switchTo().defaultContent();
            Actions actions = new Actions(driver);
            WebElement ele = driver.findElement(By.xpath(buildXpath));
            actions.moveToElement(ele);
            actions.click().build().perform();
            if(value[i].contains("TodayDate")){
                String[] valueSplitDateAndTime = value[i].split("-");
                driver.findElement(By.xpath(p.getProperty("day"))).clear();
                driver.findElement(By.xpath(p.getProperty("day"))).sendKeys(dateToStr);
                driver.findElement(By.xpath(p.getProperty("time"))).clear();
                driver.findElement(By.xpath(p.getProperty("time"))).sendKeys(valueSplitDateAndTime[1]);
            }else{
                driver.findElement(By.xpath(buildXpath)).clear();
                driver.findElement(By.xpath(buildXpath)).sendKeys(value[i]);
            }
        }
        driver.switchTo().defaultContent();

    }


    @AfterClass
    public static void tearDown(){
        driver.quit();
    }

    public static void waitForElement(String xpath){
        WebDriverWait wait=new WebDriverWait(driver,50);
        WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    }
    public static boolean isElementDisplayed(String xpath){
        if(driver.findElement(By.xpath(xpath)).isDisplayed()){
            return true;
        }
        return false;
    }

    public static void capTureTheScreenshot(String filePath){
        TakesScreenshot scrShot = ((TakesScreenshot)driver);
        File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
        File desFile=new File(filePath);

        try {
            Files.copy(srcFile.toPath(),desFile.toPath());
        }catch (Exception e){

        }

    }
}
