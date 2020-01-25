package stepdefinitions;

import actions.searchforitem.SearchForAnItem;
import com.google.inject.Inject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.WebObjectHandlingMethods;

public class AddItemToCart {

    @Inject
    private SearchForAnItem searchForAnItem;


    @Given("John has searched for a {string} item")
    public void john_has_searched_for_a_item(String itemType) {
        searchForAnItem.searchesForAnItem(itemType);
    }

    @When("John adds the item to the cart")
    public void john_adds_the_item_to_the_cart() {

    }

    @Then("John can see his item in the cart")
    public void john_can_see_his_item_in_the_cart() {

    }

}
