import java.util.Scanner;

public class ArrayInsert {

	public static void main(String[] args) {
		int size, pos, item;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        size= s.nextInt();
        int a[] = new int[size+1];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < size; i++)
        {
            a[i] = s.nextInt();
        }
        System.out.print("Enter the position where you want to insert element:");
        pos = s.nextInt();
        System.out.print("Enter the element you want to insert:");
        item = s.nextInt();
        for(int i = (size-1); i >= (pos-1); i--)
        {
            a[i+1] = a[i];
        }
        a[pos-1] = item;
        System.out.print("After inserting:");
        for(int i = 0; i < size; i++)
        {
            System.out.print(a[i]+",");
        }
        System.out.print(a[size]);
	}

}
