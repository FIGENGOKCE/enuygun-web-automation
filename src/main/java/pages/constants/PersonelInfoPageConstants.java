package pages.constants;

import base.BasePageFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PersonelInfoPageConstants extends BasePageFunctions {

    public PersonelInfoPageConstants(WebDriver driver) {
        super(driver);
    }
    //1.kişi bilgilieri

    protected By contact_email=By.id("contact_email");
    protected By contact_cellphone=By.id("contact_cellphone");
    protected By firstName_0=By.id("firstName_0");
    protected By lastName_0=By.id("lastName_0");
    protected By birthDateDay_0=By.id("birthDateDay_0");
    protected By birthDateMonth_0=By.id("birthDateMonth_0");
    protected By birthDateYear_0=By.id("birthDateYear_0");
    protected By publicId_0=By.id("publicId_0");
    protected By healthCode_0=By.id("healthCode_0");
    protected By gender_F_0=By.cssSelector("[for='gender_F_0']");
    //2.kişi bilgileri
    protected By firstName_1=By.id("firstName_1");
    protected By lastName_1=By.id("lastName_1");
    protected By birthDateDay_1=By.id("birthDateDay_1");
    protected By birthDateMonth_1=By.id("birthDateMonth_1");
    protected By birthDateYear_1=By.id("birthDateYear_1");
    protected By publicId_1=By.id("publicId_1");
    protected By healthCode_1=By.id("healthCode_1");
    protected By gender_F_1=By.cssSelector("[for='gender_F_1']");
    //Çocuk bilgileri
    protected By firstName_2=By.id("firstName_2");
    protected By lastName_2=By.id("lastName_2");
    protected By birthDateDay_2=By.id("birthDateDay_2");
    protected By birthDateMonth_2=By.id("birthDateMonth_2");
    protected By birthDateYear_2=By.id("birthDateYear_2");
    protected By publicId_2=By.id("publicId_2");
    protected By healthCode_2=By.id("healthCode_2");
    protected By gender_F_2=By.cssSelector("[for='gender_F_2']");
    protected By acceptEmails=By.xpath("//*[@id=\"accept-email-container\"]/label");
    protected By jsReservationBtn=By.cssSelector(".js-reservation-btn");
    protected By popover=By.cssSelector("div:nth-of-type(12) > .popover-content");
    protected By popoverContent=By.cssSelector("div[role='tooltip'] > .popover-content");
    protected By firstDateDay=By.cssSelector("select[name='birthDateDay_0'] > option[value='01']");
    protected By firstDateMonth=By.cssSelector("select[name='birthDateMonth_0'] > option[value='01']");
    protected By firstDateYear =By.cssSelector("select[name='birthDateYear_0'] > option[value='1990']");
    protected By secondDateDay=By.cssSelector("select[name='birthDateDay_1'] > option[value='01']");
    protected By secondDateMonth=By.cssSelector("select[name='birthDateMonth_1'] > option[value='01']");
    protected By secondDateYear =By.cssSelector("select[name='birthDateYear_1'] > option[value='1996']");
    protected By childDateDay=By.cssSelector("select[name='birthDateDay_2'] > option[value='01']");
    protected By childDateMonth=By.cssSelector("select[name='birthDateMonth_2'] > option[value='01']");
    protected By childDateYear =By.cssSelector("select[name='birthDateYear_2'] > option[value='2015']");
    protected By reservationGeneralError =By.xpath("//*[@id=\"ReservationGeneralError\"]/div/div/div[3]/button");
    protected By reservationGeneralErrorModal =By.cssSelector("#ReservationGeneralError > div > div > div.modal-footer > button");
    protected By emailValid=By.cssSelector("[data-email-typofix-show]");


}

