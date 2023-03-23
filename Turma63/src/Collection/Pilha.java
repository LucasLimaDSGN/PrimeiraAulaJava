package Collection;

import java.util.Iterator;
import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String> pilha = new Stack<String>();
		
		pilha.push("Prato Verde");
		pilha.push("Prato Azul");
		pilha.push("Prato Amarelo");
		pilha.push("Prato Vermelho");
		pilha.push("Prato Preto");
		pilha.push("Prato Branco");
		
		System.out.println("\nElementos da pilha: "+pilha);
		System.out.println("\nRetirar um elemento da pilha: "+pilha.pop());
		System.out.println("\nElementos da pilha: "+pilha);
		System.out.println("\nElemento no topo da pilha: "+pilha.peek());
		System.out.println("\nAdicionar um prato roxo: "+pilha.push("Prato Roxo"));
		System.out.println("\nElementos da pilha: "+pilha);
		System.out.println("\nTamanho da pilha: "+pilha.size());
		System.out.println("\nVerificar um elemento na pilha: "+pilha.contains("Prato Azul"));
		System.out.println("\nExibir todos os elementos da minha pilha: ");
		
		
		Iterator<String> iterator = pilha.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		
	}

}
