package page;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.constants.FlightListPageConstants;

import javax.xml.bind.Element;
import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class FlightListPage extends FlightListPageConstants {

    String selectedAirlinesText;
    String selectedAirportsText;
    String selectedTimeText;
    String selectedTransitText;
    String selectedPriceText;
    String airlinesText;
    String summaryAirportsText;
    String summaryTimeText;
    String summaryTransitText;
    String summaryPriceText;

    public FlightListPage(WebDriver driver) {
        super(driver);
    }

    public void selectFilter() {
        waitVisibility(flightSelectButton);
        waitElement(filterLabel, 5);
        assertTrue(find(filterTitle).getText().matches("Filtrele"));
        click(filter1);
        click(filter2);
        click(filterDepaturePrice);
        waitVisibility(slider);
        click(departureReturnTime);
        wait(2);
        click(departureTimeNight);
        wait(2);
        click(departureTimeMorning);
    }

    public void noResultSearch(){
        waitForLoad();
        waitVisibility(resultEmpty);
        assertTrue(find(resultEmptyText).getText().matches("Seçtiğiniz tarihlerde uçuş bulunamıyor."));

        if(waitElement(resultEmptyButton,2)) {
        assertTrue(find(resultEmptyButton).getText().matches("Aradığım uçuş bulunduğunda haber ver!"));
        }
        assertTrue(find(resultEmptyCardState).getText().matches("Farklı tarihli alternatif uçuşlar"));

        if(waitElement(busSearch,2)) {
            assertTrue(find(busSearch).getText().matches("Bu rotada otobüs yolculuğunu tercih edebilirsiniz"));
        }
    }
        public void selectDepartureFlight(){
            waitForLoad();
            waitElement(detailClose,3);
            List<WebElement> locations=finds(flightSelectButton);
            locations.get(0).click();
        }

    public void selectReturnFlight(){

        waitForLoad();
        waitElement(flightListReturn,2);
        List<WebElement> returnlocations=finds(returnFlightSelect);
        returnlocations.get(0).click();
    }

    public void getDepartureFlightInfo(){

        waitForLoad();
        waitElement(detailClose,2);

        waitElement(domesticList,3);
        List<WebElement> selectedFlightCard = finds(detailCloseDomestic);

        WebElement selectedAirlines= selectedFlightCard.get(0).findElement(summaryMarketingAirlines);
        selectedAirlinesText= selectedAirlines.getText();

        WebElement selectedAirports=selectedFlightCard.get(0).findElement(summaryAirports);
        selectedAirportsText= selectedAirports.getText();

        WebElement selectedTime=selectedFlightCard.get(0).findElement(flightDepartureTime);
        selectedTimeText =selectedTime.getText();

        WebElement selectedTransit=selectedFlightCard.get(0).findElement(directSummaryTransit);
        selectedTransitText=selectedTransit.getText();

        WebElement selectedPrice=selectedFlightCard.get(0).findElement(summaryAveragePrice);
        selectedPriceText=selectedPrice.getText();

    }

    public void getSelectedFlightInfo(){
        waitForLoad();
        waitElement(selectedDetailClose,3);

        List<WebElement> flightCard = finds(listDeparture);
        waitForLoad();
        wait(5);

        WebElement airlines=flightCard.get(0).findElement(summaryMarketingairlines);
        airlinesText = airlines.getText();

        WebElement summaryAirports=flightCard.get(0).findElement(summaryairports);
        summaryAirportsText = summaryAirports.getText();

        WebElement summaryTime=flightCard.get(0).findElement(flightDepartureTime);
        summaryTimeText = summaryTime.getText();

        WebElement summaryTransit=flightCard.get(0).findElement(directSummaryTransit);
        summaryTransitText =summaryTransit.getText();

        WebElement summaryPrice=flightCard.get(0).findElement(summaryAveragePrice);
        summaryPriceText= summaryPrice.getText();
    }

    public void compareFlightInfo(){
        waitElement(selectedDetailClose,3);
        assertEquals(selectedAirlinesText,airlinesText,"havayolları eşleşmedi");
        assertEquals(selectedAirportsText,summaryAirportsText,"havayolları eşleşmedi");
        assertEquals(selectedTimeText,summaryTimeText,"Uçuş saatleri eşleşmedi");
        assertEquals(selectedTransitText,summaryTransitText,"Uçuş aktarma durumu eşleşmedi");
        assertEquals(selectedPriceText,summaryPriceText,"Uçuş fiyatları eşleşmedi");
    }



}

