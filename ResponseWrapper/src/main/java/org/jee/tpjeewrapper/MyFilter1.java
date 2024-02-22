package org.jee.tpjeewrapper;

import jakarta.servlet.*;

import java.io.IOException;
import java.io.PrintWriter;

public class MyFilter1 implements Filter
        // Le MyFilter1 va intercepter toute requête ayant pour destination /MyServ
        // (comme configuré dans web.xml)
{
    public void init (FilterConfig filterConfig)
    {
    }
    public void destroy ()
    {
    }
    // doFilter est le post-processing de la requête interceptée
    public void doFilter (ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException
    {
        response.setContentType ("text/html");
        // out est un objet qui permet d'écrire du contenu HTML dans la réponse
        PrintWriter out = response.getWriter ();
        out.println("<b> <i>Filter is filtering the response and passing it to Wrapper class</i> </b> <br/>");
        // Creation d'un ResponseWrapper à partir de la réponse interceptée
        ResponseWrapper1 responseWrapper = new ResponseWrapper1 (response);
        // Passer la requête interceptée
        chain.doFilter (request, responseWrapper);
    }
}