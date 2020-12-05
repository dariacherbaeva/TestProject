package tests;

public class NavigationTest extends TestBase {
    @Override
    public void testCase() {
        app.getNavigationHelper().openPage();
        app.getNavigationHelper().setWindowSize();
        //app.terminate();
    }

    @Override
    public void additionalSetup() {

    }
}
