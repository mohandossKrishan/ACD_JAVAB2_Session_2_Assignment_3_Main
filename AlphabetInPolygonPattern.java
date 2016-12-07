public class AlphabetInPolygonPattern
{
	public static void main(String args[])
	{
		char c;
		int i;
		for(int m=1;m<=5;++m)        
		{
			c='A';
			if (m>3)
			{
				i = 6-m;
			}	
			else
			{
				i = m;
			}
			for(int j=i;j<3;++j)        
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;++k)      
			{
				System.out.print(c);
			++c;
			}
			c-=2;
			for(int l=1;l<i;++l)      
			{
				System.out.print(c);
				--c;
			}
			System.out.println();    
		}

       } 
} 