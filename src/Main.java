import model.Dados;
import view.Login;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dados.start();
		new Login().setVisible(true);

	}

}
