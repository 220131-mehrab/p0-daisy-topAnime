package com.revature.topAnime;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class AniService extends HttpServlet {
    AniRepo aniRepo;
    public AniService(AniRepo aniRepo) {
        this.aniRepo = aniRepo;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userInput;
        userInput = req.getParameter("searchName");

        if (userInput != null) {
            String result = aniRepo.getAnime(userInput);
            resp.getWriter().println(result);
        } else
            for (String anime : aniRepo.getAnime()) {
                resp.getWriter().println(anime);
        }
    }
}