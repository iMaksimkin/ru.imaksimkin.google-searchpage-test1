package java;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.primitive.exceptions.ConcstructTestObjectException;
import org.primitive.testobjects.Page;
import org.primitive.webdriverencapsulations.SingleWindow;

public class LinksAreFound extends Page implements IPerformsClickOnALink {

    @FindBy(xpath = ".//*[@class='r']/a")
    private List<WebElement> linksAreFound;


    public LinksAreFound(SingleWindow browserWindow)
            throws ConcstructTestObjectException {
        super(browserWindow);
        loadPageObject();
    }

    @PageMethod
    public void clickOn(int index) {
        linksAreFound.get(0).click();
    }

    @Deprecated
    public void clickOn(String text) {

    }

    @PageMethod
    public int getLinkCount() {
        return linksAreFound.size();
    }

}
