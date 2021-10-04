package Calculos_Salariais;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

public class GUI {

	JFrame frame;
	private JTextField txtNome;
	private JTextField salBase;
	private JTextField totVend;
	private JTextField numDep;

	GUI() {
		initialize();
	}
	
	void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 702, 465);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setFont(new Font("DejaVu Serif Condensed", Font.PLAIN, 16));
		lblNewLabel.setBounds(53, 64, 220, 43);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CALCULADORA DE SAL\u00C1RIO");
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setFont(new Font("Algerian", Font.PLAIN, 24));
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(0, 30, 684, 33);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtNome = new JTextField();
		txtNome.setBounds(31, 97, 616, 27);
		frame.getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblSalarioBase = new JLabel("Salario Base");
		lblSalarioBase.setFont(new Font("DejaVu Serif Condensed", Font.PLAIN, 16));
		lblSalarioBase.setBounds(53, 137, 220, 43);
		frame.getContentPane().add(lblSalarioBase);
		
		salBase = new JTextField();
		salBase.setColumns(10);
		salBase.setBounds(31, 171, 616, 27);
		frame.getContentPane().add(salBase);
		
		JLabel lblTotalDeVendas = new JLabel("Total de Vendas");
		lblTotalDeVendas.setFont(new Font("DejaVu Serif Condensed", Font.PLAIN, 16));
		lblTotalDeVendas.setBounds(53, 210, 220, 43);
		frame.getContentPane().add(lblTotalDeVendas);
		
		totVend = new JTextField();
		totVend.setColumns(10);
		totVend.setBounds(31, 244, 616, 27);
		frame.getContentPane().add(totVend);
		
		JLabel lblNumeroDeDependentes = new JLabel("Numero de Dependentes");
		lblNumeroDeDependentes.setFont(new Font("DejaVu Serif Condensed", Font.PLAIN, 16));
		lblNumeroDeDependentes.setBounds(53, 283, 220, 43);
		frame.getContentPane().add(lblNumeroDeDependentes);
		
		numDep = new JTextField();
		numDep.setColumns(10);
		numDep.setBounds(31, 318, 616, 27);
		frame.getContentPane().add(numDep);
		
		JButton btnNewButton = new JButton("CALCULAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					GUIEvent ev = new GUIEvent(txtNome.getText(), Double.parseDouble(salBase.getText()), Double.parseDouble(totVend.getText()), Double.parseDouble(numDep.getText()));
					ev.frame2.setVisible(true);
					
				} 
				catch (java.lang.NumberFormatException exc) {
					JOptionPane.showMessageDialog(null, "HOUVE UMA ENTRADA INVÁLIDA!", null, JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
					exc.printStackTrace();
				}
				
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Algerian", Font.PLAIN, 16));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBounds(280, 373, 124, 26);
		frame.getContentPane().add(btnNewButton);
	}
	
}
