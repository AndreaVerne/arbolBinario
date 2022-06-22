package Arbol;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArbolBinario numeros = new ArbolBinario();
	
		Nodo raiz = new Nodo(8);
		numeros.setRaiz(raiz);
	//	numeros.addValor(8);
		numeros.addValor(3);
		numeros.addValor(1);
		numeros.addValor(6);
		numeros.addValor(10);
		numeros.addValor(14);
		numeros.addValor(13);
		numeros.addValor(4);
		numeros.addValor(7);

		/*
		//imprimo nodo raiz
		System.out.println(raiz);
		//imprimo nodo ordenado
		System.out.println(numeros.recorrer());
		//imprimo el arbol
		System.out.println(numeros);
		*/
		
		
		
		
		/*
		 * ArbolBinario animales = new ArbolBinario();
		 * 
		 * Nodo raizAnimales = new Nodo("gato"); animales.setRaiz(raiz); //
		 * numeros.addValor("gato"); animales.addValor("canario");
		 * animales.addValor("perro"); animales.addValor("conejo");
		 * animales.addValor("liebre"); animales.addValor("jabali");
		 * animales.addValor("carpincho"); animales.addValor("zorro");
		 * animales.addValor("aguilucho");
		 * 
		 * //imprimo nodo raiz System.out.println(raizAnimales); //imprimo nodo ordenado
		 * System.out.println(animales.recorrer()); //imprimo el arbol
		 * System.out.println(animales);
		 * 
		 */
	}

}
