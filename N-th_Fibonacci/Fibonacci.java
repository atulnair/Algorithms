

import java.util.Scanner;

public class Fibonacci 
{
	double f=0;
	double mem[]=new double[1001];
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		int n =scanner.nextInt();
		System.out.println(n+"-th Fibonacci number is: "+new Fibonacci().fibo2(n));
		scanner.close();
	}	
	public double fibo2(int n)
	{
		for(int k=1;k<=n;k++)
		{
		if(k<=2)
			f=1;
		else
			f=mem[k-1]+mem[k-2];
		mem[k]=f;
		}
		return mem[n];
		
	}
}













/*
 * public double fibo(int n)
	{
		if(n<=2)
			f=1;
		else
			f=fibo(n-1)+fibo(n-2);
		return f;
		
	}
	
	public double fibo1(int n)
	{
		if(mem[n]!=0)
			f=mem[n];
		else if(n<=2)
			f=1;
		else
			f=fibo1(n-1)+fibo1(n-2);
		mem[n]=f;
		return f;
		
	}
 */
