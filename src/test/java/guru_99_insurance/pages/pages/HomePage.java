package guru_99_insurance.pages.pages;

import guru_99_insurance.pages.util.CommonUtils;
import guru_99_insurance.pages.util.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

   public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[.='Register']")
    private WebElement registerButton;
   public void clickRegisterButton(){
       CommonUtils.clickWithWait(registerButton);
   }
}
