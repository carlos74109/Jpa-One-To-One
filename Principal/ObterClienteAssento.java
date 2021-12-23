package Principal;

import Classes.Assento;
import Classes.Cliente;
import infra.DAO;

public class ObterClienteAssento {

	public static void main(String[] args) {
		//obter dados de assento a partir de cliente
		DAO<Cliente> daoCliente = new DAO<>(Cliente.class);
		
		
		Cliente cliente = daoCliente.obterPorId(1l);
		//System.out.println("nome do cliente: "+cliente.getNome());
		System.out.println("nome do assento: " +cliente.getAssento().getNome());
		System.out.println("Acessando o cliente do assento: "+cliente.getAssento().getCliente().getNome());
		
		
		
		//obter dado de cliente a partir do assento
		DAO<Assento> daoAssento = new DAO<>(Assento.class);
		
		Assento assento = daoAssento.obterPorId(2l);
		
		System.out.println(assento.getCliente().getNome());
		System.out.println(assento.getCliente().getAssento().getNome());
		
		
		

	}

}
