package Exerc�ciosHeran�aPolimorfismo1;

public class ClassMain {

	public static void main(String[] args) {
		
		ClassCachorro laila = new ClassCachorro("Laila",5);
		ClassCavalo alazao = new ClassCavalo("Alaz�o", 8);
		ClassPreguica flecha = new ClassPreguica("Flecha", 6);
		
		System.out.println("A Cachorrinha: "+ laila.getNome()+" Esta: "+laila.getCorrendo()+" Faz: "+laila.getEmitindoSom());
		System.out.println("O Cavalo: "+alazao.getNome()+" Esta: "+alazao.getCorrendo()+" Faz: "+alazao.getEmitindoSom());
		System.out.println("A Pregui�a: "+flecha.getNome()+" Esta: "+flecha.getSubindoArvore()+" Faz: "+flecha.getEmitindoSom());
 
	}

}
