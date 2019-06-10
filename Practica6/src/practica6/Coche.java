package practica6;

/**
 * Clase Coche.
 * @author Lidia Cuadro Pérez
 */

public class Coche extends Vehiculo {

	private static final String HÍBRIDO = "Híbrido";
	private static final String DIESEL = "Diesel";
	private static final String GASOLINA = "Gasolina";
	String combustible;
	String modelo;
	String fabricante;
	
	/**
	 * Constructor de la clase coche.
	 */
	public Coche() {
		matricula = "";
		combustible = "";
		modelo = "";
		fabricante = "";
	}
	
	/**
	 * Constructor de la clase Coche con parámetros.
	 * @param m Matrícula
	 * @param c Combustible
	 * @param mo Modelo
	 * @param f Fabricante
	 */
	public Coche(String m, String c, String mo, String f) {
		matricula = m;
		combustible = c;
		modelo = mo;
		fabricante = f;
	}
	
	/**
	 * Método que obtiene la información de un Coche en función del combustible.
	 * @return String Información del coche.
	 */
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
	
	/**
	 * Método que obtiene la información de un coche con combustible híbrido.
	 * @param modelo2 Modelo
	 * @param fabricante2 Fabricante
	 * @return String Información del coche.
	 */
	private String obtenerInfoHibrido(String modelo2, String fabricante2) {
		String resultado = "";
		String textoInicio = "es un";
		String textoFin = "y no necesita combustible.";
		resultado += textoInicio + " " + fabricante2 + " ";
		resultado += modelo2 + " " + textoFin;
		return resultado;
	}
	
	/**
	 * Método que obtiene la información de un coche con combustible diesel.
	 * @param modelo2 Modelo
	 * @param fabricante2 Fabricante
	 * @return String Información del coche.
	 */
	private String obtenerInfoDiesel(String modelo2, String fabricante2) {
		String resultado = "";
		String textoInicio = "es un";
		String textoFin = "y gasta 1,052 euros por litro.";
		resultado += textoInicio + " " + fabricante2 + " ";
		resultado += modelo2 + " " + textoFin;
		return resultado;
	}
	
	/**
	 * Método que obtiene la informacion de un coche con combustible gasolina.
	 * @param modelo2 Modelo
	 * @param fabricante2 Fabricante
	 * @return String Información del coche.
	 */
	private String obtenerInfoGasolina(String modelo2, String fabricante2) {
		String resultado = "";
		String textoInicio = "es un";
		String textoFin = "y gasta 1,337 euros por litro.";
		resultado += textoInicio + " " + fabricante2 + " ";
		resultado += modelo2 + " " + textoFin;
		return resultado;
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
