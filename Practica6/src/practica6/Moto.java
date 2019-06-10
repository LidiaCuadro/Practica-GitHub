package practica6;

public class Moto extends Vehiculo {
	int cilindrada;

	public Moto() {
		matricula = "";
		cilindrada = 0;
	}

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
