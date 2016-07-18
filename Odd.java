/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice1;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Odd {
    public static void main(String[] args) {
        int n,i,sum=0;
        System.out.println("Enter n:");
       Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
        for(i=0;i<=n;i++)
        {
            if(i%2!=0)
            {
                sum=sum+i;
            }
        }
        System.out.println("Sum of odd digits:"+sum);
    }
    
}
