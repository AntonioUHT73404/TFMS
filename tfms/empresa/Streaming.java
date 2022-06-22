package tfms.empresa;

import tfms.categoria.CategoriaModel;

public class Streaming {
	private int codigo;
	private CategoriaModel categoria;
		
	
	public Streaming(int codigo, CategoriaModel categoria) {
		this.codigo = codigo;
		this.categoria = categoria;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public CategoriaModel getCategoria() {
		return categoria;
	}


	public void setCategoria(CategoriaModel categoria) {
		this.categoria = categoria;
	}
	
	
}
