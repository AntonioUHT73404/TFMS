package tfms.tipo;

public class VTipoModel {
     
     private int codigo;
     private String nome;

     public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

     public ValorsModel(int codigo, String nome) { 
          setCodigo(codigo);
          setNome(nome);
     }
}