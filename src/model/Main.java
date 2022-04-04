package model;
import view.AdcionarPagamento;
import view.AlugarCarro;
import view.CadastrarAdmin;
import view.CadastrarCarro;
import view.CadastrarClient;
import view.EditarContaClient;
import view.EditarEDeletarCarro;
import view.Login;
import view.MenuAdmin;
import view.VisualizarCarro;

import java.lang.ModuleLayer.Controller;
import java.util.ArrayList;

import java.util.Scanner;
import control.LoginControl;

public class Main {

	public static void main(String[] args) {
		
		
		
	  

// classe main para testar codigo

		
		
		
		Dados.start();
		
		
		//Client a = new Client("a","bfdsf","bfd","v","dgfc");
	//	Dados.selecionarPorNomeESenha(a);
		new Login().setVisible(true);
		
	//	new MenuAdmin().setVisible(true);
		
		//new CadastrarClient().setVisible(true);
	//	new CadastrarAdmin().setVisible(true);
	//	new CadastrarCarro().setVisible(true); 
       //  new EditarContaClient().setVisible(true);
	//System.out.println(Dados.getClientes().get(0).getNome());
		//new EditarEDeletarCarro().setVisible(true);
	
	//System.out.print(getIndexOfContaLogado() );
	//	new VisualizarCarro().setVisible(true);
		// new EditarEDeletarCarro().setVisible(true);
		
	new AlugarCarro().setVisible(true);
		
		
	//	new AdcionarPagamento().setVisible(true);
}
}
