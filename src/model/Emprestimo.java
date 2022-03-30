package model;


public class Emprestimo {
	
	private String date;
	private  Endereco endereco;
	private double alguel;
	
	public Emprestimo() {}
	public Emprestimo(String date,Endereco endereco, double alguel) {
		this.date = date;
		this.endereco = endereco;
		this.alguel = alguel;
		
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
	public double getAlguel() {
		return alguel;
	}
	public void setAlguel(double alguel) {
		this.alguel = alguel;
	}
	
	
	

}
