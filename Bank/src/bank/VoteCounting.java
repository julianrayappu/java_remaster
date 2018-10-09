/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import java.util.*;

/**
 *
 * @author suppiah_00
 */

public class VoteCounting {
    class VoteComparator implements Comparator<Map.Entry<String, Integer>> {

        @Override
        public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
            if (o2.getValue().compareTo(o1.getValue()) == 0) {
                return o2.getKey().compareTo(o1.getKey());
            }
            return o2.getValue().compareTo(o1.getValue());
        }
    }

    // Complete the electionWinner function below.
    String electionWinner(String[] votes) {
        String winner = "";
        HashMap<String, Integer> results = new HashMap<>();
        
        for (String vote : votes)
        {
            int count = 1;
            if (results.containsKey(vote))
            {
                count = results.get(vote) + 1;
            }
            results.put(vote, count);
            System.out.println(vote);
        }
        
        List<Map.Entry<String, Integer>> voteList = new LinkedList<>(results.entrySet());
        
        voteList.forEach((Map.Entry<String, Integer> entry) -> {
            System.out.println("entry is " + entry);
            System.out.println("name is " + entry.getKey());
            System.out.println("vote is " + entry.getValue());
            String s;
            s = (String) entry.getKey();
        });
        
        // sort hashmap
        Collections.sort(voteList, new VoteComparator());
        
        Iterator iter;
        Map.Entry<String, Integer> entry;
        
        iter = voteList.iterator();
        if (iter.hasNext())
        {
            entry = (Map.Entry<String, Integer>) iter.next();
            winner = (String) entry.getKey();
        }
        
        return winner;
    }

}
