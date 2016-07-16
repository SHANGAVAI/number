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
public class Reverse {
    public static void main(String[] args) {
        String s1,str;
        System.out.println("Enter the String:");
        Scanner sc=new Scanner(System.in);
        s1=sc.nextLine();
        str=new StringBuffer(s1).reverse().toString();
        System.out.println("Reversed String is "+str);
    }
    
}
