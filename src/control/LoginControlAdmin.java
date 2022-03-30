package control;
import view.Login;
import view.LoginAdmin;
import view.MenuAdmin;
import model.Client;
import model.Admin;

import java.awt.event.ActionEvent;
import javax.swing.JButton;

import model.Admin;
import model.Client;
import model.Dados;
import view.Login;


public class LoginControlAdmin {
	
	
	private final LoginAdmin view;


    public LoginControlAdmin(LoginAdmin view) {
        super();
        this.view = view;
    }
    
    
    public void executarBotao(ActionEvent e) {
        JButton botao = (JButton) e.getSource();

        if (botao == view.getLoginBtn()) {
            validadarUser();
        } else if(botao == view.getClientBtn()) {
        	new Login().setVisible(true);
        	
        }
         
    }
    
    
    
    public void validadarUser() {
    	
        Admin a = obterAdmin();
        

      
        Admin adminValidado = Dados.buscarAdmin(a);
     
        if (adminValidado != null && obterAdmin() != null) {
            view.mostrarMensagemLoginValido("Admin logado com sucesso!");
          new MenuAdmin().setVisible(true);
            this.view.dispose();
        	
        } else {
            view.mostrarMensagemLoginInvalido("Usuário e/ou senha inválidos!");
        }
      
        
    }
 
    
    public Admin obterAdmin(){
    	 String name = view.getUsername().getText();
		@SuppressWarnings("deprecation")
		String password = view.getPassword().getText();
         return new Admin(name, password);
    }
    
    
  
    
    public LoginAdmin getView() {
        return view;
    }

	
	
}
