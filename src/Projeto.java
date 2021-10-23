import java.util.Locale;
import java.util.Scanner;
import entitites.Banco;

public class Projeto {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Nome do titular: ");
		String nome = sc.next();
		sc.nextLine();
		System.out.println("Numero da conta: ");
		int numeroDaConta = sc.nextInt();

		Banco banco = new Banco(numeroDaConta, nome);

		System.out.println("Valor do deposito inicial?");
		double valorDepositoInicial = sc.nextDouble();
		banco.setValorDepositoInicial(valorDepositoInicial);

		System.out.println("Deseja fazer algo ou gostaria de encerrar? Para encerrar - 3, saque - 2, deposito - 1");
		int escolha = sc.nextInt();
		for (int i = 0; i <= escolha; i++) {
			if (escolha == 1) {
				System.out.println("Qual o valor do deposito que deseja fazer? ");
				banco.setDeposito(sc.nextDouble());
				System.out.printf("Seu saldo atual é de: R$ %.2f%n", banco.deposito());
			} else if (escolha == 2) {
				if (banco.getValorDepositoInicial() == 0) {
					System.out.println("Não será possível fazer um saque");
				} else {
					System.out.println("Coloque o valor do saque: ");
					banco.setSaque(sc.nextDouble());
					System.out.printf("Seu saldo atual é de: R$ %.2f%n", banco.saque());
				}
			}
			i++;
			System.out.println(
					"Deseja fazer um deposito? Coloque 1, caso queira fazer um saque coloque 2, para finalizar 3");
			escolha = sc.nextInt();
		}

	}
}
