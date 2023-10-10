package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.LoginPageSucess;
import support.Utils;

public class LoginSucessSteps extends Utils {

    LoginPageSucess loginPageSucess = new LoginPageSucess(driver);

    @Dado("^que acesso o site da SauceDemo$")
    public void que_acesso_o_site_da_SauceDemo()  {

        loginPageSucess.accessWebsite();

    }

    @Dado("^preencho o campo username$")
    public void preencho_o_campo_username()  {

        loginPageSucess.fillFieldUserName();
    }

    @Dado("^preencho o campo password$")
    public void preencho_o_campo_password()  {

        loginPageSucess.fillFieldPassword();
    }

    @Quando("^clico no botão Login$")
    public void clico_no_botão_Login()  {

        loginPageSucess.loginButtonClick();
    }

    @Então("^deverá ser aberta a homePage da SauceDemo$")
    public void deverá_ser_aberta_a_homePage_da_SauceDemo() {

        loginPageSucess.loginSuccess();

    }
}
