package model;

public class Car {
	private String marca;
	private String cor;
	private String modelo;
	private String anoDeFabricacao;
	private boolean disponivel;
	
	
	

	
	public Car(String marca, String cor, String modelo, String anoDeFabricacao, boolean disponivel) {
		
		// TODO Auto-generated constructor stub
		this.marca = marca;
		this.cor = cor;
		this.modelo = modelo;
		this.anoDeFabricacao = anoDeFabricacao;
		this.disponivel = disponivel;


		

		
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo=modelo;
	}
	public String getAnoDeFabricacao() {
		return anoDeFabricacao;
	}
	public void setAnoDeFabricacao(String anoDeFabricacao) {
		this.anoDeFabricacao = anoDeFabricacao;
	}
	
	public boolean isDisponivel() {
		return disponivel;
	}
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;}
	
	
	
    public String toString() {
        return "Car: "+ "\n"
                +"Modelo :"+ getModelo() + "\n"+
        		"\n"+
    
        		"Marca :  "+ getMarca() + "\n"+
	             "\n"+
	            "Cor  :  " + getCor() + "\n"
	            +"\n"+
	            "Ano de Facricacoa :  "+ getAnoDeFabricacao() +"\n"
	            +"\n"+
	          "Disponibilidade  :  "  + isDisponivel() + "\n";
	            
    }
  
}
