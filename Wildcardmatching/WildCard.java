
import java.util.Scanner;
public class WildCard 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a pattern: ");
		String p=sc.nextLine();
		while(true)
		{
			System.out.println("Enter a string (enter q to quit): ");
			String string =sc.nextLine();
			if(string.equals("q"))
				break;
			if(new WildCard().match(string, p))
				System.out.println(string +" matches the pattern: "+ p+"\n");
			
			else
				System.out.println(string+ " doesn't match with the given pattern: "+p+"\n");
		}
		sc.close();
	}
	
    public boolean match(String S, String P) 
    {
        char[] string = S.toCharArray();
        char[] pattern = P.toCharArray();
        int m = string.length;
        int n = pattern.length;
        int pos = 0;
        boolean isFirst = true;
        
        for ( int i = 0 ; i < pattern.length; i++)	//Replacing multiple * with single * 
        {
            if (pattern[i] == '*') 
            {
                if (isFirst) 
                {
                    pattern[pos++] = pattern[i];
                    isFirst = false;
                }
            } 
            else 
            {
                pattern[pos++] = pattern[i];
                isFirst = true;
            }
        }

        boolean T[][] = new boolean[m + 1][n + 1];

        if (pos > 0 && pattern[0] == '*') 
            T[0][1] = true;
        
        T[0][0] = true;
        
        for (int i = 1; i < T.length; i++) 
        {
            for (int j = 1; j < T[0].length; j++) 
            {
                if (pattern[j-1] == '?' || string[i-1] == pattern[j-1]) 
                {
                    T[i][j] = T[i-1][j-1];
                }
                else if (pattern[j-1] == '*')
                {
                    T[i][j] = T[i-1][j] || T[i][j-1];
                }
            }
        }

        return T[m][pos];
    }


}
