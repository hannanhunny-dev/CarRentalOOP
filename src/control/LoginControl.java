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
	private static  int indextado;



    public LoginControl(Login view) {

        this.view = view;
    }
    
   



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
    
    
  
 
    
    


	public Client obterClient() {
        String name = view.getUsername().getText();
        @SuppressWarnings("deprecation")
		String password = view.getPassword().getText();
        return new Client(name, password);
    }
	
	

    
 
   
  
    
    
  
    
    public Login getView() {
        return view;
    }
 

	
	
}
