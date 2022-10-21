package Hacker_Ranker;

public class String_HTML {

	public static void main(String[] args) {
		String_HTML obj = new String_HTML();
		obj.String_h1();
	}

	private void String_h1() {
		String []s=new String[4];
		
		 s[0]="<h1>Nayeem loves counseling</h1>";
		 s[1]="<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>";
		 s[2]="<SA premium>Imtiaz has a secret crush</SA premium>";
		
		 
		 s[0]=(String) s[0].subSequence('<', '>');
		 
		 System.out.println(s[0]);
		 try {
			for(int i=0;i<s.length;i++) {
			s[i]=s[i].replaceAll("</h1>", "<h1>");
			//System.out.println(s.toString());
			
			String []ss=s[i].split("<h1>");
			for(String s1:ss)
				System.out.println(s1);
			 }
		} catch (Exception e) {
             System.out.println("None");			
		}
	}

}
