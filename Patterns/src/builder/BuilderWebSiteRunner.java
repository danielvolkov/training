package builder;



/**
 * Created by daniel on 21/11/16.
 */
public class BuilderWebSiteRunner {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new VisitCardWebSiteBuilder());
        WebSite webSite = director.buildWebSite();
        System.out.println( webSite);
    }
}
