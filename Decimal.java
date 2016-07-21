/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package multi;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Decimal {
    public static void main(String[] args) {
        int n,d,r=0;
        System.out.println("Enter n:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0)
        {
        d=n%2;
        r=r*10+d;
        n=n/2;
        
    }
        System.out.println(r);
    
}
}
