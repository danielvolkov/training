package templateMethod;

/**
 * Created by daniel on 30/11/16.
 */
public class WebsiteRunner {
    public static void main(String[] args) {
        WebsiteTemplate welcomePage = new WelcomePage();
        WebsiteTemplate newsPage = new NewsPage();

        welcomePage.showPage();
        System.out.println("===============");
        newsPage.showPage();
    }
}
