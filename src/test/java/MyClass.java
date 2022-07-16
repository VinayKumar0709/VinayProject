import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MyClass {
    //WebDriver driver1;
    static long startTime = 0;
    static long endTime = 0;
    static long totalTime = 0;

    @BeforeClass
    public static void test1() throws InterruptedException {
        startTime =  System.currentTimeMillis();
    }


    @AfterClass
    public static void tearDown(){
        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;
        System.out.println(totalTime);
    }
}
