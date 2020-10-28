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
        int[] data = {1,3,4,6,7,3,4,5,1,3,7,6,3,1,4,7,6,8,3};
        
        Histogram histo = new Histogram(data);
        Map<Integer,Integer> histogram = histo.getHistogram();
            
        
        Iterator<Map.Entry<Integer,Integer>> entries = histogram.entrySet().iterator();
        while(entries.hasNext()){
            Map.Entry<Integer,Integer> entry = entries.next();
            System.out.println("Key: "+entry.getKey()+", value: "+entry.getValue());
        }
        
    }
    
}
