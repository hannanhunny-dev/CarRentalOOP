package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.util.Arrays;
import control.EditarEDeletarCarroControl;

import model.Car;
import model.Dados;

public class EditarEDeletarCarro extends JFrame implements ActionListener{
	private static final String COLO_STRING = null;
	private String[] listaNomes;
//	private JFrame janela;
	
	private JPanel panel;
    private final JTextArea informacoesTable;
    private JButton deletarBtn;
    private JButton editarBtn;
    private JButton mostraBtn;

	private final JComboBox<String> buscarCarroComboBox;
	
	private final EditarEDeletarCarroControl controller;

	
	private final JTextField marcaFeild;
	private final JTextField corFeild;
	private final JTextField modeloFeild;
	private final JTextField anoDeFAbricacaoFeild;
	private final JComboBox<Object> disponiveComboBox;
	private final JButton confirmarBtn;
	private final JButton voltarBtn;

	
	
	public EditarEDeletarCarro() {
		
		controller = new EditarEDeletarCarroControl(this);
		
		//parte modificar dadaos//
		setResizable(false);
		setTitle("Cadastro de Carro");
		this.setSize(750, 750);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 750);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel);
		panel.setLayout(null);
        
           
        JLabel marca = new JLabel("marca");
		marca.setHorizontalAlignment(SwingConstants.CENTER);
		marca.setFont(new Font(COLO_STRING, Font.PLAIN, 14));
		marca.setBounds(0, 400, 150, 14);
		panel.add(marca);

		JLabel cor = new JLabel("cor");
		cor.setHorizontalAlignment(SwingConstants.CENTER);
		cor.setFont(new Font(COLO_STRING, Font.PLAIN, 14));
		cor.setBounds(0, 440, 154, 14);
		panel.add(cor);

		JLabel modelo = new JLabel("modelo");
		modelo.setHorizontalAlignment(SwingConstants.CENTER);
		modelo.setFont(new Font(COLO_STRING, Font.PLAIN, 14));
		modelo.setBounds(0, 480, 154, 14);
		panel.add(modelo);

		JLabel anoDeFAbricacao = new JLabel("anoDeFAbricacao");
		anoDeFAbricacao.setHorizontalAlignment(SwingConstants.CENTER);
		anoDeFAbricacao.setFont(new Font(COLO_STRING, Font.PLAIN, 14));
		anoDeFAbricacao.setBounds(0, 520, 154, 14);
		panel.add(anoDeFAbricacao);

		JLabel dispoivel = new JLabel("Disponivel");
		dispoivel.setHorizontalAlignment(SwingConstants.CENTER);
		dispoivel.setFont(new Font(COLO_STRING, Font.PLAIN, 14));
		dispoivel.setBounds(0, 560, 154, 14);
		panel.add(dispoivel);

	

		marcaFeild = new JTextField();
		marcaFeild.setBounds(174, 400, 233, 30);
		marcaFeild.setColumns(10);
		panel.add(marcaFeild);
		

		corFeild = new JTextField();
		corFeild.setColumns(15);
		corFeild.setBounds(174, 440, 233, 30);
		panel.add(corFeild);

		modeloFeild = new JTextField();
		modeloFeild.setColumns(10);
		modeloFeild.setBounds(174, 480, 233, 30);
		panel.add(modeloFeild);
		
		
		anoDeFAbricacaoFeild = new JTextField();
		anoDeFAbricacaoFeild.setColumns(10);
		anoDeFAbricacaoFeild.setBounds(174, 520, 233, 30);
		panel.add(anoDeFAbricacaoFeild);
		
		
		
		disponiveComboBox = new JComboBox<>();
		disponiveComboBox.setBounds(168, 560, 156, 31);
		panel.add(disponiveComboBox);
		disponiveComboBox.addItem(true);
		disponiveComboBox.addItem(false);
		

		confirmarBtn = new JButton("Salvar Mudancas");
		confirmarBtn.addActionListener(this);
		confirmarBtn.setBounds(100, 650, 200, 50);
		panel.add(confirmarBtn);
		
		voltarBtn = new JButton("Voltar");
		voltarBtn.addActionListener(this);
		voltarBtn.setBounds(350, 650, 200, 50);
		panel.add(voltarBtn);
           
           // parte para modificar dados end //
           
		
	
		
		deletarBtn = new JButton("deletar");
		deletarBtn.addActionListener(this);
		deletarBtn.setBounds(20, 300, 200, 50);
		panel.add(deletarBtn);
		
		editarBtn = new JButton("editarBtn");
		editarBtn.addActionListener(this);
		editarBtn.setBounds(270, 300, 200, 50);
		panel.add(editarBtn);
		
		mostraBtn = new JButton("Mostra Carro");
		mostraBtn.addActionListener(this);
		mostraBtn.setBounds(500, 300, 200, 50);
		panel.add(mostraBtn);
		
	    
		
		
		
		buscarCarroComboBox = new JComboBox<>();
		buscarCarroComboBox.setBounds(219, 227, 170, 22);
		buscarCarroComboBox.setSelectedItem("Selecionar carro");
    	buscarCarroComboBox.setModel(controller.atualizarCar());

		panel.add(buscarCarroComboBox);
		
		Car car = new Car("","","","",false);
		
		informacoesTable = new JTextArea(car.toString());
		informacoesTable.setBounds(10, 11, 521, 204);
		informacoesTable.setEditable(false);
		panel.add(informacoesTable);
		
		
		
		

		
		
		
		
		
		
		
           
           
           
           
           
           
           
           
           
       

   		
           
           
           
           
           
           this.setLocationRelativeTo(null);
	
		
		
	}
	
	public JTextField  getMarcaFeild() {
		return marcaFeild;
	}
	public JTextField  getCorFeild() {
		return corFeild;
	}
	public JTextField  getModeloFeild() {
		return modeloFeild;
	}
	public JTextField  getAnoDeFAbricacaoFeild() {
		return anoDeFAbricacaoFeild;
	}
	public JButton getConfirmarBtn() {
		return confirmarBtn;
	}
	
	
	public JComboBox<Object>  disponiveComboBox() {
		return disponiveComboBox;
	}
	
	
	
	
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		this.controller.executaBotao(e.getSource());
	}








	public void mostrarMensagemErro(String string) {
		// TODO Auto-generated method stub
		
	}
	public JTextArea getInformacoesTable() {
		return informacoesTable;
	}
	public JButton getExcluirBtn() {
		
		return deletarBtn;
	}
	
    public JButton getEditarBtn() {
		
		return editarBtn;
	}
    public JButton getMostraBtn() {
		return mostraBtn;
	}
    

	public JComboBox<String> getBuscarCarroComboBox() {
		return buscarCarroComboBox;
	}
	
	public JButton getconfirmarBtn() {
		return confirmarBtn;
	}
	public JButton getVoltarBtn() {
		return voltarBtn;
	}
	
	
}
