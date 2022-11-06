import java.util.ArrayList;
import java.util.List;

public class Pedido {

	public List<Produto> lista;
	public Cliente cliente;
	public double valorTotal;
	
	public Pedido(List<Produto> lista, Cliente cliente) {
		this.lista = lista;
		this.cliente = cliente;
	}
	
	public double somaTotal(List<Produto> lista) {
		lista.forEach(p -> valorTotal += p.getPreco());
		return valorTotal;
	}
	
	
}
