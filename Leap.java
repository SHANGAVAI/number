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
public class Leap {
    public static void main(String[] args) {
        int yr;
        System.out.println("Enter the year:");
        Scanner sc=new Scanner(System.in);
        yr=sc.nextInt();
        if(yr%4==0)
        {
            System.out.println("Given year "+yr+" is Leap year");
        }
        else
        {
            System.out.println("Given year "+yr+" is not an Leap year");
        }
    }
    
}
