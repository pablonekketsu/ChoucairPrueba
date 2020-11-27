package co.com.chourcair.certification.proyectobase.stepdefinitions;
import co.com.chourcair.certificate.proyectobase.model.AcademyChoucairData;
import co.com.chourcair.certificate.proyectobase.questions.Answer;
import co.com.chourcair.certificate.proyectobase.task.Login;
import co.com.chourcair.certificate.proyectobase.task.OpenUp;
import co.com.chourcair.certificate.proyectobase.task.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class ChoucairAcademyStepDefinitions {

    @Given("^that (.*) wants to learn automation at the academy choucair$")
    public void thatPabloWantsToLearnAutomationAtTheAcademyChoucair(String actor,List<AcademyChoucairData> academyChoucairData){
        theActorCalled(actor).wasAbleTo(OpenUp.thePage(),(Login.onThePage(academyChoucairData.get(0).getStrUser(),academyChoucairData.get(0).getStrPassword())));
    }

    @When("^he search for the course on the Choucair Academy platform$")
    public void heSearchForTheCourseRecursosAutomatizacionBancolombia(List<AcademyChoucairData> academyChoucairData){
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyChoucairData.get(0).getStrCourse()));
    }

    @Then("^he finds the course called$")
    public void heFindsTheCourseCalledResourcesRecursosAutomatizacionBancolombia(List<AcademyChoucairData> academyChoucairData){
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(academyChoucairData.get(0).getStrCourse())));

    }


}
