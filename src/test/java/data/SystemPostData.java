package data;

public class SystemPostData {

    public String text;
    public String theme;

    public SystemPostData(String text, String theme) {
        this.text = text;
        this.theme = theme;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }
}
