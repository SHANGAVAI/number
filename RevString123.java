package guvi;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args)
	{
		String str ;
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		String str1=new StringBuffer(str).reverse().toString();
		System.out.println(str1);
		int l=str1.length();
		System.out.println(l);
		char ch;
String s2=" ";
		for(int i=0;i<l;i++)
		{
			ch=str1.charAt(i);
			if(ch!='\0')
			{
				
				s2=s2+ch;
				str1=str1.replace(ch, ' ');
			}
			
			}
		System.out.println(s2);
		}
	}


