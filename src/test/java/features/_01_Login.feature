#Senaryo;
  #1-Siteyi ac
  #2-username ve password u gönderin ve Login butonuna tiklatin
  #3-Login oldugunuzu dogrulayin

  #-Yukaridaki senaryonun Gherkin dilinde yazilmis hali

  Feature: Login Functinality

    Scenario: Login with valid username and password

      Given Navigate to basqar
      When Enter username and password and click login button
      Then User should login successfuly