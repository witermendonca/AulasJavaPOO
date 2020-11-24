package ExercíciosHerançaPolimorfismo1;

public class ClassCavalo extends ClassAnimal{
	
	

	public ClassCavalo(String nome, int idade) {
		super(nome, idade);
		
	}
	public String getCorrendo() {
		return "Galopando...";
	}

	public String getEmitindoSom() {
		return " Fazendo Som de Cavalo... ";
	}
	
	

}
