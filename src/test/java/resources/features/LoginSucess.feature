# language: pt

  @LoginSucess
  Funcionalidade: Acessar o site da SauceDemo e logar com sucesso

    Cenario: Logar na SauceDemo
      Dado que acesso o site da SauceDemo
      E preencho o campo username
      E preencho o campo password
      Quando clico no botão Login
      Então deverá ser aberta a homePage da SauceDemo