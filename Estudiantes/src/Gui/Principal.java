package Gui;
import Estudiantes.estudiante;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;

import Estudiantes.Hobbies;
import Logica.Operaciones;
import Utilidades.utilidades;

public class Principal {

	public static void main(String[] args) {
		Operaciones operaciones = new Operaciones(5);
		estudiante elEstudiante= new estudiante();
		utilidades.leercadena("");
		for (int i=0; i<6;i++) {
			Date fechanacimiento = new Date(i);
			String nombre= utilidades.leercadena("Digite el nombre");
			String apellido= utilidades.leercadena("Digite el apellido");
			String fechaNacimiento=utilidades.leercadena("Digite la fecha de nacimiento");
			
			elEstudiante.modNombre(nombre);
			elEstudiante.modApellido(apellido);
			elEstudiante.modFechaNacimiento(fechanacimiento);
			
			operaciones.crearEstudiante(elEstudiante);
			System.out.println(elEstudiante);
			
		}
	}

}

