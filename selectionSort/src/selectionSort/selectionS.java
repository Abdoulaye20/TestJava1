package selectionSort;
import java.util.Scanner;
public class selectionS {

	public static void main(String[] args) {
		int size, i,j,temp;
		int [] arr= new int[20];
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		size = scan.nextInt();
		System.out.println("Enter the elements of the array: ");
		for (i=0; i<size; i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("The array before sorting is :");
		for(i=0; i<size; i++)
		{
			System.out.print(arr[i] + " ");
		}
		// sorting code
		for (i=0; i<size; i++)
		{
			for (j=i+1; j<size; j++)
			{
				if (arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("The array after sorting is :");
		for(i=0; i <size; i++)
		{
			System.out.println(arr[i] + " ");
		}

	}

}
