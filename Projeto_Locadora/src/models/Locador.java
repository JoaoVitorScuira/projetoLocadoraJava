package models;

public class Locador {

	private String nome;
	private String cpf;	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public boolean equals(Object obj) {
		Locador outroLocador = (Locador) obj;
		return getCpf().equals(outroLocador.getCpf());
	}
	
	@Override
	public String toString() {
		return "Nome: " + getNome() + " | CPF: " + getCpf();
	}
	
	public void add(Locador locador) {
		// TODO Auto-generated method stub
		
	}
}
