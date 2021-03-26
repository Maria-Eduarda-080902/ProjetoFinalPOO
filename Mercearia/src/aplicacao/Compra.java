package aplicacao;
import java.util.ArrayList;
import java.util.Date;

public class Compra {
	private int id;
	private static int nextid;
	private String status;
	private ArrayList <Produto> produtos;
	private Cliente cliente;
	private Date data;
	private float valortotal;
	private float juros;
	
	public Compra(String status, ArrayList<Produto> produtos, Cliente cliente) {
		this.id = nextid;
		nextid += 1;
		this.status = status;
		this.produtos = produtos;
		this.cliente = cliente;
	}
	
	
	public int getId() {
		return id;
	}


	public String getStatus() {
		return status;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public Date getData() {
		return data;
	}


	public float getValortotal() {
		return valortotal;
	}


	public float getJuros() {
		return juros;
	}


	public void setId(int id) {
		this.id = id;
	}


	public static void setNextid(int nextid) {
		Compra.nextid = nextid;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public void setValortotal(float valortotal) {
		this.valortotal = valortotal;
	}


	public void setJuros(float juros) {
		this.juros = juros;
	}


	//public float calcJuros() {}
	public float calcValorTotal() {
		float results = 0;
		for(int i=0;i<this.produtos.size();i++) {
			results += this.produtos.get(i).getValor();
		}
		this.setValortotal(results);
		return results;
	}
	//+ toString() : String
}
