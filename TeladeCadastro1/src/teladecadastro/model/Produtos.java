package teladecadastro.model;

public class Produtos {
	
	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", valor=" + valor + ", quantidade=" + quantidade + "]";
	}

	private String nome;
	private double valor;
	private int quantidade;

	public Produtos(String nome, double valor, int quantidade) {
		this.nome = nome;
		this.valor = valor;
		this.quantidade = quantidade;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public static void add(Produtos produto) {
		// TODO Auto-generated method stub
		
	}

	public static String size() {
		// TODO Auto-generated method stub
		return null;
	}

	public static char[] get(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}