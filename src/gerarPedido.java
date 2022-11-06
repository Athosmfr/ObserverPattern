import java.util.List;

public class gerarPedido { // Classe que está disparando os eventos
	
	public List<gravaPedido> acoes; // Varias ações - Lista de ações
	
	// Ao invez de receber diversos parametros e instanciar diversas classes, podemos usar o polimorfismo para extrair o codigo.

	public gerarPedido(List<gravaPedido> acoes) {
		this.acoes = acoes;
	}
	
	public void execAcoes(Pedido pedido) { // Evento

//		envioEmailPedido emp = new envioEmailPedido();
//		gravaBancoDados gbd = new gravaBancoDados();
		
		acoes.forEach(a -> a.execAcoes(pedido)); // Evento que quando for disparado, vou ter varios ouvintes que se inscreveram e estão 
		//observando esse evento e serão notificados.
		
		// Ao invés de sair chamando ouvinte por ouvinte, você só notifica que disparou o evento, quem estiver "observando" executara sua
		// ação.
	}
	
}
