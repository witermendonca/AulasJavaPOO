package ExercíciosHerançaPolimorfismo1;

public class ClassPreguica extends ClassAnimal{
	

	public ClassPreguica(String nome, int idade) {
		super(nome, idade);
		
	}

	public String getSubindoArvore() {
		return "Subindo na Arvore...";
	}

	public String getEmitindoSom() {
		return "Emitindo Som de preguiça.... ";
	}
	
	
	

}
