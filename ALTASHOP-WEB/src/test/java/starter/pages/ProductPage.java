package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ProductPage extends PageObject {

    private By buyButton() {
        return By.xpath("/html/body/div/div/main/div/div/div[2]/div/div[1]/div/div[3]/div[2]/button[2]/span");
    }

    private By cartButton() {
        return By.xpath("/html/body/div/div/header/div/button[1]");
    }

    private By detailButton() {
        return By.xpath("/html/body/div/div/main/div/div/div[2]/div/div[1]/div/div[3]/div[2]/button[1]/span");
    }

    private By PayButton() {
        return By.xpath("/html/body/div/div/main/div/div/div[2]/button");
    }

    private By starOne() {
        return By.xpath("/html/body/div/div/main/div/div/div/div/div/div/div/button[1]");
    }

    private By starTwo() {
        return By.xpath("/html/body/div/div/main/div/div/div/div/div/div/div/button[2]");
    }

    private By starThree() {
        return By.xpath("/html/body/div/div/main/div/div/div/div/div/div/div/button[3]");
    }

    private By starFour() {
        return By.xpath("/html/body/div/div/main/div/div/div/div/div/div/div/button[4]");
    }

    private By starFive() {
        return By.xpath("/html/body/div/div/main/div/div/div/div/div/div/div/button[5]");
    }

    @Step
    public boolean validateOnProductPage() {
        return $(cartButton()).isDisplayed();
    }

    @Step
    public boolean validateOnProfilePage() {
        return $(cartButton()).isDisplayed();
    }

    @Step
    public void select1OrMoreProductsOnTheHomePage(){
    }

    @Step
    public void tapTheBuyButton() {
        $(buyButton()).click();
    }

    @Step
    public void tapCartButtonAtTheTopRightPage() {
        $(cartButton()).click();
    }

    @Step
    public void tapPayButton() {
        $(PayButton()).click();
    }

    @Step
    public void tapDetailButton() {
        $(detailButton()).click();
    }

    @Step
    public void ratingInArrange1StarSymbol() {
        $(starOne()).click();
    }

    @Step
    public void ratingInArrange2StarSymbol() {
        $(starTwo()).click();
    }

    @Step
    public void ratingInArrange3StarSymbol() {
        $(starThree()).click();
    }

    @Step
    public void ratingInArrange4StarSymbol() {
        $(starFour()).click();
    }

    @Step
    public void ratingInArrange5StarSymbol() {
        $(starFive()).click();
    }
}
