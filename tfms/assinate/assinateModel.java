package tfms.assinate;

public class AssinanteModel {

	private int codigo;
	private int assinatura;
	private String nome;
	private String endereco;
	private String email;
	private String telefone;

	private int getCodigo() {
		return codigo;
	}

	private void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	private int getAssinatura() {
		return assinatura;
	}

	private void setAssinatura(int assinatura) {
		this.assinatura = assinatura;
	}

	private String getNome() {
		return nome;
	}

	private void setNome(String nome) {
		this.nome = nome;
	}

	private String getEndereco() {
		return endereco;
	}

	private void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	private String getEmail() {
		return email;
	}

	private void setEmail(String email) {
		this.email = email;
	}

	private String getTelefone() {
		return telefone;
	}

	private void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Assinante() {
		assinatura = new Assinatura(codigo);
	}
}
