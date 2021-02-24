package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that Brandon wants to learn automation at the Choucair Academy$")
    public void thatBrandonWantsToLearnAutomationAtTheChoucairAcademy() {
        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage());
    }

    @When("^he searches for the course Recursos Automatización Bancolombia on the Choucair Academy platform$")
    public void heSearchesForTheCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcademyPlatform() {

    }

    @Then("^he finds the course called Recursos Automatización Bancolombia$")
    public void heFindsTheCourseCalledRecursosAutomatizacionBancolombia() {

    }

}
