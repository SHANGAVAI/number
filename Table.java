/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hash;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Table {
    public static void main(String[] args) {
        int n,i=1,d;
        System.out.println("Enetr n:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(i<=10)
        {
            d=n*i;
            System.out.println(+n+"*"+i+"="+d);
            i++;
        }
        
        
        
    }   
}
