
public class Persona {

	/*
	 * ATRIBUTOS
	 */
	private String nombre;
	private int edad;
	private String dni;
	private String sexo;
	private double peso;
	private double altura;
	
	/*
	 * GETTERS Y SETTERS
	 */
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	/*
	 * CONSTRUCTORES
	 */
	
	public Persona() {
		
	}
	
	public Persona(String nombre, int edad, String dni, String sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	
	/*
	 * METODOS
	 */
	
	//Variables finales para el calculo del IMC
		public static final int INFRAPESO = -1;
		public static final int PESO_IDEAL = 0;
		public static final int SOBREPESO = 1;
		
		public static int calcularIMC(double peso, double altura) {
			int estado;
			int imc;
			
			imc = (int) (peso/(altura * altura));
			
			if(imc < 20 ) {
				estado = INFRAPESO;
			}else if(imc >= 20 && imc <= 25) {
				estado = PESO_IDEAL;
			}else {
				estado = SOBREPESO;
			}
			return imc;
			
		}
		
		public static boolean mayorDeEdad(int edad) {
			
			boolean esMayor = false;
			
			if(edad < 18) {
				esMayor = false;
			}else {
				esMayor = true;
			}
			
			return esMayor;
		}
}
