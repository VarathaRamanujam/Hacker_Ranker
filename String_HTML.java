package Hacker_Ranker;

public class String_HTML {

	public static void main(String[] args) {
		String_HTML obj = new String_HTML();
		obj.String_h1();
	}

	private void String_h1() {
		String []s=new String[3];
		
		 s[0]="<h1>Nayeem loves counseling</h1>";
		 s[1]="<h1>Sanjay has no watch</h1>";
		 s[2]="<Sa premium>Imtiaz has a secret crush</Sa premium>";
		
		for(int len=0;len<s.length;len++) {
		String ss="";
		int count =0;
		
		for(int i=0;i<s[len].length();i++) {
			if(s[len].charAt(i)=='<'  || count ==1) {
				count =1;
				ss+=s[len].charAt(i);
			
			if(s[len].charAt(i)=='>') {
				count =i;
				break;
			}	
			}
		}
		
		int j=0;
		String s1="";
		//System.out.println(ss);
		for(int i=0;i<=ss.length();i++) {
			if(i==1)
				s1+="/";
			else 
				s1+=ss.charAt(j++);
			
		}

		if(s[len].contains(s1) ) {
		s[len]=s[len].replaceAll(ss, s1);
		System.out.println(s[len]=s[len].replaceAll(s1, "").trim());
		}else 
			System.out.println("None");
	}
	}
}
