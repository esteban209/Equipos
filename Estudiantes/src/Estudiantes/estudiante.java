package Estudiantes;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class estudiante {

	private String nombre;
	private String apellido;
	private Date fechaNacimiento;
	private Hobbies [] hobbies;
	private final int TAMANO_HOBBIES= 3;
	
	public estudiante() {
		this.hobbies= new Hobbies[TAMANO_HOBBIES];
		
	}
	
	
	public String obtNombre() {
		return nombre;
	}
	public void modNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String obtApellido() {
		return apellido;
	}
	public void modApellido(String apellido) {
		this.apellido = apellido;
	}
	public Date obtFechaNacimiento() {
		return fechaNacimiento;
	}
	public void modFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Hobbies[] obtHobbies() {
		return hobbies;
	}
	public void modHobbies(Hobbies[] hobbies) {
		this.hobbies = hobbies;
	}
	
	@Override
	public String toString() {
		return this.nombre +""+ this.apellido+""+this.fechaNacimiento+"";
	}
	
	public int obtenerEdad() {
		
		return 0;
	}

}
