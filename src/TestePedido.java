import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestePedido {

	public static void main(String[] args) {
		
		// Instanciando um Cliente
		Cliente cliente1 = new Cliente("Athos", "1256");
		
		//Instanciando os Produtos consumidos pelo Cliente
		Produto prod1 = new Produto("Coca-Cola", 6.50);
		Produto prod2 = new Produto("Agua Mineral", 4);
		Produto prod3 = new Produto("Twix", 2.50);
		
		//Instanciando uma lista de Produtos
		List<Produto> listaProdutos = new ArrayList<Produto>();

		//Instanciando um Pedido que recebe a lista de Produtos e o Cliente.
		Pedido ped1 = new Pedido(listaProdutos, cliente1);
		
		// Adicionando os produtos na lista.
		Collections.addAll(ped1.lista, prod1, prod2, prod3);
		
		// Imprimindo os valores encontrados na lista.
		ped1.lista.forEach(p -> System.out.println(p));
		System.out.println("\n");
		
		//--------------------- Observer ----------------------------
		
		// Instanciando uma lista de ações a serem feitas no pedido.
		List<gravaPedido> acoes = new ArrayList<gravaPedido>();
		
//		// Instanciando ações.
//		gravaBancoDados gbd = new gravaBancoDados();
//		envioEmailPedido eep = new envioEmailPedido();
		
		// Instanciando a classe responsavel pelo evento de disparar as ações;
		gerarPedido gp1 = new gerarPedido(acoes);
		
		// Adicionando as ações na lista.
		Collections.addAll(gp1.acoes, new gravaBancoDados(), new envioEmailPedido());		
		
//		gerarPedido gp1 = new gerarPedido( 
//				Arrays.asList(new gravaBancoDados(), new envioEmailPedido())
//				);
	
		// Executando o método que chama todas as ações.
		gp1.execAcoes(ped1);
		
	}
	
}
