package page;

import org.openqa.selenium.WebDriver;
import pages.constants.PersonelInfoPageConstants;

public class PersonelInfoPage extends PersonelInfoPageConstants {
    public PersonelInfoPage(WebDriver driver) {
        super(driver);
    }


    public void checkPersonelInfoValidation() {

        click(jsReservationBtn);
        wait(1);
        find(popover).getText().contains("Lütfen geçerli bir e-posta adresi girin");
        sendKeys(contact_email, "test@h.com");
        click(jsReservationBtn);
        find(emailValid).getText().matches("E-posta adresinizi hatalı girmiş olabilirsiniz");
        wait(1);
        sendKeys(contact_email, "test@hotmail.com");
        sendKeys(contact_cellphone, "544 56_ ____");
        click(jsReservationBtn);
        find(popoverContent).getText().matches("Lütfen geçerli bir cep telefonu girin");

    }

    public void fillPassengerInfos() {

        find(contact_email).sendKeys("automation@enuygun.com");
        find(contact_cellphone).sendKeys("5375205779");
        sendKeys(firstName_0, "firstname");
        sendKeys(lastName_0, "firstsurname");
        click(birthDateDay_0);
        click(firstDateDay);
        click(birthDateMonth_0);
        click(firstDateMonth);
        click(birthDateYear_0);
        click(firstDateYear);
        sendKeys(publicId_0, "22222222220");
        click(gender_F_0);
        sendKeys(healthCode_0, "1qa2ws3ed4");

        sendKeys(firstName_1, "secondname");
        sendKeys(lastName_1, "secondsurname");
        click(birthDateDay_1);
        click(secondDateDay);
        click(birthDateMonth_1);
        click(secondDateMonth);
        click(birthDateYear_1);
        click(secondDateYear);
        sendKeys(publicId_1, "33333333330");
        click(gender_F_1);
        sendKeys(healthCode_1, "3ed4rf5tg6");

        sendKeys(firstName_2, "childname");
        sendKeys(lastName_2, "childsurname");
        click(birthDateDay_2);
        click(childDateDay);
        click(birthDateMonth_2);
        click(childDateMonth);
        click(birthDateYear_2);
        click(childDateYear);
        sendKeys(publicId_2, "44444444440");
        click(gender_F_2);
        sendKeys(healthCode_2, "2ws3ed4rf5");

    }

    public void acceptEmails() {

        if (getDriver().findElement(acceptEmails).isDisplayed()) {
            waitClickable(acceptEmails).click();
        }
    }

    public void clickPaymentbutton() {
        click(jsReservationBtn);
    }

    public void checkHesCodeMessage() {
        waitForLoad();
        waitClickable(reservationGeneralError).isDisplayed();
        click(reservationGeneralErrorModal);
    }


}


