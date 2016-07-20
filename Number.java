/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Number {
    public static void main(String[] args) {
        int n,r=0,d;
        System.out.println("Enter n:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0)
        {
            d=n%10;
            r=r*10+d;
            n=n/10;
                }
        System.out.println("Reverse a number:"+r);
    }
    
}
