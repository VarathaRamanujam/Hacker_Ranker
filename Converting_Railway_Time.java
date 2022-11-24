package Hacker_Ranker;

public class Converting_Railway_Time {

	public static void main(String[] args) {
		Converting_Railway_Time obj = new Converting_Railway_Time();
		obj.timeConversion("07:05:45PM");
	}

	 public  String timeConversion(String s) {
	        
	      
	        String ss[] = s.split(":");
	        String s1="";
	        String s2=ss[1];
	        String s3="";
	        
	        int hour = Integer.parseInt(ss[0]);// 7
	        s1=ss[0];
	        if(hour ==12){
	            if(ss[2].contains("AM")){
	              s1="00";  
	            }
	        }
	        
	        if(ss[2].contains("PM")){
	            if(hour==12){
	                s1=ss[0];
	            }
	            else
	            s1=hour+12+"";
	        }
	       
	      
	      //step3 
	       for(int i=0;i<2;i++)
	       s3+=ss[2].charAt(i);
	       
	        System.out.println( s1+":"+s2+":"+s3);
	        return  s1+":"+s2+":"+s3;
	   

	    }
}
