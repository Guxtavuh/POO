package Aplicacao;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Repositorio.RepoSistema;
import classes.PrjCliente;
import classes.PrjEndereco;
import classes.PrjUsuario;

public class FormCliente extends JFrame {

	private JPanel contentPane;
	private JTextField txtidCLiente;
	private JLabel lblidUsuario;
	private JTextField txtUsuario;
	private JLabel lblEmail_1;
	private JTextField txtemailCliente;
	private JTextField textnomeCliente;
	private JLabel lblnomeUsuario;
	private JTextField txtnomeUsuario;
	private JLabel lblSenha;
	private JPasswordField passwordField;
	private JTextField txtidEndereco;
	private JTextField txtLogradouro;
	private JTextField txtNumero;
	private JTextField txtBairro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormCliente frame = new FormCliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FormCliente() {
		setResizable(false);
		setTitle("Gerenciar clientes");
		setBackground(Color.DARK_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 795, 617);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblidCliente = new JLabel("ID do Cliente:");
		lblidCliente.setFont(new Font("Arial", Font.PLAIN, 12));
		lblidCliente.setBounds(10, 11, 104, 14);
		contentPane.add(lblidCliente);
		
		JLabel lblnomeCliente = new JLabel("Nome do Cliente:");
		lblnomeCliente.setFont(new Font("Arial", Font.PLAIN, 12));
		lblnomeCliente.setBounds(124, 12, 104, 14);
		contentPane.add(lblnomeCliente);
		
		lblidUsuario = new JLabel("ID do Usuario:");
		lblidUsuario.setFont(new Font("Arial", Font.PLAIN, 12));
		lblidUsuario.setBounds(10, 200, 104, 14);
		contentPane.add(lblidUsuario);
		
		txtUsuario = new JTextField();
		txtUsuario.setColumns(10);
		txtUsuario.setBounds(10, 225, 86, 20);
		contentPane.add(txtUsuario);
		
		lblEmail_1 = new JLabel("Email do cliente:");
		lblEmail_1.setBounds(10, 87, 104, 14);
		contentPane.add(lblEmail_1);
		lblEmail_1.setFont(new Font("Arial", Font.PLAIN, 12));
		
		txtemailCliente = new JTextField();
		txtemailCliente.setBounds(10, 112, 759, 20);
		contentPane.add(txtemailCliente);
		txtemailCliente.setColumns(10);
		
		txtidCLiente = new JTextField();
		txtidCLiente.setBounds(10, 36, 86, 20);
		contentPane.add(txtidCLiente);
		txtidCLiente.setColumns(10);
		
		textnomeCliente = new JTextField();
		textnomeCliente.setBounds(124, 37, 251, 20);
		contentPane.add(textnomeCliente);
		textnomeCliente.setColumns(10);
		
		lblnomeUsuario = new JLabel("Nome do Usuario:");
		lblnomeUsuario.setFont(new Font("Arial", Font.PLAIN, 12));
		lblnomeUsuario.setBounds(124, 200, 123, 14);
		contentPane.add(lblnomeUsuario);
		
		txtnomeUsuario = new JTextField();
		txtnomeUsuario.setBounds(124, 225, 104, 20);
		contentPane.add(txtnomeUsuario);
		txtnomeUsuario.setColumns(10);
		
		lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Arial", Font.PLAIN, 12));
		lblSenha.setBounds(252, 200, 123, 14);
		contentPane.add(lblSenha);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(252, 225, 60, 20);
		contentPane.add(passwordField);
		
		JLabel lblEndereco = new JLabel("ID Endere\u00E7o:");
		lblEndereco.setFont(new Font("Arial", Font.PLAIN, 12));
		lblEndereco.setBounds(10, 274, 104, 14);
		contentPane.add(lblEndereco);
		
		txtidEndereco = new JTextField();
		txtidEndereco.setColumns(10);
		txtidEndereco.setBounds(10, 299, 104, 38);
		contentPane.add(txtidEndereco);
		
		JLabel lblLogradouro = new JLabel("Logradouro:");
		lblLogradouro.setFont(new Font("Arial", Font.PLAIN, 12));
		lblLogradouro.setBounds(124, 274, 104, 14);
		contentPane.add(lblLogradouro);
		
		txtLogradouro = new JTextField();
		txtLogradouro.setColumns(10);
		txtLogradouro.setBounds(124, 299, 382, 38);
		contentPane.add(txtLogradouro);
		
		JLabel lblNumero = new JLabel("Numero:");
		lblNumero.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNumero.setBounds(516, 274, 104, 14);
		contentPane.add(lblNumero);
		
		txtNumero = new JTextField();
		txtNumero.setColumns(10);
		txtNumero.setBounds(516, 299, 86, 38);
		contentPane.add(txtNumero);
		
		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setFont(new Font("Arial", Font.PLAIN, 12));
		lblBairro.setBounds(10, 348, 104, 14);
		contentPane.add(lblBairro);
		
		txtBairro = new JTextField();
		txtBairro.setColumns(10);
		txtBairro.setBounds(10, 372, 200, 49);
		contentPane.add(txtBairro);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//instancia da classe PRJusuario
				PrjUsuario usuario = new PrjUsuario();
				//instancia da classe endereco
				PrjEndereco endereco = new PrjEndereco();
				//instancia da classe cliente
				PrjCliente cliente = new PrjCliente();
				//Vamos adicionar os clientes a um repositorio
				RepoSistema rs = new RepoSistema();
				// id usuario recebe apenas numero inteiro por isso convertemos de text (entrada) para int
				usuario.idUsuario = Integer.parseInt(txtUsuario.getText()) ;
				//vamos receber o nome do usuario
				usuario.nomeUsuario = txtnomeUsuario.getText();
				//
				usuario.senha = passwordField.getText();
				
				//endereco
				endereco.idEndereco = Integer.parseInt(txtidEndereco.getText()) ;
				endereco.logradouro = txtLogradouro.getText();
				endereco.numero =  txtNumero.getText();
				
				cliente.idCliente = Integer.parseInt(txtidCLiente.getText());
				cliente.nomeCliente = textnomeCliente.getText();
				cliente.email = txtemailCliente.getText();
				
				
				
				
				
				
				
				
				
				
				JOptionPane.showMessageDialog(null,rs.cadUsuario(usuario)+"\n" + rs.cadEndereco(endereco)+"\n"+ rs.cadCLiente(cliente));
			}
		});
		btnCadastrar.setBounds(265, 371, 337, 50);
		contentPane.add(btnCadastrar);
	}
}
