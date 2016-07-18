/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice1;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Factorial {
    public static void main(String[] args) {
        int n,i,fact=1;
        System.out.println("Enetr n:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n<0)
        {
            System.out.println("Sorry,Factorial is not exixts for Negative values");
        }
        for(i=1;i<=n;i++)
        {
            fact=fact*i;
            
        }
        System.out.println("Factorial of "+n+"! is "+fact);
    }
    
}
