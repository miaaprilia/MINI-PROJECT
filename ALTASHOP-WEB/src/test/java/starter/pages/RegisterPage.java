package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class RegisterPage extends PageObject {

    private By fullnameField() {
        return By.xpath("/html/body/div/div/main/div/div/div/div[2]/form/div[1]/div/div[1]/div/input");
    }
    private By emailField() {
        return By.xpath("/html/body/div/div/main/div/div/div/div[2]/form/div[2]/div/div[1]/div/input");
    }

    private By passwordField() {
        return By.xpath("/html/body/div/div/main/div/div/div/div[2]/form/div[3]/div/div[1]/div/input");
    }

    private By registerButton() {
        return By.xpath("/html/body/div/div/main/div/div/div/div[2]/form/div[4]/button/span");
    }

    @Step
    public boolean validateOnRegisterPage() {
        return $(registerButton()).isDisplayed();
    }

    @Step
    public void inputForm(String fullname, String email, String password) {
        $(fullnameField()).type(fullname);
        $(emailField()).type(email);
        $(passwordField()).type(password);
    }

    @Step
    public void inputFullname(String fullname) {
        $(fullnameField()).type(fullname);
    }

    @Step
    public void inputEmail(String email) {
        $(emailField()).type(email);
    }

    @Step
    public void inputPassword(String password) {
        $(passwordField()).type(password);
    }

    @Step
    public void tapRegisterButton() {
        $(registerButton()).click();
    }
}
