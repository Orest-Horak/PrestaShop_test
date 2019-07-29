package com.softserve.edu.prestashop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.ArrayList;
import java.util.List;

public class AHeadComponent {
    private final String OPTION_NOT_FOUND_MESSAGE = "Option %s not found in %s";
    private final String TAG_ATTRIBUTE_VALUE = "value";

    protected WebDriver driver;
    //

    @FindBy(css = ".logo.img-responsive")
    private WebElement logo;

    @FindBy(css = "#category-6")
    private WebElement accessoriesButton;

    @FindBy(css = "#category-3")
    private WebElement clothesButton;

    @FindBy(css = "#category-9")
    private WebElement artButton;

    @FindBy(css = "#category-4")
    private WebElement menButton;

    private DropdownOptions dropdownOptions;

    protected AHeadComponent(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    private class DropdownOptions {

        private List<WebElement> listOptions;

        public DropdownOptions(By searchLocator) {
            initListOptions(searchLocator);
        }

        private void initListOptions(By searchLocator) {
            listOptions = driver.findElements(searchLocator);
        }

        public List<WebElement> getListOptions() {
            return listOptions;
        }

        public WebElement getDropdownOptionByPartialName(String optionName) {
            WebElement result = null;
            for (WebElement current : getListOptions()) {
                if (current.getText().toLowerCase().contains(optionName.toLowerCase())) {
                    result = current;
                    break;
                }
            }
            return result;
        }

        public List<String> getListOptionsText() {
            List<String> result = new ArrayList<String>();
            for (WebElement current : getListOptions()) {
                result.add(current.getText());
            }
            return result;
        }

        public void clickDropdownOptionByPartialName(String optionName) {
            getDropdownOptionByPartialName(optionName).click();
        }
    }

    //PageObject Atomic Operation

    //logo
    public WebElement getLogo() {
        return logo;
    }

    public String getLogoText() {
        return getLogo().getText();
    }

    public void clickLogo() {
        getLogo().click();
    }


    // menuTop
    public CategoryPage clickAccessoriesButton() {
        accessoriesButton.click();
        return new CategoryPage(driver);
    }

    public CategoryPage clickClothesButton() {
        clothesButton.click();
        return new CategoryPage(driver);
    }

    public CategoryPage clickArtButton() {
        artButton.click();
        return new CategoryPage(driver);
    }

    public void hoverClothesButton() {
        Actions builder = new Actions(driver);
        builder.moveToElement(clothesButton).perform();
    }

    public void hoverAccessoriesButton() {
        Actions builder = new Actions(driver);
        builder.moveToElement(accessoriesButton).perform();
    }

    // dropdownOptions
    protected DropdownOptions getDropdownOptions() {
        return dropdownOptions;
    }

    private void createDropdownOptions(By searchLocator) {
        dropdownOptions = new DropdownOptions(searchLocator);
    }

    private boolean findDropdownOptionByPartialName(String optionName) {
        boolean isFound = false;
        if (getDropdownOptions() == null) {
            throw new RuntimeException("DropdownOption is null");
        }
        for (String current : getDropdownOptions().getListOptionsText()) {
            if (current.toLowerCase().contains(optionName.toLowerCase())) {
                isFound = true;
            }
        }
        return isFound;
    }

    private void clickDropdownOptionByPartialName(String optionName) {
        if (!findDropdownOptionByPartialName(optionName)) {
            throw new RuntimeException(String.format("OPTION_NOT_FOUND_MESSAGE %s %s",
                    optionName, dropdownOptions.getListOptionsText().toString()));
        }
        getDropdownOptions().clickDropdownOptionByPartialName(optionName);
        dropdownOptions = null;
    }
}
