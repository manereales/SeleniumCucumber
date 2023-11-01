package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GooglePage;

public class GoogleSteps{

    GooglePage google = new GooglePage();
    
    @Given("^I am on the Google$")
    public void navigate(){
        google.navigateToGoogle();  
    }

     @When("^I enter a search creteria$")
    public void Buscar(){
      google.enterSearchCriterio("El Salvador");
    }

    @And("^click on the search buttom$")
     public void click(){
      google.click();
    }

     @Then("^the results match the criterias$")
    public void Resultados(){

    }

}