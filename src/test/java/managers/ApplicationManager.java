package managers;

import helpers.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.Map;

public class ApplicationManager {
    private FirefoxDriver driver;
    private String baseURL;
    private Map<String, Object> vars;
    private JavascriptExecutor js;
    private LogInHelper logInHelper;
    private MessageHelper messageHelper;
    private NavigationHelper navigationHelper;
    private PostHelper postHelper;
    private LikeHelper likeHelper;

    static {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\user1\\Desktop\\ucheba\\3 курс\\тесты\\AutoTests\\" +
                "TestProject\\src\\main\\resources\\geckodriver.exe");
    }

    private ApplicationManager() {
        driver = new FirefoxDriver();
        baseURL = "https://dashacherbaeva.pythonanywhere.com/";
        vars = new HashMap<>();
        logInHelper = new LogInHelper(this);
        messageHelper = new MessageHelper(this);
        navigationHelper = new NavigationHelper(this);
        postHelper = new PostHelper(this);
        js = (JavascriptExecutor) driver;
        likeHelper = new LikeHelper(this);
    }

    private static ThreadLocal<ApplicationManager> instance = new ThreadLocal<>();

    public static ApplicationManager getInstance() {
        if (instance.get() == null) {
            instance.set(new ApplicationManager());
        }
        return instance.get();
    }

    public void terminate() {
        driver.quit();
    }

    public FirefoxDriver getDriver() {
        return driver;
    }

    public void setDriver(FirefoxDriver driver) {
        this.driver = driver;
    }

    public String getBaseURL() {
        return baseURL;
    }

    public void setBaseURL(String baseURL) {
        this.baseURL = baseURL;
    }

    public LogInHelper getLogInHelper() {
        return logInHelper;
    }

    public void setLogInHelper(LogInHelper logInHelper) {
        this.logInHelper = logInHelper;
    }

    public MessageHelper getMessageHelper() {
        return messageHelper;
    }

    public void setMessageHelper(MessageHelper messageHelper) {
        this.messageHelper = messageHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public void setNavigationHelper(NavigationHelper navigationHelper) {
        this.navigationHelper = navigationHelper;
    }

    public PostHelper getPostHelper() {
        return postHelper;
    }

    public void setPostHelper(PostHelper postHelper) {
        this.postHelper = postHelper;
    }

    public Map<String, Object> getVars() {
        return vars;
    }

    public void setVars(Map<String, Object> vars) {
        this.vars = vars;
    }

    public JavascriptExecutor getJs() {
        return js;
    }

    public void setJs(JavascriptExecutor js) {
        this.js = js;
    }

    public LikeHelper getLikeHelper() {
        return likeHelper;
    }

    public void setLikeHelper(LikeHelper likeHelper) {
        this.likeHelper = likeHelper;
    }

    public static void setInstance(ThreadLocal<ApplicationManager> instance) {
        ApplicationManager.instance = instance;
    }
}
