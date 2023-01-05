package demoqa.pages;

import com.codeborne.selenide.SelenideElement;
import demoqa.pages.components.CalendarComponent;
import demoqa.pages.components.ResultTableComponent;
import demoqa.pages.components.SelectionStateAndCity;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class AutomationPracticeFormPage {
    CalendarComponent calendarComponent = new CalendarComponent();
    SelectionStateAndCity selectionStateAndCity = new SelectionStateAndCity();
    ResultTableComponent resultTableComponent = new ResultTableComponent();

    public AutomationPracticeFormPage openPage() {
        open("/automation-practice-form");
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");

        return this;
    }


    private final SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            emailInput = $("#userEmail"),
            genderSelect = $("#genterWrapper"),
            phoneInput = $("#userNumber"),
            calendarInput = $("#dateOfBirthInput"),
            subjectsInput = $("#subjectsInput"),
            hobbiesSelect = $("#hobbiesWrapper"),
            uploadPicture = $("#uploadPicture"),
            currentAddressInput = $("#currentAddress"),
            submitButton = $("#submit"),
            modalForm = $(".modal-dialog");


    public AutomationPracticeFormPage setFirstName(String firstName) {
        firstNameInput.setValue(firstName);

        return this;
    }

    public AutomationPracticeFormPage setLastName(String lastName) {
        lastNameInput.setValue(lastName);

        return this;
    }

    public AutomationPracticeFormPage setEmail(String email) {
        emailInput.setValue(email);

        return this;
    }

    public AutomationPracticeFormPage selectGender(String gender) {
        genderSelect.$(byText(gender)).click();

        return this;
    }

    public AutomationPracticeFormPage setPhone(String phone) {
        phoneInput.setValue(phone);

        return this;
    }

    public AutomationPracticeFormPage setCalendar(String day, String month, String year) {
        calendarInput.click();
        calendarComponent.calendar(day, month, year);

        return this;
    }

    public AutomationPracticeFormPage setSubjects(String subject) {
        subjectsInput.setValue(subject).pressEnter();

        return this;
    }

    public AutomationPracticeFormPage selectHobbies(String hobbies) {
        hobbiesSelect.$(byText(hobbies)).click();

        return this;
    }

    public AutomationPracticeFormPage uploadPicture(String picture) {
        uploadPicture.uploadFromClasspath(picture);

        return this;
    }

    public AutomationPracticeFormPage setCurrentAddress(String currentAddress) {
        currentAddressInput.setValue(currentAddress);

        return this;
    }

    public AutomationPracticeFormPage selectionStateAndCity(String state, String city) {
        selectionStateAndCity.selectionStateAndCity(state, city);

        return this;
    }

    public AutomationPracticeFormPage submitClick() {
        submitButton.click();

        return this;
    }

    public AutomationPracticeFormPage checkResultModalForm() {
        resultTableComponent.checkVisible();

        return this;
    }

    public AutomationPracticeFormPage checkResult(String key, String value) {
        resultTableComponent.checkResult(key, value);

        return this;
    }
}
