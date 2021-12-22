
public class Main {

	public static void main(String[] args) {
		
		Banco banco = new Banco("Banco Cognizant");
		
		Agencia agenciaA = new Agencia("001");
		agenciaA.getEndereco().setCep("14800-390");
		agenciaA.getEndereco().setRua("Av. 7 de Setembro");
		agenciaA.getEndereco().setEstado(EnumEstados.SAO_PAULO);
		agenciaA.getEndereco().setBairro("Araraquara");
		
		Agencia agenciaB = new Agencia("002");
		agenciaB.getEndereco().setCep("04711-130");
		agenciaB.getEndereco().setRua("Av. Dr. Chucri Zaidan");
		agenciaB.getEndereco().setEstado(EnumEstados.SAO_PAULO);
		agenciaB.getEndereco().setBairro("Vila Sao Francisco (Zona Sul)");

		banco.getAgencias().add(agenciaA);
		banco.getAgencias().add(agenciaB);
		
		Cliente clienteA = new Cliente("Adeilton", "111.111.111-11", "1111111");
		Cliente clienteB = new Cliente("Evellyn", "222.222.222-22", "22222222");

		Conta contaP1 = new ContaPoupanca(clienteA);
		Conta contaC1 = new ContaCorrente(clienteA);
		Conta contaP2 = new ContaPoupanca(clienteB);
		Conta contaC2 = new ContaCorrente(clienteB);
		
		agenciaA.getContas().add(contaP1);
		agenciaA.getContas().add(contaC1);		
		agenciaB.getContas().add(contaP2);
		agenciaB.getContas().add(contaC2);	
		
		contaC1.depositar(100.0);
		contaP2.depositar(100.00);
		
		contaC1.transferir(20.00, contaC2);
		contaP2.transferir(30.00, contaP1);
		
//		contaC1.imprimirExtrato();
//		contaC2.imprimirExtrato();
//		contaP1.imprimirExtrato();
//		contaP2.imprimirExtrato();
		
		System.out.println(banco);
	}
}
