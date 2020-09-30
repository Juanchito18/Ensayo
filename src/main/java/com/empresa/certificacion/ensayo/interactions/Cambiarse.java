package com.empresa.certificacion.ensayo.interactions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.Set;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class Cambiarse implements Interaction{
	
	private String nombreVentana;

	
	
	public Cambiarse(String nombreVentana) {
		
		this.nombreVentana = nombreVentana;
	}

	public <T extends Actor> void performAs(T actor) {
		Set <String> handles = BrowseTheWeb.as(actor).getDriver().getWindowHandles();
		for(String handle: handles) {
			if (BrowseTheWeb.as(actor).getDriver().switchTo().window(handle).getTitle().equals(nombreVentana)) {
			break;	
			}
		}
	}
	
	public static Cambiarse deVentana(String nombreVentana) {
		return instrumented(Cambiarse.class, nombreVentana);
		
	}
	

}
