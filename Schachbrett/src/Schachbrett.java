public class Schachbrett{
	public static void main (String[] args){
		char zeichen = 'A';
		while (zeichen <= 'H'){
			int zahl = 8;
			System.out.print(zeichen);
			while (zahl >= 1){
				System.out.print("\t"+zeichen+zahl+"  ");
				zahl = zahl-1;
			}
			System.out.println();
			zeichen = (char)(zeichen+1);
		}
		for (int zahl= 8; zahl >= 1; zahl--){
			System.out.print("\t"+zahl);
		}
	}
}