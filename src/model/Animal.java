package model;

public class Animal {
	
	private String nome;
	private int idade;
	private Cliente dono;
	
	
	public String toString() {
		return "Animal [nome=" + nome + ", idade=" + idade + ", dono=" + dono + "]";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Cliente getDono() {
		return dono;
	}
	public void setDono(Cliente dono) {
		this.dono = dono;
	}
	
	
	
}
