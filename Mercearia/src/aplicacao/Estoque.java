package aplicacao;
import java.util.HashMap;

public class Estoque {
	private HashMap<Integer, Produto> produtos;
	
	public Estoque() {
		this.produtos = new HashMap<Integer, Produto>();
	}
	public boolean cadastrarProduto(Produto p) {
		if(this.produtos.containsKey(p.getId())) {
			return false;
		}
		else {
			System.out.println("Produto cadastrado com sucesso");
			produtos.put(p.getId(), p);
			return true;
		}
	}
	public boolean excluirProduto(int id) {
		if(this.produtos.containsKey(id)) {
			System.out.println("Produto excluído com sucesso");
			produtos.remove(id);
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean reporProduto(int qtd, int id) {
		if(this.produtos.containsKey(id)) {
			Produto p = produtos.get(id);
			p.setQuantidade(p.getQuantidade()+qtd);
			System.out.println("Produto reposto com sucesso");
			return true;
		}
		else {
			return false;
		}
	}
	public boolean retirarProduto(int qtd, int id) {
		if(this.produtos.containsKey(id)) {
			Produto p = produtos.get(id);
			p.setQuantidade(p.getQuantidade()-qtd);
			System.out.println("Produto retirado com sucesso");
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		String results = "";
		for(int x : produtos.keySet()) {
			results += produtos.get(x).toString() + "\n";
		}
		return results;
	}
}
