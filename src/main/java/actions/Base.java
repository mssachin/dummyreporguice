package actions;

import com.google.inject.Singleton;
import cucumber.runtime.java.guice.ScenarioScoped;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@ScenarioScoped
@Singleton
public class Base {

    protected WebDriver driver;


    public Base() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//src//main//resources//chromedriver.exe");
        this.driver = new ChromeDriver();
    }
}
