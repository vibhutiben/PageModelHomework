package xyz;

import org.openqa.selenium.By;

public class  RegistrationSuccessPage extends Utils{

    private By _RegistrationSuccessPage = By.xpath("");

    public void verifyUserSeeRegistrationSuccessMessage(){
        assertURL("registerresult");
        assertTextMessage("your registration completed");
    }


}
