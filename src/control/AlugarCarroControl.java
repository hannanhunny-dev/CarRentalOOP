package control;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;

import model.Car;
import model.Dados;
import view.AdcionarPagamento;
import view.AlugarCarro;
import view.EmprestimoView;

public class AlugarCarroControl {
	
	
	private AlugarCarro view;
	 private int text2int;

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
			
		           
			text2int = Integer.parseInt(view.getQtdsDiasFeild().getText());    
		      
		//	new AdcionarPagamento(dinheiro,text2int).setVisible(true);
			new EmprestimoView(dinheiro,text2int).setVisible(true);
			this.view.dispose();
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
	    		//view.getpreco().setVisible(true);
	    	}else {
	    		view.getProximo().setVisible(false);
	    		//view.getpreco().setVisible(false);
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

    Random random = new Random();
   private int dinheiro = 100 + random.nextInt(200);
   
   public int getDinheiro() {
	   return dinheiro;
   }
   
   
   
   
  //  private int text2int = Integer.parseInt(view.getQtdsDiasFeild().getText());

	 public int getText2int() {
		 return text2int;
	 }

}

