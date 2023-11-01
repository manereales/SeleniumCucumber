package steps;


import io.cucumber.java.en.*;
import pages.SandBoxPage;

public class TestSandBoxSteps {
    SandBoxPage google = new SandBoxPage();
    
    @Given("^I Navigate to the SandBox Page$")
    public void navigate(){
        google.navigateToGoogle();  
    }

   /*@When("^I Click in the Dropdown$")
    public void click(){
      google.Clickdropdown();
    }*/

     @And("^Select a value from the dropdown$")
    public void ClickdropdownValue(){
      google.Dropdown(1);
    }
}
