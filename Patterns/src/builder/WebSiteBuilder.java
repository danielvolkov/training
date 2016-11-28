package builder;

/**
 * Created by daniel on 28/11/16.
 */
public abstract class WebSiteBuilder {
    WebSite webSite;

    void createWebSite(){
        webSite = new WebSite();
    }

    WebSite getWebSite(){
        return webSite;
    }

    abstract void buildName();
    abstract void buildCms();
    abstract void buildPrice();
}
