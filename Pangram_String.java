package Hacker_Ranker;

public class Pangram_String {

	public static void main(String[] args) {
		Pangram_String obj = new Pangram_String();
		obj.Pangram_String();
	}

	private void Pangram_String() {  //QWERTYUIOPASDFGHJKLZXCVBNM
		String s="qwertyuiopasdfghjklzxcvbnm ";
		//System.out.println(s.length());
		String c = "We promptly judged antique ivory buckles for the next prize";
		c=c.toLowerCase();
		int count =0;
		for (int i=0;i<s.length();i++) {
			for (int j=0;j<c.length();j++) {
				if (s.charAt(i)==c.charAt(j)) {
					count++;
					break;
				}
			}
		}System.out.println(count);
		if((s.length())==count) {
			System.out.println("hi");
		}
	}

}
