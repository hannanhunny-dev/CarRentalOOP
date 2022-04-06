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
import view.MenuClient;

public class AlugarCarroControl {
	
	//classe responsavel pelo logica atras do view AlugarCarro
	private AlugarCarro view;
	 private int text2int;

	public AlugarCarroControl(AlugarCarro view){
		this.view = view;
	}
	/*
	 * se usaurio clicar em butao ok sistema vai mostra detalhes do carro selecionado em combobox
	 * se carro fosse disponivel esta disponivel, o sistema vai visibilizar button para comprar carro
	 * @param no caso usaurio selecionar carro sistema vai levar para novo tela com EmprestimoView com de dinheiro e dias para que usaurio esta querendo
	 */
	
	

	public void executarBotao(ActionEvent e) {
		// TODO Auto-generated method stub
		Object botao = e.getSource();
		if(botao == view.getOkBtn()) {
			view.getAreaText().setText(((this.buscarCarEscolhido((String)view.getSelecionarCarro().getSelectedItem())).toString()));
            view.getAreaText().updateUI();
            checkAvailability();
            
			
		}else if (botao == view.getProximo()) {
			
		           
			text2int = Integer.parseInt(view.getQtdsDiasFeild().getText());    
		    new EmprestimoView(dinheiro,text2int).setVisible(true);
			this.view.dispose();
		}else if (botao== view.getVoltarBtn()) {
			new MenuClient().setVisible(true);
			this.view.dispose();
		}
		
	}
	
	
	//boolean para verificao de dados em dados.getcar
	
	  private boolean saoIguais(String marca) {
	        for (Car c : Dados.getCars()) {
	            if (c.getMarca().equals(marca)) {
	                return true;
	            }
	        }

	        return false;
	    }
	    
	    
	    //se o carro fosse escolhido vai devolver o informacoes salvados nos dados
	    public Car buscarCarEscolhido(String name) {
	        for (Car c : Dados.getCars()) {
	            if (c.getMarca().equals(name)) {
	                return c;
	            }
	        }

	        return null;
	    }
	    
	    //metodo vai verficao de se carro esta disponivel para alugamento
	    public boolean buscarCarEscolhidoDisponivel(String name) {
	        for (Car c : Dados.getCars()) {
	            if (c.getMarca().equals(name)) {
	                return c.isDisponivel();
	            }
	        }
			return false;

	       
	    }
	    
	    
	    //metodo que ta usando metodo buscarCarEscolhidoDisponivel dentro dele para verificao se carro esta disponivel
	    public void checkAvailability() {
	    	if(buscarCarEscolhidoDisponivel((String)view.getSelecionarCarro().getSelectedItem()) == true){
	    		view.getProximo().setVisible(true);
	    		
	    	}else {
	    		view.getProximo().setVisible(false);
	    	
	    	}
	    }
	    
	    
	    //
	    // marca em objeto car do arraylist para array e depois esse array para combobox 
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
// usando random para gerar preco random do carro
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

