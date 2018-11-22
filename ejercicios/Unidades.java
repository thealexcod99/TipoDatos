/**
 * Clase Unidades, que nos sirve para
 * convertir distintos tipos de unidades
 * @author Alejajndro Alvarez
 * @version 1.0 
 * */




public class Unidades {
	
	//Aqui se definen las constantes.
		/**Constante para convertir de libras a kilogramos */
		public static final double LIBRAS_A_KILOGRAMOS = 0.45;
		
		public static final double KILOGRAMOS_A_LIBRAS = 2.20;

		public static final double PIES_A_METROS = 0.30;
		public static final double METROS_A_PIES = 3.28;
		
		public static final double METROS_A_YARDAS = 1.09;
		public static final double YARDAS_A_METROS =0.91;
		
		public static final double METROS_A_MILLAS = 0.00062;
		public static final double MILLAS_A_METROS = 1609.34;
		
		public static final double HECTAREAS_A_ACRES = 2.47105;
		public static final double ACRES_A_HECTAREAS = 0.404686;
		
		public static final double MILILITROS_A_ONZAS = 0.033814;
		public static final double ONZAS_A_MILILITROS = 29.5735;
		
		public static final double LITROS_A_GALONES =  0.264;
		public static final double GALONES_A_LITROS =  3.785;
	
	
	//Aqui se definen los metodos.
	
	/* --Este es un ejemplo de la forma en que lo ha hecho el profesor--
	 * 
	 * public static double convertirKilogramosALibras( double libras ) {
	  
	  		return libras * KILOGRAMOS_A_LIBRAS;
	  }
	 */
	
	/** Método conversorLibrasKilogramos que convierte las libras a kilogramos
	 * @param libras a convertir
	 * //(solo si no es "void")@return operación de convertir libras a kilogramos*/
	
	public static void conversorLibrasKilogramos(double libras){							
		double kilogramos = libras * LIBRAS_A_KILOGRAMOS;
		System.out.println( libras + " Libras son " + kilogramos + " Kilogramos" );	
	}
	
	public static void conversorKilogramosLibras(double kilogramos) {							
		double libras = kilogramos * KILOGRAMOS_A_LIBRAS;
		System.out.println( kilogramos + " Kilos son " + libras + " Libras" );	
	}
	
	
	
	public static void conversorMetrosPies(double metros) {							
		double pies = metros * METROS_A_PIES;
		System.out.println( metros + " Metros son " + pies + " Pies" );	
	}
	
	public static void conversorPiesMetros(double pies) {							
		double metros = pies * PIES_A_METROS;
		System.out.println( pies + " Pies son " + metros + " Metros" );	
	}
	
	public static void conversorMetrosYardas(double metros) {						
		double yardas = metros * METROS_A_YARDAS;
		System.out.println( metros + " Metros son " + yardas + " Yardas" );	
	}
	
	public static void conversorYardasMetros(double yardas) {						
		double metros = yardas * YARDAS_A_METROS;	
		System.out.println( yardas + " Yardas son " + metros + " Metros" );	
	}
	
	public static void conversorMetrosMillas(double metros) {						
		double millas = metros * METROS_A_MILLAS;
		System.out.println( metros + " Metros son " + millas + " Millas" );	
	}
	
	public static void conversorMillasMetros(double millas) {						
		double metros = millas * MILLAS_A_METROS;
		System.out.println( millas + " Millas son " + metros + " Metros" );	
	}
	
	public static void conversorHectareasAcres(double hectareas) {					
		double acres = hectareas * HECTAREAS_A_ACRES;
		System.out.println( hectareas + " Hectareas son " + acres + " acres" );	
	}
	
	public static void conversorAcresHectareas(double acres) {						
		double hectareas = acres * ACRES_A_HECTAREAS;
		System.out.println( acres + " Acres son " + hectareas + " Hectareas" );	
	}
	
	public static void conversorMililitrosOnzas(double mililitros) {				
		double onzas = mililitros * MILILITROS_A_ONZAS;
		System.out.println( mililitros + " Mililitros son " + onzas + " Onzas" );	
	}
	
	public static void conversorOnzasMililitros(double onzas) {						 
		double mililitros = onzas * ONZAS_A_MILILITROS;
		System.out.println( onzas + " Onzas son " + mililitros + " Mililitros" );	
	}
	
	public static void conversorLitrosGalones(double litros) {						
		double galones = litros * LITROS_A_GALONES;
		System.out.println( litros + " Litros son " + galones + " Galones" );	
	}
	
	public static void conversorGalonesLitros(double galones) {						
		double litros = galones * GALONES_A_LITROS;
		System.out.println( galones + " Galones son " + litros + " Litros" );	
	}
	
	//Y por ultimo se ejecutan en otro fichero "ConvertirUnidades.java".
}
