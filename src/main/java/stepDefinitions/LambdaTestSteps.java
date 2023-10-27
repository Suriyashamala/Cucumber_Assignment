package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LambdaTestSteps {
    @Given("navigated to the LambdaTest URL")
    public void navigated_to_the_lambda_test_url() {
        System.out.println("navigated to the LambdaTest URL");
    }
    @When("enter the product name {string} in the search bar")
    public void enter_the_product_name_in_the_search_bar(String productname) {
        System.out.println("enter the product name " + productname + " in the search bar");
    }
    @And("click the {string} button")
    public void click_the_button(String button) {
        System.out.println("click the " + button);
    }
    @And("wait for the page to load")
    public void wait_for_the_page_to_load() {
        System.out.println("wait for the page to load");
    }
    @Then("close the browser")
    public void close_the_browser() {
        System.out.println("close the browser");
    }
    @Then("click the filter option")
    public void click_the_filter_option() {
        System.out.println("click the filter option");
    }

    @And("choose the {string} from the given filter option")
    public void choose_the_from_the_given_filter_option(String filter) {
        System.out.println("choose the" + filter + "from the given filter option");
    }
    @Then("validate the displayed product belong to the selected option")
    public void validate_the_displayed_product_belong_to_the_selected_option() {
        System.out.println("validate the displayed product belong to the selected option");
    }
    @When("search the product name {string} in the search bar")
    public void search_the_product_name_in_the_search_bar(String productname) {
        System.out.println("search the "+productname+" in the search bar");
    }
    @And("validate the search page indicates no relevant result")
    public void validate_the_search_page_indicates_no_relevant_result() {
        System.out.println("validate the search page indicates no relevant result");
    }
    @Then("take a screenshot of the result page")
    public void take_a_screenshot_of_the_result_page() {
        System.out.println("take a screenshot of the result page");
    }
    @When("enter the product name {string}")
    public void enter_the_product_name(String productname) {
        System.out.println("enter the product name "+productname);
    }
    @Then("take a screenshot of the product details page")
    public void take_a_screenshot_of_the_product_details_page() {
        System.out.println("take a screenshot of the product details page");
    }
    @Then("validate the displayed screenshot page belong to the selected loaded page")
    public void validate_the_displayed_screenshot_page_belong_to_the_selected_loaded_page() {
        System.out.println("validate the displayed screenshot page belong to the selected loaded page");
    }
}