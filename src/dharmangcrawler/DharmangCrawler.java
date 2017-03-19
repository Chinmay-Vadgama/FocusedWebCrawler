/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dharmangcrawler;

/**
 *
 * @author Dharmang Solanki
 */
public class DharmangCrawler {  
    public static void main(String[] args) throws Exception
    {
        Spider s = new Spider();
        s.getLinks("https://www.youtube.com","Bahubali");
        
    }
    
}
