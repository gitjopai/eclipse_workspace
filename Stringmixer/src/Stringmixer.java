public class Stringmixer {
	public static void main (String  []args){
		String wort1 = "drerttgr";
		String wort2 = "DE";
		int zaehler;
		char c;
		char d;
		for (zaehler = 0; zaehler <= 32; zaehler++){
			if ((wort1.charAt(zaehler) != '\0') && ((wort2.charAt(zaehler) != '\0'))){
				c = wort1.charAt(zaehler);
				d = wort2.charAt(zaehler);
				System.out.println(c);
				System.out.println(d);
			}
			if ((wort1.charAt(zaehler) != '\0') && ((wort2.charAt(zaehler) == '\0'))){
				c = wort1.charAt(zaehler);
				System.out.println(c);
			}
			if ((wort1.charAt(zaehler) == '\0') && ((wort2.charAt(zaehler) != '\0'))){
				d = wort2.charAt(zaehler);
				System.out.println(d);
			}
		}
	}
}