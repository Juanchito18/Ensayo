package com.empresa.certificacion.ensayo.tasks;

import com.empresa.certificacion.ensayo.userinterfaces.EmpleosLnk;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;



public class LlegarHasta implements Task {
	

	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(EmpleosLnk.LNK_EMPLEOS),
				Click.on(EmpleosLnk.LNK_EMP_TECNOLOGIA),
				Click.on(EmpleosLnk.LNK_BUSCAR_TECNOLOGIA),
				Click.on(EmpleosLnk.BTN_BUSCAR)
				);
		
	}

	
	public static LlegarHasta laPaginaDeVacantes() {
		
		return Tasks.instrumented(LlegarHasta.class);
	}
}
