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
		System.out.println("Introduce el peso");
		peso = scan.nextDouble();
		System.out.println("Introduce la altura");
		altura = scan.nextDouble();
		System.out.println("introduce el dni");
		scan.nextLine();
		dni = scan.nextLine();
		
		
		// Fin pedir datos de la persona
		
		//Creamos una persona pasandole los parametros al crear la persona
		Persona p1 = new Persona(nombre, edad, sexo, dni, altura, peso);
		
		//Creamos una persona y le damos los datos con el metodo set
		Persona p2 = new Persona();
		p2.setNombre(nombre);
		p2.setEdad(edad);
		p2.setSexo(sexo);
		p2.setPeso(peso);
		p2.setAltura(altura);
		p2.setDni(dni);
	
		mostrarMensajePeso(p1);
		
		mostrarMayorDeEdad(p1);
	
	}
	
	
	
	//mostrar mensaje sobre estado fisico
	public static void mostrarMensajePeso(Persona p) {
		int imc = p.calcularIMC(p.getPeso(), p.getAltura());
		switch (imc) {
		case Persona.INFRAPESO:
			System.out.println("La persona esta en delgadez");
			break;
		case Persona.PESO_IDEAL:
			System.out.println("La persona esta en un peso ideal");
			break;
		case Persona.SOBREPESO:
			System.out.println("La persona sufre de sobrepeso");
			break;
		
		}
	}
	
	
	//mostrar mensaje sobre si es mayor de edad
	public static void mostrarMayorDeEdad(Persona p) {
		
		boolean Mayor = p.mayorDeEdad(p.getEdad());
		
		if(Mayor = true) {
			System.out.println("La persona es mayor de edad");
		}else {
			System.out.println("La persona es menor de edad");
		}
		
	}
	
	
	
	
	

}
