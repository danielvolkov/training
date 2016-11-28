package builder;

/**
 * Created by daniel on 28/11/16.
 */
public class VisitCardWebSiteBuilder extends WebSiteBuilder {
    @Override
    void buildName() {
        webSite.setName("Visit Card");
    }

    @Override
    void buildCms() {
        webSite.setCms(Cms.WORDPRESS);
    }

    @Override
    void buildPrice() {
        webSite.setPrice(500);
    }
}
