package Hacker_Ranker;
import java.text.NumberFormat;
import java.math.*;
import java.util.*;
public class Currency {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        //double payment = scanner.nextDouble();
	        scanner.close();
	        
	        double   payment =467667;
	    NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
	    NumberFormat india = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
	    NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
	  //  NumberFormat france = NumberFormat.getCurrencyInstance(Locale.GERMAN);
	    NumberFormat france = NumberFormat.getCurrencyInstance(Locale.getDefault());

	   System.out.println( NumberFormat.class.getName());
	    System.out.println("US\t : " + us.format(payment));
	    System.out.println("India\t : " + india.format(payment));
	    System.out.println("China\t : " + china.format(payment));
	    System.out.println("France\t : " + france.format(payment));
}
}
