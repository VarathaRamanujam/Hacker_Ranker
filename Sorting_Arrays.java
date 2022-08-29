package Arrays;

public class Sorting_Arrays {

	public static void main(String[] args) {
		Sorting_Arrays obj = new Sorting_Arrays();
		obj.Sorting_Arrays_Asending();
		obj.Sorting_Arrays_Desending();
	}

	private void Sorting_Arrays_Desending() {
int ls[] = {45,57,64,7,8,899,54,10,1,3,01};
		
		int temp=0;
		for (int i=0;i<ls.length;i++) {
			for (int j=0;j<ls.length-1;j++) {
				
			if((ls[j]  < ls[j+1]) ) {
				temp=ls[j];
				ls[j]=ls[j+1];
				ls[j+1]=temp;
		         }
				}
		}
		for(int i=0;i<ls.length;i++) {
			System.out.print(ls[i]+" ");	
		}
System.out.println();
}
	

	private void Sorting_Arrays_Asending() {
		int ls[] = {45,57,64,7,8,899,54,10,1,3,01};
		
		int temp=0;
		for (int i=0;i<ls.length;i++) {
			for (int j=0;j<ls.length-1;j++) {
				
			if((ls[j]  > ls[j+1]) ) {
				temp=ls[j];
				ls[j]=ls[j+1];
				ls[j+1]=temp;
		         }
				}
		}
		for(int i=0;i<ls.length;i++) {
			System.out.print(ls[i]+" ");	
		}
System.out.println();
}
}
