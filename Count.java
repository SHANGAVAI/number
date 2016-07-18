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
public class Count {
    public static void main(String[] args) {
        int r=0,i,d,n,count=0;
        System.out.println("Enetr n:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0)
        {
            n=n/10;
            count++;
        }
        System.out.println("Number of Digits in the given number is:"+count);
    }
    
}
