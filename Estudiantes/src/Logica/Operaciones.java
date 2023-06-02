package Logica;
import java.sql.Date;
import java.util.ArrayList;

import Estudiantes.estudiante;
import Estudiantes.Hobbies;
import Logica.Operaciones;
public class Operaciones {
private estudiante[] estudiantes;

	public Operaciones(int tamano) {
		this.estudiantes = new estudiante[tamano];
	}
	
	 
	
	public void crearEstudiante(estudiante estudiante) {
		for(int i=0;i<estudiantes.length;i++) {
			if(estudiantes[i] == null)
				this.estudiantes[i]=estudiante;
			
			break;
		}
		
		//this.estudiante[0]=estudiante;
		
		
	}
	
	public boolean modificarEstudiante(int posicion,String nombre, String apellido, Date fechaNacimiento,Hobbies hobbie ) {
		
		return false;
	}
	
	public boolean modificarHobbie(Hobbies hobbie, int posicionHobbie, int posicion) {
		return false;
		
	}
	
	public void visualizar() {
		for(int i= 0; i< estudiantes.length;i++) {
			System.out.print("El estuidante"+(i+1)+"El estudiante"+estudiantes[i]);
		}
	}
	
	

}

