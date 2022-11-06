package Hacker_Ranker;

import java.util.Scanner;

public class Deque_count_of_Unique {
	 public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
       //  Deque deque = new ArrayDeque<>();
         int n = in.nextInt();
         int m = in.nextInt();
         int [ ] num = new int[n];
         for (int i = 0; i < n; i++) {
              num[i] = in.nextInt();              
         }
         
//       int  n=6;
//       int m=3;
//       int []num= new  int [n];
//       num[0]=5;
//       num[1]=3;
//       num[2]=5;
//       num[3]=2;
//       num[4]=3;
//       num[5]=2;
       
         
         int len[] = new int[m];
         int unique[]=new int [(n-m)+1];
         int i_unique=0;
         
         for(int i=0;i<n;i++){  // full loop
             if(i<((n-m)+1)){
                 int k=0;
                 for(int j=i;j<i+m;j++){
                     len[k]=num[j];
                     k++;
                 }
                 
//                 for(int ls:len)
//                	 System.out.println(ls);
//                 System.out.println();
                 
                int count=0;
                 for(int fr=0;fr<len.length;fr++){ // checking first loop
                     boolean flag = true;  // unique finding
                      // count=0;         // count the unique values
                     for(int sec=fr+1;sec<len.length;sec++){  // checking second loop
                         if(len[fr]==len[sec]){
                             flag=false;
                         }
                     }
                     if(flag==true){
                       count++;  
                     }
                     //
                 }
                 //System.out.println(count);
                 unique[i_unique++]=count;
                 
             }
         }
         
         int max=unique[0];
         for(int i=1;i<unique.length;i++){
             if(max<unique[i])
             max=unique[i];
         }
         System.out.println(max+" max");
     }
}
