package Arrays;
import java.util.*;
public class Array_Searching {

	public static void main(String[] args) {
		Array_Searching obj = new Array_Searching();
		obj.Array_Searching();
	}

	private void Array_Searching() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Array length : ");
		int length=sc.nextInt();
		
		int ls[]= new int[length];
		for(int i=0;i<length;i++) {
			System.out.print("Enter a number : ");
			ls[i]=sc.nextInt();
			//System.out.println();
		}
		System.out.print("Enter a number  that present in the list or not : ");
		int num=sc.nextInt();
		boolean a = true;
		
		
		for (int i=0;i<ls.length;i++) {
			if(num==ls[i]) {
				a=false;
				System.out.println(num +" it is present");
				break;
			}
		}
		
		if(a==true) {
			System.out.println(num+" it is not present");
		}
	}

}
