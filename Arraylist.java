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
public class Arraylist {
    public static void main(String[] args) {
        int[] a=new int[5];
        int i;
        System.out.println("Enter arrays:");
        Scanner sc=new Scanner(System.in);
        for(i=0;i<a.length;i++)
        {
        a[i]=sc.nextInt();
        if(i==a[i])
        {
            System.out.println(a[i]);
        }
        /*else
        {
            System.out.println("No Array position is equal to its index");
        }*/
        }
}
}
