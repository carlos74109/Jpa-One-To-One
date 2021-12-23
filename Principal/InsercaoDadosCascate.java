package Principal;

import Classes.Assento;
import Classes.Cliente;
import infra.DAO;

public class Principal2 {

	/*Inserção de dados usando o cascade, repare que o metodo de incluir muda
	, onde faço a ultilização apenas do objeto cliente, esse é o efeito cascade
	
	*/
	public static void main(String[] args) {
		DAO<Object> dao = new DAO<>();
		
		Assento assento = new Assento("4d");
		
		Cliente cliente = new Cliente("Tom", assento);
		dao.incluirAtomica(cliente).fechar();
		
	}

}
