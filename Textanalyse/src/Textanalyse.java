public class Textanalyse {
	public static void main (String []args){
		String zaSatz = "4li  ..?,iar!rek9";
		int zaehler;
		int satzzeichen = 0;
		int konsonanten = 0;
		int vokale = 0;
		int leerzeichen = 0;
		int zahlen = 0;
		int a;
		for (zaehler = 0; zaehler < zaSatz.length(); zaehler++){
			a = zaSatz.charAt(zaehler);
			if (Character.isDigit(a)){
				zahlen = zahlen +1;
			}
			if (Character.isLetter(a)){
				if ((zaSatz.charAt(zaehler) == 'a') || (zaSatz.charAt(zaehler) == 'e') || (zaSatz.charAt(zaehler) == 'i') || (zaSatz.charAt(zaehler) == 'o') || (zaSatz.charAt(zaehler) == 'u')){
					vokale = vokale +1;
				}
				else {
				konsonanten = konsonanten +1;
				}
			}
			if (Character.isWhitespace(a)){
				leerzeichen = leerzeichen +1;
			}
			if ((zaSatz.charAt(zaehler) == '!') || (zaSatz.charAt(zaehler) == '.') || (zaSatz.charAt(zaehler) == ',')){
				satzzeichen = satzzeichen+1;
			}
			
		}
		System.out.println("Anzahl der Zahlen:\t\t" + zahlen);
		System.out.println("Anzahl der Konsonanten:\t\t" + konsonanten);
		System.out.println("Anzahl der Leerzeichen:\t\t" + leerzeichen);
		System.out.println("Anzahl der Vokale\t\t" + vokale);
		System.out.println("Anzahl der Satzzeichen:\t\t" + satzzeichen);
	}
}