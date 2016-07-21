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
public class Arraylist21 {
    public static void main(String[] args) {
        int[] a=new int[10];
        int i,c=0;
        System.out.println("Enter the arrays:");
        Scanner sc=new Scanner(System.in);
        for(i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        if(a[i]==a[i])
        {
            c++;
        }
        if(c==2)
        {
            System.out.println(a[i]);
        }
    }
    
}
}
