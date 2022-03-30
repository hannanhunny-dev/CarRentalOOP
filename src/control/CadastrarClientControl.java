package control;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import model.Client;
import model.Dados;
import view.CadastrarClient;
import view.Login;

public class CadastrarClientControl {

	
	
	private final CadastrarClient view;
	public CadastrarClientControl(CadastrarClient view) {
        this.view = view;
    }
	
	
	public void cadastrarClient() {

        String name = view.getNameField().getText();
        String date = view.getDateField().getText();
        String cpf = view.getCpfField().getText();
        String email = view.getEmailField().getText();
        String password = view.getSenhaField().getText();

        Dados.getClientes().add(new Client(name, date, cpf, email, password));
    }
	
	
	 public void executarBotao(ActionEvent e) {
	        JButton botao = (JButton) e.getSource();

	        if (botao == view.getConfirmarBtn()) {
	            cadastrarClient();
	            view.mensagemConfirmarCadastro("Cadastro realizado com sucesso!");
	            this.view.dispose();
	            new Login().setVisible(true);
	        } else {
	            this.view.dispose();
	            new Login().setVisible(true);
	        }
	    }
	 
	   public Client pegarModelo() {

	        String name = view.getNameField().getText();
	        String date = view.getDateField().getText();
	        String cpf = view.getCpfField().getText();
	        String email = view.getEmailField().getText();
	        String password = view.getSenhaField().getText();

	        return new Client(name, date, cpf, email, password);
	    }
}
