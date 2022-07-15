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

//INC34832583
public class MyClass {
    //WebDriver driver1;
    static long startTime = 0;
    static long endTime = 0;
    static long totalTime = 0;

    @BeforeClass
    public static void test1() throws InterruptedException {
        startTime =  System.currentTimeMillis();
    }

    @Test
    public static void test2(){
        System.setProperty("webdriver.chrome.driver", "/Users/Vinay/Music/chromedriver_win32/chromedriver.exe");
        ChromeDriver driver;
        driver = new ChromeDriver();
        driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ttestfirstlast@gmail.com");
        driver.findElement(By.xpath("//div[@id='identifierNext']")).click();
        WebDriverWait wait=new WebDriverWait(driver,20);
        WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("vinay9703334720");
        driver.findElement(By.xpath("//div[@id='passwordNext']")).click();
        WebDriverWait wait1=new WebDriverWait(driver,20);
        WebElement element1=wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id=':2a']//tr")));
        driver.findElement(By.xpath("//table[@id=':2a']//tr")).click();
        driver.navigate().back();
        driver.getTitle();
        driver.quit();
    }

    @Test
    public static void test3(){
        System.setProperty("webdriver.chrome.driver", "/Users/Vinay/Music/chromedriver_win32/chromedriver.exe");
        ChromeDriver driver;
        driver = new ChromeDriver();
        driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ttestfirstlast@gmail.com");
        driver.findElement(By.xpath("//div[@id='identifierNext']")).click();
        WebDriverWait wait=new WebDriverWait(driver,20);
        WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("vinay9703334720");
        driver.findElement(By.xpath("//div[@id='passwordNext']")).click();
        WebDriverWait wait1=new WebDriverWait(driver,20);
        WebElement element1=wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id=':2a']//tr")));
        driver.findElement(By.xpath("//table[@id=':2a']//tr")).click();
        driver.navigate().back();
        driver.getTitle();
        driver.quit();
    }

    @Test
    public static void test4(){
        System.setProperty("webdriver.chrome.driver", "/Users/Vinay/Music/chromedriver_win32/chromedriver.exe");
        ChromeDriver driver;
        driver = new ChromeDriver();
        driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ttestfirstlast@gmail.com");
        driver.findElement(By.xpath("//div[@id='identifierNext']")).click();
        WebDriverWait wait=new WebDriverWait(driver,20);
        WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("vinay9703334720");
        driver.findElement(By.xpath("//div[@id='passwordNext']")).click();
        WebDriverWait wait1=new WebDriverWait(driver,20);
        WebElement element1=wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id=':2a']//tr")));
        driver.findElement(By.xpath("//table[@id=':2a']//tr")).click();
        driver.navigate().back();
        driver.getTitle();
        driver.quit();
    }

    @Test
    public static void test5(){
        System.setProperty("webdriver.chrome.driver", "/Users/Vinay/Music/chromedriver_win32/chromedriver.exe");
        ChromeDriver driver;
        driver = new ChromeDriver();
        driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ttestfirstlast@gmail.com");
        driver.findElement(By.xpath("//div[@id='identifierNext']")).click();
        WebDriverWait wait=new WebDriverWait(driver,20);
        WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("vinay9703334720");
        driver.findElement(By.xpath("//div[@id='passwordNext']")).click();
        WebDriverWait wait1=new WebDriverWait(driver,20);
        WebElement element1=wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id=':2a']//tr")));
        driver.findElement(By.xpath("//table[@id=':2a']//tr")).click();
        driver.navigate().back();
        driver.getTitle();
        driver.quit();
    }
    @Test
    public static void test6(){
        System.setProperty("webdriver.chrome.driver", "/Users/Vinay/Music/chromedriver_win32/chromedriver.exe");
        ChromeDriver driver;
        driver = new ChromeDriver();
        driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ttestfirstlast@gmail.com");
        driver.findElement(By.xpath("//div[@id='identifierNext']")).click();
        WebDriverWait wait=new WebDriverWait(driver,20);
        WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("vinay9703334720");
        driver.findElement(By.xpath("//div[@id='passwordNext']")).click();
        WebDriverWait wait1=new WebDriverWait(driver,20);
        WebElement element1=wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id=':2a']//tr")));
        driver.findElement(By.xpath("//table[@id=':2a']//tr")).click();
        driver.navigate().back();
        driver.getTitle();
        driver.quit();
    }
    @Test
    public static void test7(){
        System.setProperty("webdriver.chrome.driver", "/Users/Vinay/Music/chromedriver_win32/chromedriver.exe");
        ChromeDriver driver;
        driver = new ChromeDriver();
        driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ttestfirstlast@gmail.com");
        driver.findElement(By.xpath("//div[@id='identifierNext']")).click();
        WebDriverWait wait=new WebDriverWait(driver,20);
        WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("vinay9703334720");
        driver.findElement(By.xpath("//div[@id='passwordNext']")).click();
        WebDriverWait wait1=new WebDriverWait(driver,20);
        WebElement element1=wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id=':2a']//tr")));
        driver.findElement(By.xpath("//table[@id=':2a']//tr")).click();
        driver.navigate().back();
        driver.getTitle();
        driver.quit();
    }
    @Test
    public static void test8(){
        System.setProperty("webdriver.chrome.driver", "/Users/Vinay/Music/chromedriver_win32/chromedriver.exe");
        ChromeDriver driver;
        driver = new ChromeDriver();
        driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ttestfirstlast@gmail.com");
        driver.findElement(By.xpath("//div[@id='identifierNext']")).click();
        WebDriverWait wait=new WebDriverWait(driver,20);
        WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("vinay9703334720");
        driver.findElement(By.xpath("//div[@id='passwordNext']")).click();
        WebDriverWait wait1=new WebDriverWait(driver,20);
        WebElement element1=wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id=':2a']//tr")));
        driver.findElement(By.xpath("//table[@id=':2a']//tr")).click();
        driver.navigate().back();
        driver.getTitle();
        driver.quit();
    }
    @Test
    public static void test9(){
        System.setProperty("webdriver.chrome.driver", "/Users/Vinay/Music/chromedriver_win32/chromedriver.exe");
        ChromeDriver driver;
        driver = new ChromeDriver();
        driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ttestfirstlast@gmail.com");
        driver.findElement(By.xpath("//div[@id='identifierNext']")).click();
        WebDriverWait wait=new WebDriverWait(driver,20);
        WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("vinay9703334720");
        driver.findElement(By.xpath("//div[@id='passwordNext']")).click();
        WebDriverWait wait1=new WebDriverWait(driver,20);
        WebElement element1=wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id=':2a']//tr")));
        driver.findElement(By.xpath("//table[@id=':2a']//tr")).click();
        driver.navigate().back();
        driver.getTitle();
        driver.quit();
    }
    /*@Test
    public static void test10(){
        System.setProperty("webdriver.chrome.driver", "/Users/Vinay/Music/chromedriver_win32/chromedriver.exe");
        ChromeDriver driver;
        driver = new ChromeDriver();
        driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ttestfirstlast@gmail.com");
        driver.findElement(By.xpath("//div[@id='identifierNext']")).click();
        WebDriverWait wait=new WebDriverWait(driver,20);
        WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("vinay9703334720");
        driver.findElement(By.xpath("//div[@id='passwordNext']")).click();
        WebDriverWait wait1=new WebDriverWait(driver,20);
        WebElement element1=wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id=':2a']//tr")));
        driver.findElement(By.xpath("//table[@id=':2a']//tr")).click();
        driver.navigate().back();
        driver.getTitle();
        driver.quit();
    }
    @Test
    public static void test11(){
        System.setProperty("webdriver.chrome.driver", "/Users/Vinay/Music/chromedriver_win32/chromedriver.exe");
        ChromeDriver driver;
        driver = new ChromeDriver();
        driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ttestfirstlast@gmail.com");
        driver.findElement(By.xpath("//div[@id='identifierNext']")).click();
        WebDriverWait wait=new WebDriverWait(driver,20);
        WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("vinay9703334720");
        driver.findElement(By.xpath("//div[@id='passwordNext']")).click();
        WebDriverWait wait1=new WebDriverWait(driver,20);
        WebElement element1=wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id=':2a']//tr")));
        driver.findElement(By.xpath("//table[@id=':2a']//tr")).click();
        driver.navigate().back();
        driver.getTitle();
        driver.quit();
    }
    @Test
    public static void test12(){
        System.setProperty("webdriver.chrome.driver", "/Users/Vinay/Music/chromedriver_win32/chromedriver.exe");
        ChromeDriver driver;
        driver = new ChromeDriver();
        driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ttestfirstlast@gmail.com");
        driver.findElement(By.xpath("//div[@id='identifierNext']")).click();
        WebDriverWait wait=new WebDriverWait(driver,20);
        WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("vinay9703334720");
        driver.findElement(By.xpath("//div[@id='passwordNext']")).click();
        WebDriverWait wait1=new WebDriverWait(driver,20);
        WebElement element1=wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id=':2a']//tr")));
        driver.findElement(By.xpath("//table[@id=':2a']//tr")).click();
        driver.navigate().back();
        driver.getTitle();
        driver.quit();
    }
    @Test
    public static void test13(){
        System.setProperty("webdriver.chrome.driver", "/Users/Vinay/Music/chromedriver_win32/chromedriver.exe");
        ChromeDriver driver;
        driver = new ChromeDriver();
        driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ttestfirstlast@gmail.com");
        driver.findElement(By.xpath("//div[@id='identifierNext']")).click();
        WebDriverWait wait=new WebDriverWait(driver,20);
        WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("vinay9703334720");
        driver.findElement(By.xpath("//div[@id='passwordNext']")).click();
        WebDriverWait wait1=new WebDriverWait(driver,20);
        WebElement element1=wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id=':2a']//tr")));
        driver.findElement(By.xpath("//table[@id=':2a']//tr")).click();
        driver.navigate().back();
        driver.getTitle();
        driver.quit();
    }
    @Test
    public static void test14(){
        System.setProperty("webdriver.chrome.driver", "/Users/Vinay/Music/chromedriver_win32/chromedriver.exe");
        ChromeDriver driver;
        driver = new ChromeDriver();
        driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ttestfirstlast@gmail.com");
        driver.findElement(By.xpath("//div[@id='identifierNext']")).click();
        WebDriverWait wait=new WebDriverWait(driver,20);
        WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("vinay9703334720");
        driver.findElement(By.xpath("//div[@id='passwordNext']")).click();
        WebDriverWait wait1=new WebDriverWait(driver,20);
        WebElement element1=wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id=':2a']//tr")));
        driver.findElement(By.xpath("//table[@id=':2a']//tr")).click();
        driver.navigate().back();
        driver.getTitle();
        driver.quit();
    }
    @Test
    public static void test15(){
        System.setProperty("webdriver.chrome.driver", "/Users/Vinay/Music/chromedriver_win32/chromedriver.exe");
        ChromeDriver driver;
        driver = new ChromeDriver();
        driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ttestfirstlast@gmail.com");
        driver.findElement(By.xpath("//div[@id='identifierNext']")).click();
        WebDriverWait wait=new WebDriverWait(driver,20);
        WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("vinay9703334720");
        driver.findElement(By.xpath("//div[@id='passwordNext']")).click();
        WebDriverWait wait1=new WebDriverWait(driver,20);
        WebElement element1=wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id=':2a']//tr")));
        driver.findElement(By.xpath("//table[@id=':2a']//tr")).click();
        driver.navigate().back();
        driver.getTitle();
        driver.quit();
    }
    @Test
    public static void test16(){
        System.setProperty("webdriver.chrome.driver", "/Users/Vinay/Music/chromedriver_win32/chromedriver.exe");
        ChromeDriver driver;
        driver = new ChromeDriver();
        driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ttestfirstlast@gmail.com");
        driver.findElement(By.xpath("//div[@id='identifierNext']")).click();
        WebDriverWait wait=new WebDriverWait(driver,20);
        WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("vinay9703334720");
        driver.findElement(By.xpath("//div[@id='passwordNext']")).click();
        WebDriverWait wait1=new WebDriverWait(driver,20);
        WebElement element1=wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id=':2a']//tr")));
        driver.findElement(By.xpath("//table[@id=':2a']//tr")).click();
        driver.navigate().back();
        driver.getTitle();
        driver.quit();
    }
    @Test
    public static void test17(){
        System.setProperty("webdriver.chrome.driver", "/Users/Vinay/Music/chromedriver_win32/chromedriver.exe");
        ChromeDriver driver;
        driver = new ChromeDriver();
        driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ttestfirstlast@gmail.com");
        driver.findElement(By.xpath("//div[@id='identifierNext']")).click();
        WebDriverWait wait=new WebDriverWait(driver,20);
        WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("vinay9703334720");
        driver.findElement(By.xpath("//div[@id='passwordNext']")).click();
        WebDriverWait wait1=new WebDriverWait(driver,20);
        WebElement element1=wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id=':2a']//tr")));
        driver.findElement(By.xpath("//table[@id=':2a']//tr")).click();
        driver.navigate().back();
        driver.getTitle();
        driver.quit();
    }*/

    @AfterClass
    public static void tearDown(){
        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;
        System.out.println(totalTime);
    }
}
