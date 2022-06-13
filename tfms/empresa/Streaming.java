package tfms;

public class Streaming {
	private int codigo;
	private Categoria categoria;
		
	
	public Streaming(int codigo, Categoria categoria) {
		this.codigo = codigo;
		this.categoria = categoria;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public Categoria getCategoria() {
		return categoria;
	}


	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
}
