/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package evenodd;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Evenodd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        System.out.println("Enter n:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n%2==0)
        {
            System.out.println("Given number "+n+" is Even");
        }
        else
        {
            System.out.println("Given number is "+n+" Odd");
        }
        
        // TODO code application logic here
    }
}
