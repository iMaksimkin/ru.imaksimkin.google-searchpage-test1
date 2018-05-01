package java;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.primitive.exceptions.ConcstructTestObjectException;
import org.primitive.testobjects.Page;
import org.primitive.webdriverencapsulations.SingleWindow;

public class SearchBar extends Page implements IPerformsSearch{
    @FindBy(id = "qaqaqa")
    private WebElement searchInput;
    @FindBy(id = "qaqaqa")
    private WebElement searchButton;


    public SearchBar(SingleWindow browserWindow)
            throws ConcstructTestObjectException {
        super(browserWindow);
        loadPageObject();
    }

    @PageMethod
    public void performSearch(String searchString) {
        searchInput.sendKeys(searchString);
        searchButton.click();
    }
}
