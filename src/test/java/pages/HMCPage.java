package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HMCPage {

  public   HMCPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy (xpath = "(//a[@class='nav-link'])[7]")
public WebElement HMCloginButton;


    @FindBy (id="UserName")
    public WebElement userNameTextBox;

    @FindBy(id="Password")
public  WebElement passwordTextBox;

    @FindBy(id="btnSubmit")
public  WebElement logInButton;

@FindBy(xpath = "//span[text()='ListOfUsers']")
public  WebElement basarılıGırısYazısıElementi;

@FindBy(xpath = "//div[@class='validation-summary-errors']")
    public  WebElement gırısYapılamadıYazıElementi;













































}
