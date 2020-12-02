package helpers;

import helpers.HelperBase;
import managers.ApplicationManager;
import org.openqa.selenium.Dimension;

public class NavigationHelper extends HelperBase {

    public NavigationHelper(ApplicationManager manager) {
        super(manager);
    }

    public void openPage() {
        manager.getDriver().get(manager.getBaseURL());
    }

    public void setWindowSize() {
        manager.getDriver().manage().window().setSize(new Dimension(1075, 596));
    }


}
