public class Pattern16
{
	public static void main(String[] args)
	{
		int rows = 5;
		System.out.println("Printing the pattern");
		for (int i = rows; i >= 1; i--)
		{
			for (int j = rows; j >= i; j--)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}