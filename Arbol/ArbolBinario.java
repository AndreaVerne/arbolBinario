package Arbol;

import java.util.ArrayList;

public class ArbolBinario {

	Nodo raiz;

	public void setRaiz(Comparable valor) {
		this.raiz = (Nodo) valor;
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
	
	  public ArrayList<Comparable> recorrer(){
	        if (!(raiz==null)) {  //si la raiz no esta vacia
	            return raiz.recorrer(); //la recorro
	        }
	        return new ArrayList<>(); //sino retorno un arreglo vacío
	    }

	@Override
	public String toString() {
		//imprimo cual es mi raiz y despues imprimo la raiz (el metodo toString esta redefinido en el nodo)
		return "ArbolBinario [raiz=" + raiz + "]";
	}

}
