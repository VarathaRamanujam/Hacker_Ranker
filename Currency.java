package Hacker_Ranker;
import java.text.NumberFormat;
import java.math.*;
import java.util.*;
public class Currency {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        double payment = scanner.nextDouble();
	        scanner.close();
	        
	        
//	       Math nb = new Math();
//	       nb.max(42, 8628);
	    NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
	    NumberFormat india = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
	    NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
	    NumberFormat france = NumberFormat.getCurrencyInstance(Locale.GERMAN);

	    System.out.println("US: " + us.format(payment));
	    System.out.println("India: " + india.format(payment));
	    System.out.println("China: " + china.format(payment));
	    System.out.println("France: " + france.format(payment));
}
}
