package sprint;

import java.util.Scanner;

public class Sac {

	public static void main(String[] args) {
		PilhaMensagens pilhaMensagens = new PilhaMensagens();
		pilhaMensagens.init();
		Scanner le = new Scanner(System.in);
		System.out.print("Digite nome do cliente: ");
		String nome = le.nextLine();
		System.out.print("Digite id do cliente: ");
		int id = le.nextInt();
		int opcao;
		do {
			Usuario cliente = new Usuario(id, nome);
			System.out.println(gerarMenu());
			opcao = le.nextInt();
			switch (opcao) {
			case 0:
				System.out.println("Finalizado o atendimento");
				break;
			case 1:
				System.out.println("Digite mensagem a ser enviada: ");
				le.nextLine();
				String msg = le.nextLine();
				cliente.enviaMsg(msg);
				pilhaMensagens.push(cliente);
				break;
			case 2:
				pilhaMensagens.leMsg();
				break;
			default:
				System.out.println("Opção inválida!");
			}
		} while (opcao != 0);
	}

	private static String gerarMenu() {
		String aux = "Escolha uma operação\n";
		aux += "0- para sair do sistema\n";
		aux += "1- para enviar mensagem de feedback\n";
		aux += "2- ler e responder mensagem de feedback\n";
		aux += "Digite opção:";
		return aux;
	}
}
