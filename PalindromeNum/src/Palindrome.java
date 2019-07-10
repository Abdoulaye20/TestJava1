import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		int num, remainder,result=0,i;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number a number :");
		num = scan.nextInt();
		int temp=num;
		while ( num > 0) {
			remainder= num%10;
			result = result *10 + remainder;
			num = num /10;
			
		}
		if(temp == result)
		{
			System.out.println("The number your give is a palindrome number.");
		}
		else
		{
			System.out.println("The number you gave in not a palindrome number.");
		}
			
			
		
	}

}
