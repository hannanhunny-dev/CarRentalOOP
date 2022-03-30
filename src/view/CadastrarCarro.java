package view;

import java.awt.Component;
import java.awt.Toolkit;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import control.CadastrarCarroControl;

public class CadastrarCarro extends JFrame implements ActionListener {
	

	private final CadastrarCarroControl controller;
	private final JLabel marca;
	private final JLabel cor;
	private final JLabel modelo;
	private final JLabel anoDeFAbricacao;
	private final JLabel dispoivel;
	private final JTextField marcaFeild;
	private final JTextField corFeild;
	private final JTextField modeloFeild;
	private final JTextField anoDeFAbricacaoFeild;

	private final JPanel contentPane;
	private final JButton voltarBtn;
	private final JButton adcionarCarroBtn;
	private static final String COLO_STRING = "Open Sans";
	private final JComboBox<Object> disponiveComboBox;

	
	
	
	public CadastrarCarro() {
		controller = new CadastrarCarroControl(this);
		
		setResizable(false);
		setTitle("Cadastro de Carro");
		this.setSize(484, 413);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 484, 413);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		marca = new JLabel("marca");
		marca.setHorizontalAlignment(SwingConstants.CENTER);
		marca.setFont(new Font(COLO_STRING, Font.PLAIN, 14));
		marca.setBounds(10, 31, 154, 14);
		contentPane.add(marca);

		cor = new JLabel("cor");
		cor.setHorizontalAlignment(SwingConstants.CENTER);
		cor.setFont(new Font(COLO_STRING, Font.PLAIN, 14));
		cor.setBounds(10, 72, 154, 14);
		contentPane.add(cor);

		modelo = new JLabel("modelo");
		modelo.setHorizontalAlignment(SwingConstants.CENTER);
		modelo.setFont(new Font(COLO_STRING, Font.PLAIN, 14));
		modelo.setBounds(10, 112, 154, 14);
		contentPane.add(modelo);

		anoDeFAbricacao = new JLabel("anoDeFAbricacao");
		anoDeFAbricacao.setHorizontalAlignment(SwingConstants.CENTER);
		anoDeFAbricacao.setFont(new Font(COLO_STRING, Font.PLAIN, 14));
		anoDeFAbricacao.setBounds(10, 151, 154, 14);
		contentPane.add(anoDeFAbricacao);

		dispoivel = new JLabel("Disponivel");
		dispoivel.setHorizontalAlignment(SwingConstants.CENTER);
		dispoivel.setFont(new Font(COLO_STRING, Font.PLAIN, 14));
		dispoivel.setBounds(10, 193, 154, 14);
		contentPane.add(dispoivel);

	

		marcaFeild = new JTextField();
		marcaFeild.setBounds(174, 33, 233, 30);
		marcaFeild.setColumns(10);
		contentPane.add(marcaFeild);
		

		corFeild = new JTextField();
		corFeild.setColumns(15);
		corFeild.setBounds(174, 70, 233, 30);
		contentPane.add(corFeild);

		modeloFeild = new JTextField();
		modeloFeild.setColumns(10);
		modeloFeild.setBounds(174, 110, 233, 30);
		contentPane.add(modeloFeild);
		
		
		anoDeFAbricacaoFeild = new JTextField();
		anoDeFAbricacaoFeild.setColumns(10);
		anoDeFAbricacaoFeild.setBounds(174, 149, 233, 30);
		contentPane.add(anoDeFAbricacaoFeild);
		
		
		
		
//		sim = new JRadioButton("sim");
//		
//		sim.setBounds(200, 188, 50, 50);
//		contentPane.add(sim);
//		nao =  new JRadioButton("nao");
//		nao.setBounds(300, 188, 50, 50);
//		contentPane.add(nao);
//		
//		
//		ButtonGroup group = new ButtonGroup();
//		group.add(sim);
//	    group.add(nao);
		
	
		
		
		disponiveComboBox = new JComboBox<>();
		disponiveComboBox.setBounds(168, 200, 156, 31);
		contentPane.add(disponiveComboBox);
		disponiveComboBox.addItem(true);
		disponiveComboBox.addItem(false);
		
		
	

		
		

		adcionarCarroBtn = new JButton("Confirmar");
		adcionarCarroBtn.addActionListener(this);
		adcionarCarroBtn.setBounds(20, 280, 200, 50);
		contentPane.add(adcionarCarroBtn);

		voltarBtn = new JButton("Voltar");
		voltarBtn.addActionListener(this);
		voltarBtn.setBounds(250, 280, 200, 50);
		contentPane.add(voltarBtn);

		setLocationRelativeTo(null);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		this.controller.executarBotao(e);
		
	}
	

	
	
	
	
	public void mostrarMensagemCadastro(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem, null, JOptionPane.INFORMATION_MESSAGE);
	}
	
	
	public JComboBox<Object> getDisponiveComboBox() {
		return disponiveComboBox;
	}
	
	public JLabel getMarca() {
		return marca;
	}
	
	public JLabel getCor() {
		return cor;
	}
	 public JLabel getModelo() {
	    return modelo;
	 
	 }
	
	public JLabel getAnoDeFabricacao() {
		return anoDeFAbricacao;
	}
	public JLabel getDisponivel() {
		return dispoivel;
	}
	
	public JTextField getMarcaFeild() {
		return marcaFeild;
	}
	
	public JTextField getCorFeild() {
		return corFeild;
	}
	
	public JTextField getAnoDeFabricacaoFeild() {
		return anoDeFAbricacaoFeild;
	}
	public JTextField getModeloFeild() {
		return modeloFeild;
	}
	

	public CadastrarCarroControl getController() {
		return controller;
	}
	public JButton getAdcionarCarroBtn() {
		return adcionarCarroBtn;
	}
	
	public JButton getvoltarBtn() {
		return voltarBtn;
	}
	
	
	
	
	
	
	
	
	
	

}
