package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class AHeadComponent {

    protected WebDriver driver;

//--------------Shevchuk Oleksii
    @FindBy(css = "input.ui-autocomplete-input")
    private WebElement searchField;

    @FindBy(css = "button>i.material-icons.search")
    private WebElement searchButton;


    protected AHeadComponent(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //search field //--------------Shevchuk Oleksii

    public WebElement getSearchField() {
        return searchField;
    }

    public void setTextSearchField(String text) {
        getSearchField().sendKeys(text);
    }

    public void clearTextInSearchField() {
        getSearchField().clear();
    }

    //search Button //--------------Shevchuk Oleksii


    public WebElement getSearchButton() {
        return searchButton;
    }

    public void clickSearchButton() {
        getSearchButton().click();
    }


}
