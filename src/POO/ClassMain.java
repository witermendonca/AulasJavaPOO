package POO;

public class ClassMain {

	public static void main(String[] args) {
		
		
	    ClassCliente joca = new ClassCliente("Joca","1234567-89","019 912345678","13272000", "345678-00");
	    
	    System.out.println("Nome: "+joca.getNome());
	    System.out.println("CPF: "+joca.getCpf());
	    System.out.println("RG: "+joca.getRg());
	    System.out.println("TELEFONE: "+joca.getTelefone());
	    System.out.println("CEP: "+ joca.getCEP());
	    System.out.println(joca.getStatus());
	   
	    
	    

	}

	
}
