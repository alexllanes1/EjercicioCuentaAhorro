package EjercicioCuentaAhorro;

public class CajaAhorro extends Cuenta {
	
	
	public CajaAhorro(String titular, float cantidad) {
		super(titular, cantidad);
		// TODO Auto-generated constructor stub
	}
	
	public void imprimirInfo() {
		System.out.println("Titular: " + titular);
		System.out.println("Cantidad: " + cantidad);

	}

	@Override
	public String toString() {
		return "CajaAhorro [titular=" + titular + ", cantidad=" + cantidad + "]";
	}
	
	
}
