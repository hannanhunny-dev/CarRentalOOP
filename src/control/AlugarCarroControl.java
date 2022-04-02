package control;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;

import model.Car;
import model.Dados;
import view.AlugarCarro;

public class AlugarCarroControl {
	
	private AlugarCarro view;

	public AlugarCarroControl(AlugarCarro view){
		this.view = view;
	}
	
	
	
	

	public void executarBotao(ActionEvent e) {
		// TODO Auto-generated method stub
		Object botao = e.getSource();
		if(botao == view.getOkBtn()) {
			view.getAreaText().setText(((this.buscarCarEscolhido((String)view.getSelecionarCarro().getSelectedItem())).toString()));
            view.getAreaText().updateUI();
            checkAvailability();
            
			
		}else if (botao == view.getProximo()) {
			
		}
		
	}
	
	
	
	
	  private boolean saoIguais(String marca) {
	        for (Car c : Dados.getCars()) {
	            if (c.getMarca().equals(marca)) {
	                return true;
	            }
	        }

	        return false;
	    }
	    
	    
	    //
	    public Car buscarCarEscolhido(String name) {
	        for (Car c : Dados.getCars()) {
	            if (c.getMarca().equals(name)) {
	                return c;
	            }
	        }

	        return null;
	    }
	    
	    
	    public boolean buscarCarEscolhidoDisponivel(String name) {
	        for (Car c : Dados.getCars()) {
	            if (c.getMarca().equals(name)) {
	                return c.isDisponivel();
	            }
	        }
			return false;

	       
	    }
	    
	    public void checkAvailability() {
	    	if(buscarCarEscolhidoDisponivel((String)view.getSelecionarCarro().getSelectedItem()) == true){
	    		view.getProximo().setVisible(true);
	    	}else {
	    		view.getProximo().setVisible(false);
	    	}
	    }
	    
	    
	    
	    //
	    
	    public DefaultComboBoxModel<String> atualizarCar() {
	        return new DefaultComboBoxModel<>(arraysCar());
	    }
	    //
	    
	    public String[] arraysCar() {
	        List<String> modelo = new ArrayList<>();

	        for (Car c : Dados.getCars()) {
	            modelo.add(c.getMarca());
	        }

	        return modelo.toArray(new String[0]);
	    }
	
	
	
	

}
