package dharmangcrawler;

import java.io.IOException;
import java.util.*;
import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dharmang Solanki
 */
public class Spider 
{
    private static final int MAX_LINKS = 20;
    private static final int MAX_LEVEL = 5;
    private Set<String> pagesVisited = new HashSet<String>();
    private List<String> pagesToVisit = new LinkedList<String>();
    public void getLinks(String url,String domain) throws IOException
    {    
        int i=0,j;
        Document homepage = Jsoup.connect(url).get();
        Elements links = homepage.select("a[href]");
        // get the first MAX number of links on the page.
        for(Element e : links)
        {
            if(i>MAX_LINKS)
                break;
            System.out.println("Link "+i+"::"+e.attr("abs:href"));
            pagesToVisit.add(e.attr("abs:href"));
            i++;            
        }
        i=0;
        System.out.println("From The List.....");
        for(String e :pagesToVisit)
        {
            System.out.println(i+"::"+e);
            
            i++;
        }
        //-----------------------------------------------------------------
        
             
    }
}
