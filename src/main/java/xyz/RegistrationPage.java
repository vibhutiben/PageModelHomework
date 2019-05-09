package xyz;

import org.openqa.selenium.By;

public class RegistrationPage extends Utils {

    LoadProp loadProp = new LoadProp();

    private By _firstName =By.xpath("FirstName");
    private By _lastName = By.xpath("Lastname");
    private By _email = By.xpath("Email");
    private By _password =By.xpath("Password");
    private By _confirmPassword = By.xpath("ConfirmPassword");
    private By _registerButton =By.xpath("Register-button");

    private static String timestamp = createTimeStamp();

    public void verifyUserIsOnRegisterPage(){
        assertURL("register");}

    }









}
