package sistema;

public class Endereco {
	private int cep;
	private String rua;
	private String bairro;
	private String cidade;
	
	public Endereco(int cep, String rua, String bairro, String cidade) {
		this.cep = cep;
		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
	}
}
