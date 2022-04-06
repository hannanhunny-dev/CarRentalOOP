package control;

import java.awt.event.ActionEvent;

import view.CadastrarAdmin;
import view.CadastrarCarro;
import view.EditarEDeletarCarro;
import view.Login;
import view.MenuAdmin;
import view.VisualizarCarro;


public class MenuControlAdmin {

	private final MenuAdmin view;

	public MenuControlAdmin(MenuAdmin view) {
	//	super();
		this.view = view;
	}

	public void executarBotao(ActionEvent e) {
		Object botao = e.getSource();

		if (botao == view.getSairBtn()) {
			new Login().setVisible(true);
			this.view.dispose();
		} else if (botao == view.getCadastrarCarrosBtn()) {
			new CadastrarCarro().setVisible(true);
			this.view.dispose();
		} else if (botao == view.getAdcionarAdminBtn()) {
			new CadastrarAdmin().setVisible(true);
			this.view.dispose();
		} else if (botao == view.getEditarCarrosBtn()) {
			 new EditarEDeletarCarro().setVisible(true);
			 this.view.dispose();
		} else if (botao == view.getVisualizarCarrosBtn()) {
			 new VisualizarCarro().setVisible(true);
			this.view.dispose();
		} else if (botao == view.getMinhaContaBtn()) {
			view.indisponivel(" indisponivel no momento");
		}else if (botao== view.getDeletarCarrosBtn()) {
			new EditarEDeletarCarro().setVisible(true);
			 this.view.dispose(); 
		}
	}

}