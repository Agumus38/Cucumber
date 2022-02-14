package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HerokuappPage;
import utilities.ReusableMethods;

public class HerokuappStepDefinations {
HerokuappPage herokuappPage=new HerokuappPage();
    @When("Add Element butonuna basar")
    public void add_element_butonuna_basar() {
herokuappPage.addButtonElement.click();
    }
    @Then("Delete butonu gorununceye kadar bekler")
    public void delete_butonu_gorununceye_kadar_bekler() {
        ReusableMethods.waitForVisibility(herokuappPage.deleteButtonElement,20);


    }
    @Then("Delete butonunun gorundgunu test eder")
    public void delete_butonunun_gorundgunu_test_eder() {
        Assert.assertTrue(herokuappPage.deleteButtonElement.isDisplayed());
    }
    @Then("Delete butonuna basarak butonu siler")
    public void delete_butonuna_basarak_butonu_siler() {
       herokuappPage.deleteButtonElement.click();

    }






}
