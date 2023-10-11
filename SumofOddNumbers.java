package Package4;

public class SumofOddNumbers
{
	public static void main(String[] args)
	{
		int sum=0;
		for(int i=7;i<=21;i++)
		{
			if(i%2!=0)
			{
				sum = sum + i; 
			}
		}
		System.out.println(sum);
	}
}
