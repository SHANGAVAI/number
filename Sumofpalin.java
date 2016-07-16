/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package evenodd;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Sumofpalin {
    public static void main(String[] args) {
     int a,b,n,c,s,x=0,r=0,d;
        System.out.println("Enter n:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0)
        {
            d=n%10;
            r=r+d;
            n=n/10;      
        }
        System.out.println(r);
        s=r;
        while(r>0)
        {
            b=r%10;
            x=x*10+b;
            r=r/10;
        }
        System.out.println(x);
        if(s==x)
        {
            System.out.println("Sum of given two digit number is Palindrome");
        }
        else
        {
            System.out.println("Sum of given two digit number is not a Palindrome");
        }
        
       
    }
    
}
