package Estudiantes;

public class Hobbies {

	private String nombre;
	private int prioridad;
	private String descripcion;
	
	public String obtNombre() {
		return nombre;
	}
	
	public void colocarNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public int obtPrioridad() {
		return prioridad;
	}
	
	public void colocarPrioridad(int prioridad) {
		this.prioridad=prioridad;
	}
	
	public String obtDescripcion() {
		return descripcion;
	}

}
