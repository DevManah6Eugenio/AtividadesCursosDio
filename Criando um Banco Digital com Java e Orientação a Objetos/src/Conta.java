import lombok.Data;

@Data
public abstract class Conta implements IConta {

	private static int SEQUENCIAL = 1;

	protected int numero;
	protected double saldo;
	protected Cliente cliente;

	public Conta(Cliente cliente) {
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	@Override
	public boolean sacar(Double valor) {
		if (this.saldo - valor >= 0) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}

	@Override
	public void depositar(Double valor) {
		this.saldo += valor;
	}

	@Override
	public void transferir(Double valor, IConta contaDestino) {
		if (this.sacar(valor))
			contaDestino.depositar(valor);
	}

	protected void infoComuns() {
		System.out.println(String.format("Titular: %s", this.getCliente().getNome()));
		System.out.println(String.format("Numero: %d", this.getNumero()));
		System.out.println(String.format("Saldo: %f", this.getSaldo()));
	}

	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", saldo=" + saldo + ", cliente=" + cliente + "]";
	}
	
	

}
