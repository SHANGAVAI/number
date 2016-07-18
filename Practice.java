/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        System.out.println("Enetr n:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n<0)
        {
            System.out.println("Given number "+n+" is Negative");   
        }
        else if(n>0)
        {
            System.out.println("Given number "+n+" is Positive");
        }
        else if(n==0)
        {
            System.out.println("Given number is equal to zero");
        }
        
        // TODO code application logic here
    }
}
