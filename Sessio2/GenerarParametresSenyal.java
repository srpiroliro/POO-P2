package Sessio2;

public class GenerarParametresSenyal {

	public static String generarCodi() {
		// Implementeu el m�tode que generi un identificador aleatori segons
		// el format "XXX-YYYY" on XXX s�n lletres i YYYY s�n n�meros
		// Per fer-ho cal invocar les funcions generarForma i generarDigit
		// El m�tode retorna un String que �s el codi del senyal
		
		String digit="";
		for(int i=0; i<4; i++) digit+=generarDigit();
		
		return( generarForma()+"-"+digit );
	}
	
	public static int generarAny(int maxim) {
		// Implementeu el m�tode per generar un valor num�ric aleatori de 4
		//xifres compres dins de l�interval [1980, maxim] corresponent a un
		// any
		
		// maxim inclusiu o exclusiu?
		int minim=1980;
		return( (int)(Math.random() * (maxim-minim))+minim ); // max. es exclusiu
	}
	
	public static char generarDigit() {
		// Implementeu el m�tode per obtenir un n�mero 0-9 aleatori (van del
		// 48 al 57 en decimal a la taula ASCII)
		
		int minim=48; int maxim=57+1; // +1 per tal de 57 ser inclusiu.
		int charNum=(int) (Math.random() * (maxim-minim))+minim ;
		return( (char) charNum );
	}
	
	public static String generarForma() {
		// Implementeu el m�tode per generar aleat�riament un string de
		// llarg�ria 3 dins del conjunt {"ROD","TRI","REC","QUA"}
		
		String[] conjunt={"ROD","TRI","REC","QUA"};
		return( conjunt[(int) (Math.random()*conjunt.length)] );
	}
}
