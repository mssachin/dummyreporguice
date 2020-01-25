package utilities;

import actions.Base;
import com.google.inject.Singleton;
import org.openqa.selenium.By;

@Singleton
public class WebObjectHandlingMethods extends Base {



    public void launchURL(){
        driver.get("https://www.asos.com/");
    }

    public void enterTextInTextBox(By locator, String textToEnter){
        driver.findElement(locator).sendKeys(textToEnter);
    }

    public void clickLinkOrElement(By locator){
        driver.findElement(locator).click();
    }

    public String getTextOfTheElement(By locator){
        return driver.findElement(locator).getText();
    }

}
