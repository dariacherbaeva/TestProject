package tests;

import data.MessageData;
import data.UserData;
import generators.DataGenerator;

import javax.xml.crypto.Data;

public class MessageTest extends TestBase {

    private MessageData testMessage;
    private UserData testUser;

    @Override
    public void additionalSetup() {
        testMessage = DataGenerator.readMessage("message.json");
        testUser = DataGenerator.readUser("user.json");
    }


    @Override
    public void testCase() {
        //UserData user = new UserData("admin", "admin");
        //MessageData message = new MessageData("some text", "daria");
        app.getNavigationHelper().openPage();
        app.getNavigationHelper().setWindowSize();
        app.getLogInHelper().logIn(testUser);
        app.getMessageHelper().sendMessage(testMessage);
        app.getLogInHelper().logOut();
        //app.terminate();
    }
}


