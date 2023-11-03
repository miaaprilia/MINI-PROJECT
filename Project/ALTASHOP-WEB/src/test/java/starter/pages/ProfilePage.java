package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ProfilePage extends PageObject {
    private By profileButton() {
        return By.xpath("/html/body/div/div/header/div/button[2]");
    }

    private By transactionButton() {
        return By.xpath("/html/body/div/div[2]/div/div[1]/div[2]");
    }

    private By logoutButton() {
        return By.xpath("/html/body/div/div[2]/div/div[2]/div[2]");
    }

    private By selectRows() {
        return By.xpath("/html/body/div/div[1]/main/div/div/div/div/div[2]/div[1]/div/div/div/div[1]/div[2]/div/i");
    }

    private By set5Rows() {
        return By.xpath("/html/body/div/div[3]/div/div[1]/div/div");
    }

    private By set10Rows() {
        return By.xpath("/html/body/div/div[3]/div/div[2]/div/div");
    }

    private By set15Rows() {
        return By.xpath("/html/body/div/div[3]/div/div[3]/div/div");
    }

    private By allRows() {
        return By.xpath("/html/body/div/div[3]/div/div[4]/div/div");
    }

    private By paginationToTheRight() {
        return By.xpath("/html/body/div/div[1]/main/div/div/div/div/div[2]/div[4]/button/span/i");
    }

    private By paginationToTheLeft() {
        return By.xpath("/html/body/div/div[1]/main/div/div/div/div/div[2]/div[3]/button/span/i");
    }

    @Step
    public void tapTheProfileButton() {
        $(profileButton()).click();
    }

    @Step
    public void tapTheTransactionButton() { $(transactionButton()).click();
    }

    @Step
    public void tapTheRowsButton() {
        $(selectRows()).click();
    }

    @Step
    public void set5RowsPerPage() {
        $(set5Rows()).click();
    }

    @Step
    public void set10RowsPerPage() {
        $(set10Rows()).click();
    }

    @Step
    public void set15RowsPerPage() {
        $(set15Rows()).click();
    }

    @Step
    public void organizeAllRowsPerPage() {
        $(allRows()).click();
    }

    @Step
    public void tappedThePaginationToTheRight() {
        $(paginationToTheRight()).click();
    }

    @Step
    public void tappedThePaginationToTheLeft() {
        $(paginationToTheLeft()).click();
    }

    @Step
    public void tapTheLogoutButton() {
        $(logoutButton()).click();
    }
}

