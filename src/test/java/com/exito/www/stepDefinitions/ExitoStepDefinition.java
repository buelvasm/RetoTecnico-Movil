package com.exito.www.stepDefinitions;

import com.exito.www.driver.Driver;
import com.exito.www.models.Registro_Data;
import com.exito.www.questions.ValidarCodigo;
import com.exito.www.task.InicioExitoTask;
import com.exito.www.task.RegistoExitoTask;
import com.exito.www.userinterfaces.RegistroExitoUI;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ExitoStepDefinition {

    @Before
    public void setStage() {
        setTheStage(new OnlineCast());
    }

    @Given("^Que me encuentro en la app de exito$")
    public void queMeEncuentroEnLaAppDeExito() {
        OnStage.theActorCalled("Manuel").can(BrowseTheWeb.with((Driver.appium().on())));
    }

    @When("^Diligencio el formulario de registro$")
    public void diligencioElFormularioDeRegistro(List<Registro_Data> datos) {
        theActorInTheSpotlight().attemptsTo(InicioExitoTask.laApp(), RegistoExitoTask.elRegistro(datos));
    }

    @When("^Valido que se haya enviado el codigo al correo$")
    public void validoQueSeHayaEnviadoElCodigoAlCorreo() {
        OnStage.theActorInTheSpotlight().should(seeThat("No se visualiza el Estado", ValidarCodigo.validarMensaje(), Matchers.equalTo(true)));
    }

}
