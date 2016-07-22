/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package activity;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author Student
 */
public class Position {
    public static void main(String[] args) {
        int[] a=new int[4];
        int i,sum=0,sum1=0,total;
        System.out.println("Enter the strings:");
        Scanner sc=new Scanner(System.in);
       for(i=0;i<a.length;i++)
       {
           a[i]=sc.nextInt();
           if(i%2==0)
           {
               sum=(int) (sum+Math.pow(a[i],2));
               //System.out.println(sum);
           }
           else if(i%2!=0)
           {
               sum1=(int) (sum1+Math.pow(a[i],3));
               //System.out.println(sum1);
           }
       }
       total=sum+sum1;
        System.out.println(total);
        
    }
    
}
