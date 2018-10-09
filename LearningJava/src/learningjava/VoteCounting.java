/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningjava;
import java.util.*;
/**
 *
 * @author suppiah_00
 */
public class VoteCounting {
    // Complete the electionWinner function below.
    static String electionWinner(String[] votes) {
        String winner;
        HashMap<String, Integer> results;
        
        for (String vote : votes)
        {
            if (results.containsKey(vote))
            {
                results.put(vote, 1);
            }
            int count = results.get(vote);
            results.put(vote, count);
        }
        
            // Getting a Set of Key-value pairs
        Set entrySet = results.entrySet();
 
        // Obtaining an iterator for the entry set
        Iterator it = entrySet.iterator();
        while(it.hasNext())
        {
            Map.Entry me = (Map.Entry) it.next();
            System.out.println("Key is: " + me.getKey() + " & " + " value is: "+me.getValue());
            winner = (String) me.getKey();
        }
        
        return winner;
    }
    
    public static void main(String[] args)
    {
        String[] votes = { "Bob", "Alice", "Joe", "Alice", "Bob" };
        
        String winner = electionWinner(votes);
               
        System.out.println(winner);
    }
}
