package aplicacao;

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

import classes.PrjCliente;
import classes.PrjEndereco;
import classes.PrjUsuario;
import repositorio.RepoSistema;

public class FormCliente extends JFrame {

	private JPanel contentPane;
	private JTextField txtIdCliente;
	private JTextField txtNomeCliente;
	private JTextField txtEmail;
	private JTextField txtIdUsuario;
	private JTextField txtNomeUsuario;
	private JPasswordField txtSenha;
	private JTextField txtIdEndereco;
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
		setTitle("Gerenciar Clientes");
		setBackground(new Color(230, 230, 250));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 558, 492);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 245, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIdCliente = new JLabel("Id do Cliente:");
		lblIdCliente.setFont(new Font("Swis721 LtEx BT", Font.PLAIN, 14));
		lblIdCliente.setBounds(28, 35, 122, 30);
		contentPane.add(lblIdCliente);
		
		txtIdCliente = new JTextField();
		txtIdCliente.setBounds(28, 61, 99, 30);
		contentPane.add(txtIdCliente);
		txtIdCliente.setColumns(10);
		
		JLabel lblNomeCliente = new JLabel("Nome do Cliente:");
		lblNomeCliente.setFont(new Font("Swis721 LtEx BT", Font.PLAIN, 14));
		lblNomeCliente.setBounds(137, 44, 156, 14);
		contentPane.add(lblNomeCliente);
		
		txtNomeCliente = new JTextField();
		txtNomeCliente.setBounds(137, 61, 371, 30);
		contentPane.add(txtNomeCliente);
		txtNomeCliente.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-Mail:");
		lblEmail.setFont(new Font("Swis721 LtEx BT", Font.PLAIN, 14));
		lblEmail.setBounds(28, 117, 122, 14);
		contentPane.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(28, 136, 480, 30);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		JLabel lblIdUsuario = new JLabel("Id do Usu\u00E1rio:");
		lblIdUsuario.setFont(new Font("Swis721 LtEx BT", Font.PLAIN, 14));
		lblIdUsuario.setBounds(28, 192, 122, 30);
		contentPane.add(lblIdUsuario);
		
		txtIdUsuario = new JTextField();
		txtIdUsuario.setColumns(10);
		txtIdUsuario.setBounds(28, 220, 99, 30);
		contentPane.add(txtIdUsuario);
		
		JLabel lblNomeUsuario = new JLabel("Nome do Usu\u00E1rio:");
		lblNomeUsuario.setFont(new Font("Swis721 LtEx BT", Font.PLAIN, 14));
		lblNomeUsuario.setBounds(137, 200, 156, 14);
		contentPane.add(lblNomeUsuario);
		
		txtNomeUsuario = new JTextField();
		txtNomeUsuario.setColumns(10);
		txtNomeUsuario.setBounds(137, 220, 179, 30);
		contentPane.add(txtNomeUsuario);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(326, 220, 182, 30);
		contentPane.add(txtSenha);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Swis721 LtEx BT", Font.PLAIN, 14));
		lblSenha.setBounds(326, 200, 156, 14);
		contentPane.add(lblSenha);
		
		JLabel lblIdEndereco = new JLabel("Id do Endere\u00E7o:");
		lblIdEndereco.setFont(new Font("Swis721 LtEx BT", Font.PLAIN, 14));
		lblIdEndereco.setBounds(28, 261, 122, 30);
		contentPane.add(lblIdEndereco);
		
		txtIdEndereco = new JTextField();
		txtIdEndereco.setColumns(10);
		txtIdEndereco.setBounds(28, 289, 122, 30);
		contentPane.add(txtIdEndereco);
		
		JLabel lblLogradouro = new JLabel("Logradouro:");
		lblLogradouro.setFont(new Font("Swis721 LtEx BT", Font.PLAIN, 14));
		lblLogradouro.setBounds(160, 265, 156, 22);
		contentPane.add(lblLogradouro);
		
		txtLogradouro = new JTextField();
		txtLogradouro.setColumns(10);
		txtLogradouro.setBounds(160, 289, 348, 30);
		contentPane.add(txtLogradouro);
		
		JLabel lblNumero = new JLabel("N\u00FAmero:");
		lblNumero.setFont(new Font("Swis721 LtEx BT", Font.PLAIN, 14));
		lblNumero.setBounds(28, 330, 122, 30);
		contentPane.add(lblNumero);
		
		txtNumero = new JTextField();
		txtNumero.setColumns(10);
		txtNumero.setBounds(28, 358, 122, 30);
		contentPane.add(txtNumero);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setFont(new Font("Swis721 LtEx BT", Font.PLAIN, 14));
		lblBairro.setBounds(160, 334, 156, 22);
		contentPane.add(lblBairro);
		
		txtBairro = new JTextField();
		txtBairro.setColumns(10);
		txtBairro.setBounds(160, 358, 348, 30);
		contentPane.add(txtBairro);
		
		JButton btnCadastrar = new JButton("Cadastar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Inst?ncia da classe PRJUsuario
				PrjUsuario usuario = new PrjUsuario();
				//Inst?ncia da classe PRJEndereco
				PrjEndereco endereco = new PrjEndereco();
				//Inst?cia da classe PRJCliente
				PrjCliente cliente = new PrjCliente(); 
				//Vamos adicionar o cliente a mem?ria com o RepoSistema
				RepoSistema rs = new RepoSistema();
				
				//O id do usu?rio recebe apenas n?meros inteiros, porem a caixa
				//em que ? digitado o id ? do tipo text. Portanto se faz 
				//necess?rio realizar uma convers?o de texto para inteiro
				//com o comando Integer.parseInt
				usuario.idUsuario = Integer.parseInt(txtIdUsuario.getText());
				usuario.nomeUsuario = txtNomeUsuario.getText();
				usuario.senha = txtSenha.getText();
				
				endereco.idEndereco = Integer.parseInt(txtIdEndereco.getText());
				endereco.logradouro = txtLogradouro.getText();
				endereco.numero= txtNumero.getText();
				endereco.bairro = txtBairro.getText();
				
				cliente.idCliente = Integer.parseInt(txtIdCliente.getText());
				cliente.nomeCliente = txtNomeCliente.getText();
				cliente.email = txtEmail.getText();
				cliente.usuario = usuario;
				cliente.endereco = endereco;
				
		
				JOptionPane.showMessageDialog(null,rs.cadUsuario(usuario)+"\n"+rs.cadEndereco(endereco)+"\n"+rs.cadCliente(cliente));
			}
		});
		btnCadastrar.setBounds(352, 399, 156, 30);
		contentPane.add(btnCadastrar);
	}
}
