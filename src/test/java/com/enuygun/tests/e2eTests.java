package com.enuygun.tests;

import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import page.FlightListPage;
import page.MainPage;
import page.PersonelInfoPage;

public class e2eTests extends BaseTest {

    /**
     * www.enuygun.com anasayfasına gidilir
     *Anasayfada Tab kontrolleri yapılır
     * Search kutusunda Tek Yön uçuş checkbox'ının check'i kaldırılır
     * Gidiş uçuşu için parametre girilir
     * Dönüş uçuşu parametre girilir
     * Gidiş dönüş için Takvimden  için ileri tarih seçilir
     * Kişi sayısı seçilir
     * "Ucuza bilet bul" butonuna tıklanır
     * Uçuş seçimi listesi açılır
     * Filtrele kısmından filtreler seçilir
     * Seçilen filtrelere göre uçuşlar listelenir
     * Listelenen gidiş uçuşlarından ilk sıradaki uçuş seçilir
     * Listelenen dönüş uçuşlarından ilk sıradaki uçuş seçilir
     * Kişi bilgileri sayfası açılır
     * Kişi bilgileri girilir
     * Ödeme için ilerle butonuna tıklanır
     * Has code Random girildiği için uyarısının çıkması beklenir
     * Has code Popup'ı kapatılır.
     */

    @Test
    public void e2eTest() {

        MainPage mainPage = new MainPage(driver);
        mainPage.goToMainPage();
        mainPage.checkMainPage();
        mainPage.unSelectOneWayCheckbox();
        mainPage.selectFromWhere("istanbul");
        mainPage.destinationInput("Antalya");
        mainPage.selectDate();
        mainPage.selectPerson();
        mainPage.clickFindACheapTicketButton();

        FlightListPage flightListPage = new FlightListPage(driver);
        flightListPage.selectFilter();
        flightListPage.selectDepartureFlight();
        flightListPage.selectReturnFlight();
        PersonelInfoPage personelInfoPage = new PersonelInfoPage(driver);
        personelInfoPage.fillPassengerInfos();
        personelInfoPage.acceptEmails();
        personelInfoPage.clickPaymentbutton();
        personelInfoPage.checkHesCodeMessage();

    }
    /**
     * www.enuygun.com anasayfasına gidilir
     * Gidiş uçuşu için parametre girilir
     * Gidiş uçuşu için suggessionlardan listedeki ilk element seçilir
     * Dönüş uçuşu parametre girilir
     * Dönüş uçuşu için suggessionlardan listedeki ilk element seçilir
     * Gidiş dönüş uçuşu için Takvimden  için ileri tarih seçilir
     * Kişi sayısı seçilir
     * "Ucuza bilet bul" butonuna tıklanır
     * Uçuş seçimi listesi açılır
     * Listelenen gidiş uçuşlarından ilk sıradaki uçuş seçilir
     * Listelenen dönüş uçuşlarından ilk sıradaki uçuş seçilir
     * Kişi bilgileri sayfası açılır
     * Kişi bilgileri girilmeden önce "ödemeye ilerle" butonuna tıklanır
     * Eposta validasyonu kontrol edilir
     * Eposta adresi format dışı girilir
     * Eposta validasyon mesajı kontrol edilir
     * Telefon numarası boş bıkakılır
     * Telefon numarası validasyon mesajı kontrol edilir
     */

    @Test
    public void personelInfoValidationTest() {

        MainPage mainPage = new MainPage(driver);
        mainPage.goToMainPage();
        mainPage.unSelectOneWayCheckbox();
        mainPage.selectFromWhere("istanbul");
        mainPage.destinationInput("Antalya");
        mainPage.selectDate();
        mainPage.selectPerson();
        mainPage.clickFindACheapTicketButton();

        FlightListPage flightListPage = new FlightListPage(driver);
        flightListPage.selectDepartureFlight();
        flightListPage.selectReturnFlight();

        PersonelInfoPage personelInfoPage = new PersonelInfoPage(driver);
        personelInfoPage.checkPersonelInfoValidation();

    }
    /**
     * www.enuygun.com anasayfasına gidilir
     * Gidiş uçuşu için parametre girilir
     * Dönüş uçuşu parametre girilir (Sonuç getirmemesi için uçuş seçeneği az olan bir lokasyon girildi)
     * Tarih seçilir
     * Kişi sayısı seçilir
     * "Ucuza bilet bul" butonuna tıklanır
     * Uçuş seçimi listesinde "Uçuş bulunamadı" sayfasının gelmesi beklenir
     * "Uçuş bulunamadı" sayfasındaki kontroller yapılır
     */

    @Test
    public void noResultSearchTest() {

        MainPage mainPage = new MainPage(driver);
        mainPage.goToMainPage();
        mainPage.checkMainPage();
        mainPage.unSelectOneWayCheckbox();
        mainPage.selectFromWhere("Kocaeli");
        mainPage.destinationInput("Helsinki");
        mainPage.selectDate();
        mainPage.selectPerson();
        mainPage.clickFindACheapTicketButton();

        FlightListPage flightListPage = new FlightListPage(driver);
        flightListPage.noResultSearch();
    }
    /**
     * www.enuygun.com anasayfasına gidilir
     * Gidiş uçuşu için parametre girilir
     * Dönüş uçuşu parametre girilir
     * Tarih seçilir
     * Kişi sayısı seçilir
     * "Ucuza bilet bul" butonuna tıklanır
     * Uçuş listesinde listelenen gidiş uçuşlarında listedeki ilk uçuş kartını bulup içindeki bilgiler tutulur
     * Gidiş uçuşu listesindeki ilk uçuş seçilir
     * Seçilen Gidiş uçuşunun bilgileri ile listedeki ilk uçuş bilgileri ile karşılaştırılır
     * Uçuş bilgileri eşit mi kontrolü yapılır
     */

    @Test
    public void checkFlightInfo() {

        MainPage mainPage = new MainPage(driver);
        mainPage.goToMainPage();
        mainPage.checkMainPage();
        mainPage.unSelectOneWayCheckbox();
        mainPage.selectFromWhere("istanbul");
        mainPage.destinationInput("Antalya");
        mainPage.selectDate();
        mainPage.selectPerson();
        mainPage.clickFindACheapTicketButton();

        FlightListPage flightListPage = new FlightListPage(driver);
        flightListPage.getDepartureFlightInfo();
        flightListPage.selectDepartureFlight();
        flightListPage.getSelectedFlightInfo();
        flightListPage.compareFlightInfo();
    }
}
