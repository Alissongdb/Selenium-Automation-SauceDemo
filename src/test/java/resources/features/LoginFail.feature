# language: pt

@LoginFail
Funcionalidade: Acessar o site da SauceDemo e logar com falha

  Cenario: Logar na SauceDemo com falha
    Dado que eu acesso o site da SauceDemo
    E eu preencho o campo username
    E eu preencho o campo password incorretamente
    E clico no botão Login
    Então deverá ser apresentada uma mensagem de bloqueio