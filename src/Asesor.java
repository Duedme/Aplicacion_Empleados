package paq;

@SuppressWarnings("serial")
public class Asesor extends Empleados implements FuncionesGerenciales{

	public Asesor(String clave, String nombre, int edad, String genero, String descPuesto, float sueldo) {
		super(clave, nombre, edad, genero, descPuesto, sueldo);
	}

	//Métodos que vinen de "FuncionesGerenciales".
	public String getRecomendacion(String recomienda) {
		return null;
	}

	public String tomaDecision(String decision) {
		// TODO Auto-generated method stub
		return null;
	}

	public float determinaSueldo(Empleados sueldo) {
		// TODO Auto-generated method stub
		return 0;
	}

	//Métodos que vienen de "Empleados".
	float calculaImpuesto() {
		// TODO Auto-generated method stub
		return 0;
	}

	void designaJefe(Empleados persona) {
		// TODO Auto-generated method stub
		
	}
	
	
}
