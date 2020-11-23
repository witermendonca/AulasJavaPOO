package POO3;

import java.util.Scanner;

public class exe3 {
	 public static void main(String[] args) {
	        Scanner leia = new Scanner(System.in);
	        int parcelas;

	        produtoEletronico tv = new produtoEletronico("televisor", "Samsumg", 16000.00, 82, true);
	        if(tv.isaPrazo()) {
	        System.out.println("Você parcelou em quantas vezes ? ");
	        parcelas = leia.nextInt();
	        tv.setQntParcelas(parcelas);
	        }
	        System.out.println("Você adquiriu um " + tv.getTipo() + " da marca " + tv.getMarca()
	        + "\nO valor pago foi de: " + tv.getValor() +
	        "\nEla possui " + tv.getTamanho() + " polegas. "
	                + "\nE o status da sua compra é: " + tv.getStatus() + " vezes");

	        System.out.println("Pelos nossos testes " + tv.getFuncionando()
	        + "\nE " + tv.getTempoGarantia());
	    }
}
