package views;

import controllers.LocadorController;

import models.Locador;

public class ListarLocador {

	@SuppressWarnings("unused")
	public static void renderizar() {
		
		System.out.println("\n\n Voc� entrou na op��o 2 - Listagem de locadores");
			for(Locador locadorCadastrado : LocadorController.listar()) {
	//		
				System.out.println();
			}
		
	}
}
