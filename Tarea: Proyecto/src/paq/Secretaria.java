package paq;

public class Secretaria extends Empleados{

	//Constructor con base en método padre.
	public Secretaria(String clave, String nombre, int edad, String genero, String descPuesto, float sueldo) {
		super(clave, nombre, edad, genero, descPuesto, sueldo);
		// TODO Auto-generated constructor stub
	}

	//Método para calcular los impuestos, si debe pagar 30% de su sueldo. Viene de clase "Empleados".
	float calculaImpuesto() {
		return this.getSueldo() * 0.3f;
	}

	//Implementa método de clase "Empleados".
	void designaJefe(Empleados persona) {
		System.out.println("Le sirve sólo al Gerente y SubGerente");
	}
	
}
