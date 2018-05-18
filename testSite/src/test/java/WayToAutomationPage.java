import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class WayToAutomationPage {
    WebDriver driver;
    @FindBy(css="li:nth-of-type(3) [href=\"javascript\\:void\\(0\\)\\;\"]")
    @CacheLookup
    private WebElement sectionCourses;


    @FindBy(css="li:nth-of-type(3) [href=\"selenium\\/training\\/index\\.html\"]")
    @CacheLookup
    private  WebElement itemSelenium;

    @FindBy(css=".dropdown:nth-of-type(3) [href=\"mobile-automation-testing\\/training\\/appium-selendroid-training-noida-delhi-gurgaon\\.html\"]")
    @CacheLookup
    private  WebElement itemAppium;

    @FindBy(css=".dropdown:nth-of-type(3) [href=\"protractor\\/protractor-tutorials\\/protractor-angularjs-training\\.html\"]")
    @CacheLookup
    private  WebElement itemProtractor;

    @FindBy(css=".navbar-nav [href=\"Jmeter Training\\/Jmeter_training_noida_delhi\\.html\"]")
    @CacheLookup
    private  WebElement itemJmeter;

    @FindBy(css=".navbar-nav [href=\"soapui\\/rest-api-webservices-testing-training\\.html\"]")
    @CacheLookup
    private  WebElement itemSoapui;

    @FindBy(css="li:nth-of-type(4) [href=\"javascript\\:void\\(0\\)\\;\"]")
    @CacheLookup
    private  WebElement sectionSelenium;

    @FindBy(css=".navbar-nav [href=\"selenium\\/training\\/online-training-webinars\\.html\"]")
    @CacheLookup
    private  WebElement itemOnlinetraining;

    @FindBy(css=".dropdown:nth-of-type(5) [href=\"javascript\\:void\\(0\\)\\;\"]")
    @CacheLookup
    private  WebElement sectionAppium;

    @FindBy(css=".dropdown:nth-of-type(5) [href=\"mobile-automation-testing\\/training\\/appium-selendroid-training-noida-delhi-gurgaon\\.html\"]")
    @CacheLookup
    private  WebElement itemClassroomtraining;

    @FindBy(css="li:nth-of-type(6) [href=\"javascript\\:void\\(0\\)\\;\"]")
    @CacheLookup
    private  WebElement sectionProtractor;

    @FindBy(css="li:nth-of-type(6) [href=\"protractor\\/protractor-tutorials\\/protractor-angularjs-training\\.html\"]")
    @CacheLookup
    private  WebElement itemVideotutorials;

    public WayToAutomationPage(WebDriver driver)
    {

        PageFactory.initElements(driver, this);
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    public void openPage(String url)
    {
        driver.get(url);
    }

    public void closePage()
    {
        driver.quit();
    }


    public WayToAutomationPage clickToMenuSectionItem(WebElement section, WebElement item)
    {
        Actions builder = new Actions(driver);
        builder.moveToElement(section);
        builder.moveToElement(item);
        builder.click(item).perform();
        return new WayToAutomationPage(driver);
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public WebElement getSectionSelenium()
    {
        return sectionSelenium;
    }

    public WebElement getSectionCourses()
    {
        return sectionCourses;
    }

    public WebElement getSectionAppium()
    {
        return sectionAppium;
    }

    public WebElement getSectionProtractor()
    {
        return sectionProtractor;
    }

    public WebElement getItemSelenium()
    {
        return itemSelenium;
    }

    public WebElement getItemAppium()
    {
        return itemAppium;
    }

    public WebElement getItemProtractor()
    {
        return itemProtractor;
    }

    public WebElement getItemJmeter()
    {
        return itemJmeter;
    }

    public WebElement getItemSoapui()
    {
        return itemSoapui;
    }

    public WebElement getItemOnlinetraining()
    {
        return itemOnlinetraining;
    }

    public WebElement getItemClassroomtraining()
    {
        return itemClassroomtraining;
    }

    public WebElement getItemVideotutorials()
    {
        return itemVideotutorials;
    }


    public void back()
    {
        driver.navigate().back();
    }
}
