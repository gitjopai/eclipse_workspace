public class Textanalyse {
	public static void main (String []args){
		String zuanalysierenderSatz = "4lkjggr!!nge? frg.,kog gomjh";
		int zaehler;
		int satzzeichen = 0;
		int konsonanten = 0;
		int vokale = 0;
		int leerzeichen = 0;
		for (zaehler = 0; zaehler < zuanalysierenderSatz.length(); zaehler++){
			if ((zuanalysierenderSatz.charAt(zaehler)) == (33)){
				satzzeichen = satzzeichen +1;
			}
			if ((zuanalysierenderSatz.charAt(zaehler)) == (63)){
				satzzeichen = satzzeichen +1;
			}
			if ((zuanalysierenderSatz.charAt(zaehler)) == (44)){
				satzzeichen = satzzeichen +1;
			}
			if ((zuanalysierenderSatz.charAt(zaehler)) == (46)){
				satzzeichen = satzzeichen +1;
			}
		}
		System.out.println("Anzahl der Satzzeichen:\t"+satzzeichen);
	}
}