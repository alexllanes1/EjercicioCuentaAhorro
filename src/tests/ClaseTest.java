package tests;

import EjercicioCuentaAhorro.CajaAhorro;
import EjercicioCuentaAhorro.PlazoFijo;


public class ClaseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CajaAhorro instancia1 = new CajaAhorro("Felipe Maqueda", 1000.0f);
		
		PlazoFijo instancia2 = new PlazoFijo("Jesus Gonzalez", 2500.0f, 12, 5.0);
		
		instancia1.imprimirDatos();
		System.out.println();
		instancia2.mostrarInformacion();
	}

}
