
public class gravaBancoDados implements gravaPedido { // É um Observador, está  observando uma ação e quando for chamada
	// vai executar esta ação.

	@Override
	public void execAcoes(Pedido pedido) {
		System.out.println("Salvando pedido no banco de dados");
	}
	
}
