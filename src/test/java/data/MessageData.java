package data;

public class MessageData {

    public String messageText;
    public String username;

    public MessageData(String messageText, String username) {
        this.messageText = messageText;
        this.username = username;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
