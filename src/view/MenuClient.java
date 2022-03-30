package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Font;
import java.awt.Toolkit;
import control.MenuControlClient;

public class MenuClient extends JFrame implements ActionListener{

	
	private final JPanel contentPane;
	private final JButton visualizarCarros;
	private final JButton minhaContaBtn;
	private final JButton sairBtn;
	private final MenuControlClient controller;
	private static final String COLO_STRING = "Open Sans";
	
	
	
	
	public MenuClient() {
		
		controller = new MenuControlClient(this);  //So when the object needs to point or reference itself then the this keyword is used.

		setResizable(false);
	
		setTitle("Cinema");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 409);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		visualizarCarros = new JButton("Alugar Carro");
		visualizarCarros.setBounds(114, 38, 214, 49);
		visualizarCarros.setFont(new Font(COLO_STRING, Font.PLAIN, 14));
		visualizarCarros.addActionListener(this);
		contentPane.add(visualizarCarros);

		minhaContaBtn = new JButton("Editar conta");
		minhaContaBtn.setBounds(114, 115, 214, 49);
		minhaContaBtn.setFont(new Font(COLO_STRING, Font.PLAIN, 14));
		minhaContaBtn.addActionListener(this);
		contentPane.add(minhaContaBtn);

		sairBtn = new JButton("Sair");
		sairBtn.setBounds(114, 269, 214, 49);
		sairBtn.setFont(new Font(COLO_STRING, Font.PLAIN, 14));
		sairBtn.addActionListener(this);
		contentPane.add(sairBtn);

		setLocationRelativeTo(null);
	}
	
	
	//actions listioner
	
public void actionPerformed(ActionEvent e) {
		
		this.controller.executarBotao(e);
	}

	@Override
	public JPanel getContentPane() {
		return contentPane;
	}

	public JButton getVisualizarCarrosBtn() {
		return visualizarCarros;
	}

	public JButton getMinhaContaBtn() {
		return minhaContaBtn;
	}

	public JButton getSairBtn() {
		return sairBtn;
	}

	public MenuControlClient getController() {
		return controller;
	}
	
	
}
