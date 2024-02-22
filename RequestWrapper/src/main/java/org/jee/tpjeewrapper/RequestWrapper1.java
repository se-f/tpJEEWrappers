package org.jee.tpjeewrapper;

import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletRequestWrapper;

import java.io.*;
public class RequestWrapper1 extends ServletRequestWrapper
{
    public RequestWrapper1 (ServletRequest req)
    {
        // Appel du super de type ServletRequestWrapper
        super (req);
    }
    public String getParameter (String str)
    {
        // Appel de la méthode getParameter du super
        String name = super.getParameter (str);
        if (name.equals (""))
        {
            // Si le paramètre str est vide dans la requête, on affiche un message d'erreur
            name = "Please, enter your name in the form";
        }
        return name;
    }
}