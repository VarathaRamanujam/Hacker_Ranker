package Arrays;

import java.math.BigInteger;

public class String_To_Integer_Hacker_Rank {

	public static void main(String[] args) {
		String_To_Integer_Hacker_Rank obj = new String_To_Integer_Hacker_Rank();
		obj.String_To_Integer_Hacker_Rank();
	}

	private void String_To_Integer_Hacker_Rank() {
		String n="669483106578092405936560831017556154622901950048903016651285";
		BigInteger a = new BigInteger(n);
        if (a.isProbablePrime(3)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }

	}

}
