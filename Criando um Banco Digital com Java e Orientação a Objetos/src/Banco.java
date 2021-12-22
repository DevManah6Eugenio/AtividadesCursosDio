import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Banco {

	private String nome;
	private List<Agencia> agencias;

	Banco(String nome) {
		this.nome = nome;
	}
	
	public Collection<Agencia> getAgencias() {
		if (this.agencias == null) {
			this.agencias = new ArrayList<Agencia>();
		}
		return this.agencias;
	}

	@Override
	public String toString() {
		return "Banco [nome=" + nome + ", agencias=" + agencias + "]";
	}
	
	
}
