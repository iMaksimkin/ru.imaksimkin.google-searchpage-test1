package java;

import org.primitive.configuration.Configuration;
import org.primitive.exceptions.ConcstructTestObjectException;
import org.primitive.testobjects.Entity;
import org.primitive.testobjects.TestObjectFactory;
import org.primitive.webdriverencapsulations.SingleWindow;


public class Google extends Entity implements IPerformsSearch, IPerformsClickOnALink{

    private final static String url = "https://www.google.ru/";
    private SearchBar searchBar;
    private LinksAreFound linksAreFound;


    public Google(SingleWindow browserWindow) throws ConcstructTestObjectException {
        super(browserWindow);
        searchBar     = get(SearchBar.class);
        linksAreFound = get(LinksAreFound.class);
    }


    public static Google getNew() throws ConcstructTestObjectException
    {
        return TestObjectFactory.getEntity(Google.class, url);
    }

    public static Google getNew(Configuration config) throws ConcstructTestObjectException
    {
        return TestObjectFactory.getEntity(Google.class, config, url);
    }

    public void performSearch(String searchString) {
        searchBar.performSearch(searchString);
    }

    public void clickOn(int index) {
        linksAreFound.clickOn(index);
    }

    @Deprecated
    public void clickOn(String text) {

    }

    public int getLinkCount() {
        return linksAreFound.getLinkCount();
    }
}
