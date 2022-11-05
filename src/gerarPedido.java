import java.util.List;

public class gerarPedido {
	
	public List<gravaPedido> acoes;

	public gerarPedido(List<gravaPedido> acoes) {
		this.acoes = acoes;
	}
	
	public void execAcoes(Pedido pedido) {
		acoes.forEach(a -> a.execAcoes(pedido));
	}
	
}
