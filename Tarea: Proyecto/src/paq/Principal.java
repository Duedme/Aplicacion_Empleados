package paq;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		//Creación de Menú
		@SuppressWarnings("resource")
		Scanner num = new Scanner (System.in);
		int opcion;
		
		do
		{
			System.out.println("Menú:\n"
					+ "\tRegistrar Empleado: Oprima '1'\n"
					+ "\tEliminar Empleado: Oprima '2'\n"
					+ "\tMostrar a todos los Empleados: Oprima '3'"
					+ "\tHacer modificaciones: Oprima '4'"
					+ "\tSerializar lista de Empleados: Oprima '5'"
					+ "\tDesearializar lista de Empleados: Oprima '6'"
					+ "\tSalir del menú: Oprima '7'");
			
			System.out.print("Por favor elija una opción del menú.");
			opcion = num.nextInt();
			
			switch (opcion)
			{
				case 1:
					System.out.println("\tUsted ha elegido registrar un empleado:");
					
				case 2: break;
				case 3: break;
				case 4: break;
				case 5: break;
				case 6: break;
				default: break;
			}
			
			
			
		} while (opcion != 7);
	}

}
