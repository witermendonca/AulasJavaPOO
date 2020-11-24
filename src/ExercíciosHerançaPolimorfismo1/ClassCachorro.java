package ExercíciosHerançaPolimorfismo1;

public class ClassCachorro extends ClassAnimal {



	public ClassCachorro(String nome, int idade) {
		super(nome, idade);
		
	}

	public String getCorrendo() {
		return "correndo";
	}

	public String getEmitindoSom() {
		return " AUAUAUAUA ";
	}
	
	
}
