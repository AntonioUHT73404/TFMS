package tfms.internet;

import tfms.categoria.CategoriaModel;

public class InternetModel extends CategoriaModel {
	private int codigo;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public InternetModel(int codigo) {
		this.codigo = codigo;
	}

}