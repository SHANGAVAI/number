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
public class Norepeat {
    public static void main(String[] args) {
        String s1,s2;
        System.out.println("Enter the string:");
        Scanner sc=new Scanner(System.in);
        s1=sc.nextLine();
        int i;
        char a;
        s2=" ";
        for(i=0;i<s1.length();i++)
        {
            a=s1.charAt(i);
            if(a!='\0')
            {
                s2=s2+a;
                s1=s1.replace(a,' ');
            }
        }
        System.out.println(s2);
    }
    
}
