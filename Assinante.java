
public class Assinante {
	
	

	private int codigo;
	private int assinatura;
	private String nome;
	private String endereco;
	private String email;
	private String telefone;

	public Assinante() {
		// TODO Auto-generated constructor stub
		assinatura = new Assinatura(codigo); // Chamada da classe Assinatura.
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
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

}
