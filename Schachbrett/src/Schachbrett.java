public class Schachbrett{
	public static void main (String[] args){
		char zeichen = 'A';
		while (zeichen <= 'H'){
			int zahl = 8;
			while (zahl >= 1){
				System.out.printf(""+zeichen+zahl+"  ");
				zahl = zahl-1;
			}
			System.out.println();
			zeichen = (char)(zeichen+1);
		}
	}
}