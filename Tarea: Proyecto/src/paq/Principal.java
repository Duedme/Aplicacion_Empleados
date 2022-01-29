package paq;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Hashtable;
import java.util.Scanner;

public class Principal {

	@SuppressWarnings("unchecked")
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
					String clave = null, puesto = null;
					int opcion2;
					
					System.out.println("\tUsted ha elegido contratar un empleado:\n"
							+ "\tPor favor, teclee la clave de su empleado.\n"
							+ "\tSi se equivocó de opción, oprima '0'.");
					
					clave = num.nextLine();
					
					if (clave == "0") break;
					
					System.out.println("\tPor favor diga qué puesto tiene su empleado:\n"
							+ "Gerente: Oprima 1;\n"
							+ "Subgerente: Oprima 2;\n"
							+ "Secretaria: Oprima 3;\n"
							+ "Asesor: Oprima 4;\n"
							+ "Técnico: Oprima 5;\n");
					
					System.out.println("Proporcione la siguiente información del Empleado: ");
							System.out.print("Nombre: "); String nombre = num.nextLine();
							System.out.print("Edad: "); int edad = num.nextInt();
							System.out.print("Género: "); String genero = num.nextLine();
							System.out.print("Sueldo: "); float sueldo = num.nextFloat();
					opcion2 = num.nextInt();
					switch (opcion2)
					{
						case 1: puesto = "Gerente"; 
							Coleccion_Empleados.ClaveYEmpleados.put(clave, new Gerente(clave, nombre, edad, puesto, genero, sueldo));
							break;
						case 2: puesto = "Subgerente";
							Coleccion_Empleados.ClaveYEmpleados.put(clave, new Subgerente(clave, nombre, edad, puesto, genero, sueldo));
						break;
						case 3: puesto = "Secretaria"; 
							Coleccion_Empleados.ClaveYEmpleados.put(clave, new Subgerente(clave, nombre, edad, puesto, genero, sueldo));
						break;
						case 4: puesto = "Asesor"; 
							Coleccion_Empleados.ClaveYEmpleados.put(clave, new Subgerente(clave, nombre, edad, puesto, genero, sueldo));
						break;
						
						case 5: puesto = "Técnico"; 
							Coleccion_Empleados.ClaveYEmpleados.put(clave, new Subgerente(clave, nombre, edad, puesto, genero, sueldo));
						break;	
						
					} 
					System.out.println("Se ha agregado un " + puesto + ".");
					
					System.out.println("__________________________");
							
					break;
					
				case 2:
					String clave1 = null;
					
					System.out.println("\tUsted ha decidido despedir a un empleado:\n"
							+ "\tPor favor proporcione al clave de aquél eliminado.;");
					
					clave1 = num.nextLine();
					
					try
					{
						Coleccion_Empleados.ClaveYEmpleados.remove(clave1);
						System.out.println("Se ha removido a aquel con la clave " + clave1 + ".");
					}
					catch (NullPointerException e)
					{
						System.out.println("La clave que entregó no se encuentra en el registro,\n"
								+ "inténtelo más tarde.");
					}
					
					break;
					
				case 3:
					
					if (Coleccion_Empleados.ClaveYEmpleados.values().isEmpty())
						System.out.println("Usted no tiene empleados.");
					
					else {
						System.out.println("Todos los empleados son lo siguiente: \n\n"
							+ Coleccion_Empleados.ClaveYEmpleados.values());
					}
					
					break;
					
				case 4: 
					
					String clave2 = null;
					int opcion1, iralmenu;
					
					System.out.print("\tUsted ha decidido modificar algún registro.\n"
							+ "Por favor proporcione la nueva clave de su empleado y su puesto.\n\n"
							+ "\tClave: ");
					clave2 = num.nextLine();
					
					System.out.println("\tPor favor diga qué puesto tiene su empleado:\n"
							+ "Gerente: Oprima 1;\n"
							+ "Subgerente: Oprima 2;\n"
							+ "Secretaria: Oprima 3;\n"
							+ "Asesor: Oprima 4;\n"
							+ "Técnico: Oprima 5;\n");
					opcion1 = num.nextInt();
					
					System.out.println("Proporcione la siguiente información del Empleado: ");
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
					
					System.out.println("\tUsted ha decidido serializar la lista.");
					
					try
					{
						FileOutputStream archfuera = new FileOutputStream("./empleados.ser");
						ObjectOutputStream fuera = new ObjectOutputStream(archfuera);
						fuera.writeObject(Coleccion_Empleados.ClaveYEmpleados);
						fuera.close();
						archfuera.close();
						
						System.out.println("Sus empleados fueron serializados.");
					}
					catch (IOException e)
					{
						System.out.println("Ocurrió un error en el proceso. Inténtelo más tarde.");
					}
					
				case 6: 
					
					System.out.println("\tUsted ha decidido deserializar la lista.");
					
					Hashtable<String, Empleados> recuperados = new Hashtable<String, Empleados>();
					
					try
					{
						FileInputStream archdentro = new FileInputStream("./empleados.ser");
						ObjectInputStream dentro = new ObjectInputStream(archdentro);
						recuperados = (Hashtable<String, Empleados>) dentro.readObject();
						dentro.close();
						archdentro.close();
						
						System.out.println("Se ha recuperado la información. Se la mostraré ahora: \n\n"
								+ recuperados);
					}
					catch (IOException | ClassNotFoundException e)
					{
						System.out.println("Hubo un error al recuperar la información.");
					}
					
					break;
				default: System.out.println("Elija una opción válida por favor"); break;
			}
			
			
			
		} while (opcion != 7);
	}

}
