package control;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JRadioButton;

import model.Car;
import model.Dados;
import view.CadastrarCarro;
import view.MenuAdmin;

public class CadastrarCarroControl {
	
	private boolean a;

	private final CadastrarCarro view;
	//private CadastrarCarro view;
	
	public CadastrarCarroControl(CadastrarCarro view) {
       this.view = view;
    }

	 public void cadastrarCarro() {

	        String marca = view.getMarcaFeild().getText();
	        String cor = view.getCorFeild().getText();
	        String anoDeFabricacao = view.getAnoDeFabricacaoFeild().getText();
	        String modelo = view.getModeloFeild().getText();
	        Object disponivel = view.getDisponiveComboBox().getSelectedItem();
	       if(disponivel.equals(true)) {
	    	   a = true;
	       }else {
	    	   a = false;
	       }

	        Dados.getCars().add(new Car(marca, cor, modelo, anoDeFabricacao, a));
	        System.out.print(a);
	    }
	 
	  public void executarBotao(ActionEvent e) {
	        JButton botao = (JButton) e.getSource();
	       
	        if (botao == view.getAdcionarCarroBtn()) {
	            cadastrarCarro();
	            this.view.mostrarMensagemCadastro("Cadastro finalizado com sucesso!");
	            this.view.dispose();
	            new MenuAdmin().setVisible(true);
	        } else {
	            this.view.dispose();
	            new MenuAdmin().setVisible(true);
	        }
	    }
	  
	
}
