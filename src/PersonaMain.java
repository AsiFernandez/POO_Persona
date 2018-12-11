import java.util.Scanner;

public class PersonaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre, sexo, dni;
		int edad;
		double peso, altura;
		
		Scanner scan = new Scanner(System.in);
	
		// Pedimos los datos de la persona
		
		System.out.println("Introduce el nombre");
		nombre = scan.nextLine();
		System.out.println("Introduce la edad");
		edad = scan.nextInt();
		System.out.println("Introduce el sexo");
		scan.nextLine();
		sexo = scan.nextLine();
		System.out.println("Introduce la altura");
		altura = scan.nextDouble();
		System.out.println("Introduce el peso");
		peso = scan.nextDouble();
		System.out.println("introduce el dni");
		scan.nextLine();
		dni = scan.nextLine();
		// Fin pedir datos de la persona
		
		//Creamos una persona pasandole los parametros al crear la persona
		Persona p1 = new Persona(nombre, edad, sexo, dni, peso, altura);
		
		//Creamos una persona y le damos los datos con el metodo set
		Persona p2 = new Persona();
		p2.setNombre("Joni");
		p2.setEdad(21);
		p2.setSexo("hombre");
		p2.setAltura(1.90);
		p2.setPeso(78);
		p2.setDni("69847353H");
	
		System.out.println("----- PERSONA 1-----");
		System.out.println(p1.toString());
		mostrarMensajePeso(p1);
		mostrarMayorDeEdad(p1);
		
		
		System.out.println("----- PERSONA 2-----");
		System.out.println(p2.toString());
		mostrarMensajePeso(p2);
		mostrarMayorDeEdad(p2);
		
		
	}
	
	
	
	//mostrar mensaje sobre estado fisico
	public static void mostrarMensajePeso(Persona p) {
		
		
		int imc = p.calcularIMC(p);
		switch (imc) {
		case Persona.PESO_IDEAL:
			System.out.println("La persona esta en un peso ideal");
			break;
		case Persona.INFRAPESO:
			System.out.println("La persona esta en delgadez");
			break;
		case Persona.SOBREPESO:
			System.out.println("La persona sufre de sobrepeso");
			break;
		
		}
	}
	
	
	//mostrar mensaje sobre si es mayor de edad
	public static void mostrarMayorDeEdad(Persona p) {
		
		if(p.esMayorDeEdad(p)) {
			System.out.println("La persona es mayor de edad");
		}else {
			System.out.println("La persona no es mayor de edad");
		}
		
		
		
	}
	
	
	
	
	

}
