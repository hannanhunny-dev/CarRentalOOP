package control;

import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;

import model.Car;
import model.Dados;
import view.EditarEDeletarCarro;
import view.Login;
import view.MenuAdmin;

public class EditarEDeletarCarroControl {
	
	
	
	private final EditarEDeletarCarro view;
	private String b;


    public EditarEDeletarCarroControl(EditarEDeletarCarro view) {
        this.view = view;
    }

   //
    public void executaBotao(Object botao) {
    	
    	if (botao == view.getExcluirBtn()) {
    		 excluirCarro((String)view.getBuscarCarroComboBox().getSelectedItem());
    		 this.view.dispose();
    		 new EditarEDeletarCarro().setVisible(true);
    		 
            // this.view.dispose();
    	}else if (botao == view.getMostraBtn()) {
    		view.getInformacoesTable().setText(((this.buscarCarEscolhido((String)view.getBuscarCarroComboBox().getSelectedItem())).toString()));
            view.getInformacoesTable().updateUI();
    		
    	}else if (botao == view.getEditarBtn()) {
    	//	b = (String) view.getBuscarCarroComboBox().getSelectedItem();
    		EditarInformacoesCar();
    	    buscarCarEscolhidoIndex(b);
    	} else if (botao == view.getConfirmarBtn() ) {
    		salvaMudancas();
    		this.view.dispose();
    		new EditarEDeletarCarro().setVisible(true);
    	} else if (botao == view.getVoltarBtn()) {
    		new MenuAdmin().setVisible(true);
    		this.view.dispose();
    	}

        
    }	

    //
    
    public boolean excluirCarro(String name) {
        for (Car c : Dados.getCars()) {
            if (saoIguais(name)) {
                Dados.getCars().remove(c);
                return true;
            }
        }

        view.mostrarMensagemErro("Não foi possível excluir o usuário");
        return false;
    }
    
    //
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
 

   // meteodos para  no caso admin deseja mudar alguma informacao
    
    
    
    public int buscarCarEscolhidoIndex(String name) {
    	for (Car c : Dados.getCars()) {
            if (c.getMarca().equals(name)) {
                return Dados.getCars().indexOf(c);
            }
        }

        return -1;
    	
    }
 
    	public void EditarInformacoesCar() {
    		String marca = this.buscarCarEscolhido((String)view.getBuscarCarroComboBox().getSelectedItem()).getMarca();
            String cor =this.buscarCarEscolhido((String)view.getBuscarCarroComboBox().getSelectedItem()).getCor();
            String anoDeFabricacao = this.buscarCarEscolhido((String)view.getBuscarCarroComboBox().getSelectedItem()).getAnoDeFabricacao();
            String modelo = this.buscarCarEscolhido((String)view.getBuscarCarroComboBox().getSelectedItem()).getModelo();
            boolean disponivel = this.buscarCarEscolhido((String)view.getBuscarCarroComboBox().getSelectedItem()).isDisponivel();
            
            
            
            view.getMarcaFeild().setText(marca);
            view.getCorFeild().setText(cor);
            view.getAnoDeFAbricacaoFeild().setText(anoDeFabricacao);
            view.getModeloFeild().setText(modelo);
            view.disponiveComboBox().setSelectedItem(disponivel);
            
            
    	}
    	public void salvaMudancas() {
    		boolean a;
      		String marca = view.getMarcaFeild().getText();
            String cor =view.getCorFeild().getText();
            String anoDeFabricacao = view.getAnoDeFAbricacaoFeild().getText();
            String modelo = view.getModeloFeild().getText();
            Object disponivel = view.disponiveComboBox().getSelectedItem();
            if(disponivel.equals(true)) {
 	    	   a = true;
 	       }else {
 	    	   a = false;
 	       }
            b = (String) view.getBuscarCarroComboBox().getSelectedItem().toString();
            int c = buscarCarEscolhidoIndex(b);
            Dados.getCars().get(c).setMarca(marca);
            Dados.getCars().get(c).setCor(cor);
            Dados.getCars().get(c).setAnoDeFabricacao(anoDeFabricacao);
            Dados.getCars().get(c).setModelo(modelo);
            Dados.getCars().get(c).setDisponivel(a);
    	}
    	
    

     
    
    
    
  
}
