package templateMethod;

/**
 * Created by daniel on 30/11/16.
 */
public abstract class WebsiteTemplate {
    public void showPage(){
        System.out.println("header");
        showPageContent();
        System.out.println("footer");
    }

    public abstract void showPageContent();
}
