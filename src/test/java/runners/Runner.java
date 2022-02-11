package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
features ="src/test/resources/features",
        glue = "stepdefinitions",
        tags="@parametreliTest",
        dryRun = false
)


public class Runner {
//Runner class ının body kısmı bos olarak kalıyor


    //dryRun =false yazıldıgında belırlenen tag la etıketlenen tum scenarıo'ları sırasıyla calıstırır
    //dryRun=true yazdıldıgında kodları calıstırmadan eksık steplerı tespıt edıp bıze eksık steplerı rapor eder






}
