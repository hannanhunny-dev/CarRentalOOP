package control;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import model.Admin;
import model.Client;
import model.Dados;
import view.CadastrarAdmin;
import view.LoginAdmin;


public class CadastrarAdminControl {
	
	
	
	private final CadastrarAdmin view;
	public CadastrarAdminControl(CadastrarAdmin view) {
        this.view = view;
    }
	
	public void cadastrarAdmin() {

        String name = view.getNameField().getText();
     
        String password = view.getSenhaField().getText();

        Dados.getAdmin().add(new Admin(name, password));
    }
	
	
	
	public void executarBotao(ActionEvent e) {
        JButton botao = (JButton) e.getSource();

        if (botao == view.getConfirmarBtn()) {
            cadastrarAdmin();
            view.mensagemConfirmarCadastro("Cadastro realizado com sucesso!");
            this.view.dispose();
            new LoginAdmin().setVisible(true);
        } else {
            this.view.dispose();
            new LoginAdmin().setVisible(true);
        }
    }
	
	
	   public Admin pegarModelo() {

	        String name = view.getNameField().getText();
	        String password = view.getSenhaField().getText();

	        return new Admin(name, password);
	    }

}
