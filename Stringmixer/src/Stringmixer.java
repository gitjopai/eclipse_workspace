public class Stringmixer {
	public static void main (String  []args){
		String wort1 = "drerttgr";
		String wort2 = "!  4skgm";
		int zaehler;
		String result = "";
		for (zaehler = 0; zaehler < wort1.length() || zaehler < wort2.length(); zaehler++){
			if ( wort1.length() > zaehler){
				result = result + wort1.charAt(zaehler);
			}
			if ( wort2.length() > zaehler){
				result = result + wort2.charAt(zaehler);
			}
		}
		System.out.println(result);
	}
}