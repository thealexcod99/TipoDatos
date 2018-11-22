public class ConvertirUnidades {
		
	public static void main(String[] args) {
			
		//Aqui doy valor a la variable a convertir
		
		double UnidadAConvertir = 5;
		
		//Aqui inicio las funciones declaradas en el fichero "Unidades.java" 
		//las cuales convierten el valor que he definido antes.
			
		/* --Este es un ejemplo de la forma en que lo ha hecho el profesor--
		 * 
		  double kilogramos = 3.5;
		  
		  double libras = Unidades.convertirKilogramosALibras( double kilogramos );
		  
		  System.out.println( kilogramos + " kilogramos son " + libras + " libras." );
		  */
		
			
		Unidades.conversorKilogramosLibras(UnidadAConvertir);
		Unidades.conversorLibrasKilogramos(UnidadAConvertir);
		
		
		Unidades.conversorMetrosPies(UnidadAConvertir);
		Unidades.conversorPiesMetros(UnidadAConvertir);
		
		
		Unidades.conversorMetrosYardas(UnidadAConvertir);
		Unidades.conversorYardasMetros(UnidadAConvertir);
		
		
		Unidades.conversorMetrosMillas(UnidadAConvertir);
		Unidades.conversorMillasMetros(UnidadAConvertir);
		
		
		Unidades.conversorHectareasAcres(UnidadAConvertir);
		Unidades.conversorAcresHectareas(UnidadAConvertir);
		
		
		Unidades.conversorMililitrosOnzas(UnidadAConvertir);
		Unidades.conversorOnzasMililitros(UnidadAConvertir);
		
		
		Unidades.conversorLitrosGalones(UnidadAConvertir);
		Unidades.conversorGalonesLitros(UnidadAConvertir);

	}
}
