package pages.constants;

import base.BasePageFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPageConstants extends BasePageFunctions {

    public MainPageConstants(WebDriver driver) {
        super(driver);
    }
    protected By logo=By.cssSelector(".navbar-logo");
    protected By flightFromTab = By.cssSelector("a#flight-from-tab");
    protected By checkinTab= By.cssSelector("a#checkin-tab");
    protected By pnrTab=By.cssSelector("a#pnr-tab > span");
    protected By biletIptalTab= By.cssSelector("a#cancel-refund-tab > span");
    protected By aracKiralamaTab= By.cssSelector("li:nth-of-type(5) > .nav-link > span");
    protected By oneWayCheckbox=By.id("oneWayCheckbox");
    protected By DepartureDate=By.id("DepartureDate");
    protected By arialabel=By.cssSelector("[aria-label='Move forward to switch to the next month\\.'] [width]");
    protected By startDate=By.cssSelector(".CalendarMonthGrid_month__horizontal_1:nth-of-type(2) tr:nth-of-type(3) [role='button']:nth-of-type(2)");
    protected By endDate=By.cssSelector(".CalendarMonthGrid_month__horizontal_1:nth-of-type(2) tr:nth-of-type(3) [role='button']:nth-of-type(4)");
    protected By OriginInput=By.id("OriginInput");
    protected By reactAutowhatever1=By.id("react-autowhatever-1");
    protected By locations=By.cssSelector("div:nth-of-type(1) > div[role='combobox'] > div[role='listbox']");
    protected By DestinationInput=By.id("DestinationInput");
    protected By passengerSelectButton=By.cssSelector(".passenger-select-button");
    protected By PassengerBox=By.cssSelector(".PassengerBox__type");
    protected By PassengerBox_type_actions=By.cssSelector(".PassengerBox__type__actions > button:nth-of-type(2)");
    protected By primaryLinkBtn=By.cssSelector(".primary-link-btn");
    protected By blockPrimaryBtn=By.cssSelector(".block.primary-btn");

}
