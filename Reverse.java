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
public class Reverse {
    public static void main(String[] args) {
        System.out.println("Enetr the string:");
        String s1;
        Scanner sc=new Scanner(System.in);
        s1=sc.nextLine();
        String s2=new StringBuffer(s1).reverse().toString();
        System.out.println("Reversed String is:"+s2);
    }
}
