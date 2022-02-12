package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitios {
  AmazonPage amazonPages=new AmazonPage();
    @Given("kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("AmazonUrl"));
    }
    @Given("iPhone icin arama yapar")
    public void i_phone_icin_arama_yapar() {
amazonPages.searchBox.sendKeys("iPhone"+ Keys.ENTER);
    }
    @Then("sonuclarin iPhone icerdigini test eder")
    public void sonuclarin_i_phone_icerdigini_test_eder() {
String actualResult= amazonPages.resultTextElement.getText();
String expectedResult="iPhone";

        Assert.assertTrue(actualResult.contains(expectedResult));
    }
    @Given("tea pot icin arama yapar")
    public void tea_pot_icin_arama_yapar() {
        amazonPages.searchBox.sendKeys("tea pot"+ Keys.ENTER);
    }
    @Then("sonuclarin tea pot icerdigini test eder")
    public void sonuclarin_tea_pot_icerdigini_test_eder() {
        String actualResult= amazonPages.resultTextElement.getText();
        String expectedResult="tea pot";

        Assert.assertTrue(actualResult.contains(expectedResult));
    }
    @Given("flower icin arama yapar")
    public void flower_icin_arama_yapar() {
        amazonPages.searchBox.sendKeys("flower"+ Keys.ENTER);
    }
    @Then("sonuclarin flower icerdigini test eder")
    public void sonuclarin_flower_icerdigini_test_eder() {
        String actualResult= amazonPages.resultTextElement.getText();
        String expectedResult="flower";

        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Given("{string} icin arama yapar")
    public void icin_arama_yapar(String arananKelime) {
        amazonPages.searchBox.sendKeys(arananKelime+ Keys.ENTER);
    }
    @Then("sonuclarin {string} icerdigini test eder")
    public void sonuclarin_icerdigini_test_eder(String arananKelime) {
      String actualResult=amazonPages.resultTextElement.getText();
      Assert.assertTrue(actualResult.contains(arananKelime));
    }


    @And("sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }

    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));

    }






}








