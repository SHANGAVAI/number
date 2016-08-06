package guvi;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args)
	{
		String str ;
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		int l=str.length();
		//System.out.println(l);
		char[] ch;
		for(int i=0;i<l-1;i++)
		{
			ch=str.toCharArray();
			if(ch[i]!=ch[i+1])
			{
				System.out.print(ch[i]);
			}
			if(ch[i]==ch[i+1])
			{
				System.out.println(ch[i]+"*"+ch[i+1]+ch[l-1]);
			}
		}
	}
	}


