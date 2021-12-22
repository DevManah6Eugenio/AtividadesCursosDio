import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Endereco {
	private String cep;
	private String rua;
	private String numero;// pode haver letras como 35A
	private String complemento;
	private String bairro;
	private String cidade;
	private EnumEstados estado;

	@Override
	public String toString() {
		return "Endereco [cep=" + cep + ", rua=" + rua + ", numero=" + numero + ", complemento=" + complemento
				+ ", bairro=" + bairro + ", cidade=" + cidade + ", estado=" + estado + "]";
	}
}
