package com.empresa.certificacion.ensayo.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class EmpleosLnk extends PageObject {

	public static final Target LNK_EMPLEOS =Target.the("Link para seccion empleos").locatedBy("//span[contains (text (), 'Empleos')]");
	public static final Target LNK_EMP_TECNOLOGIA =Target.the("Link tecnologia").locatedBy("//li[@class=\"col-sm-12 secondary-item\"]//*[contains (text(), 'Ofertas laborales en Tecnología')] ");
	public static final Target LNK_BUSCAR_TECNOLOGIA =Target.the("Link buscar tecnologias").locatedBy("//a[@data-analytics-link-name=\"busca trabajos en technology\"]");
	public static final Target BTN_BUSCAR =Target.the("Boton buscar").locatedBy("//button[@data-analytics-link-name=\"buscar\"]");
		
}
