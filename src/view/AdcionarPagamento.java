package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;


import control.PagamentoControl;

public class AdcionarPagamento extends JFrame implements ActionListener {

	
	private final JLabel nomeroDoCartao;       
	private final JLabel  nomeImpresso;      
	private final JLabel dataDevalidacao; 
	private final JLabel codigoDeSeguranca; 
	private final JLabel CartaoDeCredito;
	private final JButton nomeroDoCartaoBtn;       
	private final JButton  nomeImpressoBtn;      
	private final JButton dataDevalidacaoBtn; 
	private final JButton codigoDeSegurancaBtn;
	private JPanel contentPane; 
	private static final String COLO_STRING = "Open Sans";

	//private PagamentoControl controller;
	
	
	
	public AdcionarPagamento() {
	//	controller = new PagamentoControl(this);
		
		
		setResizable(false);
		setTitle("Pagamento");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
	    setContentPane(contentPane);
		contentPane.setLayout(null);
		
		CartaoDeCredito = new JLabel("Cartao de Credito");
		CartaoDeCredito.setFont(new Font(COLO_STRING, Font.PLAIN, 16));
		CartaoDeCredito.setBounds(10, 111, 151, 21);
		contentPane.add(CartaoDeCredito);
		
		nomeImpresso = new JLabel("Cartao de Credito");
		nomeImpresso.setFont(new Font(COLO_STRING, Font.PLAIN, 16));
		nomeImpresso.setBounds(10, 111, 151, 21);
		contentPane.add(nomeImpresso);
		
		dataDevalidacao = new JLabel("Cartao de Credito");
		dataDevalidacao.setFont(new Font(COLO_STRING, Font.PLAIN, 16));
		dataDevalidacao.setBounds(10, 111, 151, 21);
		contentPane.add(dataDevalidacao);
		
		codigoDeSeguranca = new JLabel("Cartao de Credito");
		codigoDeSeguranca.setFont(new Font(COLO_STRING, Font.PLAIN, 16));
		codigoDeSeguranca.setBounds(10, 111, 151, 21);
		contentPane.add(codigoDeSeguranca);
		
		
		
		
		
		
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
