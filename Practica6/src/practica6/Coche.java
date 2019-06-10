package practica6;

public class Coche extends Vehiculo {
	private static final String HÍBRIDO = "Híbrido";
	private static final String DIESEL = "Diesel";
	private static final String GASOLINA = "Gasolina";
	String combustible;
	String modelo;
	String fabricante;

	public Coche() {
		matricula = "";
		combustible = "";
		modelo = "";
		fabricante = "";
	}

	public Coche(String m, String c, String mo, String f) {
		matricula = m;
		combustible = c;
		modelo = mo;
		fabricante = f;
	}

	public String obtenerInfo() {
		String resultado = "";
		String textoInicio = "El coche con matricula ";
		if (combustible == GASOLINA) {
			resultado += textoInicio + matricula + " ";
			resultado += obtenerInfoGasolina(modelo, fabricante);
		} else if (combustible == DIESEL) {
			resultado += textoInicio + matricula + " ";
			resultado += obtenerInfoDiesel(modelo, fabricante);
		} else if (combustible == HÍBRIDO) {
			resultado += textoInicio + matricula + " ";
			resultado += obtenerInfoHibrido(modelo, fabricante);
		} else {
			resultado += textoInicio + matricula + " ";
			String textoFin = "no dispone de información";
			resultado += textoFin;
		}
		return resultado;
	}
	
	private String obtenerInfoHibrido(String modelo2, String fabricante2) {
		// TODO Auto-generated method stub
		return null;
	}

	private String obtenerInfoDiesel(String modelo2, String fabricante2) {
		// TODO Auto-generated method stub
		return null;
	}

	private String obtenerInfoGasolina(String modelo2, String fabricante2) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
}
