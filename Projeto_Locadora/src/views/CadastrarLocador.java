package views;
import java.util.Scanner;
import controllers.LocadorController;
import models.Locador;

public class CadastrarLocador {
	static private Scanner teclado = new Scanner (System.in);
	static private Locador locador;
	
	public static void renderizar() {
		
		locador = new Locador();
		System.out.println("\n\nVocê entrou na opção 1 - Cadastrar Locador\n\n");
		System.out.println("\nInforme o nome do Locador:");
		locador.setNome(teclado.nextLine());
		System.out.println("\nInforme o CPF do locador");
		locador.setCpf(teclado.nextLine());
		
			if((boolean) LocadorController.cadastrar(locador)) {
				System.out.println("Cliente Cadastrado com sucesso!");
			}
			else {
				System.out.println("O cliente não pode ser cadastrado!");
			}
	}
}
