# language: pt

  @LoginFail
  Funcionalidade: Erro ao acessar o site da orangeHRM

  Cenario: Não logar na OrangeHRM

    Dado que eu acesso o site da OrangeHRM
    E eu preencho o campo username incorretamente
    E eu preencho o campo password incorretamente
    Quando eu clico no botão Login
    Então deverá ser apresentada para mim a mensagem de credenciais inválidas