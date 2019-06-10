package practica6;

/**
 * Clase Moto.
 * @author Lidia Cuadro P�rez
 *
 */
public class Moto extends Vehiculo {
	int cilindrada;
	
	/**
	 * Constructor de la clase Moto.
	 */
	public Moto() {
		matricula = "";
		cilindrada = 0;
	}
	
	/**
	 * Constructor de la clase Moto con par�metros.
	 * @param m Matr�cula
	 * @param c Cilindrada
	 */
	public Moto(String m, int c) {
		matricula = m;
		cilindrada = c;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int c) {
		cilindrada = c;
	}
}
