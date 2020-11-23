package POO2;
import java.util.Scanner;

public class exe2 {
	 public static void main(String[] args) {
	        Scanner leia = new Scanner (System.in);
	        String horas;
	        System.out.println("Que horas São ?");
	        horas=leia.next();

	        airplane azul = new airplane();
	        azul.setHoras(horas);
	        azul.setDestino("maceió");
	        azul.setNumAcento(195);
	        azul.setNumeroDoVoo("6565");
	        azul.setPesoMala(85);
	        azul.setSaida("13:30");

	        System.out.println("Agora são : "+ azul.getHoras()+ " Horas, e você esta indo para "
	                + azul.getDestino() + "\nO número do seu acento é : " + azul.getNumAcento()
	                + "\nO número do seu voo é : " + azul.getNumeroDoVoo() + " verifique se esta correto"
	                        + "\nO peso maximo permitido da bagagem é de: " + azul.getPesoMala()
	                        + "\nA saída do seu voo está programada para as " + azul.getSaida()
	                        + "\nE o status do seu voo é: " + azul.getStatus());

	    }
}
