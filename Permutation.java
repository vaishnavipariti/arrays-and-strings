/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package permutation;
import java.util.*;
import java.io.*;

/**
 *
 * @author hp
 */
public class Permutation {
    static String sort(String s){
    char[] content=s.toCharArray();
    java.util.Arrays.sort(content);
    
    return new String(content);
    }
static boolean permutation(String s, String t){
    if(s.length()!=t.length())
    { System.out.println("false");
        return false;}
  
   return sort(s).equals(sort(t));

}


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String s="mass",t="sams";
       sort(t);
       sort(s);
       permutation(s,t);
       
        
        // TODO code application logic here
    }
    

}