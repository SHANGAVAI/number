/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package newclass;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Split {
    public static void main(String[] args) {
        int i;
        String str,words;
        System.out.println("Enter the string:");
        Scanner sc=new Scanner(System.in);
        words=sc.nextLine();
       String[] result=words.split("\\s");
       for(i=0;i<result.length;i++)
       {
           if(i%2==0)
           {
             str=new StringBuffer(result[i]).reverse().toString();
             System.out.println(str);
           }
           else if(i%2!=0)
           {
               System.out.println(result[i]);
           }
           
       }
    }
    
}
