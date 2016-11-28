package builder;

/**
 * Created by daniel on 28/11/16.
 */
public class Director {
    WebSiteBuilder builder;

    public void setBuilder(WebSiteBuilder builder) {
        this.builder = builder;
    }

    WebSite buildWebSite(){
        builder.createWebSite();
        builder.buildName();
        builder.buildCms();
        builder.buildPrice();

        WebSite webSite = builder.getWebSite();
        return  webSite;
    }
}
