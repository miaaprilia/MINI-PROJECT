package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CategoryPage extends PageObject {
    private By selectCategory() {
        return By.xpath("/html/body/div/div[1]/main/div/div/div[1]/div/div[1]/div[1]");
    }

    private By CategoryThatContainsProductItems() {
        return By.xpath("/html/body/div/div[3]/div/div[1]/div/div");
    }

    private By CategoryThatDoesNotContainsProductItems() {
        return By.xpath("/html/body/div/div[3]/div/div[2]/div/div");
    }

    private By informationMessage() {
        return By.xpath("/html/body/div/div[1]/main/div/div/div[2]/div/div[1]");
    }

    @Step
    public boolean validateInformationMessage(String message) {
        return $(informationMessage()).getText().equalsIgnoreCase(message);
    }

    @Step
    public boolean validationErrorMessage() {
        return $(informationMessage()).isDisplayed();
    }

    @Step
    public boolean validateOnCategoryPage() {
        return $(selectCategory()).isDisplayed();
    }

    @Step
    public void selectCategoryThatContainsProductItems() {
        $(selectCategory()).click();
    }

    @Step
    public void  KucingOrenIsDisplayed() {
        $(CategoryThatContainsProductItems()).click();
    }

    @Step
    public void tapCategoryThatDoesNotContainsProductItems() {
        $(CategoryThatDoesNotContainsProductItems()).click();
    }

}
