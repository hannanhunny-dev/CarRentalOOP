package control;

import javax.swing.JButton;

import model.Dados;
import view.EditarContaClient;
import view.Login;
import view.MenuClient;
import control.LoginControl;

public class EditarContaClientControl  {
	  private EditarContaClient view;
	  private LoginControl login;
	  
	public EditarContaClientControl(EditarContaClient view ) {
	        this.view = view;
	    }
	
	
	
	
	
	
	  public void executarBotao(JButton botao) {
	
	   if (botao == view.getConfirmarBtn()) {
		 
           String name = view.getNameField().getText();
           String date = view.getDateField().getText();
           String cpf = view.getCpfField().getText();
           String email = view.getEmailField().getText();
           String password = view.getSenhaField().getText();

           Dados.getClientes().get(view.getA()).setNome(name);
           Dados.getClientes().get(view.getA()).setDataDeNascimento(date);
           Dados.getClientes().get(view.getA()).setCpf(cpf);
           Dados.getClientes().get(view.getA()).setEmail(email);
           Dados.getClientes().get(view.getA()).setSenha(password);

           this.view.mensagemConfirmarCadastro("Editar as informações do Cliente foi um sucesso!");
           this.view.dispose();
           } 
	   else if ( botao == view.getVoltarBtn() ){
        	   new Login().setVisible(true);
        	   
           }
}
	  
	  
}