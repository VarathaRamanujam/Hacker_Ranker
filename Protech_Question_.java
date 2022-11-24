package Hacker_Ranker;

public class Protech_Question_ {

	public static void main(String[] args) {
		Protech_Question_ obj =  new Protech_Question_();
		//obj.Protech_Question_Patter();
		obj.Protech_Question_Patter_Diff();
	}

	private void Protech_Question_Patter_Diff() {
		int num=1;
		
       for(int i=1;i<=9;i++) {
	     for(int j=1;j<=8;j++) {
	    	 if(num>=j)
	    	 if(i%2==0) {	 
	    		 if(j%2!=0)
	    			 System.out.print("# ");
	    		 else
	    			 System.out.print(i+" ");
	    	 }else {
	    		 if(j%2==0)
	    			 System.out.print("# ");
	    		 else
	    			 System.out.print(i+" ");
	    	 }
	     }	
	     System.out.println();
	     if(i<5 ) 
	    	 num++;
	     else
	    	 num--;
     }
	}

	private void Protech_Question_Patter() {
		
		for(int i=0;i<5;i++) {		
			for(int j=4;j>=0;j--) {
				if(i<j) 
					System.out.print(" ");
				else  
					if(i%2!=0)
						System.out.print("#");
					else 
						System.out.print(i+1);		
			}System.out.println();
		}
	}

}
