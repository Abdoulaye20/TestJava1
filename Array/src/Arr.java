import java.util.Scanner;

public class Arr {

	public static void main(String[] args) {
		int size,i,j,temp;
		int arr[] = new int [50];
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of element in your array: ");
		size= scan.nextInt();
		System.out.println("Enter the element in the array:");
		for (i=0; i<size; i++)
		{
			arr[i] = scan.nextInt();
		}
		System.out.print("The resultant array is :");
		for(i = 0; i<size; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println(" this is how I am learning java");
			

	}

}
