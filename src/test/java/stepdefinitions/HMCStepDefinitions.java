package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HMCPage;
import utilities.ConfigReader;

public class HMCStepDefinitions {
  HMCPage hmcPage=new HMCPage();



    @Given("login linkine tıklar")
    public void login_linkine_tıklar() {
hmcPage.HMCloginButton.click();
    }
    @Then("kullanıcı adı olarak {string} girer")
    public void kullanıcı_adı_olarak_girer(String kullanıcıTipi) {
 hmcPage.userNameTextBox.sendKeys(ConfigReader.getProperty(kullanıcıTipi));
    }
    @Then("password olarak {string} girer")
    public void password_olarak_girer(String passwordTuru) {
hmcPage.passwordTextBox.sendKeys(ConfigReader.getProperty(passwordTuru));
    }
    @Then("Login butonuna basar")
    public void login_butonuna_basar() {

hmcPage.logInButton.click();
    }
    @Then("basarılı olarak giris yapıldıgını test eder")
    public void basarılı_olarak_giris_yapıldıgını_test_eder() {

        Assert.assertTrue(hmcPage.basarılıGırısYazısıElementi.isDisplayed());

    }


    @And("giris yapılamadıgını test eder")
    public void girisYapılamadıgınıTestEder() {
    }


    @And("scenario outline'dan kullanıcı adı olarak {string} yazar")
    public void scenarioOutlineDanKullanıcıAdıOlarakYazar(String username) {
        hmcPage.userNameTextBox.sendKeys(username);
    }

    @And("scenario outline'dan password olarak {string} yazar")
    public void scenarioOutlineDanPasswordOlarakYazar(String password) {
        hmcPage.passwordTextBox.sendKeys(password);
    }
}
