/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author hugob
 */
public class Kata2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] data = {"Pepe","Juan","Luis","Juan","Pepe","Pepe","Juan","Luis"};
        
        Histogram histo = new Histogram(data);
        Map<String,Integer> histogram = histo.getHistogram();
            
        
        Iterator<Map.Entry<String,Integer>> entries = histogram.entrySet().iterator();
        while(entries.hasNext()){
            Map.Entry<String,Integer> entry = entries.next();
            System.out.println("Key: "+entry.getKey()+", value: "+entry.getValue());
        }
        
    }
    
}
