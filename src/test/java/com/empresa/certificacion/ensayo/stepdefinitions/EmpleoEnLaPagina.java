package com.empresa.certificacion.ensayo.stepdefinitions;


import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.empresa.certificacion.ensayo.tasks.LlegarHasta;
import com.empresa.certificacion.ensayo.utils.MyDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class EmpleoEnLaPagina {

	@Before
	public void prepararEscenario() {
		OnStage.setTheStage(new OnlineCast());
	}
		//Actor usuario= Actor.named("JuanD");
	
	@Given("^(.*) esta en la pagina (.*)$")
	public void JuanDavidEstaEnLaPagina(String name, String pagina)  {
		
		theActorCalled(name).can(BrowseTheWeb.with(MyDriver.web().abrirLaPagina(pagina)));
		
	}
	
	@Given("^llega hasta la pagina de busqueda de vacantes$")
	public void LlegaHastaLaPaginaDeBusquedaDeVacantes( )  {
		theActorInTheSpotlight().attemptsTo(LlegarHasta.laPaginaDeVacantes());
		
	}
	
	
	@When("^buscar el area de su interes (.*)$")
	public void BuscarElAreaDeSuInteres(String area)  {
		
	}

	@Then("^el puede ver el nombre de la (.*) disponibles.$")
	public void ElpuedeVerElNombreDeLaVacanteDisponibles(String vacante) {
	   
	}
	
}
