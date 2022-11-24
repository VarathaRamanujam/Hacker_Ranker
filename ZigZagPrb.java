package Hacker_Ranker;

public class ZigZagPrb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZigZagPrb obj = new ZigZagPrb();
		obj.ZigZagPrb_1();
	}

	private void ZigZagPrb_1() {
		int a[]= {1,2,3,4,5,6,7};
		int n=a.length;
		int mid =(a.length+1)/2;
		
		 for(int i=0;i<n;i++){
	            for(int j=0;j<n;j++){
	                
	                if(i+j==n+3 && j>i ){
	                	System.out.println(a[i]);
	                    int temp = a[i];
	                   
	                    a[i]=a[j];
	                   // System.out.println(a[i]);
	                    a[j]=temp;
	                }
	                
	            }
	        }
	        
	        
	        
	        for(int i = 0; i < n; i++){
	            System.out.print(a[i]+" ");
	        }
	     
		
		
	}

}
