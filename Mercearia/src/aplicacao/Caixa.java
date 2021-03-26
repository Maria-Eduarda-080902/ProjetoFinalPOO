package aplicacao;
import java.util.HashMap;

public class Caixa {
	private HashMap<Integer, Compra> compras;
	private float receita;
	
	public Caixa() {
		this.compras = new HashMap<Integer, Compra>();
		this.receita = 0;
	}
	
	public boolean addCompra(Compra c) {
		if(this.compras.containsKey(c.getId())) {
			return false;
		}
		else {
			compras.put(c.getId(), c);
			return true;
		}
	}
	
	
	public float getReceita() {
		return receita;
	}
	
	public void setReceita(float receita) {
		this.receita = receita;
	}
	public float calcReceita() {
		float results = 0;
		for(int x : compras.keySet()) {
			results += compras.get(x).getValortotal();
		}
		this.setReceita(results);
		return results;
	}
	//+toString() : String
}
