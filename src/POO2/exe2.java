package POO2;
import java.util.Scanner;

public class exe2 {
	 public static void main(String[] args) {
	        Scanner leia = new Scanner (System.in);
	        String horas;
	        System.out.println("Que horas S�o ?");
	        horas=leia.next();

	        airplane azul = new airplane();
	        azul.setHoras(horas);
	        azul.setDestino("macei�");
	        azul.setNumAcento(195);
	        azul.setNumeroDoVoo("6565");
	        azul.setPesoMala(85);
	        azul.setSaida("13:30");

	        System.out.println("Agora s�o : "+ azul.getHoras()+ " Horas, e voc� esta indo para "
	                + azul.getDestino() + "\nO n�mero do seu acento � : " + azul.getNumAcento()
	                + "\nO n�mero do seu voo � : " + azul.getNumeroDoVoo() + " verifique se esta correto"
	                        + "\nO peso maximo permitido da bagagem � de: " + azul.getPesoMala()
	                        + "\nA sa�da do seu voo est� programada para as " + azul.getSaida()
	                        + "\nE o status do seu voo �: " + azul.getStatus());

	    }
}
