import java.util.*;
class fibonaccirecursion
{
	static int a=0,b=1,c;
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter the number upto you want to print");
		int num = sc.nextInt();
		System.out.print(a+" "+b+" ");
		fibonaccirecursion obj1 = new fibonaccirecursion();
		obj1.met1(num);
	}
	void met1(int j)
	{
		if(j>0)
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			met1(j-1);	
		}
	}
}