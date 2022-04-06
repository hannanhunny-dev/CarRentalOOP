package control;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import model.Admin;
import model.Client;
import model.Dados;
import view.CadastrarAdmin;
import view.LoginAdmin;
import view.MenuAdmin;


public class CadastrarAdminControl {
	
	//classe responsavel pelo logica atras do view CadastrarAdmin

	
	private final CadastrarAdmin view;
	public CadastrarAdminControl(CadastrarAdmin view) {
        this.view = view;
    }
	//metodo que pegar informacoes me textfeild do jframe para adcionar em dados
	public void cadastrarAdmin() {

        String name = view.getNameField().getText();
     
        String password = view.getSenhaField().getText();

        Dados.getAdmin().add(new Admin(name, password));
    }
	
	
	/*
	 * confirmar button  vai salvar novo admin em dadaos
	 * depois vai levar para novo login
	 * no caso usaurio clicar em back vai levar par menuadmin
	 */
	public void executarBotao(ActionEvent e) {
        JButton botao = (JButton) e.getSource();

        if (botao == view.getConfirmarBtn()) {
            cadastrarAdmin();
            view.mensagemConfirmarCadastro("Cadastro realizado com sucesso!");
            this.view.dispose();
            new LoginAdmin().setVisible(true);
        } else {
            this.view.dispose();
            new MenuAdmin().setVisible(true);
        }
    }
	
	//metodo que devolve input do usaurio em forma de object admin
	   public Admin pegarModelo() {

	        String name = view.getNameField().getText();
	        String password = view.getSenhaField().getText();

	        return new Admin(name, password);
	    }

}
