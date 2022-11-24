package Hacker_Ranker;

import java.util.ArrayList;
import java.util.List;

public class String_HTML {

	public static void main(String[] args) {
		String_HTML obj = new String_HTML();
		obj.String_h1();
	}

	private void String_h1() {
		String []s=new String[1];
		
		 s[0]="<h1><h4>Nayeem loves counseling</h4></h1>";
//     	 s[1]="<h1>Sanjay has no watch</h1><h2>Sanjayutewiu has no watch</h2>";
//		 s[2]="<Sa premium>Imtiaz has a secret crush</Sa premium>";
		
		for(int len=0;len<s.length;len++) {
		String ss="";
		int count =0;	
		List name = new ArrayList() ;
		String s2="";
		for(int i=0;i<s[len].length();i++) {
			if((s[len].charAt(i)=='<'  || count ==1)&& s[len].charAt(i)!='/') {
				count =1;
				ss+=s[len].charAt(i);
			
			if(s[len].charAt(i)=='>') {
				name.add(ss);
				ss="";
				count =0;
//				break;
			}	
			}
		}
		
		
		for(int row =0;row<name.size()-1;row++) {
			boolean check=true;
			for(int col=row+1;col<name.size();col++) {
				
				if(name.get(row).equals(name.get(col))) {
					System.out.println(name.get(row));
					check=false;
					
				}
			}
			if(check==false) {
				int j=0;
				String s1="";
				//System.out.println(ss);
				for(int i=0;i<=name.get(row).length();i++) {
					if(i==1)
						s1+="/";
					else 
						s1+=ss.charAt(j++);	
				}
				s2=s1;
				System.out.println(s2);
			}
		}
//		for(Object o:name)
//			System.out.println(o+" "+len);
		
		

	//if(s[len].contains(s2) ) {
			
		//s[len]=s[len].replaceAll(ss, s2);
		//s[len]=s[len].replaceAll(s2, " ").trim();
		//System.out.println(s[len]);
//			String	sss[ ]=s[len].split(" ");
//			  for(int s0=0;s0<sss.length;s0++)
//				System.out.print(sss[s0]+" ");

		//}else 
//			System.out.println("None");
//		System.out.println();
	}
	}
}
