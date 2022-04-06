package control;
import view.CadastrarClient;
import view.EditarContaClient;
import view.Login;
import model.Client;
import model.Admin;
import model.Car;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;

import model.Admin;
import model.Client;
import model.Dados;

import view.Login;
import view.LoginAdmin;
import view.MenuClient;
public class LoginControl {
	
	
	private final Login view;


/*Classe controller para view Login
 * tem todos os metodos necessarios para fzr comunicacao entre Modelo de dados e view.Login
 */

    public LoginControl(Login view) {

        this.view = view;
    }
    
   

/*
 * metodo que vai capturar evento 
 * 1-botao == view.getLoginBtn() , vai executar metodo validadarUser
 * 2-botao == view.getAdminBtn() , vai inicaiar novo tela jframe para login do admin
 * 3-terceiro botao vai levar vc para novo tela para cadaastrar novo usaurio
 */

	public void executarBotao(ActionEvent e) {
        JButton botao = (JButton) e.getSource();

        if (botao == view.getLoginBtn()) {
            validadarUser();
      
        } else if(botao == view.getAdminBtn()) {
        	new LoginAdmin().setVisible(true);
        	this.view.dispose();
        }else {
          new CadastrarClient().setVisible(true);
            this.view.dispose();
        }
    }
    
    
    //metodo que vai validadar input do usuario para ver se usaurio existe me banco dos dados
    public void validadarUser() {
    	Client c = obterClient();
       
        

        Client clienteValidado = Dados.selecionarPorNomeESenha(c);

        if ((clienteValidado != null && obterClient() != null)) {
        	
            view.mostrarMensagemLoginValido("Login realizado com sucesso!");
            new MenuClient().setVisible(true);
           // this.view.dispose();
        	

        }  else {
            view.mostrarMensagemLoginInvalido("Usuário e/ou senha inválidos!");
        }
      
        
    }
    
    
  
 
    
    //metodo que vai salvar input do usuario digitada em textfeild do frame


	public Client obterClient() {
        String name = view.getUsername().getText();
        @SuppressWarnings("deprecation")
		String password = view.getPassword().getText();
        return new Client(name, password);
    }
	
	

    
 
   
  
    
    

	
	
}
