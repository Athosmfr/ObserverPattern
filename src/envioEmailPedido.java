
public class envioEmailPedido implements gravaPedido { // É um Observador, está  observando uma ação e quando for chamada vai 
	// executar esta ação.

	@Override
	public void execAcoes(Pedido pedido) {
		System.out.println(pedido.lista + "\n Valor Total: R$" + pedido.somaTotal(pedido.lista));
	}

}
