package Principal;

import Classes.Assento;
import Classes.Cliente;
import infra.DAO;

public class Principal1 {

	public static void main(String[] args) {
		
		//inserção de dados sem usar o cascade
		DAO<Object> dao = new DAO<>();
		
		Assento assento = new Assento("A7");
		
		Cliente cliente = new Cliente("Andrew", assento);
		
		dao.abrirTransacao()
			.incluir(assento)
			.incluir(cliente)
			.fecharTransacao()
			.fechar();

	}

}
