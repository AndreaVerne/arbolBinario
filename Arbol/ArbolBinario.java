package Arbol;

import java.util.ArrayList;

public class ArbolBinario {

	Nodo raiz;

	public void setRaiz(Nodo valor) {
		this.raiz =  valor;
	}
	
	public void addValor(Comparable valor) {
		if (!(raiz == null)) {
			if (!this.contains(valor)) {
				raiz.agregarNodo(valor);
			}
		}
	}

	private boolean contains(Comparable valor) {
		if (raiz == null) {
			return false;
		}
		return raiz.contains(valor);
	}
	
	  public ArrayList<Comparable> recorrerDescendente(){
	        if (!(raiz==null)) {  //si la raiz no esta vacia
	            return raiz.recorrerDescendente(); //la recorro
	        }
	        return new ArrayList<>(); //sino retorno un arreglo vacío
	    }
	  
	  public int contarElementos() {
		  if(!(raiz==null)) {
			  return raiz.contarElementos();
		  }
		  return 0;
	  }
	  
	  public Comparable mayorElemento() {
		if(!(raiz==null)) {
			
		}
		  
		  return null;
		  
	  }

	@Override
	public String toString() {
		//imprimo cual es mi raiz y despues imprimo la raiz (el metodo toString esta redefinido en el nodo)
		return "ArbolBinario [raiz=" + raiz + "]";
	}


}
