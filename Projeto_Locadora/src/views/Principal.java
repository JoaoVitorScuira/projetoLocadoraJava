package views;
import java.util.ArrayList;
import java.util.Scanner;

import models.Locador;

public class Principal {
	public static void main (String []args) {
		Scanner teclado = new Scanner (System.in);
		int op;
		Locador locador;
		do {
			System.out.println("\n\n\n Bem Vindo ao Sistema de Locação de Veículos!");
			System.out.println("\n Digite a opção desejada no menu a baixo:");
			System.out.println("\n Opção 1 - Cadastar locador");
			System.out.println("\n Opção 2 - Listar locador");
			System.out.println("\n Opção 3 - Cadastar Veículo");
			System.out.println("\n Opção 4 - Cadastar Locação");
			System.out.println("\n Opção 0 - Finalizar");
			System.out.println("\n Digite a opção escolhida:");
			op = teclado.nextInt();
				switch (op) {
				case 1: 
					CadastrarLocador.renderizar();
					break;
				case 2:
					ListarLocador.renderizar();
					break;
				case 3:
					
				case 4:
					
				case 0:
					System.out.println("\n\n\nFinalizando o programa!");
					break;
				default:
					throw new IllegalArgumentException("Essa opção não existe: " + op);
				}
		} while (op != 0);
	}
}
