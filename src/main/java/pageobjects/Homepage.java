package pageobjects;

import org.openqa.selenium.By;

public class Homepage {

    public static final By SEARCH_INPUT = By.cssSelector("input[name='q']");
    public static final By SEARCH_BUTTON = By.cssSelector("button[data-testid='search-button-inline']");
}
