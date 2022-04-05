package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import control.EmprestimoControl;

public class EmprestimoView extends JFrame implements ActionListener  {
	
	
	
	

	private static final String COLO_STRING = null;

	private JPanel panel;
	
	private JLabel preco;
	private JLabel data;
	private JLabel Endereco;
	private JLabel logradouro;
	private JLabel complemento;
	private JLabel cep;
	private JLabel cidade;
	private JLabel estado;
	private JLabel pontodeReferencia;
	
	

	private JTextField dataFeild;
	private JTextField EnderecoFeild;
	private JTextField logradouroFeild;
	private JTextField complementoFeild;
	private JTextField cepFeild;
	private JTextField cidadeFeild;
	private JTextField estadoFeild;
	private JTextField pontodeReferenciaFeild;
  

	private JLabel dataDeVolta;
	private JLabel EnderecoDeVolta;
	private JLabel logradouroDeVolta;
	private JLabel complementoDeVolta;
	private JLabel cepDeVolta;
	private JLabel cidadeDeVolta;
	private JLabel estadoDeVolta;
	private JLabel pontodeReferenciaDeVolta;
	private JLabel enderecodevolta;
	

	private JTextField dataFeildDeVolta;
	private JTextField EnderecoFeildDeVolta;
	private JTextField logradouroFeildDeVolta;
	private JTextField complementoFeildDeVolta;
	private JTextField cepFeildDeVolta;
	private JTextField cidadeFeildDeVolta;
	private JTextField estadoFeildDeVolta;
	private JTextField pontodeReferenciaFeildDeVolta;
	private  EmprestimoControl controller;
	
	
	private JButton confirmar;
	private JLabel total;

	private int dinheiro;

	private int text2int;




	public EmprestimoView(int dinheiro,int text2int) {
		
		controller = new EmprestimoControl(this);
		setResizable(false);
		setTitle("Adcionar informcoes para Emprestimo");
		this.setSize(500, 1000);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(0, 0, 500, 1000);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel);
		panel.setLayout(null);
		
		
		this.setLocationRelativeTo(null);
		
		
		
		// infromcaoes pra empresa entrgar o carro

		preco = new JLabel("Endereco  para Receber Carro ");
		preco.setHorizontalAlignment(SwingConstants.CENTER);
		preco.setFont(new Font(null, Font.PLAIN, 30));
		preco.setBounds(0, 0, 500, 50);
		panel.add(preco);
		
		
		
		
		
		data = new JLabel("dia de entrega");
		data.setHorizontalAlignment(SwingConstants.CENTER);
		data.setFont(new Font(COLO_STRING, Font.PLAIN, 14));
		data.setBounds(0, 50, 154, 14);
		panel.add(data);
		
		Endereco = new JLabel("Endereco");
		Endereco.setHorizontalAlignment(SwingConstants.CENTER);
		Endereco.setFont(new Font(COLO_STRING, Font.PLAIN, 14));
		Endereco.setBounds(0, 100, 154, 14);
		panel.add(Endereco);
		
		estado = new JLabel("estado");
		estado.setHorizontalAlignment(SwingConstants.CENTER);
		estado.setFont(new Font(null, Font.PLAIN, 14));
		estado.setBounds(0, 150, 154, 14);
		panel.add(estado);
		
		cidade = new JLabel("cidade");
		cidade.setHorizontalAlignment(SwingConstants.CENTER);
		cidade.setFont(new Font(null, Font.PLAIN, 14));
		cidade.setBounds(0, 200, 154, 14);
		panel.add(cidade);
		
		logradouro = new JLabel("logradouro");
		logradouro.setHorizontalAlignment(SwingConstants.CENTER);
		logradouro.setFont(new Font(COLO_STRING, Font.PLAIN, 14));
		logradouro.setBounds(0, 250, 154, 14);
		panel.add(logradouro);
		
		complemento = new JLabel("complemento");
		complemento.setHorizontalAlignment(SwingConstants.CENTER);
		complemento.setFont(new Font(null, Font.PLAIN, 14));
		complemento.setBounds(0, 300, 154, 14);
		panel.add(complemento);
		
		pontodeReferencia = new JLabel("pontodeReferencia");
		pontodeReferencia.setHorizontalAlignment(SwingConstants.CENTER);
		pontodeReferencia.setFont(new Font(null, Font.PLAIN, 14));
		pontodeReferencia.setBounds(0, 350, 154, 14);
		panel.add(pontodeReferencia);
		
		cep = new JLabel("cep");
		cep.setHorizontalAlignment(SwingConstants.CENTER);
		cep.setFont(new Font(null, Font.PLAIN, 14));
		cep.setBounds(0, 400, 154, 14);
		panel.add(cep);
		
		
		
		
		
	
		
		
		
	

		// informcoes para amarmzenar onde usaurio vao devolver carro
//		
		
		enderecodevolta = new JLabel("Endereco para devolver Carro");
		enderecodevolta.setHorizontalAlignment(SwingConstants.CENTER);
		enderecodevolta.setFont(new Font(COLO_STRING, Font.PLAIN, 35));
		enderecodevolta.setBounds(0, 450, 500, 50);
		panel.add(enderecodevolta);
		
		
		dataDeVolta = new JLabel("data");
		dataDeVolta.setHorizontalAlignment(SwingConstants.CENTER);
		dataDeVolta.setFont(new Font(COLO_STRING, Font.PLAIN, 14));
		dataDeVolta.setBounds(0, 500, 154, 14);
		panel.add(dataDeVolta);
		
		EnderecoDeVolta = new JLabel("Endereco");
		EnderecoDeVolta.setHorizontalAlignment(SwingConstants.CENTER);
		EnderecoDeVolta.setFont(new Font(COLO_STRING, Font.PLAIN, 14));
		EnderecoDeVolta.setBounds(0, 550, 154, 14);
		panel.add(EnderecoDeVolta);
		
		logradouroDeVolta = new JLabel("logradouro");
		logradouroDeVolta.setHorizontalAlignment(SwingConstants.CENTER);
		logradouroDeVolta.setFont(new Font(COLO_STRING, Font.PLAIN, 14));
		logradouroDeVolta.setBounds(0, 700, 154, 14);
		panel.add(logradouroDeVolta);
		
		complementoDeVolta = new JLabel("complemento");
		complementoDeVolta.setHorizontalAlignment(SwingConstants.CENTER);
		complementoDeVolta.setFont(new Font(null, Font.PLAIN, 14));
		complementoDeVolta.setBounds(0, 750, 154, 14);
		panel.add(complementoDeVolta);
		
		
		
		cepDeVolta = new JLabel("cep");
		cepDeVolta.setHorizontalAlignment(SwingConstants.CENTER);
		cepDeVolta.setFont(new Font(null, Font.PLAIN, 14));
		cepDeVolta.setBounds(0, 850, 154, 14);
		panel.add(cepDeVolta);
		
		
		cidadeDeVolta = new JLabel("cidade");
		cidadeDeVolta.setHorizontalAlignment(SwingConstants.CENTER);
		cidadeDeVolta.setFont(new Font(null, Font.PLAIN, 14));
		cidadeDeVolta.setBounds(0, 650, 154, 14);
		panel.add(cidadeDeVolta);
		
		
		estadoDeVolta = new JLabel("estado");
		estadoDeVolta.setHorizontalAlignment(SwingConstants.CENTER);
		estadoDeVolta.setFont(new Font(null, Font.PLAIN, 14));
		estadoDeVolta.setBounds(0, 600, 154, 14);
		panel.add(estadoDeVolta);
		
		
		
		pontodeReferenciaDeVolta = new JLabel("pontodeReferencia");
		pontodeReferenciaDeVolta.setHorizontalAlignment(SwingConstants.CENTER);
		pontodeReferenciaDeVolta.setFont(new Font(null, Font.PLAIN, 14));
		pontodeReferenciaDeVolta.setBounds(0, 800, 154, 14);
		panel.add(pontodeReferenciaDeVolta);
		
		
		

	  
	

		dataFeild = new JTextField();
		dataFeild.setBounds(174, 50, 233, 30);
		dataFeild.setColumns(10);
		panel.add(dataFeild);
		
		EnderecoFeild = new JTextField();
		EnderecoFeild.setBounds(174, 100, 233, 30);
		EnderecoFeild.setColumns(10);
		panel.add(EnderecoFeild);
		
		logradouroFeild = new JTextField();
		logradouroFeild.setBounds(174, 250, 233, 30);
		logradouroFeild.setColumns(10);
		panel.add(logradouroFeild);
		
		complementoFeild = new JTextField();
		complementoFeild.setBounds(174, 300, 233, 30);
		complementoFeild.setColumns(10);
		panel.add(complementoFeild);
		
		cepFeild = new JTextField();
		cepFeild.setBounds(174, 400, 233, 30);
		cepFeild.setColumns(10);
		panel.add(cepFeild);
		
		cidadeFeild = new JTextField();
		cidadeFeild.setBounds(174, 200, 233, 30);
		cidadeFeild.setColumns(10);
		panel.add(cidadeFeild);
		
		estadoFeild = new JTextField();
		estadoFeild.setBounds(174, 150, 233, 30);
		estadoFeild.setColumns(10);
		panel.add(estadoFeild);
		
		
		pontodeReferenciaFeild = new JTextField();
		pontodeReferenciaFeild.setBounds(174, 350, 233, 30);
		pontodeReferenciaFeild.setColumns(10);
		panel.add(pontodeReferenciaFeild);
		
		
	
		
		
		dataFeildDeVolta = new JTextField();
		dataFeildDeVolta.setBounds(174, 500, 233, 30);
		dataFeildDeVolta.setColumns(10);
		panel.add(dataFeildDeVolta);
		
		EnderecoFeildDeVolta = new JTextField();
		EnderecoFeildDeVolta.setBounds(174, 550, 233, 30);
		EnderecoFeildDeVolta.setColumns(10);
		panel.add(EnderecoFeildDeVolta);
		
		logradouroFeildDeVolta = new JTextField();
		logradouroFeildDeVolta.setBounds(174, 700, 233, 30);
		logradouroFeildDeVolta.setColumns(10);
		panel.add(logradouroFeildDeVolta);
		
		complementoFeildDeVolta = new JTextField();
		complementoFeildDeVolta.setBounds(174, 750, 233, 30);
		complementoFeildDeVolta.setColumns(10);
		panel.add(complementoFeildDeVolta);
		
		cepFeildDeVolta = new JTextField();
		cepFeildDeVolta.setBounds(174, 850, 233, 30);
		cepFeildDeVolta.setColumns(10);
		panel.add(cepFeildDeVolta);
		
		cidadeFeildDeVolta = new JTextField();
		cidadeFeildDeVolta.setBounds(174, 650, 233, 30);
		cidadeFeildDeVolta.setColumns(10);
		panel.add(cidadeFeildDeVolta);
		
	
		
		estadoFeildDeVolta = new JTextField();
		estadoFeildDeVolta.setBounds(174, 600, 233, 30);
		estadoFeildDeVolta.setColumns(10);
		panel.add(estadoFeildDeVolta);
		
		
		pontodeReferenciaFeildDeVolta = new JTextField();
		pontodeReferenciaFeildDeVolta.setBounds(174, 800, 233, 30);
		pontodeReferenciaFeildDeVolta.setColumns(10);
		panel.add(pontodeReferenciaFeildDeVolta);
		
		
		
		confirmar = new JButton("Confirmar");
		confirmar.setBounds(220, 900, 180, 50);
		confirmar.addActionListener(this);
		panel.add(confirmar);
		
		
		total = new JLabel("Total : "+dinheiro +" x qtd dias ="+dinheiro*text2int);
		total.setBounds(0, 900, 180, 50);
		
		panel.add(total);
		
		
		
		
		
		
	}
	
	public int getDinehiro() {
		return dinheiro*text2int;
	}

	
	
	public JButton getCOnfimrarBtn() {
		return confirmar;
		
	}

	 public JLabel getTotal() {
		 return total;
	 }





	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		this.controller.executarBotao(e);
	}






	public JPanel getPanel() {
		return panel;
	}






	public void setPanel(JPanel panel) {
		this.panel = panel;
	}






	public JLabel getPreco() {
		return preco;
	}






	public void setPreco(JLabel preco) {
		this.preco = preco;
	}






	public JLabel getData() {
		return data;
	}






	public void setData(JLabel data) {
		this.data = data;
	}






	public JLabel getEndereco() {
		return Endereco;
	}






	public void setEndereco(JLabel endereco) {
		Endereco = endereco;
	}






	public JLabel getLogradouro() {
		return logradouro;
	}






	public void setLogradouro(JLabel logradouro) {
		this.logradouro = logradouro;
	}






	public JLabel getComplemento() {
		return complemento;
	}






	public void setComplemento(JLabel complemento) {
		this.complemento = complemento;
	}






	public JLabel getCep() {
		return cep;
	}






	public void setCep(JLabel cep) {
		this.cep = cep;
	}






	public JLabel getCidade() {
		return cidade;
	}






	public void setCidade(JLabel cidade) {
		this.cidade = cidade;
	}






	public JLabel getEstado() {
		return estado;
	}






	public void setEstado(JLabel estado) {
		this.estado = estado;
	}






	public JLabel getPontodeReferencia() {
		return pontodeReferencia;
	}






	public void setPontodeReferencia(JLabel pontodeReferencia) {
		this.pontodeReferencia = pontodeReferencia;
	}






	public JTextField getDataFeild() {
		return dataFeild;
	}






	public void setDataFeild(JTextField dataFeild) {
		this.dataFeild = dataFeild;
	}






	public JTextField getEnderecoFeild() {
		return EnderecoFeild;
	}






	public void setEnderecoFeild(JTextField enderecoFeild) {
		EnderecoFeild = enderecoFeild;
	}






	public JTextField getLogradouroFeild() {
		return logradouroFeild;
	}






	public void setLogradouroFeild(JTextField logradouroFeild) {
		this.logradouroFeild = logradouroFeild;
	}






	public JTextField getComplementoFeild() {
		return complementoFeild;
	}






	public void setComplementoFeild(JTextField complementoFeild) {
		this.complementoFeild = complementoFeild;
	}






	public JTextField getCepFeild() {
		return cepFeild;
	}






	public void setCepFeild(JTextField cepFeild) {
		this.cepFeild = cepFeild;
	}






	public JTextField getCidadeFeild() {
		return cidadeFeild;
	}






	public void setCidadeFeild(JTextField cidadeFeild) {
		this.cidadeFeild = cidadeFeild;
	}






	public JTextField getEstadoFeild() {
		return estadoFeild;
	}






	public void setEstadoFeild(JTextField estadoFeild) {
		this.estadoFeild = estadoFeild;
	}






	public JTextField getPontodeReferenciaFeild() {
		return pontodeReferenciaFeild;
	}






	public void setPontodeReferenciaFeild(JTextField pontodeReferenciaFeild) {
		this.pontodeReferenciaFeild = pontodeReferenciaFeild;
	}






	public JLabel getDataDeVolta() {
		return dataDeVolta;
	}






	public void setDataDeVolta(JLabel dataDeVolta) {
		this.dataDeVolta = dataDeVolta;
	}






	public JLabel getEnderecoDeVolta() {
		return EnderecoDeVolta;
	}






	public void setEnderecoDeVolta(JLabel enderecoDeVolta) {
		EnderecoDeVolta = enderecoDeVolta;
	}






	public JLabel getLogradouroDeVolta() {
		return logradouroDeVolta;
	}






	public void setLogradouroDeVolta(JLabel logradouroDeVolta) {
		this.logradouroDeVolta = logradouroDeVolta;
	}






	public JLabel getComplementoDeVolta() {
		return complementoDeVolta;
	}






	public void setComplementoDeVolta(JLabel complementoDeVolta) {
		this.complementoDeVolta = complementoDeVolta;
	}






	public JLabel getCepDeVolta() {
		return cepDeVolta;
	}






	public void setCepDeVolta(JLabel cepDeVolta) {
		this.cepDeVolta = cepDeVolta;
	}






	public JLabel getCidadeDeVolta() {
		return cidadeDeVolta;
	}






	public void setCidadeDeVolta(JLabel cidadeDeVolta) {
		this.cidadeDeVolta = cidadeDeVolta;
	}






	public JLabel getEstadoDeVolta() {
		return estadoDeVolta;
	}






	public void setEstadoDeVolta(JLabel estadoDeVolta) {
		this.estadoDeVolta = estadoDeVolta;
	}






	public JLabel getPontodeReferenciaDeVolta() {
		return pontodeReferenciaDeVolta;
	}






	public void setPontodeReferenciaDeVolta(JLabel pontodeReferenciaDeVolta) {
		this.pontodeReferenciaDeVolta = pontodeReferenciaDeVolta;
	}






	public JTextField getDataFeildDeVolta() {
		return dataFeildDeVolta;
	}






	public void setDataFeildDeVolta(JTextField dataFeildDeVolta) {
		this.dataFeildDeVolta = dataFeildDeVolta;
	}






	public JTextField getEnderecoFeildDeVolta() {
		return EnderecoFeildDeVolta;
	}






	public void setEnderecoFeildDeVolta(JTextField enderecoFeildDeVolta) {
		EnderecoFeildDeVolta = enderecoFeildDeVolta;
	}






	public JTextField getLogradouroFeildDeVolta() {
		return logradouroFeildDeVolta;
	}






	public void setLogradouroFeildDeVolta(JTextField logradouroFeildDeVolta) {
		this.logradouroFeildDeVolta = logradouroFeildDeVolta;
	}






	public JTextField getComplementoFeildDeVolta() {
		return complementoFeildDeVolta;
	}






	public void setComplementoFeildDeVolta(JTextField complementoFeildDeVolta) {
		this.complementoFeildDeVolta = complementoFeildDeVolta;
	}






	public JTextField getCepFeildDeVolta() {
		return cepFeildDeVolta;
	}






	public void setCepFeildDeVolta(JTextField cepFeildDeVolta) {
		this.cepFeildDeVolta = cepFeildDeVolta;
	}






	public JTextField getCidadeFeildDeVolta() {
		return cidadeFeildDeVolta;
	}






	public void setCidadeFeildDeVolta(JTextField cidadeFeildDeVolta) {
		this.cidadeFeildDeVolta = cidadeFeildDeVolta;
	}






	public JTextField getEstadoFeildDeVolta() {
		return estadoFeildDeVolta;
	}






	public void setEstadoFeildDeVolta(JTextField estadoFeildDeVolta) {
		this.estadoFeildDeVolta = estadoFeildDeVolta;
	}






	public JTextField getPontodeReferenciaFeildDeVolta() {
		return pontodeReferenciaFeildDeVolta;
	}






	public void setPontodeReferenciaFeildDeVolta(JTextField pontodeReferenciaFeildDeVolta) {
		this.pontodeReferenciaFeildDeVolta = pontodeReferenciaFeildDeVolta;
	}
	
}
	