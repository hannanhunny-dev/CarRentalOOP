package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import control.AlugarCarroControl;
import model.Car;
import java.awt.Font;
import java.awt.Toolkit;



public class AlugarCarro extends JFrame implements ActionListener{
	
	
	private static final String COLO_STRING = "Open Sans";
	private final JPanel contentPane;
	private final JComboBox<String> selecionarCarro;
	private JTextArea areaText;
	private final JButton okBtn;
	private final JButton next;
	private final JButton voltarBtn;
	private final AlugarCarroControl controller;
	private Car car;
	
	
	
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
	//	selecionarCarro.addItem("Selecionar Carro");
		//selecionarCarro.setSelectedIndex(5);
		
		okBtn = new JButton("OK");
		okBtn.setBounds(400, 19, 59, 28);
		okBtn.addActionListener(this);
		contentPane.add(okBtn);

		areaText = new JTextArea(car.toString());
		areaText.setBounds(20, 58, 540, 199);
		areaText.setEditable(false);
		contentPane.add(areaText);

	

		

		next = new JButton("Proximo");
		next.setFont(new Font(COLO_STRING, Font.PLAIN, 13));
		next.setBounds(54, 353, 124, 43);
		next.addActionListener(this);
		next.setVisible(false);
		contentPane.add(next);

		voltarBtn = new JButton("Voltar");
	
		voltarBtn.setFont(new Font(COLO_STRING, Font.PLAIN, 13));
		voltarBtn.setBounds(300, 353, 124, 43);
		voltarBtn.addActionListener(this);
		contentPane.add(voltarBtn);

		setLocationRelativeTo(null);
		
		
		
		
		
		
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
