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
public class Armstrong {
    public static void main(String[] args) {
        int n,a=0,r,k,sum=0,b;
        System.out.println("Enter n:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=n;
        b=n;
        while(n>0)
        {
            n=n/10;
            a++;
        }
        System.out.println(a);
        while(k!=0)
        {
            r=k%10;
            sum=(int) (sum+Math.pow(r,a));
            k=k/10;
        }
        System.out.println(sum);
        if(sum==b)
        {
            System.out.println("Given number "+b+" is Armstrong");
        }
        else
        {
             System.out.println("Given number "+b+" is not Armstrong");
        }
    }
    
}
