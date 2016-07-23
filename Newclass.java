/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package newclass;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Newclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i,d,a,n,r=0;
        System.out.println("Enter n:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=0;i<=n;i++)
        {
            d=i%10;
            a=i/10;
            if(d==2)
            {
                r=r+1;
            }
            if(a==2)
            {
                r++;
            }
        }
        System.out.println("The count of 2's from 0 to "+n+" is "+r);
    }
}
