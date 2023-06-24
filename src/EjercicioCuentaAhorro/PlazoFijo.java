package EjercicioCuentaAhorro;

public class PlazoFijo extends Cuenta{
	
	//1.- Atributos
	
	public int plazo;
	public double interes;
	
	
	
	public PlazoFijo(String titular, float cantidad, int plazo, double interes) {
		super(titular, cantidad);
		this.plazo = plazo;
		this.interes = interes;
	}



	//2.- Metodo para calcular interés
	public double obtenerImporteInteres() {
		return (cantidad*interes)/100;
	}
	
	public void mostrarInformacion() {
		System.out.println("Informacion de la cuenta Plazo Fijo");
		imprimirDatos();
		System.out.println("Plazo: " + plazo);
		System.out.println("Interes: " + interes);
		System.out.println("Total de interes: " + obtenerImporteInteres());

	}
	
}

