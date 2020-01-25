package actions.searchforitem;

import actions.Base;
import com.google.inject.Inject;
import pageobjects.Homepage;
import utilities.WebObjectHandlingMethods;

public class SearchForAnItem extends Base {


    @Inject
    private WebObjectHandlingMethods webObjectHandlingMethods;

    public void searchesForAnItem(String itemType){
        webObjectHandlingMethods.enterTextInTextBox(Homepage.SEARCH_INPUT, itemType);
        webObjectHandlingMethods.clickLinkOrElement(Homepage.SEARCH_BUTTON);
    }
}
