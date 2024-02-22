package org.jee.tpjeewrapper;

import jakarta.servlet.ServletResponse;
import jakarta.servlet.ServletResponseWrapper;

import java.util.Locale;

public class ResponseWrapper1 extends ServletResponseWrapper
{
    public ResponseWrapper1 (ServletResponse res)
    {
        // Appel du super
        super (res);
    }
    public Locale getLocale ()
    {
        System.out.println ("Wrapper class called by Filter");
        // Appel de la methode getLocale du super
        // A Locale object represents a specific geographical, political, or cultural region.
        Locale loc = super.getLocale ();
        String country = loc.getCountry ();
        String language = loc.getLanguage ();
        if (!country.equals ("US"))
        {
            // Si la localisation n'est pas les US, on la force à être les US
            Locale loc1 = new Locale ("English, US");
            loc = loc1;
        }
        System.out.println (country);
        System.out.println (language);
        return loc;
    }
}