package xyz;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils extends BasePage {

    public static void clickElementBy(By by){
        driver.findElement(by).click();
    }

    public static void enterText(By by,String text) {
        driver.findElement(by).sendKeys(text);
    }

    //get selected from dropdown
   // public static void selectByValue(By by,String text){
     //   Select select =new Select(driver.findElement(by));
      //  select.selectByValue(text);}

    //Dropdown by VisibleText
     public static void selectDropdownValue(By by,String text){
         WebElement month_dropdown = driver.findElement(by);
         Select month_dd = new Select(month_dropdown);
         month_dd.selectByVisibleText(text);}

    public static void waitForElementDisplay(By by,int time){
        WebDriverWait wait=new WebDriverWait(driver,time);
        WebElement until = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    //select text from value
    public static void getActualText(By by,String Text){driver.findElement(by).getText();
    }

    //scrol to view element
    public void ScrolltoViewElement(By by){
        WebElement element = driver.findElement(by);
        ((JavascriptExecutor)driver).executeScript("argument[0].scrollntoview(true);",element);
        try{Thread.sleep(20);
    }
        catch (InterruptedException e)
        { e.printStackTrace();}
       element.getText();}}

