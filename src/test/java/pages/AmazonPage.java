package pages;

import org.checkerframework.checker.signature.qual.FieldDescriptor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPages {

public AmazonPages(){
    PageFactory.initElements(Driver.getDriver(),this);
}
@FindBy(id="twotabsearchtextbox")
    public WebElement searchBox;

    @FindBy(xpath = "(//div[@class='a-section a-spacing-small a-spacing-top-small'])[1]")
    public WebElement resultTextElement;

}
