package pages.constants;

import base.BasePageFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlightListPageConstants extends BasePageFunctions {

    public FlightListPageConstants(WebDriver driver) {
        super(driver);
    }

    protected By filterLabel=By.cssSelector(".col-300.hidden-sm-down");
    protected By filterTitle=By.cssSelector(".filter-title");
    protected By filter1=By.cssSelector("div:nth-of-type(2) > .collapse.show > .custom-controls-stacked > label:nth-of-type(2)");
    protected By filter2=By.cssSelector("div:nth-of-type(2) > .collapse.show > .custom-controls-stacked > label:nth-of-type(3)");
    protected By filterDepaturePrice=By.cssSelector(".card-header.ctx-filter-depature-price");
    protected By slider=By.cssSelector("div[role='slider']");
    protected By departureReturnTime=By.cssSelector(".card-header.ctx-filter-departure-return-time");
    protected By departureTimeNight=By.cssSelector("div[role='group'] > .btn.btn-secondary.ctx-filter-departure-time-night");
    protected By departureTimeMorning=By.cssSelector(".ctx-filter-departure-time-morning");
    protected By resultEmpty=By.cssSelector(".result-empty");
    protected By resultEmptyText=By.cssSelector(".result-empty-text");
    protected By resultEmptyButton=By.cssSelector(".result-empty button");
    protected By resultEmptyCardState=By.cssSelector(".card-title.text-center");
    protected By busSearch=By.cssSelector(".busSearch .text-center");
    protected By detailClose=By.cssSelector(".detail-close.domestic");
    protected By flightSelectButton=By.xpath("//div[@class='flight-summary-select']/button");
    protected By returnFlightSelect=By.cssSelector(".flight-list-return div[data-provider]");

    protected By domesticList=By.cssSelector(".domesticList.flight-list.flight-list-departure > .corporateFlex.flight-list-body > div:nth-of-type(1) > .detail-close.domestic.firstClass.flight-item.tr");
    protected By detailCloseDomestic=By.cssSelector(".detail-close.domestic");
    protected By summaryMarketingAirlines=By.cssSelector(".summary-marketing-airlines");
    protected By summaryAirports=By.className("summary-airports");
    protected By directSummaryTransit=By.cssSelector(".direct.summary-transit");
    protected By summaryAveragePrice=By.cssSelector(".summary-average-price");
    protected By selectedDetailClose=By.cssSelector("flight-item tr selected detail-close firstClass domestic");
    protected By listDeparture=By.cssSelector(".domesticList.flight-list.flight-list-departure .detail-close.domestic");
    protected By summaryMarketingairlines=By.cssSelector(".summary-marketing-airlines");
    protected By summaryairports=By.cssSelector(".summary-airports");
    protected By flightDepartureTime=By.cssSelector(".flight-departure-time");
    protected By flightListReturn=By.cssSelector(".flight-list-return div[data-provider]");
}
