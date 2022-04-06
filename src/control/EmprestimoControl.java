package control;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JLabel;

import model.Dados;
import model.Emprestimo;
import model.Endereco;
import view.AdcionarPagamento;
import view.EmprestimoView;

public class EmprestimoControl {
	 EmprestimoView view;
		//classe responsavel pelo logica atras do view EmprestimoView

	public EmprestimoControl(EmprestimoView view) {
		// TODO Auto-generated constructor stub
		this.view=view;
	}
	
	public void executarBotao(ActionEvent e) {
        JButton botao = (JButton) e.getSource();
        
        if(botao==view.getCOnfimrarBtn()) {
        	
        	salvaEmprestimoLocalDeEntrega();
        	salvaEmprestimoLocalDeDevolver();
        	new AdcionarPagamento().setVisible(true);
            this.view.dispose();
        	
        	
        	
        	
        }

       
    }

	//meteodos que vao salvar informacoes do emprestimo para que empressa pode ver os informações sobre aluguel
	
	
	public void salvaEmprestimoLocalDeEntrega() {
		
	String data =view.getDataFeild().getText();
	String endereco=view.getEnderecoFeild().getText();
	String logradouro=view.getLogradouroFeild().getText();
	String complemento= view.getComplementoFeild().getText();
	String cep=view.getCepFeild().getText();
	String cidade=view.getCidadeFeild().getText();
	String estado=view.getEstadoFeild().getText();
	String pontodeReferencia=view.getPontodeReferenciaFeild().getText();
	Dados.getEmprestimo().add(new Emprestimo(data,new Endereco(endereco,estado,cidade,logradouro,complemento,pontodeReferencia,cep),view.getDinehiro(),true));
	}
	
	public void salvaEmprestimoLocalDeDevolver() {
		String data =view.getDataFeildDeVolta().getText();
		String endereco=view.getEnderecoFeildDeVolta().getText();
		String logradouro=view.getLogradouroFeildDeVolta().getText();
		String complemento= view.getComplementoFeildDeVolta().getText();
		String cep=view.getCepFeildDeVolta().getText();
		String cidade=view.getCidadeFeildDeVolta().getText();
		String estado=view.getEstadoFeildDeVolta().getText();
		String pontodeReferencia=view.getPontodeReferenciaFeildDeVolta().getText();
		Dados.getEmprestimo().add(new Emprestimo(data,new Endereco(endereco,estado,cidade,logradouro,complemento,pontodeReferencia,cep),view.getDinehiro(),false));
		
		
	}
	
	
	
	
	
}
