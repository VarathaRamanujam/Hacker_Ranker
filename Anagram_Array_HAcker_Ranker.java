package Arrays;

public class Anagram_Array_HAcker_Ranker {
static int a=12;
	public static void main(String[] args) {
		Anagram_Array_HAcker_Ranker obj = new Anagram_Array_HAcker_Ranker();
		obj.Anagram_Array_HAcker_Ranker();
		 a=100;
		
	}

	private void Anagram_Array_HAcker_Ranker() {
		System.out.println(a+a);
		String a="anaram";
		String b="anaram";
		String a1 = a;
		String b1=b;		
		// Another methods , almost all test cases passes
		String a2=a.toLowerCase();
		String b2=b.toLowerCase();
		
		int sum_1=0;
		int sum_2=0;
		for(int i=0;i<a2.length();i++) {
		
			char c = a2.charAt(i);
			sum_1=c+sum_1;
      
		}
		for(int i=0;i<b2.length();i++) {
			char d = b2.charAt(i);
		
            sum_2 = sum_2 +d;
		}
		//System.out.println(sum_1);
		//System.out.println(sum_2);
		
	      int freq[]=new int[a1.length()];
	      int freq1[]= new int [b1.length()];
	      boolean s =true;
	      if(a1.length() !=b1.length()){
	            s=false;
	            System.out.println("NOT ANAGRAMS");
	        }
	       else
	        {   // count the letter using char
	    	   a=" ";
	    	   b=" ";
	        for(int i=0;i<a1.length();i++){
	            char c = a1.charAt(i);
	            int count=1;
	            for(int j=i;j<a1.length();j++){
	                if(j!=i && ( c==a1.toUpperCase().charAt(j) || c==a1.toLowerCase().charAt(j))){
	                    count++;
	                    
	                    freq[i]=count;
	                }else if(count==1) { 
	                	 //a=a+c+" ";
	                	freq[i]=count;
	                }
	            }
	        }
	        for(int i=0;i<b1.length();i++){
	            char c = b1.charAt(i);
	            int count=1;
	            for(int j=i;j<b1.length();j++){
	                if(j!=i && ( c==b1.toUpperCase().charAt(j) || c==b1.toLowerCase().charAt(j))){
	                    count++;	                    
	                    freq1[i]=count;
	                }else if(count==1) {
	                	freq1[i]=count;
	                }
	            }
	        }
	        
          String a_big="";
          String b_big="";
	        for(int i=0;i<freq.length;i++ ) {
	        	if(freq[i]==1) {
	        		//System.out.println(i);
	        		a=a1.charAt(i)+a;	        		
	        	
	        	}else
	        		a_big=a1.charAt(i)+a_big;
	        	if(freq1[i]==1) {
	        		//System.out.println(i);
	        		b=b1.charAt(i)+b;	        			        		
	        	}else
	        		b_big=b1.charAt(i)+b_big;
	        }//System.out.println(b_big);
	         //System.out.println(a_big);
	        int count=0;
	        int count_big=0;
	        for(int i=0;i<a.length();i++) {
	        	char c =a.charAt(i);	             
	        	for(int j=0;j<b.length();j++) {
	        		if((c==b.toUpperCase().charAt(j))  || (c==b.toLowerCase().charAt(j))     ) {
	        			count++;
	        		}
	        	}
	        }
	        for(int i=0;i<a_big.length();i++) {
	        char c_big=a_big.charAt(i);
        	
        	for(int j=0;j<b_big.length();j++) {
        		if((c_big==b_big.toLowerCase().charAt(j))  || (c_big==b_big.toUpperCase().charAt(j))) {
        			count_big++;
        			break;
        		}
        	}
	        }
	        if((count==a.length())   && (count_big==a_big.length()) && (sum_1==sum_2)) {
	        	System.out.println("anagaram");
	        }else 
	        	System.out.println("Not anagaram");
        
	        
	        
	        
	        
//	        int check1[]=new int[count];
//	        int check2[]=new int[count];
//	        int j=0,k=0;
	        
	       /* for(int i=0;i<freq.length;i++) { // printing the freq and freq1
	        	if(freq[i]>1) {
	        	check1[j]=i;
	        		//System.out.print(freq[i]+"---"+a.charAt(i)+"   ");
	        		j++;
	        	}
	        	if(freq[i]>1) {
	        		check2[k]=i;
	        		//System.out.println(freq1[i]+"-- "+b.charAt(i));
	        		k++;
	        	}	        	
	        }
	        int sum=0;
	        for( int i=0;i<check1.length;i++) {
	        	//System.out.println(a.charAt(check1[i])+ " "+ b.charAt(check2[i]));
	        	for(int l=0;l<check2.length;l++) {
	        		System.out.println(a.charAt(check1[i]));
	    if((a.toUpperCase().charAt(check1[i]) == b.toUpperCase().charAt(check2[l]) ) || (a.toLowerCase().charAt(check1[i]) == b.toLowerCase().charAt(check2[l]))) {
	        			sum++;
	        		}
	        	}
	        }
	        if(sum==4) {
	        	System.out.println("anagaram");
	        }else 
	        	System.out.println("Not anagaram");   */
	        
	        
//		       for(int i=0;i<freq.length;i++) { // printing the freq and freq1 position stored in 
//        	      if(freq[i]==1) {
//        	        check1[j]=i;
//        		    System.out.print(freq[i]+"---"+a.charAt(i)+"   ");
//        		    j++;
//        	    }
//        	      if(freq1[i]==1) {       	    	
//        		    check2[k]=i;
//        		    System.out.println(freq1[i]+"-- "+b.charAt(i) + " ");
//        		    k++;
//        	}	        	
//        }  // System.out.println(check1.length);
//		       int sum=0;
//		        for( int i=0;i<check1.length;i++) {
//		        	//System.out.println(a.charAt(check1[i])+ " "+ b.charAt(check2[i]));
//		        	for(int l=0;l<check2.length;l++) {
//		        		//System.out.println(a.charAt(check1[i]));
//		    if((a.toUpperCase().charAt(check1[i]) == b.toUpperCase().charAt(check2[l]) ) || (a.toLowerCase().charAt(check1[i]) == b.toLowerCase().charAt(check2[l]))) {
//		        			sum++;
//		        		}
//		        	}
//		        } 
//		        if(sum==4  && (sum_1==sum_2)) {
//		        	System.out.println("anagaram");
//		        }else 
//		        	System.out.println("Not anagaram");
//	        
	        
	        
	       
	        
	}
	}  
}


