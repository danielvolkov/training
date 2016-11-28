package builder;

/**
 * Created by daniel on 28/11/16.
 */
public class EnterpriseWebSiteBuilder extends WebSiteBuilder {
    @Override
    void buildName() {
        webSite.setName("Enterprise");
    }

    @Override
    void buildCms() {
        webSite.setCms(Cms.ALIFRESCO);
    }

    @Override
    void buildPrice() {
        webSite.setPrice(1000);
    }
}
