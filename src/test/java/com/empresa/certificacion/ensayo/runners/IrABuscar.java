package com.empresa.certificacion.ensayo.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resourses/features/buscarempleo.feature"
,glue="com.empresa.certificacion.ensayo.stepdefinitions"
,snippets=SnippetType.CAMELCASE

)

public class IrABuscar {

}
