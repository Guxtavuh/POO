package Aplicacao;

import java.util.Scanner;

import Repositorio.RepoCliente;
import classes.Cliente;

public class AppCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cli=null;
		
		RepoCliente rc = new RepoCliente();
		
		Scanner tela = new Scanner(System.in);
		
		String resposta = "";
		
		while (!resposta.equals ("n")) {
			cli = new Cliente();	
			System.out.println("Qual o nome do cliente?");
			cli.nome = tela.next();
			
			System.out.println("Qual o EMAIL do cliente?");
			cli.email=tela.next();		
			
			System.out.println("Qual o CPF  do cliente?");
			cli.cpf = tela.next();
			
			rc.cadastrar(cli);
			
			System.out.println("/n Você quer cadastrar outro cliente ou dnv? (n para NÂO e s para SIM)");
			resposta = tela.next();
			
		}
			System.out.println("--------CLientes Cadastrados ------------");
			rc.listar();
			System.out.println("--------CLientes atualizado ------------");
			Cliente cli2 = new Cliente();
			cli2.nome = "marcos";
			cli2.email = "marcos@mgial.com";
			cli2.cpf = "86868";
			
			
			rc.atualizar(cli2);
			rc.listar();
			System.out.println("--------CLientes Deletado!!! ------------");		    
		    rc.deletar("victor correa");
		    rc.listar();
	}

}
