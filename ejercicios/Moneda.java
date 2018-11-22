


public class Moneda {
		static final double EUROS_A_DOLARES = 1.16;
		static final double DOLARES_A_EUROS = 0.86;

	public static void main (String[] args) {
		
		double monedaACambiar1 = 7.5;
		double monedaACambiar2 = 117.5;
		
		/*double dolares1 = monedaACambiar1 * EUROS_A_DOLARES;
		double dolares2 = monedaACambiar2 * EUROS_A_DOLARES;
		double euros1 = monedaACambiar1 * DOLARES_A_EUROS;
		double euros2 = monedaACambiar2 * DOLARES_A_EUROS;

		System.out.println( monedaACambiar1 + "$: " + euros1 + "€");
		System.out.println( monedaACambiar1 + "€: " + dolares1 + "$");
		System.out.println( monedaACambiar2 + "$: " + euros2 + "€");
		System.out.println( monedaACambiar2 + "€: " + dolares2 + "$"); */
		
		convertirEurosADolares(monedaACambiar1);
		convertirEurosADolares(monedaACambiar2);
		convertirDolaresAEuros(monedaACambiar1);
		convertirDolaresAEuros(monedaACambiar2);
	}
	
	
	public static void convertirEurosADolares(double euros){
		double dolares = euros * EUROS_A_DOLARES;
		System.out.println( euros + "€: " + dolares + "$");

	}
	public static void convertirDolaresAEuros(double dolares){
		double euros = dolares * DOLARES_A_EUROS;
		System.out.println( dolares + "$: " + euros + "€");
	}

}
