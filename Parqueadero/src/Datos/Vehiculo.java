package Datos;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Vehiculo {
	public Boolean esMoto=false;
	public Boolean esCarro=false;
	public String placa;
	public Propietario propietario;
	public Date fechaIngreso = new Date();
	public int tipoVehiculo;
	public int valor_Pago;
	
	@Override
	public String toString() {
		return "Vehiculo [esMoto=" + esMoto + ", esCarro=" + esCarro + ", placa=" + placa + ", propietario="
				+ propietario + ", fechaIngreso=" + fechaIngreso + ", tipoVehiculo=" + tipoVehiculo + ", valor_Pago="
				+ valor_Pago;
	}


	public int calcularPago() {
		Date fechaingreso=this.fechaIngreso;
		Date horaActual = new Date();
		int horaIngreso=this.fechaIngreso.getMinutes();
		int horaSalida=horaActual.getMinutes();
		int minutos=horaSalida-horaIngreso;
		if(this.esMoto=true) {
		valor_Pago=50*minutos;
			
		}
		if(this.esCarro=true) {
		valor_Pago=80*minutos;
			
		}
		return valor_Pago;
	}

}

