package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.constants.MainPageConstants;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class MainPage extends MainPageConstants {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void goToMainPage(){
        navigate("https://www.enuygun.com");
    }

    public void checkMainPage(){
        waitForLoad();
        assertTrue(waitElement(logo,2),"Enuygun.com logosu göründü");
        assertTrue(waitElement(flightFromTab,2),"Uçak bileti Tab'ı göründü");
        assertTrue(waitElement(checkinTab,2),"Check'in Tab'ı göründü");
        assertTrue(waitElement(pnrTab,2),"Pnr Sorgulama Tab'ı göründü");
        assertTrue(waitElement(biletIptalTab,2),"Bilet iptal Tab'ı göründü");
        assertTrue(waitElement(aracKiralamaTab,2),"Araç kiralama Tab'ı göründü");

    }
    public void unSelectOneWayCheckbox(){
        if (getDriver().findElement(oneWayCheckbox).isSelected()) {
            click(oneWayCheckbox);
        }

    }
    public void selectDate(){
          find(DepartureDate).click();
        for (int i = 1; i < 2; i++) {
            find((arialabel)).click();
        }
        find(startDate).click();
        find(endDate).click();


    }

    public void selectFromWhere(String startlocationName){
        sendKeys(OriginInput,startlocationName);
        waitElement(reactAutowhatever1,2);
        List<WebElement> locationList=finds(locations);
        locationList.get(0).click();

    }

    public void destinationInput(String destinationName){
        sendKeys(DestinationInput,destinationName);
        waitElement(reactAutowhatever1,2);
        List<WebElement> destinations=finds(reactAutowhatever1);
        destinations.get(1).click();
    }

    public void selectPerson(){
        click(passengerSelectButton);
        List<WebElement> personSelectionRows=finds(PassengerBox);
        personSelectionRows.get(0).findElement(PassengerBox_type_actions).click();
        personSelectionRows.get(1).findElement(PassengerBox_type_actions).click();
        click(primaryLinkBtn);
    }

    public void clickFindACheapTicketButton(){
        find(blockPrimaryBtn).click();
        waitForLoad();
    }








}
