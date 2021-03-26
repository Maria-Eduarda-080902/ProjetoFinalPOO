package aplicacao;
import java.util.Scanner;

public class Aplicação {
	public static void main(String[] args) {
		ControleCliente controlcliente = new ControleCliente();
		//Caixa controlcaixa = new Caixa();
		Estoque controlestoque = new Estoque();
		
		System.out.println("0) Sair\n1) Cadastrar Cliente\n2) Pesquisar Cliente\n3) Cadastrar Produto\n4)Excluir Produto\n5) Repor Produto\n6) Retirar Produto\n7) Mostrar lista de Clientes\n8) Mostrar estoque");
		
		Scanner scan = new Scanner(System.in);
		boolean end = false;
		while(!end) {
			int comando = scan.nextInt();
			
			switch(comando) {
				case 0:
					System.out.println("Até a próxima ^^");
					end = true;
				break;
				case 1:
					System.out.println("Insira CPF e Nome (na mesma linha)");
					String cpf = scan.next();
					String nome = scan.nextLine();
					Cliente c = new Cliente(cpf, nome);
					controlcliente.cadastrarCliente(c);
				break;
				case 2:
					System.out.println("Insira o CPF do cliente que deseja encontrar");
					cpf = scan.next();
					controlcliente.pesquisarCliente(cpf);
				break;
				case 3:
					System.out.println("Insira o nome do produto, seu valor e a quantidade");
					String nomep = scan.next();
					float valor = Float.parseFloat(scan.next());
					int qtd = Integer.parseInt(scan.next());
					Produto p = new Produto(nomep, valor, qtd);
					controlestoque.cadastrarProduto(p);
				break;
				case 4:
					System.out.println("Insira o id do produto que deseja excluir\n");
					int id = Integer.parseInt(scan.next());
					controlestoque.excluirProduto(id);
				break;
				case 5:
					System.out.println("Insira o id do produto e a quantidade que deseja inserir no estoque");
					id = Integer.parseInt(scan.next());
					qtd = Integer.parseInt(scan.next());
					controlestoque.reporProduto(qtd, id);
				break;
				case 6:
					System.out.println("Insira o id do produto e a quantidade que deseja retirar do estoque");
					id = scan.nextInt();
					qtd = Integer.parseInt(scan.next());
					controlestoque.retirarProduto(qtd, id);
				break;
				case 7:
					System.out.println(controlcliente.toString());
				break;
				case 8:
					System.out.println(controlestoque.toString());
				break;
			} 
		}
		
		scan.close();
	}
}
