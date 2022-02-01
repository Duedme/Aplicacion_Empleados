package paq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws IOException {

		//Creación de Menú
		@SuppressWarnings("resource")
		Scanner num = new Scanner (System.in);
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		int opcion;
		
		do
		{
			System.out.print("_______________________________\n"
					+ "\n\n\tPor favor elija una opción del menú.\n\n"
					+ "_____________________________\n\n");
			System.out.println("Menú:\n"
					+ "\tRegistrar Empleado: Oprima '1'\n"
					+ "\tEliminar Empleado: Oprima '2'\n"
					+ "\tMostrar a todos los Empleados: Oprima '3'\n"
					+ "\tHacer modificaciones: Oprima '4'\n"
					+ "\tSerializar lista de Empleados: Oprima '5'\n"
					+ "\tDesearializar lista de Empleados: Oprima '6'\n"
					+ "\tSalir del menú: Oprima '7'");
			
			opcion = num.nextInt();
			
			switch (opcion)
			{
				case 1:
					String clave = null, puesto = null, genero = null, nombre = null;
					int opcion2 = 0, edad = 0, sueldo = 0;
					
					System.out.println("_________________________\n\n"
							+ "Usted ha elegido contratar un empleado:\n"
							+ "\tPor favor, teclee la clave de su empleado.\n");
					
					clave = reader.readLine();
					
					Coleccion_Empleados_y_Metodos.Registro_Empleados(opcion2, clave, nombre, edad, puesto, genero, sueldo);
					
					
					
					break;
					
				case 2:
					String clave1 = null;
					
					System.out.println("_________________________________\n\n"
							+ "\tUsted ha decidido despedir a un empleado:\n");
					
					if (Coleccion_Empleados_y_Metodos.ClaveYEmpleados.isEmpty())
					{
						System.out.println("\tLa lista se encuentra vacía, contrate a alguien para despedirlo.");
						break;
					}
					else
					{
						System.out.println("\tPor favor proporcione al clave de aquél eliminado.;");
							
						clave1 = reader.readLine();
						
						if (Coleccion_Empleados_y_Metodos.ClaveYEmpleados.containsKey(clave1))
						{
							Coleccion_Empleados_y_Metodos.ClaveYEmpleados.remove(clave1);
							System.out.println("\tSe ha removido a aquel con la clave " + clave1 + ".\n\n");
						}
						else
						{
							System.out.println("\tLa clave que entregó no se encuentra en el registro,\n"
								+ "\tinténtelo más tarde.\n\n");
						}
					}
					
					break;
					
				case 3:
					
					if (Coleccion_Empleados_y_Metodos.ClaveYEmpleados.values().isEmpty())
						System.out.println("\tUsted no tiene empleados.\n"
								+ "\tPor favor contrate a alguien.");
					
					else {
						System.out.println("\tTodos los empleados son lo siguiente: \n\n\t"
							+ "Empleados:\n\t" + Coleccion_Empleados_y_Metodos.ClaveYEmpleados.values());
					}
					
					break;
					
				case 4: 
					

					System.out.println("_________________________________\n\n");
					
					String clave2 = null, puesto1 = null, genero1 = null, nombre1 = null;
					int opcion1 = 0, iralmenu = 0, edad1 = 0, sueldo1 = 0;
					
					System.out.print("\tUsted ha decidido modificar algún registro.\n");
					
					if (!Coleccion_Empleados_y_Metodos.ClaveYEmpleados.isEmpty())
					{
						System.out.println("\t\nPor favor proporcione la nueva clave de su empleado y su puesto.\n\n"
								+ "\tClave: ");
						clave2 = num.nextLine();
						
						Coleccion_Empleados_y_Metodos.Registro_Empleados(opcion1, clave2, nombre1, edad1, puesto1, genero1, sueldo1);
					}
					else
					{
						System.out.print("La llave que entregó no está registrada aún. ¿Desea registrarla?\n"
								+ "\tColoque '1', acepta, coloque '2' para ir al menú.");
						
						iralmenu = num.nextInt();
						
						if (iralmenu == 1) 
							Coleccion_Empleados_y_Metodos.Registro_Empleados(opcion1, clave2, nombre1, edad1, puesto1, genero1, sueldo1);

					}
					
					break;

				case 5: 
					
					System.out.println("_________________________________\n\n");
					
					System.out.println("\tUsted ha decidido serializar la lista.");
					
					Coleccion_Empleados_y_Metodos.Serializar();
					
					break;
					
				case 6: 
					
					System.out.println("_________________________________\n\n");
					
					System.out.println("\tUsted ha decidido deserializar la lista.");
					
					Coleccion_Empleados_y_Metodos.Deserealizar();
					
					break;
					
				default: 
					if (opcion != 7)
						System.out.println("\tElija una opción válida por favor"); 
					else System.out.println("¡Adiós!");
					break;
			}
			
			
			
		} while (opcion != 7);
	}

}
