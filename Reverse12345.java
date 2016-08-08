package Logical;

import java.util.Scanner;

public class Reverse12345 {
	public static void main(String[] args)
	{
		int i,j,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:");
		n=sc.nextInt();
		int k=n;
		int arr[]=new int[n];
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<k;i++)
			{
			System.out.print(arr[i]);
			System.out.print(arr[n-1]);
			n--;
			}
		//System.out.println(arr[0]);
	}

}
