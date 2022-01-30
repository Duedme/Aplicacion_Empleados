package paq;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Hashtable;
import java.util.Scanner;

public class Principal {

	@SuppressWarnings("unchecked")
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
					String clave = null, puesto = null;
					int opcion2;
					
					System.out.println("_________________________\n\n"
							+ "Usted ha elegido contratar un empleado:\n"
							+ "\tPor favor, teclee la clave de su empleado.\n");
					
					clave = reader.readLine();
					
					System.out.println("__________________________\n\n"
							+ "Por favor diga qué puesto tiene su empleado:\n"
							+ "\tGerente: Oprima 1;\n"
							+ "\tSubgerente: Oprima 2;\n"
							+ "\tSecretaria: Oprima 3;\n"
							+ "\tAsesor: Oprima 4;\n"
							+ "\tTécnico: Oprima 5;\n");
					opcion2 = num.nextInt();
					
					System.out.println("Proporcione la siguiente información del Empleado: ");
							System.out.print("Nombre: "); String nombre = reader.readLine();
							System.out.print("Edad: "); int edad = num.nextInt();
							System.out.print("Género: "); String genero = reader.readLine();
							System.out.print("Sueldo: "); int sueldo = num.nextInt();
							
					switch (opcion2)
					{
						case 1: puesto = " Gerente"; 
							Coleccion_Empleados.ClaveYEmpleados.put(clave, new Gerente(clave, nombre, edad, puesto, genero, sueldo));
							break;
						case 2: puesto = " Subgerente";
							Coleccion_Empleados.ClaveYEmpleados.put(clave, new Subgerente(clave, nombre, edad, puesto, genero, sueldo));
						break;
						case 3: puesto = " Secretaria"; 
							Coleccion_Empleados.ClaveYEmpleados.put(clave, new Subgerente(clave, nombre, edad, puesto, genero, sueldo));
						break;
						case 4: puesto = " Asesor"; 
							Coleccion_Empleados.ClaveYEmpleados.put(clave, new Subgerente(clave, nombre, edad, puesto, genero, sueldo));
						break;
						
						case 5: puesto = " Técnico"; 
							Coleccion_Empleados.ClaveYEmpleados.put(clave, new Subgerente(clave, nombre, edad, puesto, genero, sueldo));
						break;
						default: System.out.println("\n\tPor favor otorgue una opción válida para el puesto.");
						
					} 
					
					if (opcion2 > 5 || opcion2 < 1)
						continue;
					else
						System.out.println("\n\tSe ha agregado un" + puesto + ".");
					
					break;
					
				case 2:
					String clave1 = null;
					
					System.out.println("_________________________________\n\n"
							+ "\tUsted ha decidido despedir a un empleado:\n");
					
					if (Coleccion_Empleados.ClaveYEmpleados.isEmpty())
					{
						System.out.println("\tLa lista se encuentra vacía, contrate a alguien para despedirlo.");
						break;
					}
					else
					{
						System.out.println("\tPor favor proporcione al clave de aquél eliminado.;");
							
						clave1 = reader.readLine();
						
						if (Coleccion_Empleados.ClaveYEmpleados.containsKey(clave1))
						{
							Coleccion_Empleados.ClaveYEmpleados.remove(clave1);
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
					
					if (Coleccion_Empleados.ClaveYEmpleados.values().isEmpty())
						System.out.println("\tUsted no tiene empleados.\n"
								+ "\tPor favor contrate a alguien.");
					
					else {
						System.out.println("\tTodos los empleados son lo siguiente: \n\n\t"
							+ "Empleados:\n\t" + Coleccion_Empleados.ClaveYEmpleados.values());
					}
					
					break;
					
				case 4: 
					

					System.out.println("_________________________________\n\n");
					
					String clave2 = null;
					int opcion1, iralmenu;
					
					System.out.print("\tUsted ha decidido modificar algún registro.\n");
					
					System.out.println("\t\nPor favor proporcione la nueva clave de su empleado y su puesto.\n\n"
							+ "\tClave: ");
					clave2 = num.nextLine();
					
					System.out.println("Por favor diga qué puesto tiene su empleado:\n"
							+ "\tGerente: Oprima 1;\n"
							+ "\tSubgerente: Oprima 2;\n"
							+ "\tSecretaria: Oprima 3;\n"
							+ "\tAsesor: Oprima 4;\n"
							+ "\tTécnico: Oprima 5;\n");
					opcion1 = num.nextInt();
					
					System.out.println("\tProporcione la siguiente información del Empleado: ");
							System.out.print("Nombre: "); String nombre1 = num.nextLine();
							System.out.print("Edad: "); int edad1 = num.nextInt();
							System.out.print("Género: "); String genero1 = num.nextLine();
							System.out.print("Sueldo: "); float sueldo1 = num.nextFloat();
					
					if (!Coleccion_Empleados.ClaveYEmpleados.containsKey(clave2))
					{
						System.out.print("La llave que entregó no está registrada aún. ¿Desea registrarla?\n"
								+ "\tColoque '1', acepta, coloque '2' para ir al menú.");
						
						iralmenu = num.nextInt();
						if (iralmenu != 1) break;
					}
					
					switch (opcion1)
						{
						case 1: puesto = "Gerente"; 
							Coleccion_Empleados.ClaveYEmpleados.put(clave2, new Gerente(clave2, nombre1, edad1, puesto, genero1, sueldo1));
							break;
						case 2: puesto = "Subgerente";
							Coleccion_Empleados.ClaveYEmpleados.put(clave2, new Subgerente(clave2, nombre1, edad1, puesto, genero1, sueldo1));
						break;
						case 3: puesto = "Secretaria"; 
							Coleccion_Empleados.ClaveYEmpleados.put(clave2, new Subgerente(clave2, nombre1, edad1, puesto, genero1, sueldo1));
						break;
						case 4: puesto = "Asesor"; 
							Coleccion_Empleados.ClaveYEmpleados.put(clave2, new Subgerente(clave2, nombre1, edad1, puesto, genero1, sueldo1));
						break;
						
						case 5: puesto = "Técnico"; 
							Coleccion_Empleados.ClaveYEmpleados.put(clave2, new Subgerente(clave2, nombre1, edad1, puesto, genero1, sueldo1));
						break;	
						
						} 
					
					break;

				case 5: 
					
					System.out.println("_________________________________\n\n");
					
					System.out.println("\tUsted ha decidido serializar la lista.");
					
					try
					{
						FileOutputStream archfuera = new FileOutputStream("./empleados.ser");
						ObjectOutputStream fuera = new ObjectOutputStream(archfuera);
						fuera.writeObject(Coleccion_Empleados.ClaveYEmpleados);
						fuera.close();
						archfuera.close();
						
						System.out.println("\tSus empleados fueron serializados en el archivo empleados.ser.");
					}
					catch (IOException e)
					{
						System.out.println("\tOcurrió un error en el proceso. Inténtelo más tarde.");
					}
					
					break;
					
				case 6: 
					
					System.out.println("_________________________________\n\n");
					
					System.out.println("\tUsted ha decidido deserializar la lista.");
					
					Hashtable<String, Empleados> recuperados = new Hashtable<String, Empleados>();
					
					try
					{
						FileInputStream archdentro = new FileInputStream("./empleados.ser");
						ObjectInputStream dentro = new ObjectInputStream(archdentro);
						recuperados = (Hashtable<String, Empleados>) dentro.readObject();
						dentro.close();
						archdentro.close();
						
						System.out.println("\n\tSe ha recuperado la información. Se la mostraré ahora: \n\n"
								+ recuperados);
					}
					catch (IOException | ClassNotFoundException e)
					{
						System.out.println("\tHubo un error al recuperar la información.");
					}
					
					break;
					
				default: System.out.println("\tElija una opción válida por favor"); break;
			}
			
			
			
		} while (opcion != 7);
	}

}
