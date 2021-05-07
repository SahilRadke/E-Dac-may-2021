//two no. takes input and display product
import java.util.Scanner ;
 clsss Product{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the first no: ");
		int num1 = scan.nextInt();
		System.out.print("Enter the second no: ");
		int num2 = scan.nextInt();
		scan.close();
		int product = num1*num2;
		System.out.println("Output: "+product);
	}
}
