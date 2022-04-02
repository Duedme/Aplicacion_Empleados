package paq;

@SuppressWarnings("serial")
public class Gerente extends Empleados implements FuncionesGerenciales{

	public Gerente(String clave, String nombre, int edad, String genero, String descPuesto, float sueldo) {
		super(clave, nombre, edad, genero, descPuesto, sueldo);
	}
	
	//Métodos que vienen de empleados.
	//Método para calcular los impuestos, si debe pagar 10% de su sueldo.
	float calculaImpuesto() {
		return this.getSueldo() * 0.1f;
	}

	void designaJefe(Empleados persona) {
		System.out.println ("Es su propio jefe");
	}



	//Métodos que vienen de "Funciones Gerenciales".
	public String getRecomendacion(String recomienda) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public String tomaDecision(String decision) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public float determinaSueldo(Empleados sueldo) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
