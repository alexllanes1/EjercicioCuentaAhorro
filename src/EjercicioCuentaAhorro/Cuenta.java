package EjercicioCuentaAhorro;

public class Cuenta {
	
	//1.- Atributos
	 String titular;
	 float cantidad;
	
	//Constructor
	public Cuenta(String titular, float cantidad) {
		this.titular = titular;
		this.cantidad = cantidad;
		// TODO Auto-generated constructor stub
	}

	//2.- Metodo para imprimir datos
	public void imprimirDatos() {
		System.out.println("Titular: " + titular);
		System.out.println("Cantidad: " + cantidad);
	}
	
	

}
