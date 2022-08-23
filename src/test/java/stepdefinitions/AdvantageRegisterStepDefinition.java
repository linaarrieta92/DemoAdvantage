package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import drivers.ChromeWebDriver;
import models.Usuario;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import questions.VerificaMensaje;
import tasks.Register;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AdvantageRegisterStepDefinition {

    @When("^register a user$")
    public void registerAUser(List<Usuario> listDatos) {
        theActorInTheSpotlight().attemptsTo(Register.elUsuario(listDatos));

    }

    @Then("^verify the register (.*)$")
    public void verifyTheRegisterMaria(String mensaje) {
        OnStage.theActorInTheSpotlight().should(seeThat(VerificaMensaje.deRegistro(mensaje), Matchers.equalTo(mensaje)));


    }

    @Given("^go to the Advantage page$")
    public void goToTheAdvantagePage(String mensaje) {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("maria").can(BrowseTheWeb.with(ChromeWebDriver.hisDriver()));
        //theActorInTheSpotlight().whoCan(doSomething)

    }
}

