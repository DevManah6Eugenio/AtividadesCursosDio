import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Agencia {
	private String nome;
	private List<Conta> contas;
	private Endereco endereco;

	Agencia(String nome) {
		this.nome = nome;
	}
	
	public Endereco getEndereco() {
		if (this.endereco == null)
			this.endereco = new Endereco();
		return this.endereco;
	}
	
	public List<Conta> getContas() {
		if (this.contas == null) {
			this.contas = new ArrayList<>();
		}
		return this.contas;
	}

	@Override
	public String toString() {
		return "Agencia [nome=" + nome + ", contas=" + contas + ", endereco=" + endereco + "]";
	}
	
	
}