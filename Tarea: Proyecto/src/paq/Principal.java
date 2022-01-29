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
					String puesto = null;
					
					System.out.println("\tUsted ha elegido registrar un empleado:\n"
							+ "\tSi quiere elegir un nuevo gerente: Oprima '1';\n"
							+ "\tSi busca asignar un nuevo subgerente: Oprima '2';\n"
							+ "\tSi la que necesita es una secretaria: Oprima '3';\n"
							+ "\tSi quiere un asesor: Oprima '4';\n"
							+ "\tSi necesita un nuevo técnico: Oprima '5';\n"
							+ "\tSi se equivocó de tecla: Oprima '6'.");
					
					int opcion2 = num.nextInt();
					switch (opcion2)
					{
						case 1: puesto = "Gerente"; break;
						case 2: puesto = "Subgerente"; break;
						case 3: puesto = "Secretaria"; break;
						case 4: puesto = "Asesor"; break;
						case 5: puesto = "Técnico"; break;
						case 6: break;
					}
					if (opcion2 == 6) break;
					
					System.out.println("Proporcione la siguiente información del Empleado: ");
					System.out.print("Clave: "); String clave = num.nextLine();
					System.out.print("Nombre: "); String nombre = num.nextLine();
					System.out.print("Edad: "); int edad = num.nextInt();
					System.out.print("Género: "); String genero = num.nextLine();
					System.out.print("DescPuesto: "); String descPuesto = num.nextLine();
					System.out.print("Sueldo: "); float sueldo = num.nextFloat();

					Coleccion_Empleados.ClaveYEmpleados.put(puesto, new Gerente(clave, nombre, edad, genero, descPuesto, sueldo));
							
					System.out.println("Se ha agregado al gerente.");
					System.out.println("__________________________");
							
					break;
					
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
