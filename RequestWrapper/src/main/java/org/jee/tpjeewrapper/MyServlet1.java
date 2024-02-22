package org.jee.tpjeewrapper;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import java.io.PrintWriter;
import java.io.IOException;

public class MyServlet1 extends GenericServlet
{
    public void service (ServletRequest request, ServletResponse response) throws ServletException, IOException
    {
        response.setContentType ("text/html");
        // Recuperation du username en utilisant getParameter qu'on a définit dans le wrapper
        String name = request.getParameter ("username");
        PrintWriter out = response.getWriter ();
        // Affichage du username
        out.println (name);
    }
}