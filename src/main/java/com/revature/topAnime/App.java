package com.revature.topAnime;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class App {
    public static void main(String[] args) {
        AniRepo aniRepo = new AniRepo("anime.csv");
        AniService aniService = new AniService(aniRepo);

        Tomcat server = new Tomcat();
        server.setBaseDir(System.getProperty("java.io.tmpdir"));
        server.getConnector();
        server.addContext("", null);
        server.addServlet("","aniServlet", aniService).addMapping("/");
        try {
            server.start();
        } catch (LifecycleException e) {
            e.printStackTrace();
        }
    }
}
