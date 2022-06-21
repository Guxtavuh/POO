package Aplicacao;

import Repositorio.RepoSistema;
import classes.PrjCliente;
import classes.PrjEndereco;
import classes.PrjUsuario;

public class CadastroCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrjUsuario usuario = new PrjUsuario();
		PrjEndereco endereco = new PrjEndereco();
		PrjCliente cliente = new PrjCliente();
		
		
		
		usuario.idUsuario = 10;
		usuario.nomeUsuario = "marcela";
		usuario.senha ="123";
		
		endereco.idEndereco = 53;
		endereco.logradouro = "Rua Jose";
		endereco.numero= "10";
		endereco.bairro="tatuape";

		
		
		cliente.idCliente = 54;
		cliente.nomeCliente= "Paulo";
		cliente.email="paulo@terra.com";
		cliente.usuario = usuario;
		cliente.endereco = endereco;
		
		RepoSistema rs = new RepoSistema();
		System.out.println(rs.cadUsuario(usuario)); 
		System.out.println(rs.cadEndereco(endereco)); 
		System.out.println(rs.cadCLiente(cliente)); 
	}

}
