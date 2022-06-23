package aplicacao;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import classes.ContaPoupanca;
import classes.TransacoesPoupanca;

public class FormPoupanca extends JFrame {

	private JPanel contentPane;
	private JTextField txtBanco;
	private JTextField txtAgencia;
	private JTextField txtConta;
	private JTextField txtTitular;
	private JTextField txtSaldo;
	private JTextField txtAniversario;
	private JTextField txtValorTransacao;
	private JTextArea txtSaida;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public FormPoupanca() {
		ContaPoupanca cp = new ContaPoupanca();
		TransacoesPoupanca tp = new TransacoesPoupanca();
		
		setTitle("Conta Poupan\u00E7a");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 531);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Transações");
		lblNewLabel.setFont(new Font("Lucida Sans", Font.ITALIC, 25));
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setBounds(10, 230, 188, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblNumeroBanco = new JLabel("Numero do Banco");
		lblNumeroBanco.setBounds(10, 11, 102, 14);
		contentPane.add(lblNumeroBanco);
		
		JLabel lblNumeroAgencia = new JLabel("Numero agencia");
		lblNumeroAgencia.setBounds(10, 97, 102, 14);
		contentPane.add(lblNumeroAgencia);
		
		JLabel lblNumeroConta = new JLabel("Numero da conta");
		lblNumeroConta.setBounds(10, 174, 102, 14);
		contentPane.add(lblNumeroConta);
		
		JLabel lblTitular = new JLabel("Titular da conta");
		lblTitular.setBounds(122, 11, 102, 14);
		contentPane.add(lblTitular);
		
		JLabel lblAniversario = new JLabel("Aniversario da conta");
		lblAniversario.setBounds(122, 174, 133, 14);
		contentPane.add(lblAniversario);
		
		JLabel lblSaldo = new JLabel("Saldo da conta");
		lblSaldo.setBounds(130, 97, 102, 14);
		contentPane.add(lblSaldo);
		
		txtBanco = new JTextField();
		txtBanco.setBounds(6, 36, 110, 20);
		contentPane.add(txtBanco);
		txtBanco.setColumns(10);
		
		txtAgencia = new JTextField();
		txtAgencia.setColumns(10);
		txtAgencia.setBounds(6, 122, 110, 20);
		contentPane.add(txtAgencia);
		
		txtConta = new JTextField();
		txtConta.setColumns(10);
		txtConta.setBounds(6, 199, 110, 20);
		contentPane.add(txtConta);
		
		txtTitular = new JTextField();
		txtTitular.setColumns(10);
		txtTitular.setBounds(122, 36, 302, 20);
		contentPane.add(txtTitular);
		
		txtSaldo = new JTextField();
		txtSaldo.setColumns(10);
		txtSaldo.setBounds(122, 122, 110, 20);
		contentPane.add(txtSaldo);
		
		txtAniversario = new JTextField();
		txtAniversario.setColumns(10);
		txtAniversario.setBounds(122, 199, 110, 20);
		contentPane.add(txtAniversario);
		
		JButton btnAbrirConta = new JButton("Abrir Conta");
		btnAbrirConta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cp.setNumeroBanco(Integer.parseInt(txtBanco.getText()));
				cp.setNumeroAgencia(Integer.parseInt(txtAgencia.getText()));
				cp.setNumeroConta(Integer.parseInt(txtConta.getText()));
				cp.setTitular(txtTitular.getText());
				cp.setSaldo(Double.parseDouble(txtSaldo.getText()));
				cp.setAniversario(txtAniversario.getText());
				txtSaida.setText(tp.abrirConta(cp));
				
				//Desabilitar as caixas de texto e o botão
				txtBanco.setEnabled(false);
				txtAgencia.setEnabled(false);
				txtConta.setEnabled(false);
				txtTitular.setEnabled(false);
				txtSaldo.setEnabled(false);
				txtAniversario.setEnabled(false);
				btnAbrirConta.setEnabled(false);
				
			}
		});
		btnAbrirConta.setBounds(277, 97, 133, 131);
		contentPane.add(btnAbrirConta);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 249, 414, 88);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblValorTransacao = new JLabel("Valor transação");
		lblValorTransacao.setBounds(10, 23, 92, 14);
		panel.add(lblValorTransacao);
		
		txtValorTransacao = new JTextField();
		txtValorTransacao.setBounds(10, 55, 86, 20);
		panel.add(txtValorTransacao);
		txtValorTransacao.setColumns(10);
		
		JButton btnSacar = new JButton("Sacar");
		btnSacar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(validarValorTransacao()) {
					txtSaida.append("\n"+tp.sacar(Double.parseDouble(txtValorTransacao.getText())));
				}

			}
		});
		btnSacar.setBounds(181, 19, 89, 23);
		panel.add(btnSacar);
		
		JButton btnDepositar = new JButton("Depositar");
		btnDepositar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(validarValorTransacao()) {
					txtSaida.append("\n"+tp.depositar(Double.parseDouble(txtValorTransacao.getText())));
				}
			}
		});
		btnDepositar.setBounds(181, 54, 89, 23);
		panel.add(btnDepositar);
		
		JButton btnTransferir = new JButton("Transferir");
		btnTransferir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(validarValorTransacao()) {
					txtSaida.append("\n"+tp.transferencia(Double.parseDouble(txtValorTransacao.getText())));
				}
			}
		});
		btnTransferir.setBounds(280, 19, 124, 23);
		panel.add(btnTransferir);
		
		JButton btnObterSaldo = new JButton("Obter Saldo");
		btnObterSaldo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtSaida.append("\n"+tp.saldo());
			}
		});
		btnObterSaldo.setBounds(280, 54, 124, 23);
		panel.add(btnObterSaldo);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 360, 414, 121);
		contentPane.add(scrollPane);
		
		txtSaida = new JTextArea();
		scrollPane.setViewportView(txtSaida);
	}
	//Criar uma função para validar txtvalor se está vazio
	private boolean validarValorTransacao(){
		boolean rt = true;
		if(txtValorTransacao.getText().equals("") || txtValorTransacao.getText()==null) {
			rt=false;
			JOptionPane.showMessageDialog(null,"Preencha o valor da transação" );
		}
		return rt;
	}
}