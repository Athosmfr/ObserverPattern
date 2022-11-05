import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestePedido {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Athos", "1256");
		
		Produto prod1 = new Produto("Coca-Cola", 6.50);
		Produto prod2 = new Produto("Agua Mineral", 4);
		Produto prod3 = new Produto("Twix", 2.50);
		
		List<Produto> listaProdutos = new ArrayList<Produto>();

		Pedido ped1 = new Pedido(listaProdutos, cliente1);
		
		Collections.addAll(ped1.lista, prod1, prod2, prod3);
		
		ped1.lista.forEach(p -> System.out.println(p));
		
		gerarPedido gp1 = new gerarPedido( 
				Arrays.asList(new gravaBancoDados(), new envioEmailPedido())
				);
	
		gp1.execAcoes(ped1);
		
	}
	
}
