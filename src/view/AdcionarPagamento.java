package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Font;

import control.AdcionarPagamentoControl;
public class AdcionarPagamento extends JFrame implements ActionListener {

	
	private final JLabel nomeroDoCartao;       
	private final JLabel  nomeImpresso;      
	private final JLabel dataDevalidacao; 
	private final JLabel codigoDeSeguranca; 
	private final JLabel CartaoDeCredito;
	private final JTextField nomeroDoCartaoFeild;       
	private final JTextField  nomeImpressoFeild;      
	private final JTextField dataDevalidacaoFeild; 
	private final JTextField codigoDeSegurancaFeild;
	private JPanel contentPane; 
	private final JButton pagarBtn;
	
//	private final JLabel checkout;
	
	private static final String COLO_STRING = "Open Sans";

	private AdcionarPagamentoControl controller;
	
	// int dinehrio;
	// int text2int;
	
	public AdcionarPagamento() {
		controller = new AdcionarPagamentoControl(this);
		
		
		setResizable(false);
		setTitle("Pagamento");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
	    setContentPane(contentPane);
		contentPane.setLayout(null);
		
		CartaoDeCredito = new JLabel(" Adcionar Cartao de Credito");
		CartaoDeCredito.setFont(new Font(COLO_STRING, Font.PLAIN, 27));
		CartaoDeCredito.setBounds(70, 70, 350, 50);
		contentPane.add(CartaoDeCredito);
		
		nomeImpresso = new JLabel("Nome Impresso");
		nomeImpresso.setFont(new Font(COLO_STRING, Font.PLAIN, 16));
		nomeImpresso.setBounds(10, 70+100, 151, 21);
		contentPane.add(nomeImpresso);
		
		nomeImpressoFeild = new JTextField();
		nomeImpressoFeild.setColumns(10);
		nomeImpressoFeild.setBounds(174, 70+100, 233, 30);
		contentPane.add(nomeImpressoFeild);
		
		
		dataDevalidacao = new JLabel("data De validacao");
		dataDevalidacao.setFont(new Font(COLO_STRING, Font.PLAIN, 16));
		dataDevalidacao.setBounds(10, 210+100, 151, 21);
		contentPane.add(dataDevalidacao);
		
		
		dataDevalidacaoFeild = new JTextField();
		dataDevalidacaoFeild.setColumns(10);
		dataDevalidacaoFeild.setBounds(174, 210+100, 233, 30);
		contentPane.add(dataDevalidacaoFeild);
		
		
		
		codigoDeSeguranca = new JLabel("codigo De Seguranca");
		codigoDeSeguranca.setFont(new Font(COLO_STRING, Font.PLAIN, 16));
		codigoDeSeguranca.setBounds(10, 170+100, 151, 21);
		contentPane.add(codigoDeSeguranca);
		
		codigoDeSegurancaFeild = new JTextField();
		codigoDeSegurancaFeild.setColumns(10);
		codigoDeSegurancaFeild.setBounds(174, 170+100, 233, 30);
		contentPane.add(codigoDeSegurancaFeild);
		
		
		nomeroDoCartao = new JLabel("nomeroDoCartao");
		nomeroDoCartao.setFont(new Font(COLO_STRING, Font.PLAIN, 16));
		nomeroDoCartao.setBounds(10, 120+100, 151, 21);
		contentPane.add(nomeroDoCartao);
		
		
		nomeroDoCartaoFeild = new JTextField();
		nomeroDoCartaoFeild.setColumns(10);
		nomeroDoCartaoFeild.setBounds(174, 120+100, 233, 30);
		contentPane.add(nomeroDoCartaoFeild);
		
		pagarBtn = new JButton("Confirmar");
		pagarBtn.addActionListener(this);
		pagarBtn.setBounds(200, 280+100, 200, 50);
		contentPane.add(pagarBtn);
		
		
//		checkout = new JLabel("finalizar Pedido");
//   //     checkout.setText("Checkout : Total : "+dinheiro +" x qtd dias ="+dinheiro*text2int);
//		checkout.setFont(new Font(COLO_STRING, Font.PLAIN, 20));
//		checkout.setBounds(10, 10, 400, 21);
//		contentPane.add(checkout);
	
	
		
		
	}
	  public JTextField  getnomeImpressoFeild() {
		  return nomeImpressoFeild;
	  }
	  public JTextField  getdataDevalidacaoFeild(){
		 return dataDevalidacaoFeild;
	  }
	  public JTextField  getcodigoDeSegurancaFeild(){
		  return codigoDeSegurancaFeild ;
	  }
	  public JTextField  getnomeroDoCartaoFeild(){
		  return nomeroDoCartaoFeild ;
	  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public JButton getpagarBtn() {
		return pagarBtn;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		this.controller.executarBotao(e);
	}
}
