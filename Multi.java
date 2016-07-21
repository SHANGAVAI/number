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
public class Multi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,r=1,d,s;
		System.out.println("Enter n:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int k=n;
		while(n>0)
		{
			d=n%10;
			if(d!=0)
			{
			r=r*d;
			}
			n=n/10;
		}
		s=k*r;
		System.out.println(s);
        // TODO code application logic here
    }
}
