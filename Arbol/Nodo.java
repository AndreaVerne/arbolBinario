package Arbol;

import java.util.ArrayList;

public class Nodo {

	Comparable valor;
	// HIJOS
	protected Nodo izq;
	protected Nodo der;

	protected Nodo padre;

	// Creo un nodo con un valor
	public Nodo(Comparable valor) {
		this.valor = valor;
		izq = null;
		der = null;
		padre = null;
	}

	// creo un nodo con un padre
	public Nodo(Comparable valor, Nodo padre) {
		this(valor);
		this.padre = padre;
	}

	// GETTERS Y SETTERS

	public Nodo getIzq() {
		return izq;
	}

	public void setIzq(Nodo izq) {
		this.izq = izq;
	}

	public Nodo getDer() {
		return der;
	}

	public void setDer(Nodo der) {
		this.der = der;
	}

	public Nodo getPadre() {
		return padre;
	}

	public void agregarNodo(Comparable valor) {
		// Si el valor que me pasan por parametro es mayor que yo (va a la derecha)
		if (valor.compareTo(this.valor) > 0) {
			if (der == null) { // si el valor de la derecha es nulo, creo el nodo y me paso como padre
				der = new Nodo(valor, this); //
			} else
				der.agregarNodo(valor); // sino solamente creo el nodo
		} else { // Si el valor que me pasan por parametro es menor o igual a mi (va a la
					// izquierda)
			if (izq == null) { // si el valor de la izquierda es nulo
				izq = new Nodo(valor, this); // creo un nuevo nodo y me paso como padre
			} else
				izq.agregarNodo(valor); // sino creo solamente el nodo con el valor que me pasan
		}

	}

	public boolean contains(Comparable valor) {
		if (this.valor.compareTo(valor) == 0) // si comparo mi valor con el valor que me pasan y es igual retorno true
			return true;
		else if (valor.compareTo(this.valor) > 0 && der != null) // si el valor que me pasan es mayor a mi y no tengo ya
																	// seteado mi hijo derecho
			return der.contains(valor); // retorno
		else if (valor.compareTo(this.valor) < 0 && izq != null)
			return izq.contains(valor);
		return false;
	}

	//los ordena de menor a mayor
	//Si quisiera imprimirlos de mayor a menor tengo que empezar imprimiendo los de la derecha
//	1. incorporar en un vector todos los elementos en forma ordenada ascendentemente.
	public ArrayList<Comparable> recorrerAscendente() {
		ArrayList<Comparable> elementosEnOrden = new ArrayList<>();
		// Imprimo lo que hay a la izq
		if (izq != null) {
			elementosEnOrden.addAll(izq.recorrerAscendente());
		}
		// Me imprimo yo
		elementosEnOrden.add(this.valor);
		// Imprimo lo que hay a la derecha
		if (der != null) {
			elementosEnOrden.addAll(der.recorrerAscendente());
		}
		return elementosEnOrden;
	}

//	2. incorporar en un vector todos los elementos en forma ordenada descendentemente.
	public ArrayList<Comparable> recorrerDescendente() {
		ArrayList<Comparable> elementosEnOrden = new ArrayList<>();

		
		// Imprimo lo que hay a la derecha
		if (der != null) {
			elementosEnOrden.addAll(der.recorrerDescendente());
		}
		// Me imprimo yo
				elementosEnOrden.add(this.valor);
				
		// Imprimo lo que hay a la izq
		if (izq != null) {
			elementosEnOrden.addAll(izq.recorrerDescendente());
		}
		return elementosEnOrden;
	}

	
	@Override
	public String toString() {
		return this.valor + " " + "( izq: " + this.izq + " der: " + this.der + ") ";
	}
	/*
	 * public void agregarNodo(int n) { if (this.getValor() != n) { //si el nodo a
	 * agregar no tiene el mimso valor que el nodo raiz... if (this.getValor() < n)
	 * { //si el nodo a agregar es mayor el valor que el nodo raiz... if
	 * (this.getDer() == null) { //si este nodo no tiene un hijo en la derecha...
	 * this.setDer(new Nodo(n, this)); //creo el hijo derecho, asignando el valor y
	 * a mi* como padre } else { this.der.agregarNodo(n); //si tiene hijo busco de
	 * agregarlo entre la derecha, ACA RECORRE ENTRE LAS "HOJAS" } } else if
	 * (this.getValor() > n) { //si el nodo a agregar es menor el valor que el nodo
	 * raiz... if (this.getIzq() == null) { //si este nodo no tiene un hijo en la
	 * izquierda... this.setIzq(new Nodo(n, this)); //creo el hijo izquierdo,
	 * asignando el valor y a mi* como padre } else { this.izq.agregarNodo(n); //si
	 * tiene hijo busco de agregarlo entre la izquierda, ACA RECORRE ENTRE LAS
	 * "HOJAS" } } } }
	 */

	
	//3. contar la cantidad de elementos del árbol
	public int contarElementos() {
		ArrayList<Comparable> aux = new ArrayList<>();
		if(izq != null) {
			aux.addAll(izq.recorrerAscendente());
		}
		if(der != null) {
		aux.addAll(der.recorrerDescendente());
		}
		aux.add(this.valor);
		return aux.size();
	}



	/*
	 * @Override public int compareTo(Nodo o) { //Compara por valor numerico return
	 * (this.getValor() - (o.getValor())); //BUSCAR ERROR }
	 */
}
