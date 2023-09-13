# language: pt

  @LoginSucess
  Funcionalidade: Acessar o site da orangeHRM e logar com sucesso

    Cenario: Logar na OrangeHRM
      Dado que acesso o site da OrangeHRM
      E preencho o campo username
      E preencho o campo password
      Quando clico no botão Login
      Então deverá ser aberta a tela de Dashboard