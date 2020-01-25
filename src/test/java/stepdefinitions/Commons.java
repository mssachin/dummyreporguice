package stepdefinitions;

import com.google.inject.Inject;
import io.cucumber.java.en.Given;
import utilities.WebObjectHandlingMethods;

public class Commons {

    @Inject
    private WebObjectHandlingMethods webObjectHandlingMethods;

    @Given("John is in ASOS online shop")
    public void john_is_in_ASOS_online_shop() {
        webObjectHandlingMethods.launchURL();
    }
}
