$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LoginFail.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 4,
  "name": "Acessar o site da SauceDemo e logar com falha",
  "description": "",
  "id": "acessar-o-site-da-saucedemo-e-logar-com-falha",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 3,
      "name": "@LoginFail"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "Logar na SauceDemo com falha",
  "description": "",
  "id": "acessar-o-site-da-saucedemo-e-logar-com-falha;logar-na-saucedemo-com-falha",
  "type": "scenario",
  "keyword": "Cenario"
});
formatter.step({
  "line": 7,
  "name": "que eu acesso o site da SauceDemo",
  "keyword": "Dado "
});
formatter.step({
  "line": 8,
  "name": "eu preencho o campo username",
  "keyword": "E "
});
formatter.step({
  "line": 9,
  "name": "eu preencho o campo password incorretamente",
  "keyword": "E "
});
formatter.step({
  "line": 10,
  "name": "clico no botão Login",
  "keyword": "E "
});
formatter.step({
  "line": 11,
  "name": "deverá ser apresentada uma mensagem de bloqueio",
  "keyword": "Então "
});
formatter.match({
  "location": "LoginPageFailSteps.que_acesso_o_site_da_SauceDemo()"
});
formatter.result({
  "duration": 664447100,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageFailSteps.preencho_o_campo_username()"
});
formatter.result({
  "duration": 130911300,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageFailSteps.preencho_o_campo_password_incorretamente()"
});
formatter.result({
  "duration": 79407900,
  "status": "passed"
});
formatter.match({
  "location": "LoginSucessSteps.clico_no_botão_Login()"
});
formatter.result({
  "duration": 80543800,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageFailSteps.deverá_ser_apresentada_uma_mensagem_de_bloqueio()"
});
formatter.result({
  "duration": 107179800,
  "status": "passed"
});
formatter.uri("LoginSucess.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 4,
  "name": "Acessar o site da SauceDemo e logar com sucesso",
  "description": "",
  "id": "acessar-o-site-da-saucedemo-e-logar-com-sucesso",
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
  "name": "Logar na SauceDemo",
  "description": "",
  "id": "acessar-o-site-da-saucedemo-e-logar-com-sucesso;logar-na-saucedemo",
  "type": "scenario",
  "keyword": "Cenario"
});
formatter.step({
  "line": 7,
  "name": "que acesso o site da SauceDemo",
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
  "name": "deverá ser aberta a homePage da SauceDemo",
  "keyword": "Então "
});
formatter.match({
  "location": "LoginSucessSteps.que_acesso_o_site_da_SauceDemo()"
});
formatter.result({
  "duration": 193520000,
  "status": "passed"
});
formatter.match({
  "location": "LoginSucessSteps.preencho_o_campo_username()"
});
formatter.result({
  "duration": 87482400,
  "status": "passed"
});
formatter.match({
  "location": "LoginSucessSteps.preencho_o_campo_password()"
});
formatter.result({
  "duration": 75890400,
  "status": "passed"
});
formatter.match({
  "location": "LoginSucessSteps.clico_no_botão_Login()"
});
formatter.result({
  "duration": 108560200,
  "status": "passed"
});
formatter.match({
  "location": "LoginSucessSteps.deverá_ser_aberta_a_homePage_da_SauceDemo()"
});
formatter.result({
  "duration": 101690400,
  "status": "passed"
});
});