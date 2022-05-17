/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Logger;

/**
 *
 * @author Doan Cuong
 */
public class Demo {
    static int n = 1000000;
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedlistVSVector();
    }
    
    public static void  LinkedlistVSVector()
    {
        Vector vector = new Vector();
        List linkedlist = new LinkedList();
        
        System.out.println("\t\t-----------ADD WITH LINKEDLIST AND VECTOR------------");
        //add with vector
        long startTime = System.nanoTime();
        for(int i = 0; i<n; i++)
        {
            vector.add(i);
        }
        long endTime = System.nanoTime();
        System.out.println("Vector add with time: " + (endTime-startTime)/1000000 + " milliseconds");
        
        //add with linkedlist
        startTime = System.nanoTime();
        for(int i = 0; i<n; i++)
        {
            linkedlist.add(i);
        }
        endTime = System.nanoTime();
        System.out.println("Linkedlist add with time: " + (endTime-startTime)/1000000 + " milliseconds");
        
        System.out.println("\t\t-----------REMOVE WITH LINKEDLIST AND VECTOR------------");
        //add with vector
        startTime = System.nanoTime();
        for(int i = n-1; i>0; i--)
        {
            vector.remove(i);
        }
        endTime = System.nanoTime();
        System.out.println("Vector add with time: " + (endTime-startTime)/1000000 + " milliseconds");
        
        //add with linkedlist
        startTime = System.nanoTime();
        for(int i = n-1; i>0; i--)
        {
            linkedlist.remove(i);
        }
        endTime = System.nanoTime();
        System.out.println("Linkedlist add with time: " + (endTime-startTime)/1000000 + " milliseconds");
        
    }
    
}
