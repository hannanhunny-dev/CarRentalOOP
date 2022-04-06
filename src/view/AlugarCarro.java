package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import control.AlugarCarroControl;
import model.Car;
import java.awt.Font;
import java.awt.Toolkit;



public class AlugarCarro extends JFrame implements ActionListener{
	
	
	private final JPanel contentPane;
	private final JComboBox<String> selecionarCarro;
	private JTextArea areaText;
	private final JButton okBtn;
	private final JButton next;
	private final JButton voltarBtn;
	private final AlugarCarroControl controller;
	private  Car car;
	private final JTextField qtdsDiasFeild;
	private JLabel preco;
	private JLabel qtdsDiaslabel;
	
	
	/**
	 * Tela responsável para o ALugarCArro.
	 * nesse tela tem  JComboBox para selecionarCarros e jtextfeild para digitar dias par que o cliente esta prescisando de carro
	 * e dois butoes um de proximo , que ficaria visivel se quando o carro selecionado esta disponivel
	 * e segundo butao de volar
	 * nesse tela tem JTextArea para mostrar os carros selecionados 
	 * 	

 */
	
	public AlugarCarro() {
		controller = new AlugarCarroControl(this);
		car = new Car("","","","",false);
		setTitle("Alugar Carro");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 454);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		selecionarCarro = new JComboBox<>();
		selecionarCarro.setBounds(20, 22, 300, 22);
		selecionarCarro.setModel(controller.atualizarCar());
		contentPane.add(selecionarCarro);
	    okBtn = new JButton("OK");
		okBtn.setBounds(400, 19, 59, 28);
		okBtn.addActionListener(this);
		contentPane.add(okBtn);

		areaText = new JTextArea(car.toString());
		areaText.setBounds(20, 58, 540, 199);
		areaText.setEditable(false);
		contentPane.add(areaText);

	

		

		next = new JButton("Proximo");
		next.setFont(new Font(null, Font.PLAIN, 13));
		next.setBounds(54, 353, 124, 43);
		next.addActionListener(this);
		next.setVisible(false);
		contentPane.add(next);

		voltarBtn = new JButton("Voltar");
	
		voltarBtn.setFont(new Font(null, Font.PLAIN, 13));
		voltarBtn.setBounds(300, 353, 124, 43);
		voltarBtn.addActionListener(this);
		contentPane.add(voltarBtn);

		setLocationRelativeTo(null);
		

		qtdsDiasFeild = new JTextField();
		qtdsDiasFeild.setBounds(250, 300, 150, 30);
		qtdsDiasFeild.setColumns(10);
		contentPane.add(qtdsDiasFeild);
		
		

		
		qtdsDiaslabel = new JLabel("Escreva dias para alugar");
		qtdsDiaslabel.setHorizontalAlignment(SwingConstants.CENTER);
		qtdsDiaslabel.setFont(new Font(null, Font.PLAIN, 14));
		qtdsDiaslabel.setBounds(10, 300, 200, 30);
		contentPane.add(qtdsDiaslabel);
		
		
		
		
	}
	
	
	public JTextField getQtdsDiasFeild() {
		return qtdsDiasFeild;
	}
	
	public JLabel getpreco() {
		return preco;
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		this.controller.executarBotao(e);
		
	}
	
	
	public JButton getOkBtn() {
		return okBtn;
	}
	
	public JButton getProximo() {
		return next;
	}
	public JButton getVoltarBtn() {
		return voltarBtn;
	}
	
	public JTextArea getAreaText() {
		return areaText;
	}
	public JComboBox<String> getSelecionarCarro() {
		return selecionarCarro;
	}
	

	public AlugarCarroControl getController() {
		return controller;
	}


}
