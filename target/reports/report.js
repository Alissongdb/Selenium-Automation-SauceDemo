$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LoginSucess.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 4,
  "name": "Acessar o site da orangeHRM e logar com sucesso",
  "description": "",
  "id": "acessar-o-site-da-orangehrm-e-logar-com-sucesso",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 3,
      "name": "@LoginSucess"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "Logar na OrangeHRM",
  "description": "",
  "id": "acessar-o-site-da-orangehrm-e-logar-com-sucesso;logar-na-orangehrm",
  "type": "scenario",
  "keyword": "Cenario"
});
formatter.step({
  "line": 7,
  "name": "que acesso o site da OrangeHRM",
  "keyword": "Dado "
});
formatter.step({
  "line": 8,
  "name": "preencho o campo username",
  "keyword": "E "
});
formatter.step({
  "line": 9,
  "name": "preencho o campo password",
  "keyword": "E "
});
formatter.step({
  "line": 10,
  "name": "clico no botão Login",
  "keyword": "Quando "
});
formatter.step({
  "line": 11,
  "name": "deverá ser aberta a tela de Dashboard",
  "keyword": "Então "
});
formatter.match({
  "location": "LoginSucessSteps.que_acesso_o_site_da_OrangeHRM()"
});
formatter.result({
  "duration": 7926123300,
  "status": "passed"
});
formatter.match({
  "location": "LoginSucessSteps.preencho_o_campo_username()"
});
formatter.result({
  "duration": 61439500,
  "status": "passed"
});
formatter.match({
  "location": "LoginSucessSteps.preencho_o_campo_password()"
});
formatter.result({
  "duration": 104936900,
  "status": "passed"
});
formatter.match({
  "location": "LoginSucessSteps.clico_no_botão_Login()"
});
formatter.result({
  "duration": 53877000,
  "status": "passed"
});
formatter.match({
  "location": "LoginSucessSteps.deverá_ser_aberta_a_tela_de_Dashboard()"
});
formatter.result({
  "duration": 1896841100,
  "status": "passed"
});
});