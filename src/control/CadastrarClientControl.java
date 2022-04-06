package control;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import model.Client;
import model.Dados;
import view.CadastrarClient;
import view.Login;

public class CadastrarClientControl {


	//classe responsavel pelo logica atras do view CadastrarClient

	
	private final CadastrarClient view;
	public CadastrarClientControl(CadastrarClient view) {
        this.view = view;
    }
//metodo que vai pegar input do usario e vai salva em dados
	
	public void cadastrarClient() {

        String name = view.getNameField().getText();
        String date = view.getDateField().getText();
        String cpf = view.getCpfField().getText();
        String email = view.getEmailField().getText();
        String password = view.getSenhaField().getText();

        Dados.getClientes().add(new Client(name, date, cpf, email, password));
    }
	/*
	 * getconfirmarbtn vai cadastrarclient e vai leva par a tela  login
	 * se  voltar button e clicado vai levar para  new login
	 * 
	 */
	
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

}
