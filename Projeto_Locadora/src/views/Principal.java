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
			System.out.println("\n\n\n Bem Vindo ao Sistema de Loca��o de Ve�culos!");
			System.out.println("\n Digite a op��o desejada no menu a baixo:");
			System.out.println("\n Op��o 1 - Cadastar locador");
			System.out.println("\n Op��o 2 - Listar locador");
			System.out.println("\n Op��o 3 - Cadastar Ve�culo");
			System.out.println("\n Op��o 4 - Cadastar Loca��o");
			System.out.println("\n Op��o 0 - Finalizar");
			System.out.println("\n Digite a op��o escolhida:");
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
					throw new IllegalArgumentException("Essa op��o n�o existe: " + op);
				}
		} while (op != 0);
	}
}
