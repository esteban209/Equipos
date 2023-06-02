package Datos;

import java.util.Date;

import javax.swing.JOptionPane;

public class Lista {
	
	public Nodo nodoPrincipal;
	public int numeroParqueadero;
	public int numeroMotos;
	public int numeroCarros;
	int i=0;
    int j=0;
    public void adicionarNodoMoto(Nodo nodo){
    	numeroMotos=numeroParqueadero*40/100;
    	if(i<numeroMotos) {
    		 if (nodo != null){
    	            if (nodoPrincipal == null){
    	            	nodo.informacion.fechaIngreso= new Date();
    	                this.nodoPrincipal = nodo;
    	            }else{
    	                Nodo aux = this.nodoPrincipal;
    	                 nodo.siguienteNodo = aux;
    	                 this.nodoPrincipal = nodo;
    	            }
    	            i++;
    		 }
    	}
    }
    
    	
    	
    	   public void adicionarNodoCarro(Nodo nodo){
    	    	numeroCarros=numeroParqueadero*60/100;
    	    	if(j<numeroCarros) {
    	    		 if (nodo != null){
    	    	            if (nodoPrincipal == null){
    	    	            	nodo.informacion.fechaIngreso= new Date();
    	    	                this.nodoPrincipal = nodo;
    	    	            }else{
    	    	                Nodo aux = this.nodoPrincipal;
    	    	                 nodo.siguienteNodo = aux;
    	    	                 this.nodoPrincipal = nodo;
    	    	            }  
    	    		 }
    	    	} j++;
    }
   
    public void borrarPrimero(Nodo nodo){
    	if(this.nodoPrincipal==null) {
    		nodo.siguienteNodo=this.nodoPrincipal;
    		this.nodoPrincipal=null;
    	}else {
    		this.nodoPrincipal=null;
    	}

    }
    public void ImprimirNodo() {
    	JOptionPane.showMessageDialog(null, this.nodoPrincipal+"\n"+this.nodoPrincipal.siguienteNodo);
    }

}

