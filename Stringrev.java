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
public class Stringrev {
    public static void main(String[] args) {
        String s1,s2;
        System.out.println("Enter the string:");
        Scanner sc=new Scanner(System.in);
        s1=sc.nextLine();
        s2=new StringBuffer(s1).reverse().toString();
        System.out.println(s2);
        char ch;
        int i;
        for(i=0;i<s2.length();i++)
        {
        ch=s2.charAt(i);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
            s2=s2.replace(ch,' ');
        }
        }
            System.out.println(s2);
    
}
}
