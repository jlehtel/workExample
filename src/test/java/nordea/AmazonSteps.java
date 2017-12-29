package nordea;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AmazonSteps {
    public static WebDriver driver;
    @Given("^an url '(.*)'$")
    public void anUrl(String url) throws Throwable {
        //Change path to your chromedriver.exe, geckodriver etc.
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://"+url);
    }

    @When("^searching for '(.*)'$")
    public void searching(String item) throws Throwable {

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(item);
        driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();

    }

    @When("^sorting by price high to low$")
    public void sorting() throws Throwable {
        WebElement element=driver.findElement(By.xpath("//*[@id=\"sort\"]/option[4]"));
        element.click();
    }

    @Then("^the (.*) result is '(.*)'$")
    public void secondResult(int position, String arg1) throws Throwable {
        position = position-1;
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"result_"+position+"\"]/div/div/div/div[2]/div[1]/div[1]")));
        driver.findElement(By.xpath("//*[@id=\"result_"+position+"\"]/div/div/div/div[2]/div[1]/div[1]")).click();
        String description = driver.findElement(By.id("productTitle")).getText();
        Assert.assertTrue("Item is not a "+arg1,description.contains(arg1));



            }
     @After
    public static void teardown(){
        driver.quit();
     }
}
