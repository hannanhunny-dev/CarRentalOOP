package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;


import model.Dados;

public class VisualizarCarro extends JFrame implements ActionListener {
	private final JPanel panel;
	private final  JTable table;
	private final JTableHeader header;
	private final JButton voltarbtn;
	public  VisualizarCarro() {
	
		  panel = new JPanel();
		  
		  String col[] = {"marca","cor","modelo","anoDeFabricacao","disponivel"};

		  /* tela jframe que esta usando jtable pra mostrar informacoes que tem em dadaos
		   * usando forloop para adcionar objetos carros do arraylist para jtable
		   * 
		   */
		  DefaultTableModel tableModel = new DefaultTableModel(col, 0);
		  table = new JTable(tableModel);
		  header = table.getTableHeader();
		  
		  for (int i = 0; i < Dados.getCars().size(); i++) {
			  String marca = Dados.getCars().get(i).getMarca();
			  String cor = Dados.getCars().get(i).getCor();
			  String modelo = Dados.getCars().get(i).getModelo();
			  String anoDeFabricacao = Dados.getCars().get(i).getAnoDeFabricacao();
			  boolean disponivel = Dados.getCars().get(i).isDisponivel();
			  
			  Object[] data = {marca,cor,modelo,anoDeFabricacao,disponivel};
			  tableModel.addRow(data);
		  }
		  header.setBackground(Color.white);
		  JScrollPane pane = new JScrollPane(table);
		  table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		  panel.add(pane);
		  this.add(panel);
		  this.setSize(500,550);
		  this.setUndecorated(true);
		  this.getRootPane().setWindowDecorationStyle(JRootPane.PLAIN_DIALOG);
		  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  
		  
		  voltarbtn = new JButton("voltar");
		  voltarbtn.setFont(new Font("Open Sans", Font.PLAIN,60));
		  voltarbtn.addActionListener(this);
			panel.add(voltarbtn);
		  this.setLocationRelativeTo(null);
		
	}
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() ==voltarbtn ) {
			new MenuAdmin().setVisible(true);
			this.dispose();
		}
		
	}

}
