package com.revature.topAnime;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class App {
    public static void main(String[] args) {
        String webAppName = "topanime";
        AniRepo aniRepo = new AniRepo("anime.csv");
        AniService aniService = new AniService(aniRepo);
        SearchForm searchForm = new SearchForm();

        Tomcat server = new Tomcat();
        server.setBaseDir(System.getProperty("java.io.tmpdir"));
        server.setPort(0);
        server.getConnector();
        server.addContext(webAppName, null);

        server.addServlet(webAppName, "defaultServlet", new DefaultServlet()).addMapping("/*");
        server.addServlet(webAppName,"aniServlet", aniService).addMapping("/anime");
        server.addServlet(webAppName, "searchForm", searchForm).addMapping("/search");
        //System.out.println("Server running on http://localhost:" + );
        try {
            server.start();
        } catch (LifecycleException e) {
            e.printStackTrace();
        }
    }
}