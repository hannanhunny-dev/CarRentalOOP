package view;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import control.MenuControlAdmin;


public class MenuAdmin extends JFrame implements ActionListener{

	private final JPanel contentPane;
	private final JMenuBar menuBar;
	private final JButton cadastrarCarrosBtn;
	private final JButton deletarCarrosBtn;
	private final JButton editarCarrosBtn;
	private final JButton visualizarCarrosBtn;
	private final JButton minhaContaBtn;
	private final JButton sairBtn;
	private final MenuControlAdmin controller;
	private final JButton adcionarAdminBtn;
	 /* classe herda JFrame e implementar actionlsiitoner
	   * classe responsavel pelo tela do MenuAdmin
	   * nesse tela so tem butoes que vao levar para tela desejada quando sao clicado .
	   */

	public MenuAdmin() {
		
		controller = new MenuControlAdmin(this);

		setResizable(false);
	
		setTitle("Alugar Carro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 800);

		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		cadastrarCarrosBtn = new JButton("Cadastrar Novo Carros");
		cadastrarCarrosBtn.addActionListener(this);
		cadastrarCarrosBtn.setBounds(10,10,770,80);
		cadastrarCarrosBtn.setFont(new Font(null, Font.PLAIN, 55));
		contentPane.add(cadastrarCarrosBtn);

		deletarCarrosBtn = new JButton("Editar Carros");
		deletarCarrosBtn.addActionListener(this);
		deletarCarrosBtn.setFont(new Font(null, Font.PLAIN, 60));
		deletarCarrosBtn.setBounds(10,110,770,80);
		contentPane.add(deletarCarrosBtn);

		editarCarrosBtn = new JButton("Editar E Deletar Carros");
		editarCarrosBtn.addActionListener(this);
		editarCarrosBtn.setFont(new Font(null, Font.PLAIN, 60));
		editarCarrosBtn.setBounds(10,210,770,80);
	    contentPane.add(editarCarrosBtn);

		visualizarCarrosBtn = new JButton("VisualizarCarros");
		visualizarCarrosBtn.setBounds(10,310,770,80);
		visualizarCarrosBtn.setFont(new Font(null, Font.PLAIN, 60));
		visualizarCarrosBtn.addActionListener(this);
		contentPane.add(visualizarCarrosBtn);

		minhaContaBtn = new JButton("Minha conta");
		minhaContaBtn.setBounds(10, 410,770,80);
		minhaContaBtn.setFont(new Font(null, Font.PLAIN, 60));
		minhaContaBtn.addActionListener(this);
		contentPane.add(minhaContaBtn);
		
		adcionarAdminBtn = new JButton("Cadastrar Admin");
		adcionarAdminBtn.setBounds(10, 510,770,80);
		adcionarAdminBtn.setFont(new Font(null, Font.PLAIN, 60));
		adcionarAdminBtn.addActionListener(this);
		contentPane.add(adcionarAdminBtn);
		

		sairBtn = new JButton("Sair");
		sairBtn.setBounds(10,610,770,80);
		sairBtn.setFont(new Font("Open Sans", Font.PLAIN,60));
		sairBtn.addActionListener(this);
		contentPane.add(sairBtn);

		setLocationRelativeTo(null);
	}
	
	public void indisponivel(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		this.controller.executarBotao(e);
	}

	@Override
	public JPanel getContentPane() {
		return contentPane;
	}

	

	public JButton getCadastrarCarrosBtn() {
		return cadastrarCarrosBtn;
	}

	public JButton getDeletarCarrosBtn() {
		return deletarCarrosBtn;
	}

	public JButton getEditarCarrosBtn() {
		return editarCarrosBtn;
	}

	public JButton getVisualizarCarrosBtn() {
		return visualizarCarrosBtn;
	}

	public JButton getMinhaContaBtn() {
		return minhaContaBtn;
	}

	public JButton getSairBtn() {
		return sairBtn;
	}
	public JButton getAdcionarAdminBtn() {
		return adcionarAdminBtn;
	}

	public MenuControlAdmin getController() {
		return controller;
	}
}
	