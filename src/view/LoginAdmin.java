package view;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

import control.LoginControl;
import control.LoginControlAdmin;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;




public class  LoginAdmin extends JFrame implements ActionListener {
	
	
	
	
	private final JLabel usernameJLabel;
	private final JTextField username;
	private final JLabel passwrodJLabel;
	private final JPasswordField password;
	private final JButton loginBtn;

	private final LoginControlAdmin controller;
	private final JButton clientBtn;
	private static final String COLO_STRING = "Open Sans";
	
	 /* classe herda JFrame e implementar actionlsiitoner
	   * classe responsavel pelo tela do login Admin
	   * tem dois botoes login ,ou mudar para login do cliente
	   */
	
	
	
	//contructor para jframe LoginAdmin
	public LoginAdmin() {
		controller = new LoginControlAdmin(this);
		this.setSize(425, 340);
		getContentPane().setLayout(null);
		setResizable(false);
		setTitle("Login Admin");

		usernameJLabel = new JLabel("Usuario");
		usernameJLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		usernameJLabel.setFont(new Font(COLO_STRING, Font.PLAIN, 30));
		usernameJLabel.setBounds(10, 83, 143, 25);
		getContentPane().add(usernameJLabel);

		username = new JTextField(20);
		username.setBounds(192, 84, 140, 30);
		getContentPane().add(username);

		passwrodJLabel = new JLabel("Senha");
		passwrodJLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		passwrodJLabel.setFont(new Font(COLO_STRING, Font.PLAIN, 30));
		passwrodJLabel.setBounds(10, 119, 143, 25);
		getContentPane().add(passwrodJLabel);

		password = new JPasswordField(20);
		password.setBounds(192, 120, 140, 30);
		getContentPane().add(password);

		loginBtn = new JButton("Entrar");
		loginBtn.setFont(new Font(COLO_STRING, Font.PLAIN, 30));
		loginBtn.setBounds(69, 172, 155, 50);
		loginBtn.addActionListener(this);
		getContentPane().add(loginBtn);

		clientBtn = new JButton("Login-Cliente");
		clientBtn.setFont(new Font(COLO_STRING, Font.PLAIN, 20));
		clientBtn.setBounds(215, 12, 150, 40);
		clientBtn.addActionListener(this);
		getContentPane().add(clientBtn);

		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
		
	}
	
	
	

    /**
     * Executa metodo executarBotao em LogincontrolAdmin quando botao e clicado.
     * 
     * Implementação da interface ActionListener.
     */
 

	   public void actionPerformed(ActionEvent e) {
	        
	        this.controller.executarBotao(e);
	        
	    }
	   
	   
	   
	   
	   
	   public void mostrarMensagemLoginInvalido(String mensagem) {
	        JOptionPane.showMessageDialog(null, mensagem, null, JOptionPane.ERROR_MESSAGE);
	    }

	
	   
	    public void mostrarMensagemLoginValido(String mensagem) {
	        JOptionPane.showMessageDialog(null, mensagem, null, JOptionPane.INFORMATION_MESSAGE);
	    }

	    public JTextField getUsername() {
	        return username;
	    }

	    public JPasswordField getPassword() {
	        return password;
	    }

	    public JButton getLoginBtn() {
	        return loginBtn;
	    }

		public LoginControlAdmin getController() {
			return controller;
		}
		public JButton getClientBtn() {
			return clientBtn;
		}

	

}
