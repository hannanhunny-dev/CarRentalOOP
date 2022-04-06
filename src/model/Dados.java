package model;

import java.util.ArrayList;


import java.util.HashMap;
import java.util.List;


//classe que vai servir como banco de dadaos para applicativo
public class Dados {

	

	private static final ArrayList<Admin> admins = new ArrayList<>();
	private static final  ArrayList<Client> clientes = new ArrayList<>();
	private static final ArrayList<Pagamento> pagamentos = new ArrayList<>();
	private static final ArrayList<Car> cars = new ArrayList<>();
	private static final ArrayList<Endereco> enderecos = new ArrayList<>();
	private static final ArrayList<Emprestimo> emprestimos = new ArrayList<>();

	private Dados() {
	}
    //nesse meteodo tem informcaoes pre-cadastrados necessarios 
	public static void start() {

		Admin admin1 = new Admin("admin", "admin");
		admins.add(admin1);

		Client client1 = new Client("h", "bfdsf", "bfd", "v", "h");
		Client client2 = new Client("adfds", "b", "bfgfd", "dfgv", "cdgf");
		Client client3 = new Client("basic", "b", "dfgb", "dfgv", "basic");
		Client client4 = new Client("pillow", "b", "gdfgb", "fdgv", "dfgc");
		Client client5 = new Client("gown", "b", "bgdf", "dgfv", "cdfg");

		clientes.add(client1);
		clientes.add(client2);
		clientes.add(client3);
		clientes.add(client4);
		clientes.add(client5);

		Car car1 = new Car("any", "random", "good", "sds", true);
		Car car2 = new Car("gfg", "gfgfg", "fgfg", "dfdf", true);
		Car car3 = new Car("gfgf", "jhj", "ghf", "fgfdg", false);
		Car car4 = new Car("fgdfg", "rt5gf", "fgfg", "gfgf", true);
		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		cars.add(car4);

	}

	public static List<Admin> getAdmin() {
		return admins;
	}

	public static List<Client> getClientes() {
		return clientes;
	}

	public static List<Car> getCars() {
		return cars;
	}

	public static List<Emprestimo> getEmprestimo() {
		return emprestimos;
	}

	public static List<Pagamento> getPagamentos() {
		return pagamentos;
	}

	public static List<Endereco> getEndereco() {
		return enderecos;
	}

	// arraylist clientlogado para salvar client que foi logado tem principio uso de clonar e usaurio que foi logado para usar futuramente , caso cliente deseja modificar dadaos
	public static ArrayList<Client> clientesloagado = new ArrayList<>();
	
	
	

	//@return vai fzr comparacao do entrada do usario para cada cliente em Dados para ver se existe 
	//@see usando meteudo nomeesenhaIguis entre esse meteodo, esse metodo vai fzr compracao entre duas clientes 
	public static Client selecionarPorNomeESenha(Client client) {
		for (Client c : Dados.getClientes()) { 
			if (nomeESenhaIguaisClient(c, client)) {                          
				System.out.print(c);
				clientesloagado.add(c);
				return c;

			}
		}
		return null;
	
	}
	

	private static boolean nomeESenhaIguaisClient(Client a, Client b) {
		return a.getNome().equals(b.getNome()) && a.getSenha().equals(b.getSenha());
	}

	public static List<Client> selecionaTudo() {
		return Dados.getClientes();
	}

//@return vai fzr comparacao do  para ver o index o objeto cliente em arraylist client , metodo necessario para exculir e modificar dados
	public static int getIndexOfContaLogado() {
		for (Client c : Dados.clientes) {
			if (c.getNome().equals(Dados.clientesloagado.get(0).getNome())) {

				Dados.clientesloagado.remove(0);
				return Dados.clientes.indexOf(c);

			}
		}
		return -1;
	}

	////////////////////// ADMIN//////////////////////////////////
//metodos que vao fzr validacao do admin 
	public static Admin buscarAdmin(Admin admin) {
		for (Admin a : Dados.getAdmin()) {
			if (nomeESenhaIguaisAdmin(a, admin)) {

				return a;
			}
		}

		return null;
	}

	private static boolean nomeESenhaIguaisAdmin(Admin a, Admin b) {
		return a.getNome().equals(b.getNome()) && a.getSenha().equals(b.getSenha());
	}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

}

