
public class BresenhamBasic {

	public static void main(String[] args) {
		
		/*BresenhamBasic.elementarer(0, 0, 20, 8);*/
		/*BresenhamBasic.verbessert(0, 0, 20, 8);*/
		BresenhamBasic.fertig(1, 1, 20, 8);
	}

	/*public static void elementarer(int Startx, int Starty, int Endex, int Endey) {
		final AsciiPlotter asciiPlotter = new AsciiPlotter();
		double Streckex = Endex - Startx;
		double Streckey = Endey - Starty;
		double Steigung = Streckey / Streckex;
		int Ywert = Starty;
		double Abweichung = 0.0;
		for (int Xwert = Startx; Xwert <= Endex; Xwert++) {
			Abweichung = Abweichung + Steigung;
			if (Abweichung > 0.5) {
				Ywert = Ywert + 1;
				Abweichung = Abweichung - 1;
			}
			asciiPlotter.set(Xwert, Ywert); 
		}
		System.out.println(asciiPlotter);
	}*/


	/*public static void verbessert(int Startx, int Starty, int Endex, int Endey){
		final AsciiPlotter asciiPlotter = new AsciiPlotter();
		double Streckex = Endex - Startx;
		double Streckey = Endey - Starty;
		int Ywert = Starty;
		double Abweichung = -Streckex;
		double wert1 = 2*Streckey; 
		double wert2 = 2*Streckex; 
		for (int Xwert = Startx; Xwert <= Endex; Xwert++) {
			Abweichung = Abweichung + wert1;
			if (Abweichung > 0) {
				Ywert = Ywert + 1;
				Abweichung = Abweichung - wert2;
			}
			asciiPlotter.set(Xwert, Ywert); 
		}
		System.out.println(asciiPlotter);
	}*/
	
	public static void fertig(int Startx, int Starty, int Endex, int Endey){
		final AsciiPlotter asciiPlotter = new AsciiPlotter();
		double Streckex = Endex - Startx;
		double Streckey = Endey - Starty;
		int xStep = 1;
		int yStep = 1;
		int Xwert = Startx;
		int Ywert = Starty;
		double Abweichung = 0.0;
		if (Streckex < 0){
			Streckex = -Streckex;
			xStep = -1;
		}
		if (Streckey <0){
			Streckey = -Streckey;
			yStep = -1;
		}
		double wert1 = 2*Streckex;
		double wert2 = 2*Streckey;
		if (Streckey <= Streckex){
			Abweichung = -Streckex;
			while(Startx != Endex){
				Abweichung = Abweichung + wert2;
				if (Abweichung > 0){
					Starty = Starty + yStep;
					Abweichung = Abweichung - wert1;
					Startx = Startx + xStep;
				}
			}
		}
		else{
			Abweichung = -Streckey;
			while(Starty != Endey){
				Abweichung = Abweichung + wert1;
				if (Abweichung > 0){
					Startx = Startx + xStep;
					Abweichung = Abweichung - wert2;
				}
				Starty = Starty + yStep;
			}
			asciiPlotter.set(Xwert, Ywert);
		}
		System.out.println(asciiPlotter);
	
}
}
