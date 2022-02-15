package Sessio1;
import java.util.GregorianCalendar;

public class SenyalTransit {

	public static final int Advertencia = 0;
	public static final int Reglamentacio = 1;
	public static final int Indicacio = 2;
	
	private String CODI;
	private int TIPUS;
	private Ubicacio UBICACIO;
	private int ANY_COL;
	private int ANY_RET;
	
	public SenyalTransit(String codi, int tipus, Ubicacio ubicacio, int anyColocacio) {
		CODI = codi;
		TIPUS = tipus;
		UBICACIO = ubicacio;
		ANY_COL = anyColocacio;
		/*
		   ** FALTA **
			Aquest constructor ubica el senyal a la via p�blica indicada, ubicaci� donada en el tercer
			par�metre. Si es dona el cas de qu� no �s possible tal ubicaci� (m�tode
			afegirSenyal(SenyalTransit) retorna un fals), nom�s en aquest cas, el senyal ser� ubicat
			al dip�sit i l�any de retirada vindr� donat en el darrer par�metre. En cas contrari, el darrer
			par�metre �s l�any de col�locaci�.
		 */

	}
	
	public String getTipusSenyal() {
		switch(TIPUS) {
			case Advertencia: 	return "TRI";
			case Reglamentacio: return "ROD";
			case Indicacio: 	return "QUA";
		}
		return null;
	}
	
	public boolean retirarViaPublica() { // private o public
		if(UBICACIO.treureSenyal(SenyalTransit)) { //referencia a la classe Ubicacio
			GregorianCalendar avui = new GregorianCalendar();
			ANY_RET = avui.get(1);
			UBICACIO //posar en null
			ANY_COL = 0;
			return true;
		}
		return false;
	}
	
	public String getUbicacio() { // private o public
		if(UBICACIO != null) // possible falta de referencia a la classe Ubicacio
			return UBICACIO.getNomVia() + ", " + UBICACIO.getNumVia();
		return null;
	}
	
	public boolean canviarUbicacio(Ubicacio novaUbicacio) { // private o public
		
//		 if(afegirSenyal(SenyalTransit){ 
//			UBICACIO = novaUbicacio;
//			return UBICACIO.treureSenyal(SenyalTransit);
//		 }

//		no tinc ni idea de si es aix� o no 

		 return false;
	}
	
	public String getCodi() {return CODI;}
	
	public Ubicacio getUBICACIO() {
		if (ANY_COL != 0) return UBICACIO;
		return null;
	}
	
	public String getEstat() {
		GregorianCalendar avui = new GregorianCalendar();
		switch(ANY_COL - avui.get(1)) {
			case 0:
			case 1: return "nou";
			case 2:
			case 3: return "semi nou";
			case 4:
			default: return "vell";
		}
	}
}
