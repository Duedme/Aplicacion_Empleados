package paq;
import java.io.Serializable;

@SuppressWarnings("serial")
public abstract class Empleados implements Serializable{

	//Atributos
	private String clave;
	private String nombre;
	private int edad;
	private String genero;
	private String descPuesto;
	private transient float sueldo;
	
	//métodos abstractas
	abstract float calculaImpuesto();
	abstract void designaJefe(Empleados persona);
	
	//Getters y Setters
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getDescPuesto() {
		return descPuesto;
	}
	public void setDescPuesto(String descPuesto) {
		this.descPuesto = descPuesto;
	}
	public float getSueldo() {
		return sueldo;
	}
	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}
	
	//Constructor
	public Empleados(String clave, String nombre, int edad, String genero, String descPuesto, float sueldo) {
		super();
		this.clave = clave;
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
		this.descPuesto = descPuesto;
		this.sueldo = sueldo;
	}
	
	
}
