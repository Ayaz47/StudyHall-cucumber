package guru_99_insurance.pages.step_definitions;

import guru_99_insurance.pages.pages.HomePage;
import guru_99_insurance.pages.util.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class StepDefinitions {
    HomePage homePage= new HomePage();

    @When("The user wants to go to guru99 insurance project")
    public void the_user_wants_to_go_to_guru99_insurance_project() {
    homePage.clickRegisterButton();

    }
    @Then("The user wants to verify that the user is on the insurance page")
    public void the_user_wants_to_verify_that_the_user_is_on_the_insurance_page() {

    }
}
