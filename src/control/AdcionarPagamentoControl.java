package control;

import java.awt.event.ActionEvent;

import model.Client;
import model.Dados;
import model.Pagamento;
import view.AdcionarPagamento;

public class AdcionarPagamentoControl {
	
	
	
	private AdcionarPagamento view;

	public AdcionarPagamentoControl(AdcionarPagamento view){
		this.view =view;
	}

	public void executarBotao(ActionEvent e) {
		
		// TODO Auto-generated method stub
		
		
		if(e.getSource()==view.getpagarBtn()) {
			salvaPagmento();
			view.ObrigadoMesagen("Pagamento realizado com Sucesso");

			view.ObrigadoMesagen("Obrigado pelo escholher nosso servico");
			this.view.dispose();
		}
		
	}
	
	
	
	public void salvaPagmento() {
		
		String nomeroDoCartao = view.getnomeroDoCartaoFeild().getText();
		String  nomeImpresso = view.getnomeImpressoFeild().getText();
		String dataDevalidacao = view.getdataDevalidacaoFeild().getText();
		int codigoDeSeguranca = Integer.parseInt( view.getcodigoDeSegurancaFeild().getText());
		 
		Dados.getPagamentos().add( new Pagamento(nomeroDoCartao, nomeImpresso, dataDevalidacao, codigoDeSeguranca));
		
	}

}
