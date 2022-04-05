package model;


public class Emprestimo {
	
	private String date;
	private  Endereco endereco;
	private int alguel;
	private boolean EntregarOuDevolver;
	
	public Emprestimo() {}
	public Emprestimo(String date,Endereco endereco, int alguel,boolean EntregarOuDevolver) {
		this.date = date;
		this.endereco = endereco;
		this.alguel = alguel;
		this.EntregarOuDevolver =EntregarOuDevolver;
		
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public int getAlguel() {
		return alguel;
	}
	public void setAlguel(int alguel) {
		this.alguel = alguel;
	}
	public boolean isEntregarOuDevolver() {
		return EntregarOuDevolver;
	}
	public void setEntregarOuDevolver(boolean entregarOuDevolver) {
		EntregarOuDevolver = entregarOuDevolver;
	}
	

	
	

}
