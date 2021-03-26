package aplicacao;
import java.util.HashMap;
public class ControleCliente {
	private HashMap <String, Cliente> clientes;
	
	public ControleCliente() {
		this.clientes = new HashMap <String, Cliente>();
	}
	public boolean cadastrarCliente(Cliente c) {
		if(this.clientes.containsKey(c.getCPF())) {
			return false;
		}
		else {
			clientes.put(c.getCPF(), c);
			System.out.println("Cliente cadastrado com sucesso");
			return true;
		}
	}
	public boolean pesquisarCliente(String CPF) {
		if(this.clientes.containsKey(CPF)) {
			System.out.println(this.clientes.get(CPF).toString());
			return true;
		}
		else {
			System.out.println("Cliente não Encontrado");
			return false;
		}
	}
	//+ comprarFiado(CPF : String, compra : Compra)
	//+ addCompra()
	@Override
	public String toString() {
		String results = "";
		for(String x : clientes.keySet()) {
			results += clientes.get(x).toString() + "\n";
		}
		return results;
	}
}
