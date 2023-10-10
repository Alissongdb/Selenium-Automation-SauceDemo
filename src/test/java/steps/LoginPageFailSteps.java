package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import pages.LoginPageFail;
import support.Utils;

public class LoginPageFailSteps extends Utils{

    LoginPageFail loginPageFail = new LoginPageFail(driver);

    @Dado("^que eu acesso o site da SauceDemo$")
    public void que_acesso_o_site_da_SauceDemo()  {

        loginPageFail.accessWebsite();

    }
    @Dado("^eu preencho o campo username$")
    public void preencho_o_campo_username()  {

        loginPageFail.fillFieldUserName();
    }
    @Dado("^eu preencho o campo password incorretamente$")
    public void preencho_o_campo_password_incorretamente()  {

        loginPageFail.fillFieldPassword();
    }

    @Dado("^e clico no botão Login$")
    public void e_clico_no_botão_Login()  {

        loginPageFail.loginButtonClick();
    }

    @Então("^deverá ser apresentada uma mensagem de bloqueio$")
    public void deverá_ser_apresentada_uma_mensagem_de_bloqueio()  {

        loginPageFail.loginFail();
    }
}
