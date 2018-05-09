import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestCases {
    WebDriver driver;
@BeforeClass
    public void setUp()
{
    System.setProperty("webdriver.chrome.driver","C:/chromedriver_win32/chromedriver.exe");
    driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
}


@Test
public void sughinWayToAutomationWebsite()
{
    driver.get("http://way2automation.com/way2auto_jquery/index.php");
    WebElement sighinButton = driver.findElement(By.xpath("/html//div[@id='load_box']/form[@id='load_form']//a[@href='#login']"));
    sighinButton.click();
    WebElement loginField = driver.findElement(By.xpath("//div[@id='login']/form[@id='load_form']//input[@name='username']"));
    loginField.sendKeys("alala");
    WebElement passwordField = driver.findElement(By.xpath("//div[@id='login']/form[@id='load_form']//input[@name='password']"));
    passwordField.sendKeys("zaq1XSW@");
    WebElement submitButton = driver.findElement(By.xpath("//div[@id='login']/form[@id='load_form']//input[@value='Submit']"));
    submitButton.click();
}

    @Test
    public void navigateWayToAutomationWebsite()
    {
        driver.get("way2automation.com");
        WebElement alertButton = driver.findElement(By.xpath("/html//div[@id='load_box']/form[@id='load_form']//a[@href='#login']"));
        alertButton.click();
        WebElement framesaAndWindowsButton = driver.findElement(By.xpath("/html//div[@id='load_box']/form[@id='load_form']//a[@href='#login']"));
        framesaAndWindowsButton.click();
    }

@AfterClass
        public void tearDown()
{
    driver.close();
}
}
