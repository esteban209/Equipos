package GUI;

import Datos.Lista;
import Datos.Nodo;
import Datos.Propietario;
import Datos.Vehiculo;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Lista lista= new Lista();
		Vehiculo vehiculo= new Vehiculo();
		Propietario propietario=new Propietario();
		Scanner entrada= new Scanner(System.in);
		
		int desicion;
		
		Boolean bandera= true;
		lista.numeroParqueadero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de parqueaderos"));
		
		while(bandera){
			 vehiculo.tipoVehiculo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 o si es moto o 2 si es carro"));
				if(vehiculo.tipoVehiculo==1) {
					vehiculo.esMoto=true;
				}else {
					vehiculo.esCarro=true;
				}
			
			if(vehiculo.esMoto==true) {	
				vehiculo.placa=JOptionPane.showInputDialog("ingerese la placa del vehiculo");
				propietario.nombre=JOptionPane.showInputDialog("ingrese el nombre del propietario");
				propietario.identificacion=Integer.parseInt(JOptionPane.showInputDialog(("Ingrese la identificacion del propietario")));
				vehiculo.propietario=propietario;
				Nodo nodo= new Nodo(vehiculo);
				lista.adicionarNodoMoto(nodo);
				lista.ImprimirNodo();
				desicion=Integer.parseInt(JOptionPane.showInputDialog("si desea agregar 1 \n de lo contartio 2 \n y 3 si desea sacar un carro"));
				if(desicion==2) {
					bandera=false;
					lista.ImprimirNodo();
				}if(desicion==3) {
					lista.borrarPrimero(nodo);
					lista.ImprimirNodo();
				}
				vehiculo.esCarro=false;
				vehiculo.esMoto=false;
			}
			
			if(vehiculo.esCarro==true) {
				vehiculo.placa=JOptionPane.showInputDialog("ingerese la placa del vehiculo");
				propietario.nombre=JOptionPane.showInputDialog("ingrese el nombre del propietario");
				propietario.identificacion=Integer.parseInt(JOptionPane.showInputDialog(("Ingrese la identificacion del propietario")));
				vehiculo.propietario=propietario;
				Nodo nodo= new Nodo(vehiculo);
				lista.adicionarNodoCarro(nodo);
				lista.ImprimirNodo();
				desicion=Integer.parseInt(JOptionPane.showInputDialog("si desea agregar 1 \n de lo contartio 2 \n 3 para sacar un carro"));
				if(desicion==2) {
					bandera=false;
					lista.ImprimirNodo();
				}
				if(desicion==3) {
					lista.borrarPrimero(nodo);
					lista.ImprimirNodo();
				}
				vehiculo.esCarro=false;
				vehiculo.esMoto=false;
			}
			
		}
		
	}

}

