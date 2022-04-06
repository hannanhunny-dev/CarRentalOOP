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

/*Classe controller para view LoginAdmin
 * tem todos os metodos necessarios para fzr comunicacao entre Modelo de dados e view.LoginAdmin
 */
	
	private final LoginAdmin view;


    public LoginControlAdmin(LoginAdmin view) {
        super();
        this.view = view;
    }
    
  /*  metodo que vai capturar evento 
    * 1-botao == view.getLoginBtn() , vai executar metodo validadarUser
    * 2-botao == view.getClientbtn() , vai inicaiar novo tela jframe para login do admin
    * 
    */
    public void executarBotao(ActionEvent e) {
        JButton botao = (JButton) e.getSource();

        if (botao == view.getLoginBtn()) {
            validadarUser();
        } else if(botao == view.getClientBtn()) {
        	new Login().setVisible(true);
        	this.view.dispose();
        	
        }
         
    }
    
    //meteodo que vai fzr validacao do admin
    
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
