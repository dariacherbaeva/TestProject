package generators;

import com.cedarsoftware.util.io.JsonReader;
import com.cedarsoftware.util.io.JsonWriter;
import data.*;

import java.io.*;
import java.util.Random;

public class DataGenerator {

    private static void writeObject(Object object, String name) {
        String json = JsonWriter.objectToJson(object);
        try {
            FileOutputStream out = new FileOutputStream(name + ".json");
            out.write(json.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings(value = "unchecked")
    private static <T> T readObject(String name) {
        try {
            String json = new BufferedReader(new InputStreamReader(new FileInputStream(name))).lines().reduce("", (s1, s2) -> s1 + s2);
            return (T) JsonReader.jsonToJava(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static void generatePost(String text, String theme, String filename) {
        SystemPostData note = new SystemPostData(text, theme);
        writeObject(note, filename);
    }

    private static void generateMessage(String messageText, String username, String filename) {
        MessageData folder = new MessageData(messageText, username);
        writeObject(folder, filename);
    }

    private static void generateUser(String login, String password, String filename) {
        UserData account = new UserData(login, password);
        writeObject(account, filename);
    }


    public static SystemPostData readPost(String name) {
        return readObject(name);
    }

    public static MessageData readMessage(String name) {
        return readObject(name);
    }

    public static UserData readUser(String name) {
        return readObject(name);
    }

    private static String randomString() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        return buffer.toString();
    }

    public static void main(String[] args) throws IOException {
        generatePost(randomString(), "FAQ", "post");
        generateMessage(randomString(), "admin", "message");
        generateUser("admin", "admin", "user");
    }
}
