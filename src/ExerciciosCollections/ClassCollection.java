package ExerciciosCollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class ClassCollection {
	/*Crie uma um programa para trabalhar com estoque de uma loja, 
	 o programa deverá trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, 
	 o programa deverá atender as seguintes funcionalidades:
	Armazenar dados da List
	Remover dados da list;
	Atualizar dados da list.
	Apresentar todos os dados da list.
	*/
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		ClassProdutos furadeira = new ClassProdutos("Furadeira", 5, 300.0, "Material de construção");
		ClassProdutos makita = new ClassProdutos("Makita", 4, 400.0, "Material de construção");
		ClassProdutos martelo = new ClassProdutos("Martelo", 10, 30.0, "Material de construção");
		ClassProdutos escada = new ClassProdutos("Escada", 5, 100.0, "Material de construção");
		
		Collection <ClassProdutos> produtos = new ArrayList<>();
		produtos.add(furadeira);
		produtos.add(makita);
		produtos.add(martelo);
		produtos.add(escada);
		
		
		for(ClassProdutos e: produtos) {
			System.out.println(e);
		}
		
		produtos.remove(makita);
		System.out.println("\nItem Removido\n");

		for(ClassProdutos e: produtos) {
			System.out.println(e);
		}
	}

}
