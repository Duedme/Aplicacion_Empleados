package paq;

public class Tecnico extends Empleados{

	public Tecnico(String clave, String nombre, int edad, String genero, String descPuesto, float sueldo) {
		super(clave, nombre, edad, genero, descPuesto, sueldo);
	}

	float calculaImpuesto() {
		return this.getSueldo() * 0.4f;
	}

	void designaJefe(Empleados persona) {
		System.out.println("Le sirve a todos los que necesiten su ayuda");
	}
}
