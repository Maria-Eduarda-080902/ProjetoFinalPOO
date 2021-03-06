package aplicacao;
import java.util.ArrayList;

public class Cliente {
	private String CPF;
	private String nome;
	private String telefone;
	private String enderešo;
	private ArrayList <Compra> compras;
	private ArrayList <Compra> dividas;
	
	
	public Cliente(String CPF, String nome) {
		this.CPF = CPF;
		this.nome = nome;
		this.compras = new ArrayList<Compra>();
		this.dividas = new ArrayList<Compra>();
	}
	
	public String getCPF() {
		return CPF;
	}

	public String getNome() {
		return nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getEnderešo() {
		return enderešo;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}

	public void addCompra(Compra c) {
		compras.add(c);
	}
	public void comprarFiado(Compra c) {
		dividas.add(c);
	}
	//public pagarDÝvida(Compra c) {	}
	@Override
	public String toString() {
		String results =  "[ CPF: " + this.getCPF() + " - Nome: " + this.getNome();
		if(this.getTelefone() != null) results += " - Telefone: " + this.getTelefone();
		else results += " - Telefone: Desconhecido ";
		
		if(this.getEnderešo() != null) results += " - Enderešo: " + this.getEnderešo();
		else results += " - Enderešo: Desconhecido";
		
		results += "]";
		
		return results;
	}
}
