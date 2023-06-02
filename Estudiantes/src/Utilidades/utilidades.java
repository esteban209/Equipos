package Utilidades;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import Estudiantes.estudiante;
public class utilidades {
	public static SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
	public static String leercadena(String mensaje){
		Scanner sc= new Scanner(System.in);
		System.out.println(mensaje);
		return sc.nextLine();
	}
	public static String DateAString(Date fecha) {
		String fechaCadena= sdf.format(fecha);
		return fechaCadena;
	}
	
}

