package Hacker_Ranker;

import java.util.ArrayList;
import java.util.List;

public class Prefix_Contains {

	public static void main(String[] args) {
		List ls=new ArrayList();
		ls.add("as");
		ls.add("asfjbfkj");
		ls.add("kjyjkdhgdu");
		ls.add("asc");
		ls.add("dh;idkd");
		ls.add("kj");
		Prefix_Contains obj = new Prefix_Contains();
		obj.noPrefix(ls);
	}
    public static void noPrefix(List<String> words) {
        String ls[] = new String [words.size()];
         for(int i=0;i<words.size();i++)
         ls[i]=words.get(i);
         
         String s="";
          boolean check=true;
          
       //    for(int i=0;i<words.size();i++)
       //    System.out.println(ls[i]);
       
      // System.out.println(ls[3].contains(ls[0]));
          
         for(int i=0;i<ls.length;i++){
             for(int j=i+1;j<ls.length;j++){
                 if(ls[j].contains(ls[i])){
                   s=ls[j];
                    check=false;
                    
                 }
             }    
         }
          if(check==true)
             System.out.println("GOOD SET ");
             else{
              System.out.println("BAD SET ");
                    System.out.println(s);
             }
       }

}
