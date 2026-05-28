package com.swag.pe.pages.validations;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class ValidationPage extends PageObject {
    @FindBy(xpath = "//div[@class='product_label']")
     @FindBy(xpath = "//span[@class='title']")
    protected WebElementFacade lbl_product;
    protected WebElementFacade lbl_errorMessage;

}
