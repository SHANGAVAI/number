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
public class Average {
    public static void main(String[] args) {
        int[] a=new int[5];
        int sum=0,i;
        System.out.println("Enetr arrays:");
        Scanner sc=new Scanner(System.in);
        for(i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        System.out.println(sum);
    }
    
}
