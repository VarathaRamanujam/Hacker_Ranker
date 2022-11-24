package Hacker_Ranker;

public class Encry_String {

	public static void main(String[] args) {
		Encry_String obj = new Encry_String();
		obj.Encry_String_Full();
	}

	private void Encry_String_Full() {
	
		
		
		//okffng-Qwvb   Lipps_Asvph!
		String s="www.abc.xy";
		String ss="";
		int num=87;
		char ls[] = s.toCharArray();
		System.out.println(24%26);
		for (int i=0;i<ls.length;i++) {	
	           	if(ls[i]>64 && ls[i]<91) {
				      if((ls[i]+num)>=90) {
				     	ls[i]=(char) ((ls[i]-(26-num)));
				    	ss+=ls[i];
				       }else {
				         ls[i]=(char) (ls[i]+num);
				         ss+=ls[i];
				    }
			     
	           	}else if(ls[i]>=97 && ls[i]<=122) {
	    			if(ls[i]+num>=122) {
	    				ls[i]=(char) ((ls[i]-(26-num)));
	    				ss+=ls[i];
	    			}else {
	    			ls[i]=(char) ((ls[i]+num));
	    			ss+=ls[i];
	    			}
	    		}else 
	        	  ss+=ls[i];
	         }
		
	//	System.out.print(ss);
		
		
		
		
		
		
		String encrypted = ""; 
	    
	    for(int i = 0; i < s.length();i++){ 
	        
	        char c = s.charAt(i);

	        if(c >= 'A' && c<= 'Z'){
	            c = (char) (((c - 'A') + num) % 26 + 'A');
	        } else if (c >= 'a' && c<= 'z'){
	            c = (char) (((c - 'a') + num) % 26 + 'a');
	        }
	        encrypted = encrypted + c;
	    }
		System.out.println(encrypted);
	    }

}
