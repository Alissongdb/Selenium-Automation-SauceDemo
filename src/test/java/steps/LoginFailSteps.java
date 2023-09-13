package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.LoginPageFail;
import support.Utils;

public class LoginFailSteps extends Utils {

    LoginPageFail loginPageFail = new LoginPageFail(driver);

    @Dado("^que eu acesso o site da OrangeHRM$")
    public void que_acesso_o_site_da_OrangeHRM()  {

        loginPageFail.accessWebsite();


    }

    @Dado("^eu preencho o campo username incorretamente$")
    public void preencho_o_campo_username_incorretamente()  {

        loginPageFail.fillFieldUsernameFail();
    }

    @Dado("^eu preencho o campo password incorretamente$")
    public void preencho_o_campo_password_incorretamente()  {

        loginPageFail.fillFieldPasswordFail();
    }

    @Quando("^eu clico no botão Login$")
    public void clico_no_botão_Login()  {

        loginPageFail.loginButtonClick();
    }

    @Então("^deverá ser apresentada para mim a mensagem de credenciais inválidas$")
    public void deverá_ser_apresentada_a_mensagem_de_credenciais_inválidas()  {
        loginPageFail.loginFail();

    }


}
