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
	
	//classe responsavel pelo logica atras do view EditarEDeletarCarro

	
	private final EditarEDeletarCarro view;
	private String b;


    public EditarEDeletarCarroControl(EditarEDeletarCarro view) {
        this.view = view;
    }

   /*esse controller tem metodos que vao  filtrar Marca do carro para mostrar em combobox no caso esse se e selecionado em combobox
    *  eles vao mostra objeto carro daquele marca assim admin pode fzr operacoes crud nos carros.
    * 
    * 
    * 
    */
    public void executaBotao(Object botao) {
    	
    	if (botao == view.getExcluirBtn()) {
    		 excluirCarro((String)view.getBuscarCarroComboBox().getSelectedItem());
    		 this.view.dispose();
    		 new EditarEDeletarCarro().setVisible(true);
    		 
            
    	}else if (botao == view.getMostraBtn()) {
    		view.getInformacoesTable().setText(((this.buscarCarEscolhido((String)view.getBuscarCarroComboBox().getSelectedItem())).toString()));
            view.getInformacoesTable().updateUI();
    		
    	}else if (botao == view.getEditarBtn()) {
    	
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

    // metodo que pegar o marca do carro e vai exculir o carro dos dados
    
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
    
    //metodo boolean que vai fzr compracao entres string marca e car.getmarca() para ver se ele esta em dados
    private boolean saoIguais(String marca) {
        for (Car c : Dados.getCars()) {
            if (c.getMarca().equals(marca)) {
                return true;
            }
        }

        return false;
    }
    
    
    //metodo que pegar string do combobox e vai tentar achar aquele carro dentro dos dadaos
    public Car buscarCarEscolhido(String name) {
        for (Car c : Dados.getCars()) {
            if (c.getMarca().equals(name)) {
                return c;
            }
        }

        return null;
    }
    
    
    
    //novo combobox que usar arraysCar() para itens
    
    public DefaultComboBoxModel<String> atualizarCar() {
        return new DefaultComboBoxModel<>(arraysCar());
    }
    // metodo que vai converter arraylist carros para arraylist carros.getmarca()
    
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
           /*
            * no caso admin deseja mudar informcaoes metodo vai correr metodos anterios para pegar o arraylist o carro que esta selecionado em combobox e vai 
            * fzr set text do informacoes atuais do objeto carro
            */
    
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
    	
    	// metodo que usar o buscarCarEscolhidoIndex() para cahr o index do objeto atual em que estamos trablanho para salvar informcoes
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
