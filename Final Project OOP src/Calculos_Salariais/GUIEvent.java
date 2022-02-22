package Calculos_Salariais;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionEvent;

import java.io.FileOutputStream;
import java.io.IOException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class GUIEvent extends GUI {
	
	Vendedor ven = new Vend();
	Calculos cal = new Results();
	
	JFrame frame2;

	GUIEvent(String n, double sb, double tv, double nd) {
		ven.setNome(n);
		ven.setSalBase(sb);
		ven.setTotalVendas(tv);
		ven.setNumeroDeDependentes(nd);
		initialize2();
	}

	void initialize2() {
		frame2 = new JFrame();
		frame2.setBounds(100, 100, 702, 729);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.getContentPane().setLayout(null);
		
		JLabel lblFolhaDePagamento = new JLabel("FOLHA DE PAGAMENTO");
		lblFolhaDePagamento.setVerticalAlignment(SwingConstants.TOP);
		lblFolhaDePagamento.setHorizontalAlignment(SwingConstants.CENTER);
		lblFolhaDePagamento.setFont(new Font("Algerian", Font.PLAIN, 24));
		lblFolhaDePagamento.setBackground(Color.WHITE);
		lblFolhaDePagamento.setBounds(0, 40, 684, 33);
		frame2.getContentPane().add(lblFolhaDePagamento);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("DejaVu Serif Condensed", Font.PLAIN, 16));
		lblNome.setBounds(52, 94, 124, 43);
		frame2.getContentPane().add(lblNome);
		
		JLabel label_1 = new JLabel(ven.getNome());
		label_1.setFont(new Font("DejaVu Serif Condensed", Font.BOLD | Font.ITALIC, 16));
		label_1.setBounds(217, 94, 402, 43);
		frame2.getContentPane().add(label_1);
		
		JLabel lblSalarioBase = new JLabel("Salario Base: ");
		lblSalarioBase.setFont(new Font("DejaVu Serif Condensed", Font.PLAIN, 16));
		lblSalarioBase.setBounds(52, 148, 124, 43);
		frame2.getContentPane().add(lblSalarioBase);
		
		JLabel label = new JLabel(String.valueOf("R$ " + ven.isSalBase()));
		label.setFont(new Font("DejaVu Serif Condensed", Font.BOLD | Font.ITALIC, 16));
		label.setBounds(217, 148, 402, 43);
		frame2.getContentPane().add(label);
		
		JLabel lblComissao = new JLabel("Comissao: ");
		lblComissao.setFont(new Font("DejaVu Serif Condensed", Font.PLAIN, 16));
		lblComissao.setBounds(52, 202, 124, 43);
		frame2.getContentPane().add(lblComissao);
		
		JLabel label_2 = new JLabel(String.valueOf("R$ " + cal.calcularComissao(ven.isTotalVendas())));
		label_2.setFont(new Font("DejaVu Serif Condensed", Font.BOLD | Font.ITALIC, 16));
		label_2.setBounds(217, 202, 402, 43);
		frame2.getContentPane().add(label_2);
		
		JLabel lblSalarioBruto = new JLabel("Salario Bruto: ");
		lblSalarioBruto.setFont(new Font("DejaVu Serif Condensed", Font.PLAIN, 16));
		lblSalarioBruto.setBounds(52, 256, 124, 43);
		frame2.getContentPane().add(lblSalarioBruto);
		
		JLabel label_3 = new JLabel(String.valueOf("R$ " + cal.calcularSalarioBruto(ven.isSalBase(), ven.isTotalVendas())));
		label_3.setFont(new Font("DejaVu Serif Condensed", Font.BOLD | Font.ITALIC, 16));
		label_3.setBounds(217, 256, 402, 43);
		frame2.getContentPane().add(label_3);
		
		JLabel lblBonus = new JLabel("Bônus: ");
		lblBonus.setFont(new Font("DejaVu Serif Condensed", Font.PLAIN, 16));
		lblBonus.setBounds(52, 310, 124, 43);
		frame2.getContentPane().add(lblBonus);
		
		JLabel label_4 = new JLabel(String.valueOf("R$ " + cal.calcularBonus(ven.isTotalVendas())));
		label_4.setFont(new Font("DejaVu Serif Condensed", Font.BOLD | Font.ITALIC, 16));
		label_4.setBounds(217, 310, 402, 43);
		frame2.getContentPane().add(label_4);
		
		JLabel lblSalarioFamilia = new JLabel("Salario Familia: ");
		lblSalarioFamilia.setFont(new Font("DejaVu Serif Condensed", Font.PLAIN, 16));
		lblSalarioFamilia.setBounds(52, 364, 142, 43);
		frame2.getContentPane().add(lblSalarioFamilia);
		
		JLabel label_5 = new JLabel(String.valueOf("R$ " + cal.calcularSalarioFamilia(ven.isSalBase(), ven.isTotalVendas(), ven.getNumeroDeDependentes())));
		label_5.setFont(new Font("DejaVu Serif Condensed", Font.BOLD | Font.ITALIC, 16));
		label_5.setBounds(217, 364, 402, 43);
		frame2.getContentPane().add(label_5);
		
		JLabel lblIrpf = new JLabel("IRPF: ");
		lblIrpf.setFont(new Font("DejaVu Serif Condensed", Font.PLAIN, 16));
		lblIrpf.setBounds(52, 418, 142, 43);
		frame2.getContentPane().add(lblIrpf);
		
		JLabel label_7 = new JLabel(String.valueOf("R$ " + cal.calcularIRPF(ven.isSalBase(), ven.isTotalVendas())));
		label_7.setFont(new Font("DejaVu Serif Condensed", Font.BOLD | Font.ITALIC, 16));
		label_7.setBounds(217, 418, 402, 43);
		frame2.getContentPane().add(label_7);
		
		JLabel lblInss = new JLabel("INSS: ");
		lblInss.setFont(new Font("DejaVu Serif Condensed", Font.PLAIN, 16));
		lblInss.setBounds(52, 472, 142, 43);
		frame2.getContentPane().add(lblInss);
		
		JLabel label_6 = new JLabel(String.valueOf("R$ " + cal.calcularINSS(ven.isSalBase(), ven.isTotalVendas())));
		label_6.setFont(new Font("DejaVu Serif Condensed", Font.BOLD | Font.ITALIC, 16));
		label_6.setBounds(217, 472, 402, 43);
		frame2.getContentPane().add(label_6);
		
		JLabel lblSalrioLquido = new JLabel("Sal\u00E1rio L\u00EDquido: ");
		lblSalrioLquido.setFont(new Font("DejaVu Serif Condensed", Font.PLAIN, 16));
		lblSalrioLquido.setBounds(52, 526, 142, 43);
		frame2.getContentPane().add(lblSalrioLquido);
		
		JLabel label_8 = new JLabel(String.valueOf("R$ " + cal.calcularSalarioLiquido(ven.isSalBase(), ven.isTotalVendas(), ven.getNumeroDeDependentes())));
		label_8.setFont(new Font("DejaVu Serif Condensed", Font.BOLD | Font.ITALIC, 16));
		label_8.setBounds(217, 526, 402, 43);
		frame2.getContentPane().add(label_8);
		
		JButton btnSalvarCsv = new JButton("Salvar CSV");
		btnSalvarCsv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FileWriter aq;
				try {
					
					aq = new FileWriter("C:\\Users\\saulo\\eclipse-workspace\\Trabalho_Final_POO\\src\\Arquivo\\ccssvv.csv");
					PrintWriter gaq = new PrintWriter(aq);
					
					gaq.print("");
					gaq.print("Nome"+";"+ven.getNome()+";\n");
					gaq.print("Salário Base"+";"+String.valueOf("R$ " + ven.isSalBase())+";\n");
					gaq.print("Comissão"+";"+String.valueOf("R$ " + cal.calcularComissao(ven.isTotalVendas()))+";\n");
					gaq.print("Salário Bruto"+";"+String.valueOf("R$ " + cal.calcularSalarioBruto(ven.isSalBase(), ven.isTotalVendas()))+";\n");
					gaq.print("Bônus"+";"+String.valueOf("R$ " + cal.calcularBonus(ven.isTotalVendas()))+";\n");
					gaq.print("Salário Família"+";"+String.valueOf("R$ " + cal.calcularSalarioFamilia(ven.isSalBase(), ven.isTotalVendas(), ven.getNumeroDeDependentes()))+";\n");
					gaq.print("IRPF"+";"+String.valueOf("R$ " + cal.calcularIRPF(ven.isSalBase(), ven.isTotalVendas()))+";\n");
					gaq.print("INSS"+";"+String.valueOf("R$ " + cal.calcularINSS(ven.isSalBase(), ven.isTotalVendas()))+";\n");
					gaq.print("Salário Líquido"+";"+String.valueOf("R$ " + cal.calcularSalarioLiquido(ven.isSalBase(), ven.isTotalVendas(), ven.getNumeroDeDependentes()))+";\n");
					aq.close();
					
					JOptionPane.showMessageDialog(null, "CSV Salvo com Sucesso!", null, JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
					
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		btnSalvarCsv.setForeground(Color.WHITE);
		btnSalvarCsv.setFont(new Font("Algerian", Font.PLAIN, 14));
		btnSalvarCsv.setBackground(Color.BLACK);
		btnSalvarCsv.setBounds(477, 600, 142, 51);
		frame2.getContentPane().add(btnSalvarCsv);
		
		JButton btnNoSalvar = new JButton("N\u00E3o Salvar");
		btnNoSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Operações Finalizadas!", null, JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
				
			}
		});
		btnNoSalvar.setForeground(Color.WHITE);
		btnNoSalvar.setFont(new Font("Algerian", Font.PLAIN, 14));
		btnNoSalvar.setBackground(Color.BLACK);
		btnNoSalvar.setBounds(270, 600, 142, 51);
		frame2.getContentPane().add(btnNoSalvar);
		
		JButton btnSalvarPdf = new JButton("Salvar PDF");
		btnSalvarPdf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Document document = new Document();
				
				try {
					PdfWriter.getInstance(document, new FileOutputStream("C:\\Users\\saulo\\eclipse-workspace\\Trabalho_Final_POO\\src\\Arquivo\\ppddff.pdf"));
					document.open();
					int numeroDeColunas = 2;
					PdfPTable table = new PdfPTable(numeroDeColunas);

					table.addCell(new PdfPCell(new Paragraph("Nome")));
					table.addCell(new PdfPCell(new Paragraph(ven.getNome())));
					
					table.addCell(new PdfPCell(new Paragraph("Salário Base")));
					table.addCell(new PdfPCell(new Paragraph(String.valueOf("R$ " + ven.isSalBase()))));
					
					table.addCell(new PdfPCell(new Paragraph("Comissão")));
					table.addCell(new PdfPCell(new Paragraph(String.valueOf("R$ " + cal.calcularComissao(ven.isTotalVendas())))));
					
					table.addCell(new PdfPCell(new Paragraph("Salário Bruto")));
					table.addCell(new PdfPCell(new Paragraph(String.valueOf("R$ " + cal.calcularSalarioBruto(ven.isSalBase(), ven.isTotalVendas())))));
					
					table.addCell(new PdfPCell(new Paragraph("Bônus")));
					table.addCell(new PdfPCell(new Paragraph(String.valueOf("R$ " + cal.calcularBonus(ven.isTotalVendas())))));
					
					table.addCell(new PdfPCell(new Paragraph("Salário Família")));
					table.addCell(new PdfPCell(new Paragraph(String.valueOf("R$ " + cal.calcularSalarioFamilia(ven.isSalBase(), ven.isTotalVendas(), ven.getNumeroDeDependentes())))));
					
					table.addCell(new PdfPCell(new Paragraph("IRPF")));
					table.addCell(new PdfPCell(new Paragraph(String.valueOf("R$ " + cal.calcularIRPF(ven.isSalBase(), ven.isTotalVendas())))));
					
					table.addCell(new PdfPCell(new Paragraph("INSS")));
					table.addCell(new PdfPCell(new Paragraph(String.valueOf(String.valueOf("R$ " + cal.calcularINSS(ven.isSalBase(), ven.isTotalVendas()))))));
					
					table.addCell(new PdfPCell(new Paragraph("Salário Líquido")));
					table.addCell(new PdfPCell(new Paragraph(String.valueOf("R$ " + cal.calcularSalarioLiquido(ven.isSalBase(), ven.isTotalVendas(), ven.getNumeroDeDependentes())))));
					
					document.add(table);
					document.close();
					
					JOptionPane.showMessageDialog(null, "PDF Salvo com Sucesso!", null, JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
					
				} catch (DocumentException de) {
					System.err.println(de.getMessage());
				} catch (IOException ioe) {
					System.err.println(ioe.getMessage());
				}
				
			}
		});
		btnSalvarPdf.setForeground(Color.WHITE);
		btnSalvarPdf.setFont(new Font("Algerian", Font.PLAIN, 14));
		btnSalvarPdf.setBackground(Color.BLACK);
		btnSalvarPdf.setBounds(52, 600, 142, 51);
		frame2.getContentPane().add(btnSalvarPdf);
	}
}
