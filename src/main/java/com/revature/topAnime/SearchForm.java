package com.revature.topAnime;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SearchForm extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String HTMLForm = "<Html>\n" +
                "<Head>\n" +
                "    <Title>Search Anime List</Title>\n" +
                "</Head>\n" +
                "<Body>\n" +
                "    <h1>Top Anime Search</h1>\n" +
                "    <form " +
                "action='' method='get'>\n" +
                "            <input type='name' name='searchName" +
                "'/>\n" +
                "            <input type='submit' value='Search" +
                "'/>\n" +
                "            <a href='/topanime/anime'>See Full Anime List</a>\n" +
                "    </form>\n" +
                "</Body>\n" +
                "</Html>";
        resp.getWriter().println(HTMLForm);
    }
}