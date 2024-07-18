package aplicacao;

import java.util.Scanner;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {

	@Override
	public void fazerChamada() {
		System.out.println("Fazendo ligação");
	}

	@Override
	public void receberChamada() {
		System.out.println("Atendendo ligação");
	}

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo página");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando página");
	}

	@Override
	public void tocarMusica() {
		System.out.println("Reproduzindo música");
	}

	@Override
	public void pausarMusica() {
		System.out.println("Música pausada");
	}

	@Override
	public void escolherMusica() {
		System.out.println("Musica selecionada");
	}

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		Iphone iphone = new Iphone();
		int opcao;
		do {
			System.out.println("Selecione uma opção no menu: \n +" 
					+ "1: Efetuar ligação \n +"
					+ "2: Atender ligação \n +" 
					+ "3: Selecionar música \n +"
					+ "4: Tocar música \n +" 
					+ "5: Pausar música \n +" 
					+ "6: Exibir página no navegador \n +"
					+ "7: Atualizar página no navegador \n +" 
					+ "0: Desligar\n\n"
					+ "opção: ");

			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				iphone.fazerChamada();
				Thread.sleep(1000);
				break;
			case 2:
				iphone.receberChamada();
				Thread.sleep(1000);
				break;
			case 3:
				iphone.escolherMusica();
				Thread.sleep(1000);
				break;
			case 4:
				iphone.tocarMusica();
				Thread.sleep(1000);
				break;
			case 5:
				iphone.pausarMusica();
				Thread.sleep(1000);
				break;
			case 6:
				iphone.exibirPagina();
				Thread.sleep(1000);
				break;
			case 7:
				iphone.atualizarPagina();
				Thread.sleep(1000);
				break;
			case 0:
				System.out.println("Desligando o aparelho");
				Thread.sleep(900);
				break;
			default:
				System.out.println("Opção inválida. Insira um número de 0 a 7.");
				Thread.sleep(1000);
			}
		} while (opcao != 0);
		sc.close();

	}
	
}
