import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.time.Duration;
public class comment {
    WebDriver driver = null;

    public void open() {
        //set the driver location
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
        driver = new ChromeDriver();
        //maximize the screen
        driver.manage().window().maximize();
        //set time out 10 seconds
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //open url(our HTML file)
        driver.get("https://facebook.com/");
    }
    public void addComment(String email ,String password, String comment ) throws InterruptedException {
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("pass")).sendKeys(password);
        driver.findElement(By.name("login")).click();
        Thread.sleep(10000);
        driver.get("https://www.facebook.com/Electricvehiclerally/photos/a.209895362890936/1085159255364538/");
        Actions action = new Actions(driver);
        Thread.sleep(5000);
        while (true) {
            action.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div/div[2]/div/div/div/div[1]/div[2]/div/div[2]/div/div[2]/div"))).build().perform();
            Thread.sleep(1000);
            action.click().build().perform();
            action.sendKeys(comment).build().perform();
            Thread.sleep(1000);
            action.sendKeys(Keys.ENTER).build().perform();
            Thread.sleep(2000);
        }
    }
}
