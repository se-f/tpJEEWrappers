package org.jee.tpjeewrapper;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Locale;

public class MyServlet1 extends GenericServlet
{
    // La méthode Service est l'équivalent de doGet ou doPost dans un HttpServlet
        public void service (ServletRequest request, ServletResponse response) throws ServletException, IOException
        {
            response.setContentType ("text/html");
            PrintWriter out = response.getWriter ();
            // Affichage d'un message qui confirme que le servlet est appelé
            System.out.println ("Servlet is called");
            // Appel de getLocale() définie dans le wrapper
            Locale loc = response.getLocale ();
            out.println ("Locale set for this application is " + loc.toString ());
        }
    }
