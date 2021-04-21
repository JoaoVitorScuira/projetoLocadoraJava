package controllers;

import java.util.ArrayList;

import models.Locador;

public class LocadorController {
	
	private static ArrayList<Locador> locadores = new ArrayList<Locador>();
	
	public static boolean cadastrar(Locador locador) {
		
		for(Locador locadorCadastrado : locadores) {
			if(locadorCadastrado.getCpf().equals(locador.getCpf())) {
				return false;
			}
		}
		
		locador.add(locador);	
		return true;
	}
	
	
	public static ArrayList<Locador> listar(){
		return locadores;
	}
}
