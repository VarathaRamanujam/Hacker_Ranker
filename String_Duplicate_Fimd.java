package Hacker_Ranker;

import java.util.Scanner;

public class String_Duplicate_Fimd {

	public static void main(String[] args) {
		String_Duplicate_Fimd obj = new String_Duplicate_Fimd();
		obj.String_Duplicate_Find_Para();
	}

Scanner sc = new Scanner(System.in);
	private void String_Duplicate_Find_Para() {
		String s = sc.nextLine();
		s="Hello a my dear my a friends happy to to see you guys guys";
		String ss[] = s.trim().split(" ");
		
		for(int i=0;i<ss.length;i++) {
			boolean flag =true;
			for(int j=i-1;j>=0;j--) {
				if(ss[i].equals(ss[j]))
					flag=false;
			}
			if(flag ==true)
				System.out.println(ss[i]);
		}
		
		
//		for(String s1:ss)
//		System.out.println(s1);
		
		
	}

}
