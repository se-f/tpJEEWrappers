package org.jee.tpjeewrapper;

import jakarta.servlet.*;

import java.io.IOException;
import java.io.PrintWriter;


public class MyFilter1 implements Filter
{
    // Le MyFilter1 va intercepter toute requête ayant pour destination /MyServ
    // (comme configuré dans web.xml)
    public void init (FilterConfig filterConfig)
    {
    }
    public void destroy ()
    {
    }
    // doFilter est le pre-processing de la requête interceptée
    public void doFilter (ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException
    {
        response.setContentType ("text/html");
        // out est un objet qui permet d'écrire du contenu HTML dans la réponse
        PrintWriter out = response.getWriter ();
        // Affichage d'un message qui confirme que la requête est filtrée
        out.println("<b> <i>Filtering request and passing it to Wrapper class</i> </b> <br/>");
        // Création d'un RequestWrapper à partir de la requête interceptée
        RequestWrapper1 requestWrapper = new RequestWrapper1 (request);
        // Passer la requête interceptée au RequestWrapper
        chain.doFilter (requestWrapper, response);
    }
}