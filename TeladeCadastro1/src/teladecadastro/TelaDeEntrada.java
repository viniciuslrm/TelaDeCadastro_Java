package teladecadastro;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import teladecadastro.model.Produtos;

public class TelaDeEntrada extends JPanel {

	
	
		/**
	 * 
	 */
	private static final long serialVersionUID = -918650847473776828L;
		private List<Produtos> produtos = new ArrayList<>();

		public TelaDeEntrada() {

			this.setLayout(new GridLayout(0, 2));

			JLabel nomeDoProduto = new JLabel("Nome Do Produto ");
			this.add(nomeDoProduto);

			final JTextField nomeDoProdutoField = new JTextField();
			this.add(nomeDoProdutoField);

			JLabel quantidadeDoProduto = new JLabel("Quantidade ");
			this.add(quantidadeDoProduto);

			final JTextField quantidadeDoProdutoField = new JTextField();
			this.add(quantidadeDoProdutoField);

			JLabel preçoDoProduto = new JLabel("Valor Unitário ");
			this.add(preçoDoProduto);

			final JTextField preçoDoProdutoField = new JTextField();
			this.add(preçoDoProdutoField);

			JButton btnAdicionar = new JButton("Adicionar");
			this.add(btnAdicionar);
			btnAdicionar.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					

				String nome = nomeDoProdutoField.getText();
				int quantidade = Integer.parseInt(quantidadeDoProdutoField.getText());
				double valor = Double.parseDouble(preçoDoProdutoField.getText());

				Produtos produto = new Produtos(nome, valor, quantidade);
				produtos.add(produto);
				System.out.println("Quantidade cadastrada " + produtos.size());

				nomeDoProdutoField.setText("");
				quantidadeDoProdutoField.setText("");
				preçoDoProdutoField.setText("");
				}

			});

			JButton btnRelatorio = new JButton("Relatório");
			this.add(btnRelatorio);
			btnRelatorio.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					for (int i = 0; i < produtos.size(); i++) {
						System.out.println(produtos.get(i));
					}

					Object[] colunas = { "Nome", "Quantidade", "Valor", "Total" };
					Object[][] linhas = new Object[produtos.size() + 2][4];

					for (int i = 0; i < produtos.size(); i++) {
						Object[] linha = new Object[] { produtos.get(i).getNome().toUpperCase(),
								produtos.get(i).getQuantidade(), produtos.get(i).getValor(),
								produtos.get(i).getValor() * produtos.get(i).getQuantidade() };
						linhas[i] = linha;

					}

					int somaQuantidade = 0;
					double totalValorGeral = 0;

					for (Produtos produto : produtos) {
						somaQuantidade += produto.getQuantidade();
						totalValorGeral = totalValorGeral + (produto.getQuantidade() * produto.getValor());

					}
					linhas[produtos.size() + 1] = new Object[] { "TOTAL", somaQuantidade, "", totalValorGeral };

					JTable tabela = new JTable(linhas, colunas);

					JScrollPane jscroll = new JScrollPane(tabela);
					jscroll.setSize(new Dimension(500, 500));

					JOptionPane.showMessageDialog(null, new JScrollPane(tabela));

				}

			});
		}}