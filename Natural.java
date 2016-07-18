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
public class Natural {
    public static void main(String[] args) {
        int n,i,sum=0;
        System.out.println("Enter n:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=0;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("Sum of natural numbers are:"+sum);
        
    }
}
