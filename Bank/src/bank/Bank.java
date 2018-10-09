/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


/**
 *
 * @author suppiah_00
 */
class Bank {
           
    public static void test1()
    {
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        
         if (b1 & b2 | b2 & b3 | b2 ){
             System.out.println("ok");
         }          
        if (b1 & b2 | b2 & b3 | b2 | b1)
            System.out.println("ok2");
        
    }
           
    public static void test2()
    {
        int x = 3 & 5;
        int y = 3 | 5;
        
        System.out.println("X is " + x);
        System.out.println("Y is " + y);        
    }
    
    public static void test3(){
        String[] votes = { "Alice" , "Bob", "Don", "Alice", "Lisa",  "Lisa", 
                           "Alice" , "Bob", "Don", "Alice", "Lisa" };
        String winner = new VoteCounting().electionWinner(votes);
        System.out.println("And the winner is ... " + winner);
    }
           
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        test3();
    }
    
}
