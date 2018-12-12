
public class Persona {

	/*
	 * ATRIBUTOS
	 */
	private String nombre;
	private int edad;
	private String dni;
	private char sexo;
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
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
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
	//Constructor por defecto
	public Persona() {
		
	}
	
	//Contstructor con todos  los atributos
	public Persona(String nombre, int edad, String dni, char sexo, double peso, double altura) {
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
		public static final char SEXO_DEF = 'H';
		
	// metodo para calcular el imc de una persona
		public static int calcularIMC(Persona p) {
			double IMC, peso = p.getPeso(), altura = p.getAltura();
			int numero;
			
			IMC = peso/(Math.pow(altura, 2));
			
			if(IMC > 20 && IMC < 25 ) {
				numero = PESO_IDEAL;
			}else if(IMC < 20 ) {
				numero = INFRAPESO;
			}else {
				numero = SOBREPESO;
			}
			
			return numero;
					
		}
		
		
		//metodo para comprobar si la persona es mayor de edad
		public static boolean esMayorDeEdad(Persona p) {
			
			boolean mayor;
			
			if(p.getEdad() > 18) {
				mayor = true;
			}else {
				mayor = false;
			}
			
			return mayor;
			
			
		}
		
		@Override
		public String toString() {
	        String sexo;
	        if (this.sexo == 'h'  ) {
	            sexo = "Hombre";
	        } else {
	            sexo = "Mujer";
	        }
	        return "Informacion de la persona:\n"
	                + "Nombre: " + nombre + "\n"
	                + "Sexo: " + sexo + "\n"
	                + "Edad: " + edad + " años\n"
	                + "DNI: " + dni + "\n"
	                + "Peso: " + peso + " kg\n"
	                + "Altura: " + altura + " metros\n";

		}
		
}
