package tfms.linhaTelefonica;

import tfms.categoria.CategoriaModel;
import tfms.franquia.FranquiaModel;

public class LinhaTelefonica extends CategoriaModel{
	
	private int codigo;
	private double consumo;
	private FranquiaModel franquia;
		
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getConsumo() {
		return consumo;
	}

	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}

	public FranquiaModel getFranquia() {
		return franquia;
	}

	public void setFranquia(FranquiaModel franquia) {
		this.franquia = franquia;
	}	
}
