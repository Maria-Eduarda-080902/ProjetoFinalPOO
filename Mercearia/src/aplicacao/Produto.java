package aplicacao;

public class Produto {
	private int id;
	private static int nextid;
	private String nomeprod;
	private float valor;
	private int quantidade;
	
	public Produto(String nomeprod, float valor, int quantidade) {
		this.id = nextid;
		nextid +=1;
		this.nomeprod = nomeprod;
		this.valor = valor;
		this.quantidade = quantidade;
	}

	public int getId() {
		return id;
	}

	public String getNomeprod() {
		return nomeprod;
	}

	public float getValor() {
		return valor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setNomeprod(String nomeprod) {
		this.nomeprod = nomeprod;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	@Override
	public String toString() {
		return "[" + this.getNomeprod() + " - " + this.getId() + " - " + this.getValor() + " - " + this.getQuantidade() + "]";
	}
}
