import java.util.*;
class fibonacci
{
	static int b=0,c=1,d;
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number upto you ");
		int num = sc.nextInt();
		System.out.print(b+" "+c+" ");
		for(int i=1;i<num;i++)
		{
			d=b+c;
			System.out.print(d+" ");
			b=c;
			c=d;
		}
				
	}
}