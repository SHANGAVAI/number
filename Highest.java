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
public class Highest {
    public static void main(String[] args) {
        int[] a=new int[5];
        int i,min=32767,max=0;
        System.out.println("Enter the arrays:");
        Scanner sc=new Scanner(System.in);
        for(i=1;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=1;i<a.length;i++)
        {
        if(max<a[i])
        {
            max=a[i];
        }
        else if(min>a[i])
        {
            min=a[i];
        }
        }
        System.out.println("Maximum number of a given array:"+max);
        System.out.println("Minimum number of a given array:"+min);
    }
}
