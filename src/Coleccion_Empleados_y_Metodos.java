package paq;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Hashtable;
import java.util.Scanner;

public class Coleccion_Empleados_y_Metodos {
	
	//Para almacenar a los empleados, se crea un diccionario.
	//La clave dirá el rando del empleado y el valor almacenará al mismo.
	static Hashtable<String, Empleados> ClaveYEmpleados = new Hashtable<String, Empleados>();
	
	//Métodos
	
	static void Registro_Empleados(int opcion, String clave, String nombre, int edad, String puesto, String genero, int sueldo)
	{

		@SuppressWarnings("resource")
		Scanner num = new Scanner (System.in);
		
		System.out.println("\tPor favor diga qué puesto tiene su empleado:\n"
					+ "\tGerente: Oprima 1;\n"
					+ "\tSubgerente: Oprima 2;\n"
					+ "\tSecretaria: Oprima 3;\n"
					+ "\tAsesor: Oprima 4;\n"
					+ "\tTécnico: Oprima 5;\n");
		opcion = num.nextInt();
						
		switch (opcion)
		{
			case 1: puesto = "Gerente"; 
				ClaveYEmpleados.put(clave, new Gerente(clave, nombre, edad, puesto, genero, sueldo));
				break;
			case 2: puesto = "Subgerente";
				ClaveYEmpleados.put(clave, new Subgerente(clave, nombre, edad, puesto, genero, sueldo));
				break;
			case 3: puesto = "Secretaria"; 
				ClaveYEmpleados.put(clave, new Subgerente(clave, nombre, edad, puesto, genero, sueldo));
				break;
			case 4: puesto = "Asesor"; 
				ClaveYEmpleados.put(clave, new Subgerente(clave, nombre, edad, puesto, genero, sueldo));
				break;
			case 5: puesto = "Técnico"; 
				ClaveYEmpleados.put(clave, new Subgerente(clave, nombre, edad, puesto, genero, sueldo));
				break;	
			default: System.out.println("\n\tPor favor otorgue una opción válida para el puesto.");
		} 
	}
	
	static void Serializar()
	{
		try
		{
						
			FileOutputStream archfuera = new FileOutputStream("./empleados.ser");
			ObjectOutputStream fuera = new ObjectOutputStream(archfuera);
			fuera.writeObject(ClaveYEmpleados);
			fuera.close();
			archfuera.close();
						
			System.out.println("\tSus empleados fueron serializados en el archivo empleados.ser.");
		}
		catch (IOException e)
		{
			System.out.println("\tOcurrió un error en el proceso. Inténtelo más tarde.");
		}
	}
	
	@SuppressWarnings("unchecked")
	static void Deserealizar()
	{
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
	}
	
}
