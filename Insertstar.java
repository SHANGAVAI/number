package Logical;
import java.util.Scanner;


public class Reverse
{
    public static void main(String[] args)
		{
			int i,l;
			Scanner sc=new Scanner(System.in);
			String str=sc.nextLine();
			l=str.length();
			for(i=0;i<l-1;i++)
			{
				if(str.charAt(i)==str.charAt(i+1))
				{
					System.out.print(str.charAt(i)+"*");
				}
				else
				{
					System.out.print(str.charAt(i));
                                        
				}
                                if(str.charAt(i+1)=='\0')
                                {
                                    System.out.println(str.charAt(l-1));
                                        }
			}
                        System.out.print(str.charAt(l-1));
		}
    
}
