package uebung_4_1;

public class uebung_4_1 {

	public static void bruchDarstellen (int zaehler, int nenner) {
	
		double nenn = nenner;
		double zaeh = zaehler;
		double kommazahl = zaeh/nenn;
		System.out.println(zaehler);
		System.out.println("-" + " = " + (zaeh/nenn));
		System.out.println(nenner); 
}
	public static void main (String[]args){
	bruchDarstellen(1,2);
	bruchDarstellen(5,63);
	bruchDarstellen(4,6);
		
	}
}

	


