import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class WayToAutomationTest {
    private WayToAutomationPage page;

    @BeforeClass
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver","C:/chromedriver_win32/chromedriver.exe");
        page = PageFactory.initElements(new ChromeDriver(), WayToAutomationPage.class);
    }


    @Test
    public void navigateToMenuCoursesSelenium () {

       page.openPage("http://way2automation.com");
        page.clickToMenuSectionItem(page.getSectionCourses(),page.getItemSelenium());
      assertThat(page.getTitle(), containsString("Selenium Training") );
    }

    @Test
    public void navigateToMenuCoursesAppium () {

        page.openPage("http://way2automation.com");
        page.clickToMenuSectionItem(page.getSectionCourses(),page.getItemAppium());
       assertThat(page.getTitle(), containsString("Appium Selendroid Training") );
    }

    @Test
    public void navigateToMenuCoursesProtractor () {

        page.openPage("http://way2automation.com");
        page.clickToMenuSectionItem(page.getSectionCourses(),page.getItemProtractor());
       assertThat(page.getTitle(), containsString("Protractor Tutorial") );
    }

    @Test
    public void navigateToMenuCoursesJmeter () {

       page.openPage("http://way2automation.com");
        page.clickToMenuSectionItem(page.getSectionCourses(),page.getItemJmeter());
      assertThat(page.getTitle(), containsString("Selenium Training") );
    }

    @Test
    public void navigateToMenuCoursesSoapui () {

       page.openPage("http://way2automation.com");
        page.clickToMenuSectionItem(page.getSectionCourses(),page.getItemSoapui());
       assertThat(page.getTitle(), containsString("Web services, API Testing training course noida") );
    }

    @Test
    public void navigateToMenuSeleniumOnlinetraing () {
        page.openPage("http://way2automation.com");
        page.clickToMenuSectionItem(page.getSectionSelenium(),page.getItemOnlinetraining());
       assertThat(page.getTitle(), containsString("Best Selenium Training") );
    }

    @Test
    public void navigateToMenuAppiumClassroomtraining () {

       page.openPage("http://way2automation.com");
       page.clickToMenuSectionItem(page.getSectionAppium(),page.getItemClassroomtraining());
       assertThat(page.getTitle(), containsString("Selenium Training in Delhi") );
    }

    @Test
    public void navigateToMenuProtractorVideotutorials () {

        page.openPage("http://way2automation.com");
        page.clickToMenuSectionItem(page.getSectionProtractor(),page.getItemVideotutorials());
       assertThat(page.getTitle(), containsString("Best Selenium Training") );
    }

    @AfterClass
    public void tearDown()
    {
        page.closePage();
    }
}
