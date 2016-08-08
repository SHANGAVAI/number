package Logical;

import java.util.Scanner;

public class Arraysame {
	public static void main(String[] args)
	{
		int i,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:");
		n=sc.nextInt();
		int[] arr1=new int[n];
		for(i=0;i<n;i++)
		{
			arr1[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(i==arr1[i])
			{
				System.out.println(arr1[i]);
			}
		}
		
	}

}
