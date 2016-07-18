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
public class Vowels {
    public static void main(String[] args) {
        System.out.println("Enetr the character:");
        Scanner sc=new Scanner(System.in);
        char ch;
        ch=sc.next().charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
            System.out.println("Given character "+ch+" is vowel");
        }
        else
        {
            System.out.println("Given character "+ch+" is Consonant");
        }
        
        
    }
    
}
