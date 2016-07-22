/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package activity;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Activity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int[] a=new int[2];
        int[] b=new int[2];
        int i,j,sum=0;
        System.out.println("Enter the numbers:");
        Scanner sc=new Scanner(System.in);
        for(i=0;i<a.length;i++)
        {
        a[i]=sc.nextInt();
        }
        for(j=0;j<b.length;j++)
        {
        b[j]=sc.nextInt();
        }
        for(i=0;i<a.length;i++)
        {
            for(j=0;j<b.length;j++)
            {
        sum=a[i]+b[j];
            }
        }
        System.out.println(sum);
        // TODO code application logic here
    }
}
