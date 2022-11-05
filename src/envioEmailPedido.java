
public class envioEmailPedido implements gravaPedido {

	@Override
	public void execAcoes(Pedido pedido) {
		// TODO Auto-generated method stub
		System.out.println(pedido.lista + "\n Valor Total: R$" + pedido.somaTotal(pedido.lista));
	}

	
	
}
