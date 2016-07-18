/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Greatest {
    public static void main(String[] args) {
        int a,b,c,result;
        System.out.println("Enter teh numbers:");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
     if(a>b)
     {
         System.out.println("A is Greater");
     }
     else if(b>c)
     {
         System.out.println("B is greater");
     }
     else if(c>a)
     {
         System.out.println("C is greater");
     }
        
    }
    
}
