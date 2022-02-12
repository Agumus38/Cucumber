package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
features ="src/test/resources/features",
        glue = "src/test/java/stepdefinitions",
        tags="@Editor",
        dryRun = true

)


public class Runner {
//Runner class ının body kısmı bos olarak kalıyor


    //dryRun =false yazıldıgında belırlenen tag la etıketlenen tum scenarıo'ları sırasıyla calıstırır
    //dryRun=true yazdıldıgında kodları calıstırmadan eksık steplerı tespıt edıp bıze eksık steplerı rapor eder

//features ve glue olarak spesıfık bır class veya feature dosyasını degıl
    //tum klasor ve package sectık dolasıyla stepdefinitons package
    //içerisinde hangi class da olursa olsun
    //ısımıze yarayan bır stepdefınıtıon varsa rahatlıkla kullanabılırız






}
