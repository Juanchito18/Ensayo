Feature: Buscar Empleo en la pagina Accenture.
  
  Yo como ususario de la pagina Accenture
  quiero buscar una vacante de tecnologia 
  para aplicar a un empleo disponible.

  @tag1
  Scenario Outline: Buscar vacante de empleo
    Given <name> esta en la pagina <pagina>
    And llega hasta la pagina de busqueda de vacantes
    When buscar el area de su interes <area>
    Then el puede ver el nombre de la <vacante> disponibles.

    Examples: 
    | name		| pagina  				  		  | area 	       | vacante  				|
    |Juan David | https://www.accenture.com/co-es | Analyst        |  People Advisor Analyst|
     
    
     
     
     
     
     
     
     #
     #//div[@class='job-listing-content']//h3[contains (text (), 'People Advisor Analyst')]