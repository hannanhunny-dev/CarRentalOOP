package model;

public class Endereco {
	private String logradouro; 
	private String complemento;
	private String cep;
	private String  cidade;
	private String estado;
	private String  pontodeReferencia;
	private String endereco;
	
	
	public Endereco(String endereco,String estado,String cidade,String logradouro,String complemento,String  pontodeReferencia,String cep) {
		this.endereco=endereco;
		this.estado=estado;
	    this.cidade=cidade;
	    this.logradouro=logradouro;
	    this.complemento=complemento;
	    this.pontodeReferencia=pontodeReferencia;
	    this.cep=cep;
	}
	public Endereco() {
		
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getPontodeReferencia() {
		return pontodeReferencia;
	}
	public void setPontodeReferencia(String pontodeReferencia) {
		this.pontodeReferencia = pontodeReferencia;
	}
	
	

}
