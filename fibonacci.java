import java.util.*;
class fibonacci
{
	static int a=0,b=1,c;
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number upto you want to print");
		int num = sc.nextInt();
		System.out.print(a+" "+b+" ");
		for(int i=1;i<num;i++)
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
				
	}
}