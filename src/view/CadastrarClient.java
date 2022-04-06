package view;

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

import java.awt.Font;
import control.CadastrarClientControl;

public class CadastrarClient extends JFrame implements ActionListener {
	
	
	private final JPanel contentPane;
	private final JLabel nameLabel;
	private final JLabel dateLabel;
	private final JLabel cpfLabel;
	private final JLabel emailLabel;
	private final JLabel senhaLabel;
	private final JTextField nameField;
	private final JTextField dateField;
	private final JTextField cpfField;
	private final JTextField emailField;
	private final JPasswordField senhaField;
	private final JButton confirmarBtn;
	private final JButton voltarBtn;
	private final CadastrarClientControl controller;
	
	/**
	 * Tela responsável para o cadastro de novo Client .
	 * classe extends jframe e implmentar interface actionlistioner
	 * 
 */
	
	public CadastrarClient() {
		controller = new CadastrarClientControl(this);
		setResizable(false);
		setTitle("Cadastrar");
		this.setSize(500, 900);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 900, 500, 600);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		nameLabel = new JLabel("Nome");
		nameLabel.setFont(new Font(null, Font.PLAIN, 40));
		nameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		nameLabel.setBounds(30, 11, 152, 35);
		contentPane.add(nameLabel);

		dateLabel = new JLabel("Data de nascimento");
		dateLabel.setHorizontalAlignment(SwingConstants.CENTER);
		dateLabel.setFont(new Font(null, Font.PLAIN, 20));
		dateLabel.setBounds(0, 100, 250, 35);
		contentPane.add(dateLabel);

		cpfLabel = new JLabel("CPF");
		cpfLabel.setHorizontalAlignment(SwingConstants.CENTER);
		cpfLabel.setFont(new Font(null, Font.PLAIN, 40));
		cpfLabel.setBounds(30, 200, 152, 35);
		contentPane.add(cpfLabel);

		emailLabel = new JLabel("Email");
		emailLabel.setHorizontalAlignment(SwingConstants.CENTER);
		emailLabel.setFont(new Font(null, Font.PLAIN, 40));
		emailLabel.setBounds(33, 300, 152, 35);
		contentPane.add(emailLabel);

		senhaLabel = new JLabel("Senha");
		senhaLabel.setHorizontalAlignment(SwingConstants.CENTER);
		senhaLabel.setFont(new Font(null, Font.PLAIN, 40));
		senhaLabel.setBounds(33, 390, 152, 35);
		contentPane.add(senhaLabel);

		nameField = new JTextField();
		nameField.setBounds(225, 16, 257, 50);
		contentPane.add(nameField);
		nameField.setColumns(10);

		dateField = new JTextField();
		dateField.setColumns(10);
		dateField.setBounds(225, 100, 257, 50);
		contentPane.add(dateField);

		cpfField = new JTextField();
		cpfField.setColumns(10);
		cpfField.setBounds(225, 200, 257, 50);
		contentPane.add(cpfField);

		emailField = new JTextField();
		emailField.setColumns(10);
		emailField.setBounds(225, 300, 257, 50);
		contentPane.add(emailField);

		senhaField = new JPasswordField(20);
		senhaField.setColumns(10);
		senhaField.setBounds(225, 400, 257, 50);
		contentPane.add(senhaField);

		confirmarBtn = new JButton("Confirmar");
		confirmarBtn.setBounds(61, 470, 200, 80);
		confirmarBtn.addActionListener(this);
		contentPane.add(confirmarBtn);

		voltarBtn = new JButton("Voltar");
		voltarBtn.setBounds(247, 470, 200, 80);
		voltarBtn.addActionListener(this);
		contentPane.add(voltarBtn);

		setLocationRelativeTo(null);
		
		
	}
	
	
	
	 /**
     * executa um comando dependendo de qual botão foi clicado.
     * 
     * implementacao da interface ActionListener.
     */

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		this.controller.executarBotao(e);
	}
	
	
	public void mensagemConfirmarCadastro(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem);
	}

	@Override
	public JPanel getContentPane() {
		return contentPane;
	}

	public JLabel getNameLabel() {
		return nameLabel;
	}

	public JLabel getDateLabel() {
		return dateLabel;
	}

	public JLabel getCpfLabel() {
		return cpfLabel;
	}

	public JLabel getEmailLabel() {
		return emailLabel;
	}

	public JLabel getSenhaLabel() {
		return senhaLabel;
	}

	public JTextField getNameField() {
		return nameField;
	}

	public JTextField getDateField() {
		return dateField;
	}

	public JTextField getCpfField() {
		return cpfField;
	}

	public JTextField getEmailField() {
		return emailField;
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

	public CadastrarClientControl getController() {
	return controller;
	}

}
