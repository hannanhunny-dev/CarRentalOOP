package control;

import java.awt.event.ActionEvent;

import view.EditarContaClient;
import view.Login;
import view.MenuClient;

public class MenuControlClient {
	
	
    private final MenuClient view;
    public MenuControlClient(MenuClient view) {
        super();
        this.view = view;
    }
    
    
    
    public void executarBotao(ActionEvent e) {
        Object botao = e.getSource();

        if (botao == view.getSairBtn()) {
            new Login().setVisible(true);
            this.view.dispose();
        } else if (botao == view.getVisualizarCarrosBtn()) {
           //   new EditarContaClient().setVisible(true);
            this.view.dispose();
        } else if (botao == view.getMinhaContaBtn()) {
            new EditarContaClient().setVisible(true);
            this.view.dispose();
        }
    }


}
