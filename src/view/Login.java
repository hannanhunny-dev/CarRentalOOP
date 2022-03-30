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


public  class Login extends JFrame implements ActionListener{

    private final JLabel usernameJLabel;
    private final JTextField username;
    private final JLabel passwrodJLabel;
    private final JPasswordField password;
    private final JButton loginBtn;
    private final JButton registerBtn;
    private final LoginControl controller;
    private final JButton adminBtn;
    private static final String COLO_STRING = "Open Sans";



    public Login() {
		
		controller = new LoginControl(this);

		this.setSize(425, 340);
		getContentPane().setLayout(null);
		setResizable(false);
		setTitle("Login Usuario");

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
		loginBtn.setFont(new Font(COLO_STRING, Font.PLAIN, 20));
		loginBtn.setBounds(69, 172, 155, 50);
		loginBtn.addActionListener(this);
		getContentPane().add(loginBtn);

		registerBtn = new JButton("Registrar-se");
		registerBtn.setFont(new Font(COLO_STRING, Font.PLAIN, 20));
		registerBtn.setBounds(215, 172, 155, 50);
		registerBtn.addActionListener(this);
		getContentPane().add(registerBtn);
		
		adminBtn = new JButton("Login-Admin");
		adminBtn.setFont(new Font(COLO_STRING, Font.PLAIN, 20));
		adminBtn.setBounds(215, 12, 150, 40);
		adminBtn.addActionListener(this);
		getContentPane().add(adminBtn);

		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
	}
    
    
    

    
 
    @Override
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

    public JButton getRegisterBtn() {
        return registerBtn;
    }

	public LoginControl getController() {
		return controller;
	}
	public JButton getAdminBtn() {
		return adminBtn;
	}
	
}