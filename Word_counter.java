import java.lang.*;
import java.util.*;
class WordCounter{ 
	public static void main(String args[])
	{
		String ch;
	 	do
		{
			int c=0,m,n;
			String s1;
			String data[];
			Scanner s=new Scanner(System.in);
			System.out.println("Enter your Text : ");
			s1=s.nextLine();
			m=s1.length();
			data=s1.split(" ");
			if(m==0)
			{
				System.out.println("!!! Please enter any word or sentence");
			}
			else
			{
				for(int i=0;i<m;i++)
				{
					if(s1.charAt(i)==' ')
					c=0;    
				
		
					else
					{
						c++;
						n=i;
						for(i=n;i<m;i++)
						{
							if (s1.charAt(i)==' ' && s1.charAt(i+1)!=' ')
							c++;
						}
					}				
				}
				System.out.println("\n>>>There are "+c+" Words Present in above line");
			}
			
			System.out.println("\nDo you want to count again ? ");
			System.out.println("Please enter Y or y ! !");
			ch=s.nextLine();
		}
                while(ch.equals("Y") || ch.equals("y"));
		
	}
}