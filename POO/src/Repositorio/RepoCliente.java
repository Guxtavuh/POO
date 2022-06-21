package Repositorio;

import java.util.ArrayList;
import java.util.List;

import classes.Cliente;

public class RepoCliente {
	List<Cliente> lista = new ArrayList<Cliente>();
	//Adicionar novos clientes a lista
	
	/*
		 Vamos cadastrar os clientes em uma lista de dados, essa lista guardara os dados em memoria
		 todo novo cliente será inserido nessa lista, utilizaremos o comando list e a implementação será
		 feita com o comando ArrayList ambos devem ser impotados	 */
	
	public void cadastrar (Cliente novoCliente) {

		lista.add(novoCliente);
		System.out.println("Cliente Cadastrado com sucesso!");
}
		public void listar () {
			for (int i = 0 ;i < lista.size(); i++){
				System.out.println(lista.get(i).nome+"-"+lista.get(i).email+"-"+lista.get(i).cpf);
	 }
}
		
		public void atualizar(Cliente cliente) {
		for (int i = 0; i<lista.size(); i++) {
			if(lista.get(i).nome.equals(cliente.nome)) {
				lista.get(i).nome = cliente.nome;
				lista.get(i).email = cliente.email;
				lista.get(i).cpf = cliente.cpf;
				System.out.println("Cliente atualizado com sucesso");
				break; // para repetição (força saida do laço)
			}
	  }
		
}
		public void deletar(String nome) {
	    for (int i = 0; i<lista.size(); i++) {
	    	if(lista.get(i).nome.equals(nome)) {
	    		lista.remove(i);
	    		System.out.println("Cliente apagado com sucesso!");
	    		break; //força saida do laço
	    	}
	    }
	}
}
