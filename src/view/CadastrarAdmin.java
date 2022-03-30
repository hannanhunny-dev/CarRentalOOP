package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import control.CadastrarAdminControl;
import control.CadastrarClientControl;
;

public class CadastrarAdmin extends JFrame implements ActionListener {

	private final JPanel contentPane;
	private final JLabel nameLabel;
	private final JLabel senhaLabel;
	private final JTextField nameField;

	private final JPasswordField senhaField;
	private final JButton confirmarBtn;
	private final JButton voltarBtn;
	private final CadastrarAdminControl controller;
	private static final String COLO_STRING = "Open Sans";
	
	
	public CadastrarAdmin() {
		controller = new CadastrarAdminControl(this);
		setResizable(false);
		setTitle("Cadastrar");
		this.setSize(425, 340);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 425, 340);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		nameLabel = new JLabel("Nome");
		nameLabel.setFont(new Font(COLO_STRING, Font.PLAIN, 50));
		nameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		nameLabel.setBounds(30, 20, 152, 40);
		contentPane.add(nameLabel);
		
		senhaLabel = new JLabel("Senha");
		senhaLabel.setHorizontalAlignment(SwingConstants.CENTER);
		senhaLabel.setFont(new Font(COLO_STRING, Font.PLAIN, 50));
		senhaLabel.setBounds(30, 110, 152, 40);
		contentPane.add(senhaLabel);
		
		
		nameField = new JTextField();
		nameField.setBounds(215, 16, 157, 40);
		contentPane.add(nameField);
		nameField.setColumns(10);
		
		
		senhaField = new JPasswordField(20);
		senhaField.setColumns(10);
		senhaField.setBounds(215, 110, 157, 40);
		contentPane.add(senhaField);
		
		
		confirmarBtn = new JButton("Confrimar");
		confirmarBtn.setBounds(40, 220, 180, 50);
		confirmarBtn.addActionListener(this);
		contentPane.add(confirmarBtn);

		voltarBtn = new JButton("Voltar");
		voltarBtn.setBounds(220, 220, 180, 50);
		voltarBtn.addActionListener(this);
		contentPane.add(voltarBtn);

		setLocationRelativeTo(null);
	}
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		this.controller.executarBotao(e);
	}
	
	public void mensagemConfirmarCadastro(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem);
	}
	
	
	
	
	public JPanel getContentPane() {
		return contentPane;
	}
	
	
	public JLabel getNameLabel() {
		return nameLabel;
	}
	public JTextField getNameField() {
		return nameField;
	}
	public JLabel getSenhaLabel() {
		return senhaLabel;
	}
	public JTextField getSenhaField() {
		return senhaField;
	}
	
	public JButton getConfirmarBtn() {
		return confirmarBtn;
	}

	public JButton getVoltarBtn() {
		return voltarBtn;
	}

	public CadastrarAdminControl getController() {
		return controller;
	}

}
