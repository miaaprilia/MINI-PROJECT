package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Assertions;
import starter.pages.LoginPage;
import starter.pages.ProductPage;
import starter.pages.ProfilePage;

public class ProfileSteps {
    @Steps
    ProfilePage profilePage;
    LoginPage loginPage;

    ProductPage productPage;

    // Scenario Positive
    @And ( "I tap the profile button" )
    public void tapTheProfileButton() {
        profilePage.tapTheProfileButton();
    }

    @And ( "I tap the transaction button" )
    public void tapTheTransactionButton() {
        profilePage.tapTheTransactionButton();
    }

    @Then ( "I see the transaction history list" )
    public void seeTheTransactionHistoryList() {
        Assertions.assertTrue(productPage.validateOnProfilePage());
    }

    @And ( "I tap the rows button" )
    public void tapTheRowsButton() {
        profilePage.tapTheRowsButton();
    }

    @And ( "I set 5 rows per page" )
    public void set5RowsPerPage() {
            profilePage.set5RowsPerPage();
    }

    @And ( "I set 10 rows per page" )
    public void set10RowsPerPage() { profilePage.set10RowsPerPage();
    }

    @And ( "I set 15 rows per page" )
    public void set15RowsPerPage() {
        profilePage.set15RowsPerPage();
    }

    @And ( "I organize all rows per page" )
    public void organizeAllRowsPerPage() {
        profilePage.organizeAllRowsPerPage();
    }

    @Then ( "I see a list of transaction history per rows" )
    public void userRedirectTransactionPage() {
        Assertions.assertTrue(productPage.validateOnProfilePage());
    }

    @And ( "I tapped the pagination to the right" )
    public void tappedThePaginationToTheRight() {
        profilePage.tappedThePaginationToTheRight();
    }

    @And ( "I tapped the pagination to the left" )
    public void tappedThePaginationToTheLeft() {
        profilePage.tappedThePaginationToTheLeft();
    }

    @Then ( "I see a list of transaction history per page" )
    public void seeListTransactionHistoryPerPage() {
        Assertions.assertTrue(productPage.validateOnProfilePage());
    }

    @And ( "I tap the logout button" )
    public void tapTheLogoutButton() {
        profilePage.tapTheLogoutButton();
    }

    @Then ( "I was redirected to the login page" )
    public void wasRedirectedToTheLoginPage() {
        Assertions.assertTrue(loginPage.validateOnLoginPage());
    }
}
